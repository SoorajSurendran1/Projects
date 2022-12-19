package com.demo.project.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.demo.project.DTO.Covid;
import com.demo.project.service.CovidData;

@Controller
public class Controller1 
{

	@Autowired
	CovidData cod1;
    @GetMapping("/")
	public String home(Model mol)
	{
		List<Covid> l1=cod1.getAlldate();
		int tdr=l1.stream().mapToInt(start->start.getDifferFromPrevay()).sum();
		mol.addAttribute("Covid", l1);
		mol.addAttribute("totalDeathsReported", tdr);
		
		return "home";
	}
}
