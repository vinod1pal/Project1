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
<c:forEach var="sList" items="${sList}">
<tr>
<td><c:out value="${sList.sID}"></c:out></td>
<td><c:out value="${sList.sName}"></c:out></td>
<td><c:out value="${sList.sType}"></c:out></td>
<td><c:out value="${sList.NO_Days}"></c:out></td>
</tr>
</c:forEach>
</table>
<input type="button" value="Back" onclick="history.back()">
</div>
</body>
</html>