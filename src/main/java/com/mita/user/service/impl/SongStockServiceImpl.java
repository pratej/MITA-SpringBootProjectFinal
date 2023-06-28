package com.mita.user.service.impl;

import com.mita.user.model.SongStock;
import com.mita.user.repository.SongStockRepository;
import com.mita.user.service.SongStockService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.webjars.NotFoundException;

@AllArgsConstructor
public class SongStockServiceImpl implements SongStockService {
    @Autowired
    private SongStockRepository songStockRepository;


    @Override
    public SongStock getSongStockById(String songStockId) {
        // Retrieve the SongStock entity from the repository
        SongStock songStock = songStockRepository.findById(songStockId).get();

        if (songStock == null) {
            throw new NotFoundException("SongStock not found");
        }

        return songStock;
    }

    @Override
    public SongStock addSongStock(SongStock songStock) {
        SongStock savedSongStock = songStockRepository.save(songStock);

        return savedSongStock;
    }

    @Override
    public SongStock updateSongStock(String songStockId, SongStock updatedSongStock) {

        SongStock existingSongStock = songStockRepository.findById(songStockId).get();

        if (existingSongStock != null) {
            existingSongStock.setInfo(updatedSongStock.getInfo());
            existingSongStock.setPrice(updatedSongStock.getPrice());
            existingSongStock.setSong(updatedSongStock.getSong());
            existingSongStock.setArtist(updatedSongStock.getArtist());
            existingSongStock.setStats(updatedSongStock.getStats());
            existingSongStock.setSources(updatedSongStock.getSources());
            existingSongStock.setHistory(updatedSongStock.getHistory());
            existingSongStock.setAudit(updatedSongStock.getAudit());
            existingSongStock.setTags(updatedSongStock.getTags());

            SongStock updatedSongStockEntity = songStockRepository.save(existingSongStock);

            return updatedSongStockEntity;
        } else {
            throw new NotFoundException("SongStock not found with id: " + songStockId);
        }
    }

    @Override
    public void deleteSongStock(String songStockId) {

        SongStock songStock = songStockRepository.findById(songStockId).get();

        if (songStock != null) {
            songStockRepository.delete(songStock);
        } else {
            throw new NotFoundException("SongStock not found with id: " + songStockId);
        }

    }
}
