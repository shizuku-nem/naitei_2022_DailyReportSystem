
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>

	<div class="container mt-3">
		<h1>${message}</h1>
		<h1>Add User Form</h1>
		<form:form action="users/create" method="POST" modelAttribute="user">
			<form:hidden path="id" />
			<form:input path="name" />
			<input type="submit" value="Submit" />
		</form:form>
	</div>

</body>
</html>