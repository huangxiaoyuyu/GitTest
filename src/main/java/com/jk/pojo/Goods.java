package com.jk.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Goods implements Serializable{

    private Integer goodsid;

    private String goodsname;

    private Integer goodsprice;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date goodsdate;

    private String photourl;

    private Integer attentionnumber;

    private String mindate;

    private String maxdate;

    public String getMindate() {
        return mindate;
    }

    public void setMindate(String mindate) {
        this.mindate = mindate;
    }

    public String getMaxdate() {
        return maxdate;
    }

    public void setMaxdate(String maxdate) {
        this.maxdate = maxdate;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public Integer getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(Integer goodsprice) {
        this.goodsprice = goodsprice;
    }

    public Date getGoodsdate() {
        return goodsdate;
    }

    public void setGoodsdate(Date goodsdate) {
        this.goodsdate = goodsdate;
    }

    public String getPhotourl() {
        return photourl;
    }

    public void setPhotourl(String photourl) {
        this.photourl = photourl;
    }

    public Integer getAttentionnumber() {
        return attentionnumber;
    }

    public void setAttentionnumber(Integer attentionnumber) {
        this.attentionnumber = attentionnumber;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsid=" + goodsid +
                ", goodsname='" + goodsname + '\'' +
                ", goodsprice=" + goodsprice +
                ", goodsdate=" + goodsdate +
                ", photourl='" + photourl + '\'' +
                ", attentionnumber=" + attentionnumber +
                '}';
    }
}
