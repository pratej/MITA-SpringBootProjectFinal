package com.mita.user.controller;

import com.mita.user.model.UserActivity;
import com.mita.user.service.UserActivityService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user-activities")
public class UserActivityController {
    private final UserActivityService userActivityService;

    public UserActivityController(UserActivityService userActivityService) {
        this.userActivityService = userActivityService;
    }

    @PostMapping
    public ResponseEntity<UserActivity> createUserActivity(@RequestBody UserActivity userActivity) {
        UserActivity createdActivity = userActivityService.createUserActivity(userActivity);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdActivity);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserActivity> getUserActivityById(@PathVariable String id) {
        UserActivity userActivity = userActivityService.getUserActivityById(id);
        if (userActivity != null) {
            return ResponseEntity.ok(userActivity);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserActivity> updateUserActivity(@PathVariable String id, @RequestBody UserActivity userActivity) {
        UserActivity updatedActivity = userActivityService.updateUserActivity(id, userActivity);
        if (updatedActivity != null) {
            return ResponseEntity.ok(updatedActivity);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUserActivity(@PathVariable String id) {
        boolean deleted = userActivityService.deleteUserActivity(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

