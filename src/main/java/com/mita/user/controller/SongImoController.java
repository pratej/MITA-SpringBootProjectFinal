package com.mita.user.controller;

import com.mita.user.service.SongImoService;
import com.mita.user.service.impl.SongImoServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.mita.user.model.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@AllArgsConstructor
@RestController
@RequestMapping("/songImo")
@CrossOrigin(origins = "")
public class SongImoController {

    @Autowired
    private SongImoService songImoService;

    private SongImoServiceImpl songImoServiceImpl;


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

    @GetMapping(produces = "application/json")
    public ResponseEntity<SongImo> getSongImo(
    ) {
        try {

        }
        catch (Exception e){

        }

        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     *
     * @param songImoId
     * @return
     */
    @GetMapping("/{songImoId}")
    public ResponseEntity<SongImo> getSongImoById(
            @PathVariable String songImoId
    ) {
        SongImo songImo = songImoService.getSongImoById(songImoId);
        return new ResponseEntity<>(songImo, HttpStatus.OK);
    }

    @PostMapping(produces ="application/json")
    public ResponseEntity<SongImo> addSongImo(
            @RequestBody final SongImo request
    ) {
        SongImo addSong = songImoService.addSongImo(request);
        return new ResponseEntity<>(addSong, HttpStatus.OK);
    }

    @PutMapping(value = "/{songImoId}",produces ="application/json")
    public ResponseEntity<SongImo> updateSongById(
            @RequestBody final SongImo request,
            @PathVariable String songImoId
    ) {
        SongImo updatedSongImo = songImoService.updateSong(songImoId, request);
        return new ResponseEntity<>(updatedSongImo, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{songImoId}",produces ="application/json")
    public ResponseEntity<SongImo> deleteSongById(
            @PathVariable String songImoId
    ) {
        songImoService.deleteSong(songImoId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping(value = "/{songImoId}/info",produces = "application/json")
    public ResponseEntity<SongInfo> getInfo(
            @PathVariable String songImoId) {
        SongInfo songInfo = songImoService.getInfo(songImoId);
        if (songInfo != null) {
            return new ResponseEntity<>(songInfo, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(value = "/{songImoId}/song",produces = "application/json")
    public ResponseEntity<Song> getSongById(
            @PathVariable String songImoId) {
        Song song = songImoService.getSong(songImoId);

        if (song != null) {
            return new ResponseEntity<>(song, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(value = "/{songImoId}/artist",produces = "application/json")
    public ResponseEntity<Artist> getArtist(
            @PathVariable String songImoId) {
        Artist artist = songImoService.getArtist(songImoId);

        if (artist != null) {
            return new ResponseEntity<>(artist, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(value = "/{songImoId}/status",produces = "application/json")
    public ResponseEntity<Status> getStatus(
            @PathVariable String songImoId) {
        Status status = songImoService.getStatus(songImoId);

        if (status != null) {
            return new ResponseEntity<>(status, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping(value = "/{songImoId}/stats",produces = "application/json")
    public ResponseEntity<?> getStats(
            @PathVariable String songImoId) {

        Stats stats = songImoService.getStats(songImoId);

        if (stats != null) {
            return new ResponseEntity<>(stats, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{songImoId}/audit")
    public ResponseEntity<?> getAudit(
            @PathVariable String songImoId) {

        Audit audit = songImoService.getAudit(songImoId);

        if (audit != null) {
            return new ResponseEntity<>(audit, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
