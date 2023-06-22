package com.mita.user.model;

import org.springframework.data.mongodb.core.mapping.Document;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.mita.user.model.base.Favorite;
import com.mita.user.model.base.ModelBase;


import java.util.Set;

/**
 * This stores User Favorites
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@Document(collection = "userFavorite")
public class UserFavorite extends ModelBase {

    // The ID
    private String id;

    // The ID of the user
    private String userId;

    // UserName of the user
    private String userName;

    // It can be 'SONG', 'ARTIST', SONGSHARE', 'ARTISTETF', 'GENREETF' etc.
    private String type;

    // Favorite Songs
    private Set<Favorite> favoriteSongs;

    // Favorite Artist
    private Set<Favorite> favoriteArtists;

    // Favorite Songshare
    private Set<Favorite> favoriteSongshares;

    // Favorite Artist ETF
    private Set<Favorite> favoriteArtistEtf;

    // Favorite Genre ETF
    private Set<Favorite> genreEtf;

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Set<Favorite> getFavoriteSongs() {
        return favoriteSongs;
    }

    public void setFavoriteSongs(Set<Favorite> favoriteSongs) {
        this.favoriteSongs = favoriteSongs;
    }

    public Set<Favorite> getFavoriteArtists() {
        return favoriteArtists;
    }

    public void setFavoriteArtists(Set<Favorite> favoriteArtists) {
        this.favoriteArtists = favoriteArtists;
    }

    public Set<Favorite> getFavoriteSongshares() {
        return favoriteSongshares;
    }

    public void setFavoriteSongshares(Set<Favorite> favoriteSongshares) {
        this.favoriteSongshares = favoriteSongshares;
    }

    public Set<Favorite> getFavoriteArtistEtf() {
        return favoriteArtistEtf;
    }

    public void setFavoriteArtistEtf(Set<Favorite> favoriteArtistEtf) {
        this.favoriteArtistEtf = favoriteArtistEtf;
    }

    public Set<Favorite> getGenreEtf() {
        return genreEtf;
    }

    public void setGenreEtf(Set<Favorite> genreEtf) {
        this.genreEtf = genreEtf;
    }

}
