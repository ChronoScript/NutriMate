package com.chronoscript.nutrimate.service;

import com.chronoscript.nutrimate.entity.HouseOwner;
import com.chronoscript.nutrimate.entity.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    List<User> fetchUserList();

    User authenticate(String username, String password);

}
