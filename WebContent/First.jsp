<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%for(int i=1;i<=6;i++){ %>
<h<%=i%>>Hello World</h<%=i%>>
<%} %>
<br/><br/>
<%! int j=10; %>
<%=++j %>
<br/><br/>
<% int k=10; %>
<%=++k %>
<br/><br/>
<%for(int m=0;m<5;m++){ %>
out.printline(m)
<%} %>
<br/>


</body>
</html>