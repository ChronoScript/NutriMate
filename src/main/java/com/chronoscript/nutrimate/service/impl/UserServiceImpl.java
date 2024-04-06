package com.chronoscript.nutrimate.service.impl;

import com.chronoscript.nutrimate.entity.HouseOwner;
import com.chronoscript.nutrimate.entity.User;
import com.chronoscript.nutrimate.repository.UserRepository;
import com.chronoscript.nutrimate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserServiceImpl
        implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    @Autowired
    public UserServiceImpl(UserRepository userRepository,
                           PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    // Save operation
    @Override
    public User saveUser(User user)
    {
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        return userRepository.save(user);
    }
    @Override
    public List<User> fetchUserList()
    {
        return (List<User>)
                userRepository.findAll();
    }

    public User authenticate(String username, String password) {

        return userRepository.findByEmail(username)
                .filter(user -> passwordEncoder.matches(password, user.getPassword()))
                .orElse(null);
    }


}
