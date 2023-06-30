package com.example.store.dao;

import com.example.store.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface AccountDao {
    @Insert("insert into user(username,password)values(#{userName},#{password})")
    void save(Account account);

    @Delete("delete from user where username = #{userName}")
    void delete(String userName);

    @Update("update user set password = #{password} where username = #{userName}")
    void update(Account account);

    @Select("select * from user")
    List<Account> findAll();

    @Select("select * from user where username = #{userName}")
    Account findUser(String username);
}
