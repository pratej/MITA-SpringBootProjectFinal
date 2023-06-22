package com.mita.user.service.impl;

import com.mita.user.model.UserActivity;
import com.mita.user.repository.UserActivityRepository;
import com.mita.user.service.UserActivityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserActivityServiceImpl implements UserActivityService {
    private final UserActivityRepository userActivityRepository;

    public UserActivityServiceImpl(UserActivityRepository userActivityRepository) {
        this.userActivityRepository = userActivityRepository;
    }

    @Override
    public UserActivity createUserActivity(UserActivity userActivity) {
        // Perform any necessary validation or business logic before creating the activity
        // ...

        return userActivityRepository.save(userActivity);
    }

    @Override
    public UserActivity getUserActivityById(String id) {
        return userActivityRepository.findById(id).orElse(null);
    }

    @Override
    public List<UserActivity> getAllUSerActivities() {
        return userActivityRepository.findAll();
    }

    @Override
    public UserActivity updateUserActivity(String id, UserActivity userActivity) {
        // Check if the activity exists
        UserActivity existingActivity = getUserActivityById(id);
        if (existingActivity != null) {
            // Perform any necessary validation or business logic before updating the activity
            // ...

            // Update the activity data
            return userActivityRepository.save(userActivity);
        }
        return null;
    }

    @Override
    public boolean deleteUserActivity(String id) {
        // Check if the activity exists
        UserActivity existingActivity = getUserActivityById(id);
        if (existingActivity != null) {
            // Delete the activity from the database
            userActivityRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
