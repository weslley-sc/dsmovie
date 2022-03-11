package com.devsuperior.dsmovie.controller;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService service;

    @GetMapping("")
    public ResponseEntity<Page<MovieDTO>> findAllPage(Pageable pageable) {
        return ResponseEntity.ok().body(service.findAll(pageable));

    }
    @GetMapping("/{id}")
    public ResponseEntity<MovieDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(service.findById(id));

    }
}
