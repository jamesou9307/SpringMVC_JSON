package com.james.springmvc.service;

import com.james.springmvc.entity.User;

import javax.jws.soap.SOAPBinding;
import java.util.List;

public interface UserService {

    List<User> getAllUsers();

}
