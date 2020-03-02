package com.test.openmeetings.mapper;


import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.test.openmeetings.pojo.User;

import java.util.List;

public interface UserMapper {

    @Select("select * from myUser where 1=1")
    List<User> list();
    
    
    
    /**
     * 延伸：无论什么方式,如果涉及多个参数,则必须加上@Param注解,否则无法使用EL表达式获取参数。
     */
    @Select("select * from myUser where name=#{name} and password=#{password}")
    @Results({
    	 @Result(property = "id", column = "id"),
    	 @Result(property = "name", column = "name"),
    	 @Result(property = "password", column = "password"),
    	 @Result(property = "content", column = "content")
    })
    User selecUser(@Param("name") String name,@Param("password") String password);

  

}
