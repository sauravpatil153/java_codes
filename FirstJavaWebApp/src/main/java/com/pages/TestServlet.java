package com.pages;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test1")
public class TestServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Inside testservlet doGet method");
	}

	@Override
	public void destroy() {
		System.out.println("Inside testservlet destroy method");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Inside testservlet init method");
	}
	
}
