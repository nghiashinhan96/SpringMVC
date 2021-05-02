<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Customer</title>
</head>
<body>
<div align="center">
<h2>Create new Customer</h2>
<form:form action="save" method="post" modelAttribute="customer">
	<tr>
	<td>ID</td>
	<td>
	${customer.id}
	<form:hidden path="id"/></td>
	</tr>
	<tr>
	<td>Name</td>
	<td><form:input path="name"/></td>
	</tr>
	<tr>
	<td>Email</td>
	<td><form:input path="email"/></td>
	</tr>
	<tr>
	<td>Address</td>
	<td><form:input path="address"/></td>
	</tr>
	<td>
	<input type="submit" value="Save"/>
	</td>


</form:form>
</div>
</body>
</html>