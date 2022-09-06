package com.module4and5_02;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ReadUpdateServlet")
public class ReadUpdateServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");

		ServletContext context = getServletContext();
		context.setAttribute("name", name);
		context.setAttribute("email", email);
		context.setAttribute("phone", phone);

		if (request.getParameter("read") != null) {
			read(request, response);

		} else if (request.getParameter("update") != null) {
			update(request, response);
		}

	}

	public void read(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		ServletContext context = getServletContext();

		out.print("<h1 align='center'>Your Final Details</h1>");
		out.print("<h2>Name : " + context.getAttribute("name") + "</h2>");
		out.print("<h2>Email : " + context.getAttribute("email") + "</h2>");
		out.print("<h2>Phone : " + context.getAttribute("phone") + "</h2>");

	}

	public void update(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		ServletContext context = getServletContext();

		out.print("<h1 align='center'>You Enter Following Details</h1 >");
		out.print("<h3>Name : " + context.getAttribute("name") + "</h3>");
		out.print("<h3>Email : " + context.getAttribute("email") + "</h3>");
		out.print("<h3>Phone : " + context.getAttribute("phone") + "</h3>");
		out.print("<hr>");

		out.print("<h1 align='center'>You can update your data here</h1>");
		out.print("<form action='ReadUpdateServlet' method='post'>");
		out.print("<pre>Name  : <input type='text' name='name'placeholder='enter name' value='"
				+ context.getAttribute("name") + "'/><br>");
		out.print("Email : <input type='email' name='email' placeholder='enter email' value='"
				+ context.getAttribute("email") + "'/><br>");
		out.print("Phone : <input type='tel' name='phone' placeholder='enter phone' value='"
				+ context.getAttribute("phone") + "'/><br>");
		out.print("             <input type='submit' name='read' value='Update'/></pre>");

	}

}
