package com.demo.project.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.project.DTO_Bean.CurrentDateOperation;
import com.demo.project.DTO_Bean.MovieDetails;
import com.demo.project.DTO_Bean.OrderHistory;
import com.demo.project.DTO_Bean.Seat;
import com.demo.project.DTO_Bean.Users;

@Component
public class UsersDAO 
{
	@Autowired
	private UsersRepo repo;
	
	@Autowired
	private SeatRepo repo1;
	
	@Autowired
	private HistoryRepo repo2;
	
	@Autowired
	private MovieRepo movieRepo;
	
	
	public int save(Users user) 
	{
		
		repo.save(user);
		return 1;
		
	}
	
	public Users login(String email, String password) 
	{
		Users users = repo.findByEmailAndPassword(email, password);
		return users;
	}
	
	public int saveSeat(Seat seat, Users users, Date date, String time)
	{
		List<Seat> list = new ArrayList<Seat>();
		list.add(seat);
		users.setSeat(list);
		CurrentDateOperation cdo= new CurrentDateOperation();
		cdo.setShowDate(date);
		cdo.setShowTime(time);
		cdo.setSeat(list);
		
		seat.setOperation(cdo);
		seat.setOperation(cdo);
		seat.setUsers(users);
		Seat save = repo1.save(seat);
		System.out.println(save);
		return 1;
	}
	
	public List<Seat> getSeats(long id)
	{
		List<Seat> list = repo1.getAllSeat(id);
		return list;
	}
	
	public List<Users> getAll()
	{
		List<Users> findAll = repo.findAll();
		return findAll;
	}
	
	public OrderHistory saveHistory(OrderHistory history, Users users) 
	{
		users.setHistory(history);
		OrderHistory save = repo2.save(history);
		return save;
	}
	

	public List<OrderHistory> getAllHistory(long id)
	{
		List<OrderHistory> list = repo2.getAllHistory(id);		
		return list;
	}
	
	public List<Seat> getAllSeat(LocalDate date, String time)
	{
		List<Seat> list = repo1.getAllByDate(date, time);
		return list;
	}
	
	public void delete(long id) 
	{
		repo1.deleteById(id);
	}
	
	public int updateDetail(Users users)
	{
		repo.save(users);
		return 1;
	}
	
	public List<MovieDetails> getAllMovie()
	{
		List<MovieDetails> list = this.movieRepo.findAll();
		return list;
	}
	
}
