package com.pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JDBCServlet
 */
@WebServlet("/JDBCServlet")
public class JDBCServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JDBCServlet() {
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
		String empname=request.getParameter("name");
		int empage=Integer.parseInt(request.getParameter("age"));
		double empsalary=Double.parseDouble(request.getParameter("salary"));
		String empdept=request.getParameter("dept");
		String empgender=request.getParameter("gender");
		Random r=new Random();
		int empid=r.nextInt(99999)+10000;
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			PreparedStatement ps=con.prepareStatement("insert into employee123 values (?,?,?,?,?,?)");
			ps.setInt(1, empid);
			
			ps.setString(2, empname);
			ps.setInt(3, empage);
			ps.setDouble(4, empsalary);
			ps.setString(5, empdept);
			ps.setString(6, empgender);
			int i=ps.executeUpdate();
			if(i!=0) {
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("select* from employee123");
				List<Employee> l=new ArrayList<>();
				while(rs.next()) {
					Employee e= new Employee();
					e.setEmpid(rs.getInt(1));
					e.setEname(rs.getString(2));
					e.setAge(rs.getInt(3));
					e.setSalary(rs.getDouble(4));
					e.setDept(rs.getString(5));
					e.setGender(rs.getString(6));
					l.add(e);
				}
				if(l!=null) {
					request.setAttribute("empList",l);
				}
				RequestDispatcher rd=request.getRequestDispatcher("/Success.jsp");
				rd.forward(request, response);
			}
			
			
			
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			if(con!=null) {
				try {
					con.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
