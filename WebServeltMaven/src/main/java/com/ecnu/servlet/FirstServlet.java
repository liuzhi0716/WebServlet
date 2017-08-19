package com.ecnu.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{

	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException {
		doPost(request, response);
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException {
		//response.setContentType("text/html,charset=GBK");
		System.out.println("hello");
		//response.sendRedirect("/WEB-INF/test1.html");
		//RequestDispatcher rd ;
		//rd = getServletContext().getRequestDispatcher("/WEB-INF/test1.html"); 
		request.getRequestDispatcher("/WEB-INF/test1.html").forward(request, response);;
		//rd.forward(request, response);
	}
}
