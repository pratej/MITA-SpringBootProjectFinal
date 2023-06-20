package com.mita.user.repository;

import com.mita.user.model.userprofile.UserProfile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserProfileRepository extends MongoRepository<UserProfile, String> {
    // Add custom query methods or define additional queries if needed
}
