package com.demo.project.DTO_Bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class Seat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "s_id")
	private long sId;
	
	@ElementCollection
	private List<String> seatNo;
	
	@ElementCollection
	private List<Double> price;
	
	@Column(name="total")
	private double total;
	
	@ManyToOne
	private Users users;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private CurrentDateOperation operation;
	
	public Seat() 
	{
		super();
		System.out.println("<-------------super----------->");
	}

	public long getsId() {
		return sId;
	}

	public void setsId(long sId) {
		this.sId = sId;
	}

	public List<String> getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(List<String> seatNo) {
		this.seatNo = seatNo;
	}

	public List<Double> getPrice() {
		return price;
	}

	public void setPrice(List<Double> price) {
		this.price = price;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public CurrentDateOperation getOperation() {
		return operation;
	}

	public void setOperation(CurrentDateOperation operation) {
		this.operation = operation;
	}

	public Seat(long sId, List<String> seatNo, List<Double> price, double total, Users users,
			CurrentDateOperation operation) {
		super();
		this.sId = sId;
		this.seatNo = seatNo;
		this.price = price;
		this.total = total;
		this.users = users;
		this.operation = operation;
	}

	public Seat(List<String> seatNo, List<Double> price, double total, Users users, CurrentDateOperation operation) {
		super();
		this.seatNo = seatNo;
		this.price = price;
		this.total = total;
		this.users = users;
		this.operation = operation;
	}

	@Override
	public String toString() {
		return "Seat [sId=" + sId + ", seatNo=" + seatNo + ", price=" + price + ", total=" + total + ", users=" + users
				+ ", operation=" + operation + "]";
	}

	
		
	
}
