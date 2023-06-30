package com.example.store.service.impl;

import com.example.store.dao.GoodsDao;
import com.example.store.domain.Goods;
import com.example.store.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {



    @Autowired
    private GoodsDao goodsDao;

    public boolean save(Goods goods) {
        goodsDao.save(goods);
        return true;
    }


    public boolean delete(String name) {
        goodsDao.delete(name);
        return true;
    }


    public boolean update(Goods goods) {
        goodsDao.update(goods);
        return true;
    }


    public List<Goods> findAll() {
        return goodsDao.findAll();
    }


    public Goods findGoods(int id) {
        return goodsDao.findGoods(id);
    }
}
