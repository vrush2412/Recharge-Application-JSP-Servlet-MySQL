<%@page import="Bank.Model.Operator"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form class="d-flex" role="search" action="SearchOperator_Controller">
				<input class="form-control me-2" type="search" name="PlanName"
					placeholder="Search" aria-label="Search">
				<button class="btn btn-outline-success" type="submit">Search</button>
			
			
			<%!  Operator op;
 %>
	<%
    if(!session.isNew()){
    	op=(Operator )session.getAttribute("data");
  %>
	<table>
		<tr>
			<td><%=op.getId()%></td>
			<td><%= op.getPlanName()%></td>
			<td><%=op.getCompany()%></td>
			<td><%=op.getpExpiry()%></td>
			<td><%=op.getPrice()%></td>
		</tr>
	</table>
	
	<%} 
	else{%>
	<h1>something wromg</h1>
	<%} %>
 
 	</form>
	
</body>
</html>