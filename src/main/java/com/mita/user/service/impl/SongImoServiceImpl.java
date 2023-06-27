package com.mita.user.service.impl;

import com.mita.user.model.*;
import com.mita.user.service.SongImoService;
import org.springframework.stereotype.Service;

@Service
public class SongImoServiceImpl implements SongImoService {


    @Override
    public SongImo getSongImo() {

        return null;
    }

    @Override
    public SongImo getSongImoById(String songImoId) {
        return null;
    }

    @Override
    public SongImo addSongImo(SongImo request) {
        return null;
    }

    @Override
    public SongImo updateSong(String songImoId, SongImo request) {
        return null;
    }

    @Override
    public void deleteSong(String songImoId) {

    }

    @Override
    public SongInfo getInfo(String songImoId) {
        return null;
    }

    @Override
    public Song getSong(String songImoId) {
        return null;
    }

    @Override
    public Artist getArtist(String songImoId) {
        return null;
    }

    public Status getStatus(String songImoId) {

        Status status = new Status();
        return status;
    }

    public Stats getStats(String songImoId) {

        Stats stats = new Stats();
        return stats;
    }

    public Audit getAudit(String songImoId) {

        Audit audit = new Audit();
        return audit;
    }
}