package com.jk.service.Impl;

import com.jk.pojo.Goods;

import java.util.List;

public interface GoodsService {

    List<Goods> queryGoods(Goods goods);


    Goods querywheregoods(Integer goodsid);

    void updategoods(Goods goods);

    void addgoods(Goods goods);


    void deletegoods(Integer goodsid);
}
