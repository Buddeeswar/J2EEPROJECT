<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! int st; %>
<%st=Integer.parseInt(request.getParameter("age"));
%>
<%if(st== 2){
	out.println("two");
}	%>
</body>
</html>