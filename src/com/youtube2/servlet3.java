package com.youtube2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet3 extends HttpServlet

{
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		response.setContentType("text/html");
		try(PrintWriter out = response.getWriter())
		{
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet Servlet3</title>");
			out.println("</head>");
			out.println("<body>");
			
			// name fetch...
			String name = request.getParameter("user_name");
			
			out.println("<h1>Your name is "+name+" </h1>");
		// URL Rewriting technique ex	
		// 	out.println("<a href='servlet4?user="+name+"'>Go to second servlet</a>");

			// hidden form field coding...........
			
			
			out.println(""
					+"<form action='servlet4'>"
					+"<input type='hidden' name='user_name' value='"+name+"' />"
					+"<button>go to second servlet</button>"
					+""
					+""
					+"</form>"
					
					);
			
			
			out.println("</body>");
			out.println("</html>");
			
			
			
			
		}
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		processRequest(request, response);
	}

}
