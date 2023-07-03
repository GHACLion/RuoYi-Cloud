package com.cssc.srwj.mapper;

import com.cssc.srwj.domain.WenDuYaLiJinLiaoLiang;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Description：TODO
 * @Author: liliang
 * @Date: 2023/7/3 17:28
 * @Version: 1.0
 **/
@Mapper
public interface WenduYaliJinLiaoLiangMapper {
    List<WenDuYaLiJinLiaoLiang> getGuanXi1(String luhao);

    List<WenDuYaLiJinLiaoLiang> getGuanXi(String luhao, Integer idMin, Integer idMax, BigDecimal prejiJinliaoliang);
}
