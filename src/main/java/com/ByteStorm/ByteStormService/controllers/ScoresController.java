package com.ByteStorm.ByteStormService.controllers;

import com.ByteStorm.ByteStormService.models.Scores;
import com.ByteStorm.ByteStormService.repositories.ScoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ScoresController {
    @Autowired
    ScoresRepository scoresRepository;

    @GetMapping(value = "/api/leaderboard")
    public ResponseEntity<Page<Scores>> getScores(
            @RequestParam(name = "page", defaultValue = "0") int page,
            @RequestParam(name = "pageSize", defaultValue = "10") int pageSize
    ) {
        PageRequest pageRequest = PageRequest.of(page, pageSize, Sort.by(Sort.Direction.DESC, "score"));
        Page<Scores> scoresPage = scoresRepository.findAll(pageRequest);
        return new ResponseEntity<>(scoresPage, HttpStatus.OK);
    }

    @PostMapping(value="/api/leaderboard")
    public ResponseEntity<Scores> addNewScore(@RequestBody Scores scoreToAdd){
        return new ResponseEntity<>(scoresRepository.save(scoreToAdd), HttpStatus.CREATED);

    }
}
