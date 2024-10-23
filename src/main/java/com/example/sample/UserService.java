package com.example.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User addUser(User user){
        User savedUser = userRepository.save(user);
        return savedUser;
    }

    public User getUserById(int userId) {

        Optional<User> optionalUser = userRepository.findById(userId);
        User user = optionalUser.get();
        return  user;
    }
}
