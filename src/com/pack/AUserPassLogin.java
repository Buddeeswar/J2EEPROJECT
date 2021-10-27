package com.pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AUserPassLogin
 */
//@WebServlet("/AUserPassLogin")
public class AUserPassLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AUserPassLogin() {
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
		 String u=request.getParameter("username");
		 request.setAttribute("gender", "male");
		
		    /// new user name
		 String p=request.getParameter("userpass");
		 if(p.equals("chinni")) {
			 
			 pw.println(u);
			 pw.println("messsage");

			 RequestDispatcher rd=request.getRequestDispatcher("AUserPassWelcome");
			 rd.include(request, response);
		 }
		 else
		 {
			 pw.println("InValid  Password.....! ");
			 RequestDispatcher rd=request.getRequestDispatcher("AUserPass.html");
			 rd.include(request, response);
			 pw.close();
			 
		 }
	}

}
