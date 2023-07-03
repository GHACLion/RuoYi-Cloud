package com.cssc.srwj.service;

import com.cssc.srwj.dto.WenDuYaLiJinLiaoLiangDTO;

import java.util.List;

/**
 * @Description：TODO
 * @Author: liliang
 * @Date: 2023/7/3 17:11
 * @Version: 1.0
 **/
public interface WenduYaliJinLiaoLiangService {
    List<WenDuYaLiJinLiaoLiangDTO> getGuanXi(String luhao);
}
