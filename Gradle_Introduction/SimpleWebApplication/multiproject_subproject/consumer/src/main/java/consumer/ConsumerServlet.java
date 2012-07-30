package consumer;

import java.io.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;
import provider.Provider;

public class ConsumerServlet extends HttpServlet{

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
		String message = Provider.getMessage();
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		try {
			 
			out.println("Recieved message: "+message+" <br><br>");
		  
		} finally {
			out.close();
		}
	}

}