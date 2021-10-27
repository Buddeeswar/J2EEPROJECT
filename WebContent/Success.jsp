<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>employee details</h2>
<table border="1">

<tr>
   <th>EmpID</th>
   <th>Emp Name</th>
   <th>Emp Age</th>
   <th>Salary</th>
   <th>department</th>
   <th>gender</th>
</tr>
<c:forEach items="${empList }" var="empl">
<tr>
<td>${empl.empid }</td>
<td>${empl.ename }</td>
<td>${empl.age }</td>
<td>${empl.salary }</td>
<td>${empl.dept }</td>
<td>${empl.gender }</td>
</tr>

</c:forEach>
</table>
</body>
</html>