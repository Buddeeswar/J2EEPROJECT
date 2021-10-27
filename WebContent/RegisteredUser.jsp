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
<h2> Employee Details </h2>
<table border="1">
<tr>
     <th>Employee ID</th>
     <th>Emp Name</th>
     <th>Age</th>
     <th>Gender</th>
     <th>Department</th>
     <th>Basic</th>
     <th>Grade</th>
</tr>
<c:forEach items="${empList }" var="emp">
<tr>
<td>${emp.empid}</td>
<td>${emp.name}</td>
<td>${emp.age}</td>
<td>${emp.gender}</td>
<td>${emp.dept}</td>
<td>${emp.basic}</td>
<td>${emp.grade}</td>
</tr>
</c:forEach>
</table>
</body>
</html>