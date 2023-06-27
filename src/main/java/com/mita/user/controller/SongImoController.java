package com.mita.user.controller;

import com.mita.user.service.SongImoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.mita.user.model.*;

@RestController
@RequestMapping("/songImo")
public class SongImoController {

    @Autowired
    private SongImoService songImoService;

    @GetMapping(produces = "application/json")
    public ResponseEntity<SongImo> getSongImo(
    ) {
        try {

        }
        catch (Exception e){

        }

        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/{songImoId}")
    public ResponseEntity<SongImo> getSongImoById(
            @PathVariable String songImoId
    ) {
        try {

        }
        catch (Exception e){

        }

        return null;
    }
    @PostMapping(produces ="application/json")
    public ResponseEntity<SongImo> addSongImo(
            @RequestBody final SongImo request
    ) {
        try {
        }
        catch (Exception e){

        }

        return null;
    }

    @PutMapping(value = "/{songImoId}",produces ="application/json")
    public ResponseEntity<SongImo> updateSongById(
            @RequestBody final SongImo request,
            @PathVariable String songImoId
    ) {
        try {

        }
        catch (Exception e){

        }

        return null;
    }

    @DeleteMapping(value = "/{songImoId}",produces ="application/json")
    public ResponseEntity<SongImo> deleteSongById(
            @PathVariable String songImoId
    ) {
        try {

        }
        catch (Exception e){

        }

        return null;
    }

    @GetMapping(value = "/{songImoId}/info",produces = "application/json")
    public ResponseEntity<?> getInfo(
            @PathVariable String songImoId) {
        try{

        }
        catch(Exception e){

        }

        return null;
    }

    @GetMapping(value = "/{songImoId}/song",produces = "application/json")
    public ResponseEntity<?> getSongById(
            @PathVariable String songImoId) {
        try {

        }
        catch (Exception e){

        }
        return null;
    }

    @GetMapping(value = "/{songImoId}/artist",produces = "application/json")
    public ResponseEntity<SongImo> getArtist(
            @PathVariable String songImoId) {
        try{

        }
        catch (Exception e){

        }

        return null;
    }

    @GetMapping(value = "/{songImoId}/status",produces = "application/json")
    public ResponseEntity<SongImo> getStatus(
            @PathVariable String songImoId) {
        try{

        }
        catch(Exception e){

        }

        return null;
    }
    @GetMapping(value = "/{songImoId}/stats",produces = "application/json")
    public ResponseEntity<?> getStats(@PathVariable String songImoId) {
        try{

        }catch (Exception e){

        }
        return null;
    }

    @GetMapping("/{songImoId}/audit")
    public ResponseEntity<?> getAudit(@PathVariable String songImoId) {
        try{

        }catch (Exception e){

        }
        return null;
    }

}
