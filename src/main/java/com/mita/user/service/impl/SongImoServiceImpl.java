package com.mita.user.service.impl;

import com.mita.user.model.*;
import com.mita.user.repository.SongImoRepository;
import com.mita.user.service.SongImoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

@AllArgsConstructor
@Service
public class SongImoServiceImpl implements SongImoService {


    private SongImoRepository songImoRepository;

    @Override
    public SongImo getSongImo() {

        return null;
    }

    @Override
    public SongImo getSongImoById(String songImoId) {

        SongImo songImo = songImoRepository.getSongImoById(songImoId);
        if (songImo == null) {
            throw new NotFoundException("Song IMO not found");
        }
        return songImo;
    }


    public SongImo addSongImo(SongImo request) {

        SongImo songImo = new SongImo(request.getSongImoId(),request.getInfo(), request.getSong(), request.getArtist(),
                request.getStatus(), request.getStats(), request.getSources(), request.getHistory(),
                request.getAudit(), request.getTags());


        SongImo savedSongImo = songImoRepository.save(songImo);

        return savedSongImo;
        }

    @Override
    public SongImo updateSong(String songImoId, SongImo request) {

        SongImo existingSongImo = songImoRepository.findById(songImoId)
                .orElseThrow(() -> new NotFoundException("Song IMO not found"));

        existingSongImo.setInfo(request.getInfo());
        existingSongImo.setSong(request.getSong());
        existingSongImo.setArtist(request.getArtist());
        existingSongImo.setStatus(request.getStatus());
        existingSongImo.setStats(request.getStats());
        existingSongImo.setSources(request.getSources());
        existingSongImo.setHistory(request.getHistory());
        existingSongImo.setAudit(request.getAudit());
        existingSongImo.setTags(request.getTags());

        SongImo updatedSongImo = songImoRepository.save(existingSongImo);

        return updatedSongImo;

    }

    @Override
    public void deleteSong(String songImoId) {
        songImoRepository.deleteSongImoById(songImoId);
    }

    @Override
    public SongInfo getInfo(String songImoId) {

        return songImoRepository.findSongImoInfoById(songImoId);
    }

    @Override
    public Song getSong(String songImoId) {

        SongImo songImo = songImoRepository.findById(songImoId).orElse(null);

        if (songImo != null) {
            return songImo.getSong();
        }
        return null;
    }

    @Override
    public Artist getArtist(String songImoId) {

        SongImo songImo = songImoRepository.findById(songImoId).orElse(null);

        if (songImo != null) {
            return songImo.getArtist();
        }

        return null;
    }

    public Status getStatus(String songImoId) {

        SongImo songImo = songImoRepository.findById(songImoId).orElse(null);

        if (songImo != null) {
            return songImo.getStatus();
        }
        return null;
    }

    public Stats getStats(String songImoId) {

        SongImo songImo = songImoRepository.findById(songImoId).orElse(null);

        if (songImo != null) {
            return songImo.getStats();
        }
        return null;
    }

    public Audit getAudit(String songImoId) {

        SongImo songImo = songImoRepository.findById(songImoId).orElse(null);

        if (songImo != null) {
            return songImo.getAudit();
        }
        return null;
    }
}