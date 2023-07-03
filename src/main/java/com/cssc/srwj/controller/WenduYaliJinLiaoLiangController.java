package com.cssc.srwj.controller;

import com.cssc.srwj.dto.WenDuYaLiJinLiaoLiangDTO;
import com.cssc.srwj.service.WenduYaliJinLiaoLiangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description：温度/压力/进料量关系 处理器类
 * @Author: liliang
 * @Date: 2023/7/3 17:10
 * @Version: 1.0
 **/
@RestController
@RequestMapping("/wenduYaliJinliaoliang")
public class WenduYaliJinLiaoLiangController {

    @Autowired
    private WenduYaliJinLiaoLiangService wenduYaliJinLiaoLiangService;

    @GetMapping("/getGuanXi")
    public List<WenDuYaLiJinLiaoLiangDTO> getGuanXi(String luhao){ //确认入参是 炉号
        return wenduYaliJinLiaoLiangService.getGuanXi(luhao);
    }
}
