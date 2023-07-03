package com.cssc.srwj.dto;

import java.math.BigDecimal;

/**
 * @Description：温度/压力/进料量 前后端交互类
 * @Author: liliang
 * @Date: 2023/7/3 17:27
 * @Version: 1.0
 **/
public class WenDuYaLiJinLiaoLiangDTO {
    //id
    private Integer id;
    //炉号
    private String luhao;
    //累计进料量 单位 t
    private BigDecimal leijiJinliaoliang;
    //炉温3
    private BigDecimal luwen3;
    //炉温4
    private BigDecimal luwen4;
    //热端反应器压力 单位 MPa
    private BigDecimal reduanFanyingqiYali;
    //创建时间
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String createTime;

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

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
