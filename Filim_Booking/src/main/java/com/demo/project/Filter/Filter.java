package com.demo.project.Filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

public class Filter implements HandlerInterceptor
{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception 
	{
		int i = response.getStatus();
		if(i==500)
		{
			response.sendRedirect("/loginForm");
			return false;
		}
		return true;
	}
}