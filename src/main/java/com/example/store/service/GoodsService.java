package com.example.store.service;

import com.example.store.domain.Goods;

import java.util.List;

public interface GoodsService {

    boolean save(Goods goods);

    boolean delete(String name);

    boolean update(Goods goods);

    List<Goods> findAll();

    Goods findGoods(int id);
}
