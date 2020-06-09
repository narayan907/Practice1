package com.practice.project1.repository;

import com.practice.project1.models.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.UUID;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private HashMap<UUID,User> users = new HashMap<>();

    @Override
    public User createUser(User user) {
        User newUser = new User(user.getName(),user.getGender());
        users.put(newUser.getUuid(),newUser);
        return newUser;
    }

    @Override
    public User getUser(UUID uuid) {
        return users.get(uuid);
    }


}
