package com.mita.user.service;

import com.mita.user.model.User;
import com.mita.user.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    User createUser(User user);
    User getUserById(String id);
    List<User> getAllUsers();
    User updateUser(String id, User user);
    boolean deleteUser(String id);
}
