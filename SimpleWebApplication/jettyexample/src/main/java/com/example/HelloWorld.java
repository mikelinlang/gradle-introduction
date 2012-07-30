package com.example;

import java.io.*;
import java.net.*;


import javax.servlet.*;
import javax.servlet.http.*;

public class HelloWorld extends HttpServlet{

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
	
	public void processRequest(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException{
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			try {
				 
				out.println("Hello from jetty example servlet!"+"<br><br>");
			  
			} finally {
				out.close();
			}
		}

}