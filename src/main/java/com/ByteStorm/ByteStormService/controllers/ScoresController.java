package com.ByteStorm.ByteStormService.controllers;

import com.ByteStorm.ByteStormService.models.Scores;
import com.ByteStorm.ByteStormService.repositories.ScoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ScoresController {
    @Autowired
    ScoresRepository scoresRepository;

    @GetMapping(value="/api/leaderboard")
    public ResponseEntity<List<Scores>> getScores() {
        List<Scores> scores = scoresRepository.findByOrderByScoreDesc();
        return new ResponseEntity<>(scores, HttpStatus.OK);
    }

    @PostMapping(value="/api/leaderboard")
    public ResponseEntity<Scores> addNewScore(@RequestBody Scores scoreToAdd){
        return new ResponseEntity<>(scoresRepository.save(scoreToAdd), HttpStatus.CREATED);

    }
}
