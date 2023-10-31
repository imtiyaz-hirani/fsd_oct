<%@page import="com.spring.main.dto.RouteDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
  <jsp:include page="header.jsp"></jsp:include>
 
 <% 
 List<RouteDto> list = (List<RouteDto>)request.getAttribute("list");
 %>
 <p class="lead  mt-4">
  All Bus Routes
</p>

 <table class="table mt-4">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Source</th>
      <th scope="col">Destination</th>
      <th scope="col">Bus Operator</th>
      <th scope="col">Bus Operator City</th>
       <th scope="col">Journey Hours</th>
        <th scope="col">Fare</th>
      
    </tr>
  </thead>
  <tbody>
  <%
   for(RouteDto dto :list){
	  %>
	   <tr>
	      <th scope="row"><%=dto.getBus_id() %> </th>
	      <td> <%=dto.getSource() %></td>
	      <td><%=dto.getDestination() %></td>
	      <td><%=dto.getBus_operator() %></td>
	      <td><%=dto.getOperator_city() %></td>
	      <td><%=dto.getNoOfHours() %></td>
	      <td><%=dto.getFare() %></td>
	    </tr>
	  <%
   }
  %>
    
    
  </tbody>
</table>
</body>
</html>