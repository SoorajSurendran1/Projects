 package com.demo.project.Service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.project.DTO_Bean.MovieDetails;



@Repository
public interface MovieRepo extends JpaRepository<MovieDetails, Long> 
{

}
