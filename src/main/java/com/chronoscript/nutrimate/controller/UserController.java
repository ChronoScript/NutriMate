package com.chronoscript.nutrimate.controller;

import com.chronoscript.nutrimate.dto.SignUpResponseDTO;
import com.chronoscript.nutrimate.entity.User;
import com.chronoscript.nutrimate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@CrossOrigin
        (origins = "http://localhost:3000/")

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String processRegister(@RequestBody User user) {


        userService.saveUser(user);

        return "register_success";
    }

    @PostMapping("/login")
    public ResponseEntity<SignUpResponseDTO> login(@RequestBody User user) {

        User user1 = userService.authenticate(user.getEmail(), user.getPassword());
        if (user1 != null) {
            SignUpResponseDTO responseDTO = new SignUpResponseDTO();
            responseDTO.setId(user1.getId());
            responseDTO.setEmail(user1.getEmail());
            responseDTO.setToken(UUID.randomUUID().toString());
            return ResponseEntity.ok(responseDTO);
        }
        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
    }
}
