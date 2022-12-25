package com.first;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int number_1 = Integer.parseInt(request.getParameter("number_1"));
		int number_2 = Integer.parseInt(request.getParameter("number_2"));
		
		int sum = number_1 + number_2;
		
		request.setAttribute("sum", sum);
		
		RequestDispatcher dis = request.getRequestDispatcher("square");
		dis.forward(request, response);
	
	}

}
