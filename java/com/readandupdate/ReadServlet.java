package com.readandupdate;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class ReadServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		
		

		
		out.print("<h2 align='center'>You can modify your data here</h2>");
		
		out.print("<fieldset><legend style='font-size:200%'>Your Information</legend>");
		out.print("<form action='UpdatedServlet' method='post'>");
		out.print("Name : <input type='text' name='name' value='"+name+"'/><br/>");
		out.print("Email : <input type='text' name='email' value='"+email+"'/><br/>");
		out.print("Phone : <input type='text' name='phone' value='"+phone+"'/><br/>");
		out.print("Password : <input type='text' name='password' value='"+password+"'/><br/>");
		out.print("Address : <input type='text' name='address' value='"+address+"'/><br/>");
		out.print("<input type='submit' value='Update'/>");
		out.print("</fieldset>");
	}

}
