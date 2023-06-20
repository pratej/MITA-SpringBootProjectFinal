package com.mita.user.service;

import com.mita.user.exception.UserProfileNotFoundException;
import com.mita.user.model.userprofile.UserProfile;
import com.mita.user.repository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserProfileService {

    UserProfile createUserProfile(UserProfile userProfile);

    UserProfile getUserProfileById(String userId);

    List<UserProfile> getAllUserProfiles();

    UserProfile updateUserProfile(UserProfile userProfile);

    void deleteUserProfile(String userId);
}