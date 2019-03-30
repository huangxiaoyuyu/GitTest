package com.jk.service.Impl;

import com.jk.dao.GoodsMapper;
import com.jk.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService{

    @Autowired
    private GoodsMapper goodsMapper;


    @Override
    public List<Goods> queryGoods(Goods goods) {
        return goodsMapper.queryGoods(goods);
    }

    @Override
    public Goods querywheregoods(Integer goodsid) {
        return goodsMapper.querywheregoods(goodsid);
    }

    @Override
    public void updategoods(Goods goods) {
        goodsMapper.updategoods(goods);
    }

    @Override
    public void addgoods(Goods goods) {
        goodsMapper.addgoods(goods);
    }

    @Override
    public void deletegoods(Integer goodsid) {
        goodsMapper.deletegoods(goodsid);
    }


}
