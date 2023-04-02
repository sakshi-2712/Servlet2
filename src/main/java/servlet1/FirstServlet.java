package servlet1;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.*;

public class FirstServlet implements Servlet {

	ServletConfig conf;
	
	public void init(ServletConfig conf) {
		this.conf=conf;
		System.out.println("Creating object:......");
	}
	public void service(ServletRequest req, ServletResponse resp) throws ServletException , IOException
	{
		System.out.println("Servicing......");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<h1> this is output of my servlet method:</h1>");
		out.println("<h1> todays date and time is" +new Date().toString()+ "</h1>");
	}
	public void destroy()
	{
		System.out.println("going to destroy servlet object");
	}
	 public ServletConfig getServletConfig()
	 {
		 return this.conf;
	 }
	 public String getServletInfo()
	 {
	   return "this Servlet created by Sakshi....";
	 }
}
