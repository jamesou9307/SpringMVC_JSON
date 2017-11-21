package com.james.springmvc.controller;

import com.alibaba.fastjson.JSON;
import com.james.springmvc.entity.User;
import com.james.springmvc.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

@Controller
public class UserController {

    private static final Log logger= LogFactory.getLog(UserController.class);

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/get_json")
    public String toJson(){

        List<User> users=userService.getAllUsers();

        String jsonString= JSON.toJSONString(users);
        return jsonString;
    }


}
