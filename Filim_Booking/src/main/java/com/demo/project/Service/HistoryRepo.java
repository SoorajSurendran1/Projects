package com.demo.project.Service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.project.DTO_Bean.OrderHistory;

@Repository
public interface HistoryRepo extends JpaRepository< OrderHistory, Long> 
{
	
	@Query(value = "select * from o_history where users_b_id=? ORDER BY h_id DESC", nativeQuery = true)
	public List<OrderHistory> getAllHistory(long id);

}
