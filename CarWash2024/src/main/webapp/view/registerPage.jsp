<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align:center">
<h3 style="color: red"> ${error} </h3>
<form:form action="registerUser" method="post" modelAttribute="employee">
Employee ID: <form:input path="id"/><br/>
Employee Name: <form:input path="name"/><br/>
<input type="submit"/><br/>

</form:form>



</body>
</html>