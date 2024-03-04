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
<h3 style="color:red">${error}</h3>
<!-- <form action="loginUser" method="post">
UserName: <input type ="text" name="uname"> <br/>
password: <input type="password" name="upass"><br/>
<input type="submit" >
</form> -->

<form:form action="loginUser" method="post" modelAttribute="user">

Name: <form:input path="name"/><br/>
Password: <form:password path="password"/><br/>
<input type="submit">
</form:form>


</body>
</html>