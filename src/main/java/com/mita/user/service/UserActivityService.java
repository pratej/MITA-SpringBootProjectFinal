package com.mita.user.service;

import com.mita.user.model.UserActivity;
import com.mita.user.repository.UserActivityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserActivityService {
    UserActivity createUserActivity(UserActivity userActivity);
    UserActivity getUserActivityById(String id);
    List<UserActivity> getAllUSerActivities();
    UserActivity updateUserActivity(String id, UserActivity userActivity);
    boolean deleteUserActivity(String id);
}
