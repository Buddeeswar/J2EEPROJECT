package com.pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AUserPassWelcome
 */
@WebServlet("/AUserPassWelcome")
public class AUserPassWelcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AUserPassWelcome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
	    PrintWriter pw = response.getWriter();
	    pw.println(request.getAttribute("gender"));
	    //pw.println(request.getParameter("u"));
	   // ServletContext sc=getServletContext();
	    
	    //pw.println(sc.getInitParameter("email"));

		 //String u1=request.getParameter("username");
		 
	    pw.println("Welcome "+"<br/>"+"your login was success by using request Dispatcher");
	}

}
