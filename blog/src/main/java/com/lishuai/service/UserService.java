package com.lishuai.service;


import com.lishuai.po.User;


public interface UserService {

    User checkUser(String username, String password);
}
