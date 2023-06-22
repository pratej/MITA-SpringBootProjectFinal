package com.mita.user.repository;

import com.mita.user.model.UserActivity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserActivityRepository extends MongoRepository<UserActivity, String> {
    // Add custom query methods or define additional queries if needed
}
