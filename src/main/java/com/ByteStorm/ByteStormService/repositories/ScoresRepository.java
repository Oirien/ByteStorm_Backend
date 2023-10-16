package com.ByteStorm.ByteStormService.repositories;

import com.ByteStorm.ByteStormService.models.Scores;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.http.HttpStatus;

import java.util.List;

public interface ScoresRepository extends MongoRepository<Scores, String> {
    List<Scores> findByOrderByScoreDesc();
}
