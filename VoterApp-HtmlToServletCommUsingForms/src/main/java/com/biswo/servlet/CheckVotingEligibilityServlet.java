package com.biswo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CheckVotingEligibilityServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException {
		
		//Get the PrintWriter object from response object
		PrintWriter pw = res.getWriter();
		
		//Set the Content type
		res.setContentType("text/html");
		
		//Read Form data as request parameter value
		String name = req.getParameter("userName");
		String address = req.getParameter("address");
		String tage = req.getParameter("age");
		int age = Integer.parseInt(tage);
		
		//Write the logic for voting
		if(age >= 18) {
			pw.println("<h1 style='color:green; text-align:center'>Mr/Miss/Mrs"+name+" of"+address+" u are eligible for voting</h1>");
		}else {
			pw.println("<h1 style='color:green; text-align:center'>Mr/Miss/Mrs"+name+" of"+address+" u are not eligible for voting</h1>");
		}
		
		//add home hyperlink(graphic link)
		pw.println("<a style='text-align:center' href='index.html'>Home</a>");
		
		//close the stream
		pw.close();
		
	}
}
