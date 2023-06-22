package com.mita.user.service.impl;

import com.mita.user.model.UserActivity;
import com.mita.user.model.UserFavorite;
import com.mita.user.repository.UserFavoriteRepository;
import com.mita.user.service.UserFavoriteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserFavoriteServiceImpl implements UserFavoriteService {
    private final UserFavoriteRepository userFavoriteRepository;

    public UserFavoriteServiceImpl(UserFavoriteRepository userFavoriteRepository) {
        this.userFavoriteRepository = userFavoriteRepository;
    }

    @Override
    public UserFavorite createUserFavorite(UserFavorite userFavorite) {
        // Perform any necessary validation or business logic before creating the favorite
        // ...

        return userFavoriteRepository.save(userFavorite);
    }

    @Override
    public UserFavorite getUserFavoriteById(String id) {
        return userFavoriteRepository.findById(id).orElse(null);
    }

    @Override
    public List<UserFavorite> getAllUserFavorites() {
        return userFavoriteRepository.findAll();
    }

    @Override
    public UserFavorite updateUserFavorite(String id, UserFavorite userFavorite) {
        // Check if the favorite exists
        UserFavorite existingFavorite = getUserFavoriteById(id);
        if (existingFavorite != null) {
            // Perform any necessary validation or business logic before updating the favorite
            // ...

            // Update the favorite data
            return userFavoriteRepository.save(userFavorite);
        }
        return null;
    }

    @Override
    public boolean deleteUserFavorite(String id) {
        // Check if the favorite exists
        UserFavorite existingFavorite = getUserFavoriteById(id);
        if (existingFavorite != null) {
            // Delete the favorite from the database
            userFavoriteRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
