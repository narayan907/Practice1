package com.practice.project1.services;

import com.practice.project1.models.User;
import com.practice.project1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository)
    {
        this.userRepository=userRepository;
    }

    public User createUser(User user)
    {
        return userRepository.createUser(user);
    }

    public User getUser(UUID uuid)
    {
        return userRepository.getUser(uuid);
    }
}
