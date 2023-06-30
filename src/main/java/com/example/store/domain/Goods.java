package com.example.store.domain;

import java.io.Serializable;

public class Goods implements Serializable {
    private String id;
    private String name;
    private String number;
    private int price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString(){
        return "GoodsModel{"+"id="+id+" name="+name+" Number"+number+" price="+price+"}";
    }
}
