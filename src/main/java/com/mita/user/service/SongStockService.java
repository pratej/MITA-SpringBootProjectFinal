package com.mita.user.service;

import com.mita.user.model.SongStock;

public interface SongStockService {
    SongStock getSongStockById(String songStockId);

    SongStock addSongStock(SongStock songStock);

    SongStock updateSongStock(String songStockId, SongStock songStock);

    void deleteSongStock(String songStockId);
}
