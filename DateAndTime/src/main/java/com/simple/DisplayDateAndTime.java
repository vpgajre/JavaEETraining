package com.simple;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class DisplayDateAndTime extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out= resp.getWriter();
		LocalDate date= LocalDate.now();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Date & Time Example using Servlet</title>");
		out.println("<body>");
		out.println("Date and time : "+date.toString());
		out.println("</body>");
		out.println("</head>");
		out.println("</html>"); 
	}
}
