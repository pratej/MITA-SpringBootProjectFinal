package com.mita.user.service;

import com.mita.user.exception.UserProfileNotFoundException;
import com.mita.user.model.userprofile.UserProfile;
import com.mita.user.repository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    private final UserProfileRepository userProfileRepository;

    @Autowired
    public UserProfileServiceImpl(UserProfileRepository userProfileRepository) {
        this.userProfileRepository = userProfileRepository;
    }

    @Override
    public UserProfile createUserProfile(UserProfile userProfile) {
        // Perform any required validations or business logic before saving
        return userProfileRepository.save(userProfile);
    }

    @Override
    public UserProfile getUserProfileById(String userId) {
        Optional<UserProfile> userProfileOptional = userProfileRepository.findById(userId);
        if (userProfileOptional.isPresent()) {
            return userProfileOptional.get();
        } else {
            throw new UserProfileNotFoundException("User profile not found for ID: " + userId);
        }
    }

    @Override
    public List<UserProfile> getAllUserProfiles() {
        return userProfileRepository.findAll();
    }

    @Override
    public UserProfile updateUserProfile(UserProfile userProfile) {
        Optional<UserProfile> existingProfileOptional = userProfileRepository.findById(userProfile.getUserId());
        if (existingProfileOptional.isPresent()) {
            // Perform any required validations or business logic before updating
            return userProfileRepository.save(userProfile);
        } else {
            throw new UserProfileNotFoundException("User profile not found for ID: " + userProfile.getUserId());
        }
    }

    @Override
    public void deleteUserProfile(String userId) {
        Optional<UserProfile> existingProfileOptional = userProfileRepository.findById(userId);
        if (existingProfileOptional.isPresent()) {
            userProfileRepository.deleteById(userId);
        } else {
            throw new UserProfileNotFoundException("User profile not found for ID: " + userId);
        }
    }
}