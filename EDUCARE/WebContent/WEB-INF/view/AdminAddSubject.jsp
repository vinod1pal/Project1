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
<h1>Add new Subject to the List.</h1>
<hr>
<form action="addSubject">
<pre>
<table>
<tr>
<c:if test="${not empty sub}">
<td>
Subject ID :</td> <td><input type="text" name="sID" value="${sub.sID}" readonly></td>
</c:if>
<c:if test="${empty sub}">
<td>Subject ID :</td> <td><input type="text" name="sID" value="${sub.sID}"></td>
</c:if>
</tr>
<tr>
<td>Subject Name :</td><td><input type="text" name="sName" value="${sub.sName}"></td>
</tr>
<tr>
<td>Subject Type :</td><td><input type="text" name="sType" value="${sub.sType}"></td>
</tr>
<tr>
<td>Number Of Days :</td><td><input type="number" name="NO_Days" value="${sub.NO_Days}"></td>
</tr>
<tr>
<td><input type="submit" value="Update"></td>
<td><input type="button" value="Back" onclick="history.back()"></td>
</tr>
</table>
 

</table>
</pre>
</form>
</body>
</html>