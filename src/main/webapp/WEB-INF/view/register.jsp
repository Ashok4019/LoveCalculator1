<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Registrationpage</title>
<style type="text/css">
body {
	text-align: center;
}
</style>
</head>
<body>
	<h1>RegistrationPage</h1>
	<hr>
	<form:form action="registrationprocess" modelAttribute="userregister">
		<p>
			<label for="name">name</label>
			<form:input path="user" id="name" />
		</p>

		<p>
			<label for="uname">username</label>
			<form:input path="username" id="uname" />
		</p>

		<p>
			<label for="pass">password</label>
			<form:input path="password" id="pass" />
		</p>

		<p>
			Country:
			<form:select path="country">
				<form:option value="India" label="India" />
				<form:option value="USA" label="USA" />
			</form:select>
		</p>

		<p>
			hobbies: Cricket
			<form:checkbox path="hobbies" value="Cricket" />
			Programming
			<form:checkbox path="hobbies" value="Programming" />
			Readingbooks
			<form:checkbox path="hobbies" value="Readingbooks" />
		</p>

		<p>
			Male
			<form:radiobutton path="Gender" value="Male" />
			Female
			<form:radiobutton path="Gender" value="Female" />
		</p>
		<p>
			<label for="age">Age</label>
			<form:input path="age" id="age" />
			<form:errors path="age" />
		</p>


		<p>
			<label for="email">Email</label>
			<form:input path="communicationDTO.email" id="email" />

		</p>
		<p>
			<label for="cell">Phone</label>
			<form:input path="communicationDTO.phone" id="cell" />

		</p>

		<p>
			<input type="submit">
		</p>
	</form:form>

</body>
</html>