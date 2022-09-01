package com.readandupdate;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class UpdatedServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<h1 align='center'>Your Updated Information</h1>");
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		
		out.print("<h3>Name : "+name+"</h3>");
		out.print("<h3>Email : "+email+"</h3>");
		out.print("<h3>Phone : "+phone+"</h3>");
		out.print("<h3>Password : "+password+"</h3>");
		out.print("<h3>Address : "+address+"</h3>");
		
		
	}

}
