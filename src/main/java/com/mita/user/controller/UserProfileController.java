package com.mita.user.controller;

import com.mita.user.model.userprofile.UserProfile;
import com.mita.user.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user-profiles")
public class UserProfileController {

    private final UserProfileService userProfileService;

    @Autowired
    public UserProfileController(UserProfileService userProfileService) {
        this.userProfileService = userProfileService;
    }

    @PostMapping
    public UserProfile createUserProfile(@RequestBody UserProfile userProfile) {
        return userProfileService.createUserProfile(userProfile);
    }

    @GetMapping("/{userId}")
    public UserProfile getUserProfileById(@PathVariable String userId) {
        return userProfileService.getUserProfileById(userId);
    }

    @GetMapping
    public List<UserProfile> getAllUserProfiles() {
        return userProfileService.getAllUserProfiles();
    }

    @PutMapping("/{userId}")
    public UserProfile updateUserProfile(@PathVariable String userId, @RequestBody UserProfile userProfile) {
        userProfile.setUserId(userId);
        return userProfileService.updateUserProfile(userProfile);
    }

    @DeleteMapping("/{userId}")
    public void deleteUserProfile(@PathVariable String userId) {
        userProfileService.deleteUserProfile(userId);
    }
}