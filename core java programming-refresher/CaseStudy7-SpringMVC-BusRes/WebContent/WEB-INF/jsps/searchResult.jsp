<%@page import="com.spring.main.dto.SearchDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
.searchBox{
	border: 1px solid grey; 
	background: #fffeee;
	padding: 1%;
	
}
</style>
</head>
<body>
<div class="searchBox">
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
		 &nbsp;&nbsp;&nbsp;&nbsp;
		<label>Select destination: </label>
		<input list="destination" name="destination">
		<datalist id="destination">
			<option value="mumbai" />
			<option value="pune" />
			<option value="chennai" />
			<option value="hyderabad" />
			<option value="indore" />			
		</datalist>
		 &nbsp;&nbsp;&nbsp;&nbsp;
		<label>Date of Journey: </label>
		<input type="date" name="doj">
		 &nbsp;&nbsp;&nbsp;&nbsp;
		<input type="submit" value="Search Bus">
	</form>
</div>
	<h1>Search Results</h1>

	<%
		List<SearchDto> list = (List<SearchDto>) request.getAttribute("list_result");
	%>
	<table border="1" 
		style="width: 100%; 
		font-family: monospace; 
		font-size:xx-large;
		padding: 5px;
		">
		<thead>
			<tr>
				<th>BusNo</th>
				<th>Bus Operator</th>
				<th>Source</th>
				<th>Destination</th>
				<th>NumberofHours</th>
				<th>Fare</th>
				<th>Journey Date</th>
				<th>Actions</th>
			</tr>
		</thead>
		<%
			for (SearchDto dto : list) {
		%>
		<tr style="padding: 10px">
			<td><%=dto.getBusNo()%></td>
			<td><%=dto.getBusOperatorName()%></td>
			<td><%=dto.getSource()%></td>
			<td><%=dto.getDestination()%></td>
			<td><%=dto.getNoOfHours()%></td>
			<td><%=dto.getFare()%></td>
			<td><%=dto.getDoj()%></td>
			<td><button>BOOK</button></td>
		</tr>

		<%
			}
		%>

	</table>


</body>
</html>