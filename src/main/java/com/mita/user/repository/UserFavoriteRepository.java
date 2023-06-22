package com.mita.user.repository;

import com.mita.user.model.UserFavorite;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserFavoriteRepository extends MongoRepository<UserFavorite, String> {
    // Add custom query methods or define additional queries if needed
}

