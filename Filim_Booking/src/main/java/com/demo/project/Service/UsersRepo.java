package com.demo.project.Service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.project.DTO_Bean.Users;

@Repository
public interface UsersRepo extends JpaRepository<Users, Long>
{
	
	public Users findByEmailAndPassword(String email, String password);

}

