<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!DOCTYPE html>
<html>
<head>
<style>
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
}

li {
    float: left;
}

li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover {
    background-color: #111;
}
</style>

<title>Insert title here</title>
</head>
<body>
<h1>Training Zone</h1>
<input type="hidden" name="empID" value="${EmpDTO.empID}">
<input type="hidden" name="empName" value="${EmpDTO.empName}">
<div align="right">
<a href="logout">LogOut</a>
</div>
<hr>
<ul>
	<li><a class="active" href="viewSub">View</a></li>
	<!-- <li><a href="add">Search</a></li> -->
	<li><a href="manageView?eID=${EmpDTO.empID}">ManageAccount</a></li>
	<!-- <li><a href="update">Update</a></li> -->
</ul>
</body>
</html>