package com.example.store.dao;

import com.example.store.domain.Goods;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface GoodsDao {
    @Insert("insert into goods(id,name,number,price)values(#{id},#{name},#{number},#{price})")
    void save(Goods goods);

    @Delete("delete from user where username = #{name}")
    void delete(String name);

    @Update("update user set price = #{price} where name = #{name}")
    void update(Goods goods);

    @Select("select * from goods")
    List<Goods> findAll();

    @Select("select * from goods where id = #{id}")
    Goods findGoods(int id);
}
