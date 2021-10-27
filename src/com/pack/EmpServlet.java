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

/**
 * Servlet implementation class EmpServlet
 */
@WebServlet("/EmpServlet")
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpServlet() {
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
	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw= response.getWriter();
		int em=Integer.parseInt(request.getParameter("id"));
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from person where empid=em");
            List<Employee1> l= new ArrayList<>();
            while(rs.next()) {
            	Employee1 e=new Employee1();
            	e.setEmpid(rs.getInt(1));
            	e.setName(rs.getString(2));
            	e.setAge(rs.getInt(3));
            	e.setGender(rs.getString(4));
            	e.setDept(rs.getString(5));
            	e.setBasic(rs.getInt(6));
            	e.setGrade(rs.getString(7));
            	l.add(e);
            }
            if(l ==null) {
            	
                
                RequestDispatcher rd=request.getRequestDispatcher("/ErrorUser.jsp");
                rd.include(request, response);
                
            }
            else {
            	request.setAttribute("empList", l);
            	RequestDispatcher rd=request.getRequestDispatcher("/RegisteredUser.jsp");
                rd.include(request, response);
            	
            }
            
            
			
		}catch(Exception e) {
			System.out.println(e);
			
		}finally {
		if(con !=null) {
			try {
				con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		}
	}

}
