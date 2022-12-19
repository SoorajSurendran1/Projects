package com.demo.project;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.demo.project.Filter.Filter;
@Controller
public class Confic implements WebMvcConfigurer 
{
	@Bean
	public Filter getFilter()
	{
		return new Filter();
	}
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		registry.addInterceptor(getFilter()).addPathPatterns("/*");
	}

}
