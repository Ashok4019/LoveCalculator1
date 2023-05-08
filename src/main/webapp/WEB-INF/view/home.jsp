<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
body {
	text-align: center;
}
.error{
color: red;
position: fixed;
text-align: left;
margin-left:30px;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome Love Calculator</h1>
	<hr>
	<form:form action="process" modelAttribute="userinfo">
		<p>
			<label for="yname">yourname</label>
			<form:input  path="yourname" id="yname" />
			<form:errors  path="yourname" cssClass="error" />
		</p>
		<p>
			<label for="cname">crushname</label>
			<form:input  path="crushname" id="cname" />
			<form:errors  path="crushname" cssClass="error" />
			
		</p>
		<p>
		<form:checkbox path="terms"/>
		<label>I accept term and condition</label>
		<form:errors  path="terms" cssClass="error" />
		</p>
		<input type="submit">
	</form:form>

</body>
</html>