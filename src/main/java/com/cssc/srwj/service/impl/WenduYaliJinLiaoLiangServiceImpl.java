package com.cssc.srwj.service.impl;

import com.cssc.srwj.domain.WenDuYaLiJinLiaoLiang;
import com.cssc.srwj.dto.WenDuYaLiJinLiaoLiangDTO;
import com.cssc.srwj.mapper.WenduYaliJinLiaoLiangMapper;
import com.cssc.srwj.service.WenduYaliJinLiaoLiangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description：温度/压力/进料量 service服务实现类
 * @Author: liliang
 * @Date: 2023/7/3 17:11
 * @Version: 1.0
 **/
@Service
public class WenduYaliJinLiaoLiangServiceImpl implements WenduYaliJinLiaoLiangService {

    @Autowired
    private WenduYaliJinLiaoLiangMapper wenduYaliJinLiaoLiangMapper;

    /**
     * @description: 获取集合 累计进料量对应的 温度，压力
     * @author liliang
     * @date 2023/7/3 17:30
     * @version 1.0
     */
    @Override
    public List<WenDuYaLiJinLiaoLiangDTO> getGuanXi(String luhao) {
        Integer idMax = 0;
        Integer idMin = 0;
        //根据流速来判定入参炉号对应的反应开始和结束数据
        List<WenDuYaLiJinLiaoLiang> list1 =wenduYaliJinLiaoLiangMapper.getGuanXi1(luhao);
        //list集合小于2，说明没有完整的周期数据，周期区间需要有开始，有结束
        if(list1.size()<2){
            return null;
        }
        System.out.println(list1);
        /**
         * Integer x= 5
         * x.compareTo(3) = 1
         * x.compareTo(5) = 0
         * x.compareTo(8) = -1
         */
        //进料流速大于零
//        if(list1.get(0).getJinliaoLiusu().compareTo(BigDecimal.valueOf(0))>0){
//            idMax = list1.get(1).getId();
//            idMin = list1.get(2).getId();
//        }else {
//            idMin = list1.get(1).getId();
//            idMax = list1.get(0).getId();
//        }
        // list1集合大小为2
        idMax = list1.get(0).getId();
        idMin = list1.get(1).getId();
        BigDecimal prejiJinliaoliang = list1.get(0).getPreJinliaoliang();


        List<WenDuYaLiJinLiaoLiang> wenDuYaLiJinLiaoLiangList = wenduYaliJinLiaoLiangMapper.getGuanXi(luhao,idMin, idMax,prejiJinliaoliang);
        if (null==wenDuYaLiJinLiaoLiangList || wenDuYaLiJinLiaoLiangList.size() <= 0){
            return null;
        }
        List<WenDuYaLiJinLiaoLiangDTO> dtoList = new ArrayList<>();
        for (WenDuYaLiJinLiaoLiang e:wenDuYaLiJinLiaoLiangList) {
            WenDuYaLiJinLiaoLiangDTO dto = new WenDuYaLiJinLiaoLiangDTO();
            dto.setId(e.getId());

            dto.setLuhao(e.getLuhao());


            BigDecimal leijijinliaoliang = e.getLeijiJinliaoliang().setScale(2, BigDecimal.ROUND_FLOOR);


            dto.setLeijiJinliaoliang(leijijinliaoliang);


            BigDecimal luwensan = e.getLuwen3().setScale(2, BigDecimal.ROUND_FLOOR);
            dto.setLuwen3(luwensan);


            BigDecimal luwensi = e.getLuwen4().setScale(2, BigDecimal.ROUND_FLOOR);
            dto.setLuwen4(luwensi);

            BigDecimal reduanfanyingqiyali = e.getReduanFanyingqiYali().setScale(2, BigDecimal.ROUND_FLOOR);
            dto.setReduanFanyingqiYali(reduanfanyingqiyali);


            dtoList.add(dto);
            dto.setCreateTime(e.getCreateTime().toLocaleString());
        }
        return dtoList;
    }
}
