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
<center>
<h1>EDUCARE login</h1>
<hr>
<pre>
<h2>Sign IN</h2>
<form action="login" method="post">
Username :<input type="text" name="usn"><br>
Password :<input type="password" name="pwd"><br>
<input type="submit" value="login">		<a href="signup">Sign UP</a>
</form>

</pre>
</center>
</body>
</html>