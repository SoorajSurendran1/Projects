package com.demo.project.DTO;

public class Covid
{
	private String state;
	private String country;
	private int latestTotalDeaths;
	private int differFromPrevay;
	
	
	public Covid()
	{
		System.out.println(this.getClass().getSimpleName());
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getLatestTotalDeaths() {
		return latestTotalDeaths;
	}
	public void setLatestTotalDeaths(int latestTotalDeaths) {
		this.latestTotalDeaths = latestTotalDeaths;
	}
	public int getDifferFromPrevay() {
		return differFromPrevay;
	}
	public void setDifferFromPrevay(int differFromPrevay) {
		this.differFromPrevay = differFromPrevay;
	}
	@Override
	public String toString() {
		return "Covid [state=" + state + ", country=" + country + ", latestTotalDeaths=" + latestTotalDeaths
				+ ", differFromPrevay=" + differFromPrevay + "]";
	}
	
	
}
