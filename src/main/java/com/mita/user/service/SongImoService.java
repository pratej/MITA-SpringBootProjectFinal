package com.mita.user.service;

import com.mita.user.model.*;


public interface SongImoService {

    SongImo getSongImo();

    SongImo getSongImoById(String songImoId);

    SongImo addSongImo(SongImo request);

    SongImo updateSong(String songImoId, SongImo request);

    void deleteSong(String songImoId);

    SongInfo getInfo(String songImoId);

    Song getSong(String songImoId);

    Artist getArtist(String songImoId);

    Status getStatus(String songImoId);

    Stats getStats(String songImoId);

    Audit getAudit(String songImoId);
}
