package com.practice.project1.repository;

import com.practice.project1.models.User;

import java.util.UUID;

public interface UserRepository {

    User createUser(User user);
    User getUser(UUID uuid);
}
