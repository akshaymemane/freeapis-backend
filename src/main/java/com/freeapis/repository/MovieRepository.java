package com.freeapis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freeapis.model.MovieDetail;

public interface MovieRepository extends JpaRepository<MovieDetail, Integer>{

}
