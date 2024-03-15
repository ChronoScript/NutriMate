package com.chronoscript.nutrimate.service;

import com.chronoscript.nutrimate.entity.User;
public interface UserService {

    User saveUser(User user);

    User authenticate(String username, String password);

}
