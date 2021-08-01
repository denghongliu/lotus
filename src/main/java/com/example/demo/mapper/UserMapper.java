package com.example.demo.mapper;

import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author ：liudenghong
 * @date ：Created in 2021/8/1 21:50
 * @description：
 * @modified By：
 * @version: $
 */
@Mapper
public interface UserMapper {
    @Select("SELECT * FROM User WHERE state = #{name}")
    User  findByName(@Param("name") String name);
    @Insert("insert into user(name,age)values(#{name},#{age})")
    void insert(User user);
}
