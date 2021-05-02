<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Manage</title>
</head>
<body>
<div>
<h1>Customer Manage</h1>
<form method="get" action="search">
<input type="text" name="keyword"/>
<input type="submit" value="Search"/>
</form>
<h3><a href="new">New Customer</a></h3>
<table border="1">
	<tr>
	<th>Id</th>
	<th>Name</th>
	<th>Email</th>
	<th>Address</th>
	<th>Action</th>
	</tr>
	<c:forEach items="${listCustomer}" var="customer">
	<tr>
		<td>${customer.id}</td>
		<td>${customer.name}</td>
		<td>${customer.email}</td>
		<td>${customer.address}</td>
		<td>
			<a href="edit?id=${customer.id}">Edit</a>
			<a href="delete?id=${customer.id}">Delete</a>
		</td>
	</tr>
	</c:forEach>
</table>

</div>

</body>
</html>