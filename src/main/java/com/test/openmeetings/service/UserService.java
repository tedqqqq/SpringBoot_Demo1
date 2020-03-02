package com.test.openmeetings.service;


import java.util.List;

import com.test.openmeetings.pojo.User;

public interface UserService {

    List<User> list();
    
    User selecUser(String name,String password);



}
