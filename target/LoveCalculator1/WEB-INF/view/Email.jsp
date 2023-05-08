<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Email</title>
</head>
<body>
 <h1>Hi ${userinfo}</h1>
 <form:form modelAttribute="emailDto" action="/Emailprocess">
 <label>Enter your MailId</label>
 <form:input path="email"/>
 <input type="submit" />
 </form:form>
</body>
</html>