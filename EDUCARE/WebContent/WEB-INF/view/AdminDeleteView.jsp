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
<h1>Subject List.</h1>
<hr>
<div align="left">
<table border="2">
<th>Subject ID</th>
<th>Subject Name</th>
<th>Subject Type</th>
<th>No of Days</th>
<th>Modify</th>
<c:forEach var="sL" items="${sList}">
<tr>
<form action="delete">
<td><c:out value="${sL.sID}"></c:out><input type="hidden" name="sID" value="${sL.sID}"></td>
<td><c:out value="${sL.sName}"></c:out><input type="hidden" name="sName" value="${sL.sName}"></td>
<td><c:out value="${sL.sType}"></c:out><input type="hidden" name="sType" value="${sL.sType}"></td>
<td><c:out value="${sL.NO_Days}"></c:out><input type="hidden" name="NO_Days" value="${sL.NO_Days}"></td>
<td><input type="submit" value="delete"></td>
</form>
</tr>
</c:forEach>
</table>
<input type="button" value="Back" onclick="history.back()">
</div>

</body>
</html>