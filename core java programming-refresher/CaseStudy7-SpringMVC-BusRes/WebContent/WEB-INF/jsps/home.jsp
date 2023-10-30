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
 <jsp:include page="header.jsp"></jsp:include>

	<form action="<%=request.getContextPath()%>/search" method="get">
		<label>Select Source: </label>
		<input list="source" name="source">
		<datalist id="source">
			<option value="mumbai" />
			<option value="pune" />
			<option value="chennai" />
			<option value="hyderabad" />
			<option value="indore" />			
		</datalist>
		<br /><br />
		<label>Select destination: </label>
		<input list="destination" name="destination">
		<datalist id="destination">
			<option value="mumbai" />
			<option value="pune" />
			<option value="chennai" />
			<option value="hyderabad" />
			<option value="indore" />			
		</datalist>
		<br /><br />
		<label>Date of Journey: </label>
		<input type="date" name="doj">
		<br /><br />
		<input type="submit" value="Search Bus">
	</form>
	
</body>
</html>