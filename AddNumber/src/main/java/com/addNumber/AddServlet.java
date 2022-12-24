package com.addNumber;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		int number_1 = Integer.parseInt(req.getParameter("number_1"));
		int number_2 = Integer.parseInt(req.getParameter("number_2"));
		
		int sum = number_1 + number_2;
		
		PrintWriter out =  res.getWriter();
		out.println("Sum of two number is : "+sum);
		
	}
}
