package com.example.testpsycho.services;

import com.example.testpsycho.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


//    public User registerUser(User user) {
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//        return userRepository.save(user);
//    }
//
//    public User authenticateUser(LoginRequest loginRequest) {
//        User user = userRepository.findByUsername(loginRequest.getUsername());
//        if (user == null) {
//            throw new RuntimeException("User not found");
//        }
//        if (!passwordEncoder.matches(loginRequest.getPassword(), user.getPassword())) {
//            throw new RuntimeException("Invalid password");
//        }
//        return user;
//    }
//
//    public User getUserProfile(Long id) {
//        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
//    }
}

