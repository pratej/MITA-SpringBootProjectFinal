package com.mita.user.controller;
import com.mita.user.model.SongStock;
import com.mita.user.service.SongStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/songStock")
@CrossOrigin(origins = "")
public class SongStockController {

    @Autowired
    private SongStockService songStockService;

    /**
     * Swagger configuration
     * @param response
     * @throws IOException
     */
    @ApiIgnore
    @RequestMapping(value="/songImo")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping("/{songStockId}")
    public ResponseEntity<SongStock> getSongStockById(
            @PathVariable String songStockId) {
        try {
            SongStock songStock = songStockService.getSongStockById(songStockId);
            return new ResponseEntity<>(songStock, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<SongStock> addSongStock(
            @RequestBody SongStock songStock) {
        try {
            SongStock createdSongStock = songStockService.addSongStock(songStock);
            return new ResponseEntity<>(createdSongStock, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{songStockId}")
    public ResponseEntity<SongStock> updateSongStock(
            @PathVariable String songStockId,
            @RequestBody SongStock request) {
        try {
            SongStock updatedSongStock = songStockService.updateSongStock(songStockId, request);
            return new ResponseEntity<>(updatedSongStock, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{songStockId}")
    public ResponseEntity<Void> deleteSongStock(
            @PathVariable String songStockId) {
        try {
            songStockService.deleteSongStock(songStockId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Add more apis for SongStock
     */

}

