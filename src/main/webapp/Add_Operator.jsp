<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Recharge Portal | Add Plan</title>
<link rel="stylesheet" href="css/MyAccount.css">
<link rel="icon" href="img/favicon.jpg" type="image/jpg" sizes="16x16">
</head>
<body style="background: #0088a9">

	<a href="AdminDashBoard.jsp"><button type="submit">BACK</button></a>
	<div class="container">
		<%
String msg=request.getParameter("msg");
		if("valid".equals(msg)){
			%>

		<h1>Plans Added Successfully ....!</h1>
		<% } %>

		<%if("invalid".equals(msg)){
			%>


		<h1>ooppppppsssss!Some thing Went Wrong! Try Again !</h1>
		<%} %>
		<div class="main">
			<div class="main-div">

				<form action="AddOperator_Controller" method="post" id="wideform">

					<table>

						<td>Plan Id:</td>
						<td><input type="Number" name="id" style="font-size: 13px;"
							required></td>
						</tr>
						<tr>
							<td>Operater Name:</td>
							<td><input type="text" name="PlanName"
								style="font-size: 13px;"></td>
						</tr>
						<tr>
						<tr>
							<td>Operator Details:</td>
							<td><input type="text" name="company" pattern=".{1,100}"
								title="Enter 1-100 Characters" style="font-size: 13px;"></td>
						</tr>
						<tr>
							<td>Plan Validity:</td>
							<td><input type="text" name="pExpiry" pattern=".{1,40}"
								title="Enter 1-40 Characters"></td>
						</tr>
						<tr>
							<td>Price:</td>
							<td><input type="text" name="price"
								pattern="[1-9]{1}[0-9.]{0,3}"
								title="Enter amount between 1 - 9999 INR"></td>
						</tr>
					</table>
					<input type="submit" value="Add Plan">
				</form>
			</div>
		</div>
	</div>

</body>
</html>