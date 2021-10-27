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
<c:set var="salary" value="20000" scope="session"/>
My salary is <c:out value="${salary }"/><br/>
<c:remove var="salary"/>
My salary is after remove <c:out value="${salary }"/><br/>

<c:set var="sal" value="${2000*5}" scope="session"/>
<c:if test="${sal>5000 }">
My salary is <c:out value="${sal }"/>
</c:if>
<br/>
<c:choose>
     <c:when test="${sal>5000 }">
            salary is good
     </c:when>
     <c:when test="${sal<7000 }">
            salary is excellent
     </c:when>
     <c:otherwise>
             no comment on salary
     </c:otherwise>

</c:choose>
<br/>
<c:forEach var="i" begin="1" end="15" step="3">
Item <c:out value="${i}"/>
</c:forEach>
<br/>
<c:forTokens items="one,two,three" delims="," var="num">
         item <c:out value="${num }"/>
</c:forTokens>
<br/>
<c:redirect> url="http://www.google.com"</c:redirect>
</body>
</html>