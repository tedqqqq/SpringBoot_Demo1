package com.test.openmeetings.mapper;


import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import com.test.openmeetings.pojo.User;

import java.util.List;

public interface UserMapper {

    @Select("select * from myUser where 1=1")
    List<User> list();

  

}
