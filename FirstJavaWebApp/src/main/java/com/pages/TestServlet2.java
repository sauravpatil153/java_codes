package com.pages;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TestServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	public void destroy() {
		System.out.println("Inside testservlet2 destroy method");
	}


	@Override
	public void init() throws ServletException {
		System.out.println("Inside testservlet2 init method");
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Inside testservlet2 doGet method");
	}

}
