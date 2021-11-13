package com.freeapis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="movie_detailS")
public class MovieDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "movie_id")
	private Integer movieId;
	
	@Column(name = "movie_name")
	private String movieName;
	
	@Column(name = "movie_description")
	private String movieDescription;
	
	@Column(name = "movie_release_year")
	private String movieResleaseYear;
	
	@Column(name = "movie_rating")
	private String movieRating;
	
	@Column(name = "movie_image_url")
	private String movieImageUrl;
}
