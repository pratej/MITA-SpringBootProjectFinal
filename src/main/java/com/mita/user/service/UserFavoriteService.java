package com.mita.user.service;

import com.mita.user.model.UserFavorite;

import java.util.List;

public interface UserFavoriteService {
    UserFavorite createUserFavorite(UserFavorite userFavorite);
    UserFavorite getUserFavoriteById(String id);
    List<UserFavorite> getAllUserFavorites();
    UserFavorite updateUserFavorite(String id, UserFavorite userFavorite);
    boolean deleteUserFavorite(String id);
}
