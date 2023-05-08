<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body {
	text-align: center;
}
</style>
</head>
<body>
	<p>${userregister.user }</p>
	<p>${userregister.username }</p>
	<p>${userregister.password}</p>
	<p>${userregister.country }</p>
	<p>
		<c:forEach var="temp" items="${userregister.hobbies}"> 
	${temp}
	</c:forEach>
	</p>
	<p>${userregister.gender }</p>
	<p>${userregister.age }</p>
	<p>${userregister.communicationDTO.email }</p>
	<p>${userregister.communicationDTO.phone }</p>

</body>
</html>