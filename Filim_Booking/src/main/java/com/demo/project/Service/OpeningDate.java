package com.demo.project.Service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.project.DTO_Bean.CurrentDateOperation;


@Repository
public interface OpeningDate extends JpaRepository<CurrentDateOperation, Long> 
{

}
