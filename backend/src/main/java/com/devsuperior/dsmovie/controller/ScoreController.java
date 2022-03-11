package com.devsuperior.dsmovie.controller;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.dto.ScoreDTO;
import com.devsuperior.dsmovie.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/scores")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;
    @PutMapping
    public ResponseEntity<MovieDTO> saveScore(@RequestBody ScoreDTO dto) {
        MovieDTO movieDTO = scoreService.saveScore(dto);
        return ResponseEntity.ok().body(movieDTO);

    }
}


