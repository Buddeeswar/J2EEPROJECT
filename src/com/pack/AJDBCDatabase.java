package com.pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AJDBCDatabase
 */
//@WebServlet("/AJDBCDatabase")
public class AJDBCDatabase extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AJDBCDatabase() {
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
		PrintWriter pw=response.getWriter();
		pw.println("<b>i like you chinni</b><br/>");
        System.out.println("i like u da bobby   ");
		//String name=request.getParameter("name");
		//pw.println(name);
		//pw.println(" ");
       // pw.print(request.getParameter("name"));
        
        ////////////////
        //String n=request.getParameter("name");
       

        Connection con=null;
        try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select empid,name from person");
            List<AServletDatabasePOJO> l=new ArrayList<>();

            while(rs.next()) {
            	AServletDatabasePOJO aa=new AServletDatabasePOJO();
            	aa.setEmpid(rs.getInt(1));
            	aa.setName(rs.getString(2));
            	l.add(aa);
            } 
            for(AServletDatabasePOJO q:l) {
            	pw.println(q.getEmpid()+" - "+q.getName()+"<br/> ");
            	if(q.getName().equals("bobby")) {
            		pw.println("inside if condition ");
            		
            	}
            	else {
            		 RequestDispatcher rd=request.getRequestDispatcher("SuccessServlet");
              		rd.include(request, response);
            		
            	}
            	}
            	
            	
        		pw.close();
        	
            
                 
        }catch(Exception e) {
        	
        }finally {
        	if(con!=null) {
        		try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        }
        
    	}
    }	         			
        
       
		

