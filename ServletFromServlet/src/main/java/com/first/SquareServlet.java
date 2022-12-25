package com.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		int number = (int) request.getAttribute("sum");
		
		int square = number * number;
		
		
		PrintWriter out = response.getWriter();
		
		out.println("Sum of two number is "+ number);
		out.println("Square of sum is "+ square);
		
	}
}
