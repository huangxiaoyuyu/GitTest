package com.jk.dao;

import com.jk.pojo.Goods;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;


public interface GoodsMapper {


    List<Goods> queryGoods(Goods goods);

    @Select("select * from t_goods where goodsid = #{goodsid}")
    Goods querywheregoods(Integer goodsid);

    @Update("UPDATE t_goods SET goodsname=#{goodsname},goodsprice=#{goodsprice},goodsdate=#{goodsdate},photourl=#{photourl},attentionnumber=#{attentionnumber} WHERE goodsid =#{goodsid}")
    void updategoods(Goods goods);

    @Insert("INSERT INTO t_goods(goodsname,goodsprice,goodsdate,photourl,attentionnumber) VALUES(#{goodsname}, #{goodsprice}, #{goodsdate}, #{photourl}, #{attentionnumber})")
    void addgoods(Goods goods);

    @Delete("DELETE FROM t_goods WHERE goodsid =#{goodsid}")
    void deletegoods(Integer goodsid);
}
