package com.james.springmvc.service;

import com.james.springmvc.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private List<User> users;

    public UserServiceImpl(){

        users=new ArrayList<>();
        User user1=new User("1","james");
        User user2=new User("2","mai");
        User user3=new User("3","lavine");

        users.add(user1);
        users.add(user2);
        users.add(user3);


    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }
}
