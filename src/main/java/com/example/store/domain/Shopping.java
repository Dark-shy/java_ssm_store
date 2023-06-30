package com.example.store.domain;

import com.example.store.service.GoodsService;


import java.util.ArrayList;
import java.util.List;

public class Shopping {

    private List<String> shopping;
    private List<String> goods_name;
    private int Price=0;

    private GoodsService goodsService;

    public Shopping() {
        this.shopping = new ArrayList<>();
        this.goods_name = new ArrayList<>();
    }

    public void setGoodsService(GoodsService goodsService) {
        this.goodsService = goodsService;
    }
    public void setShopping(String a) {
        shopping.add(a);
    }

    public List<String> getShopping() {
        Goods goods;
        for (String i : shopping){
            goods=goodsService.findGoods(Integer.parseInt(i));
            goods_name.add(goods.getName());
            Price+=goods.getPrice();
        }
        return goods_name;
    }

    public int getPrice() {
        return Price;
    }
}
