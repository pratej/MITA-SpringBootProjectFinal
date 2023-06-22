package com.mita.user.service.impl;

import com.mita.user.model.User;
import com.mita.user.repository.UserRepository;
import com.mita.user.service.UserService;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        // Perform any necessary validation or business logic before creating the user
        // ...

        return userRepository.save(user);
    }

    @Override
    public User getUserById(String id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(String id, User user) {
        // Check if the user exists
        User existingUser = getUserById(id);
        if (existingUser != null) {
            // Perform any necessary validation or business logic before updating the user
            // ...

            // Update the user data
            return userRepository.save(user);
        }
        return null;
    }

    @Override
    public boolean deleteUser(String id) {
        // Check if the user exists
        User existingUser = getUserById(id);
        if (existingUser != null) {
            // Delete the user from the database
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }
}

