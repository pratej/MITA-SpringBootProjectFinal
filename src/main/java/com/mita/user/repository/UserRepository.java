package com.mita.user.repository;

import com.mita.user.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    // Add custom query methods or define additional queries if needed
}

