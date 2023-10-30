<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Home Page</h1>
<a href="#">Home</a>  <span>|</span>  
<!-- getContextPath() loads project name:- /CaseStudy7-SpringMVC-BusRes  -->
<a href="<%=request.getContextPath() %>/contact">Contact</a> <span>|</span> 
<a href="<%=request.getContextPath() %>/login">Login</a> <span>|</span>  
<a>Sign Up</a>
<hr>
</body>
</html>