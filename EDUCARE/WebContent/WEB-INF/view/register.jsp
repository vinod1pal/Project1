<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Registration</h1>
<c:if test="${empty eDTO}">
<form action="reg">
</c:if>
<c:if test="${not empty eDTO}">
<form action="manage">
</c:if>
<pre>
<table>
<tr>
<c:if test="${not empty eDTO}">
<td>
Employee ID :</td> <td><input type="text" name="empID" value="${eDTO.empID }" readonly></td>
</c:if>
<c:if test="${empty eDTO}">
<td>
Employee ID :</td> <td><input type="text" name="empID" value="${eDTO.empID }"></td>
</c:if>
</tr>
<tr>
<td>Employee Name :</td><td><input type="text" name="empName" value="${eDTO.empName }"></td>
</tr>
<tr>
<td>Username :</td>
<td><input type="text" name="empUSN" value="${eDTO.empUSN }"></td>
</tr>
<tr>
<td>Password :</td>
<td><input type="password" name="empPWD" value="${eDTO.empPWD}"></td>
</tr>
<tr>
<td>Email ID :</td>
<td><input type="email" name="empMailID" value="${eDTO.empMailID }"></td>
</tr>
<tr>
<td>Mobile No :</td>
<td><input type="number" name="empMob" value="${eDTO.empMob }"></td>
</tr>
<tr>
<td>
<c:if test="${not empty eDTO}">
<input type="submit" value="update">
</c:if></td>
<td>
<c:if test="${empty eDTO}">
<input type="submit" value="register"> 
</c:if>
</td>
<td><input type="button" value="Back" onclick="history.back()"></td>
</tr></table>
</pre>
</form>
</body>
</html>


