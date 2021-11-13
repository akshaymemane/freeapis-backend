package com.freeapis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.freeapis.model.MovieDetail;
import com.freeapis.repository.MovieRepository;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

	@Autowired
	MovieRepository movieRepository;
	
	@GetMapping
	public ResponseEntity<List<MovieDetail>> getAllMovies(){
		return new ResponseEntity<>(movieRepository.findAll(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<MovieDetail> saveMovie(@RequestBody MovieDetail movieDetail){
		return new ResponseEntity<>(movieRepository.save(movieDetail), HttpStatus.CREATED);
	}
}
