package com.cssc.srwj.domain;

import java.math.BigDecimal;

/**
 * @Description：温度、压力、进料量 实体类
 * @Author: liliang
 * @Date: 2023/7/3 17:24
 * @Version: 1.0
 **/
public class WenDuYaLiJinLiaoLiang extends BaseEntity{
    private Integer id;
    private String luhao;
    //单位 kg/h
    private BigDecimal jinliaoLiusu;
    //单位 t
    private BigDecimal leijiJinliaoliang;
    private BigDecimal luwen3;
    private BigDecimal luwen4;
    //单位 MPa
    private BigDecimal reduanFanyingqiYali;
    //炉状态（0反应中，1反应结束）
    private Integer luStatus;
    //前一条数据累计进料量
    private BigDecimal preJinliaoliang;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLuhao() {
        return luhao;
    }

    public void setLuhao(String luhao) {
        this.luhao = luhao;
    }

    public BigDecimal getJinliaoLiusu() {
        return jinliaoLiusu;
    }

    public void setJinliaoLiusu(BigDecimal jinliaoLiusu) {
        this.jinliaoLiusu = jinliaoLiusu;
    }

    public BigDecimal getLeijiJinliaoliang() {
        return leijiJinliaoliang;
    }

    public void setLeijiJinliaoliang(BigDecimal leijiJinliaoliang) {
        this.leijiJinliaoliang = leijiJinliaoliang;
    }

    public BigDecimal getLuwen3() {
        return luwen3;
    }

    public void setLuwen3(BigDecimal luwen3) {
        this.luwen3 = luwen3;
    }

    public BigDecimal getLuwen4() {
        return luwen4;
    }

    public void setLuwen4(BigDecimal luwen4) {
        this.luwen4 = luwen4;
    }

    public BigDecimal getReduanFanyingqiYali() {
        return reduanFanyingqiYali;
    }

    public void setReduanFanyingqiYali(BigDecimal reduanFanyingqiYali) {
        this.reduanFanyingqiYali = reduanFanyingqiYali;
    }

    public Integer getLuStatus() {
        return luStatus;
    }

    public void setLuStatus(Integer luStatus) {
        this.luStatus = luStatus;
    }

    public BigDecimal getPreJinliaoliang() {
        return preJinliaoliang;
    }

    public void setPreJinliaoliang(BigDecimal preJinliaoliang) {
        this.preJinliaoliang = preJinliaoliang;
    }
}
