package com.lishuai.service;

import com.lishuai.dao.UserRepository;
import com.lishuai.po.User;
import com.lishuai.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
       // User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
         User user = userRepository.findByUsernameAndPassword(username,password);

        return user;
    }
}
