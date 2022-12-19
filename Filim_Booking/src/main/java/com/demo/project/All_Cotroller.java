package com.demo.project;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.demo.project.DTO_Bean.MovieDetails;
import com.demo.project.DTO_Bean.OrderHistory;
import com.demo.project.DTO_Bean.Seat;
import com.demo.project.DTO_Bean.Users;
import com.demo.project.Service.UsersDAO;



@Controller
public class All_Cotroller 
{
	@Autowired
	private UsersDAO dao;
	

	@GetMapping("/")
	public String home(Model ml, HttpSession session)
	{

		String movie = (String) session.getAttribute("movieName");
		System.out.println("<--------------------------"+movie + "----------------------->");
		
		List<MovieDetails> m2 = dao.getAllMovie();
		System.out.println(movie+" and "+m2);
		
		ml.addAttribute("movieList", m2);
		ml.addAttribute("menu", "home");

		return "index";
	}
	
	@GetMapping("/booking")
	public String bookingCheck(@RequestParam("movieName") String movieName, Model ml, HttpSession session) 
	{
		List<MovieDetails> l1 = dao.getAllMovie();
		List<String> ckMovie = new ArrayList<>();
		
		for (MovieDetails string : l1) 
		{
			ckMovie.add(string.getMovieName());
		}
		
		if (ckMovie.contains(movieName))
		{
			session.setAttribute("movieName", movieName);
			System.out.println(movieName);
			LocalDate now = LocalDate.now();
			LocalDate monthLimit = LocalDate.now();
			String time = "09:00 am";
			List<String> seatNo1 = new ArrayList<String>();
			List<Seat> all = dao.getAllSeat(now, time);

			for (Seat s : all) 
			{
				for (String s1 : s.getSeatNo()) 
				{
					seatNo1.add(s1);
				}

			}

			ml.addAttribute("date", now);
			ml.addAttribute("max", monthLimit.plusMonths(1));
			ml.addAttribute("min", monthLimit);
			ml.addAttribute("time", time);
			ml.addAttribute("seats", seatNo1);
			return "home";

		} 
		else 
		{
			return "redirect:/";

		}

	}
	
	@RequestMapping("/register")
	public String register(Model ml)
	{

		ml.addAttribute("menu", "register");
		return "register";
	}

	@GetMapping("/loginForm")
	public String loginForm(Model m)
	{
		m.addAttribute("menu", "login");
		
		return "login";
	}


	@PostMapping("/save")
	public String save(@ModelAttribute("users") Users users) 
	{
		dao.save(users);
		return "redirect:/register";

	}

	@PostMapping("/processing")
	public String login(@RequestParam("email") String email, @RequestParam("password") String password,HttpSession session, Model m) {

		Users obj = (Users) session.getAttribute("user");
		
		System.out.println("<-------"+obj+"------->");
		if (obj != null)
		{
			return "redirect:/booking-seat";
		} 
		else 
		{

			Users users = dao.login(email, password);
			System.out.println("<-----------"+users+"-------------->");

			if (users == null) 
			{
				m.addAttribute("failed", "Invalied login");
				return "login";
			} 
			else
			{
				session.setAttribute("user", users);
			}
			return "redirect:/home";
		}
	}

	@GetMapping("/home")
	public String mainDashboard(HttpSession session, Model ml)
	{
		session.removeAttribute("bookingdate");
		session.removeAttribute("bookingtime");
		session.removeAttribute("movieName");
		ml.addAttribute("menu", "home");

		String message = (String) session.getAttribute("msg");
		ml.addAttribute("message", message);
		session.removeAttribute("msg");
    	System.out.println(message);
		List<MovieDetails> movie2 = dao.getAllMovie();
		ml.addAttribute("listMovie", movie2);

		return "main-dashboard";
	}

	@GetMapping("/booking-seat")
	public String getUser(@RequestParam("movieName") String mName, HttpSession session, Model ml) 
	{
		List<MovieDetails> l1 = dao.getAllMovie();
		List<String> ckMovie = new ArrayList<>();
		
		for (MovieDetails string : l1)
        {
			ckMovie.add(string.getMovieName());
		}
		
		if (ckMovie.contains(mName))
		{
			session.setAttribute("movieName", mName);

			LocalDate now = LocalDate.now();
			LocalDate monthLimit = LocalDate.now();
			String time = "09:00 am";

		    Users users = (Users) session.getAttribute("user");
			List<String> seatNo1 = new ArrayList<String>();
			List<Seat> seat = users.getSeat();

			List<Seat> all = dao.getAllSeat(now, time);

			for (Seat s : all) 
			{
				for (String s1 : s.getSeatNo())
				{
					seatNo1.add(s1);
				}

			}

			ml.addAttribute("date", now);
			ml.addAttribute("time", time);
			ml.addAttribute("max", monthLimit.plusMonths(1));
			ml.addAttribute("min", monthLimit);
			ml.addAttribute("seats", seatNo1);
			ml.addAttribute("seat", seat);
			session.setAttribute("user", users);
			return "dashboard";
		}
		
		else
		{
			return "redirect:/home";
		}

	}

	@GetMapping("/logout")
	public String logout(HttpSession session)
	{
		session.removeAttribute("user");

		session.removeAttribute("bookingdate");
		session.removeAttribute("bookingtime");
		session.removeAttribute("movieName");

		return "redirect:/";
	}

	@PostMapping("/book-seat")
	public String bookSeat(@ModelAttribute("Seat") Seat seat, @RequestParam("movieName") String movieName,HttpSession session, Model m) 
	{
		LocalDate currentDate = LocalDate.now();
		ZoneId defaultZoneId = ZoneId.systemDefault();
		
		Date todayDate = Date.from(currentDate.atStartOfDay(defaultZoneId).toInstant());
		
		LocalDate date = (LocalDate) session.getAttribute("bookingdate");
		String time = (String) session.getAttribute("bookingtime");
		System.out.println(seat.getSeatNo().equals(null) + " And " + movieName.equals(null));
		Users obj = (Users) session.getAttribute("user");

		if (obj == null)
		{
			return "redirect:/loginForm";
		}
		else if ((seat.getSeatNo().isEmpty()) && (movieName.equals(null)))
		{
			System.out.println("<-----------Seat is null---------->");
			return "redirect:/home";
		} 
		else if (date == null) 
		{
			date = currentDate;
			time = "09:00 am";
			if(date.isAfter(currentDate) || date.equals(currentDate) && date.isBefore(currentDate.plusMonths(1)) || date.equals(currentDate.plusMonths(1)))			
			{

				Date date2 = Date.from(date.atStartOfDay(defaultZoneId).toInstant());
				List<Double> price = new ArrayList<Double>();
				double sum = 0;
				double p = 149.5;
				for (String s : seat.getSeatNo()) 
				{
					sum = sum + p;
					price.add(p);
				}
				seat.setTotal(sum);
				seat.setPrice(price);

				OrderHistory history = new OrderHistory(seat.getSeatNo(), price, sum, movieName, todayDate, date2, time,obj);
				dao.saveSeat(seat, obj, date2, time);
				dao.saveHistory(history, obj);
				List<String> seatNo1 = new ArrayList<String>();
				List<Users> all = dao.getAll();
				for (Users c : all)
				{
					for (Seat s : c.getSeat())
					{
						for (String s1 : s.getSeatNo()) 
						{
							seatNo1.add(s1);
						}

					}
				}

				m.addAttribute("seats", seatNo1);
				session.setAttribute("user", obj);
				session.setAttribute("msg", "<---- Your seat book successsfully ---->");
				return "redirect:/home";

			} 
			else 
			{
				System.out.println("<------------Early day--------->");
				return "redirect:/booking-seat?movieName=" + movieName;

			}
		} 
		else 
		{
			if(date.isAfter(currentDate) ||  date.equals(currentDate) && date.isBefore(currentDate.plusMonths(1)) || date.equals(currentDate.plusMonths(1)))
			{
				Date date2 = Date.from(date.atStartOfDay(defaultZoneId).toInstant());
				List<Double> price = new ArrayList<Double>();
				double sum = 0;
				double p = 149.5;
				for (String s : seat.getSeatNo())
				{
					sum = sum + p;
					price.add(p);
				}
				seat.setTotal(sum);
				seat.setPrice(price);

				OrderHistory history = new OrderHistory(seat.getSeatNo(), price, sum, movieName, todayDate, date2, time,obj);
				
				dao.saveSeat(seat, obj, date2, time);
				dao.saveHistory(history, obj);
				List<String> seatNo1 = new ArrayList<String>();
				
				List<Users> all = dao.getAll();
				for (Users c : all)
				{
					for (Seat s : c.getSeat())
					{
						for (String s1 : s.getSeatNo())
						{
							seatNo1.add(s1);
						}

					}
				}

				m.addAttribute("seats", seatNo1);
				session.setAttribute("user", obj);
				session.setAttribute("msg", "<---- Your seat book successsfully ---->");
				return "redirect:/home";

			} 
			else 
			{
				System.out.println("<------------Early day--------->");
				return "redirect:/booking-seat?movieName=" + movieName;

			}
		}

	}

	@GetMapping("/order-history")
	public String history(HttpSession session, Model m)
	{
		Date todayDate = new Date();
		Users object = (Users) session.getAttribute("user");
		
		
		session.setAttribute("user", object);
		
		List<OrderHistory> list = dao.getAllHistory(object.getBid());
		m.addAttribute("hList", list);
		m.addAttribute("todaydate", todayDate);

		LocalDate date = (LocalDate) session.getAttribute("bookingdate");
		System.out.println(date);
		m.addAttribute("menu", "order");
		return "history";
	}

	@GetMapping("/clear-seats")
	public String eraseSeat(HttpSession session) 
	{
		LocalDate now = LocalDate.now();
		String time = "09:00 am";
		Users object = (Users) session.getAttribute("user");

		if (object != null)
		{
			List<Seat> list = dao.getAllSeat(now, time);
			
			for (Seat seat : list) 
			{
				long id = seat.getsId();
				dao.delete(id);
			}

		}
		return "redirect:/booking-seat";
	}

	@GetMapping("/all-customers-records")
	public String allRecords(Model m, HttpSession session) 
	{
		Users object = (Users) session.getAttribute("user");
		long bid = object.getBid();
		if (bid == 1)
		{
			List<Users> all = dao.getAll();
			m.addAttribute("records", all);
			m.addAttribute("menu", "allusers");
		
			return "user_records";
		} 
		else
		{
			return "redirect:/booking-seat";
		}
	}

	@GetMapping("/all-seats/{id}")
	public String allSeats(@PathVariable("id") long id, Model m, HttpSession session)
	{
		Users object = (Users) session.getAttribute("user");
		long bid = object.getBid();
		if (bid == 1)
		{
			List<OrderHistory> list = dao.getAllHistory(id);
			m.addAttribute("seatRecords", list);
			m.addAttribute("menu", "allusers");
			return "seat-records";
		}
		else 
		{
			return "redirect:/booking-seat";
		}

	}


	@GetMapping("/setting")
	public String getSetting(Model m, HttpSession session) 
	{
		Users customer = (Users) session.getAttribute("user");
		m.addAttribute("user", customer);
		m.addAttribute("menu", "setting");
		return "setting";
	}


	@GetMapping("/setting/update/{id}")
	public String updateForm(@PathVariable("id") long id, Model m) 
	{
		System.out.println(id);
		m.addAttribute("menu", "setting");
		return "update-details";

	}

	@PostMapping("/setting/update-details")
	public String updateDetails(@ModelAttribute("customer") Users cust, HttpSession session) 
	{
		String name = cust.getName();
		String email = cust.getEmail();
		Users customer = (Users) session.getAttribute("user");
		customer.setName(name);
		customer.setEmail(email);
		dao.updateDetail(customer);

		return "redirect:/setting";

	}

	@PostMapping("/check")
	public String checkDate(@RequestParam("localdate") String date, @RequestParam("localtime") String time, Model m,HttpSession session)
	{
		Users object = (Users) session.getAttribute("user");
		String movie = (String) session.getAttribute("movieName");
		
		LocalDate monthLimit = LocalDate.now();
		
		if (movie.equals(null))
		{
			return "home";

		}
		else if (object == null)
		{
			LocalDate now = LocalDate.parse(date);
			List<String> seatNo1 = new ArrayList<String>();
			List<Seat> all = dao.getAllSeat(now, time);

			for (Seat s : all)
			{
				for (String s1 : s.getSeatNo())
				{
					seatNo1.add(s1);
				}

			}

			session.setAttribute("bookingdate", now);
			session.setAttribute("bookingtime", time);
			m.addAttribute("date", now);
			m.addAttribute("max", monthLimit.plusMonths(1));
			m.addAttribute("min", monthLimit);
			m.addAttribute("time", time);
			m.addAttribute("seats", seatNo1);

			return "home";
		}
		else
		{
			LocalDate now = LocalDate.parse(date);
			List<String> seatNo1 = new ArrayList<String>();
			List<Seat> all = dao.getAllSeat(now, time);

			for (Seat s : all) 
			{
				for (String s1 : s.getSeatNo()) 
				{
					seatNo1.add(s1);
				}

			}

			session.setAttribute("bookingdate", now);
			session.setAttribute("bookingtime", time);
			m.addAttribute("date", now);
			m.addAttribute("max", monthLimit.plusMonths(1));
			m.addAttribute("min", monthLimit);
			m.addAttribute("time", time);
			m.addAttribute("seats", seatNo1);

			return "dashboard";
		}

	}

	@ExceptionHandler(Exception.class)
	public String handleError(Exception ex, Model m, HttpSession session) 
	{
		Users object = (Users) session.getAttribute("user");
		if (object == null)
		{
			return "redirect:/loginForm";
		} 
		else
		{
			return "redirect:/home";
		}
	}
	

}
