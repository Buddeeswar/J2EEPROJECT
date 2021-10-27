<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <jsp:useBean id="id" class="com.pack.Emp_Bean_Class">
      <jsp:setProperty name="id" property="code"/>
      <jsp:setProperty name="id" property="name"/>
      <jsp:setProperty name="id" property="salary"/> 
</jsp:useBean>

<p>
Employee Name : <jsp:getProperty property="name" name="id"/><br/>
Employee Code : <jsp:getProperty property="code" name="id"/><br>
Employee Salary : <jsp:getProperty property="salary" name="id"/><br/>

</p>
</body>
</html>