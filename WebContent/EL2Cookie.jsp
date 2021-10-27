<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%Cookie c=new Cookie("MyCookie","sam");
  response.addCookie(c);
%>
<a href="/J2EEProject/Cookie1.jsp">click</a>
</body>
</html>