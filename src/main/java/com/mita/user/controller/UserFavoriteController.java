package com.mita.user.controller;

import com.mita.user.model.UserFavorite;
import com.mita.user.service.UserFavoriteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user-favorites")
public class UserFavoriteController {
    private final UserFavoriteService userFavoriteService;

    public UserFavoriteController(UserFavoriteService userFavoriteService) {
        this.userFavoriteService = userFavoriteService;
    }

    @PostMapping
    public ResponseEntity<UserFavorite> createUserFavorite(@RequestBody UserFavorite userFavorite) {
        UserFavorite createdFavorite = userFavoriteService.createUserFavorite(userFavorite);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdFavorite);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserFavorite> getUserFavoriteById(@PathVariable String id) {
        UserFavorite userFavorite = userFavoriteService.getUserFavoriteById(id);
        if (userFavorite != null) {
            return ResponseEntity.ok(userFavorite);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserFavorite> updateUserFavorite(@PathVariable String id, @RequestBody UserFavorite userFavorite) {
        UserFavorite updatedFavorite = userFavoriteService.updateUserFavorite(id, userFavorite);
        if (updatedFavorite != null) {
            return ResponseEntity.ok(updatedFavorite);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUserFavorite(@PathVariable String id) {
        boolean deleted = userFavoriteService.deleteUserFavorite(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

