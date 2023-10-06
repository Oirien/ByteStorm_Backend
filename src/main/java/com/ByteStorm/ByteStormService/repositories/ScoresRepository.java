package com.ByteStorm.ByteStormService.repositories;

import com.ByteStorm.ByteStormService.models.Scores;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ScoresRepository extends MongoRepository<Scores, String> {
}
