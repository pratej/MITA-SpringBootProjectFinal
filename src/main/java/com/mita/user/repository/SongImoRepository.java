package com.mita.user.repository;

import com.mita.user.model.SongImo;
import com.mita.user.model.SongInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongImoRepository extends MongoRepository<SongImo,String> {

    SongImo getSongImoById(String songImoId);
    void deleteSongImoById(String songImoId);

    SongInfo findSongImoInfoById(String songImoId);

}
