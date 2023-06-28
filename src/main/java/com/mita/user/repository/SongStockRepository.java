package com.mita.user.repository;

import com.mita.user.model.SongStock;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SongStockRepository extends MongoRepository<SongStock,String> {
}
