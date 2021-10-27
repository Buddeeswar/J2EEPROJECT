<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%= session.getId() %><br/>
<%= session.getCreationTime() %><br/>
<%= session.getLastAccessedTime() %><br/>
<%= session.isNew() %><br/>
<% session.setAttribute("Mark1",85); %>
<a href="/J2EEProject/Session1.jsp">Click</a>
<br/>
<%Integer i=(Integer)session.getAttribute("Mark1");
out.println(i);
%>
<%! int a=1; %>
<q>You are visiting the page for: <%= a++ %> time"</q>


</body>
</html>