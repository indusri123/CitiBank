package com.nt.servlet;

import java.io.PrintWriter;
import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BankAccountServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		//initialize 
		PrintWriter pw=null;
		String name=null;
		int age=0,amount=0;
		//get printwriter
		pw=res.getWriter();
		//set content type
		res.setContentType("text/html");
		//write b.logic
		name=req.getParameter("pname");
		age=Integer.parseInt(req.getParameter("page"));
		amount=Integer.parseInt(req.getParameter("pamount"));
		if(age>=10)
		{
			if(amount>=2000)
				pw.println("<h1 style='color:green;text-align:center'>"+name+" ur account is created</h1>");
			else
				pw.println("<h1 style='color:red;text-align:center'>"+name+" u should have min. account balance:2000</h1>");
			
		}
		else
		{
			pw.println("<h1 style='color:blue;text-align:center'>"+name+" 10 or Above 10 yrs can create bank account </h1>");
	    }
		
		//add a link
		pw.println("<br><a href='index.html'>index</a>");
		
		//close stream
		pw.close();
		
	}//dopost(-,-)

}//class
