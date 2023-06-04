<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Online Recharge Portal | My Account</title>
		<link rel="stylesheet" href="css/MyAccount.css">
		<link rel="icon" href="img/favicon.jpg" type="image/jpg" sizes="16x16">
	</head>
	<body style="background: #0088a9">
	<a href="Homelogout.jsp"><button type="submit">BACK</button></a>
		<div class="container">
			
			<div class="notification-bar">
				
			</div>
			<div class="nav">
					
			</div>
			<div class="main">
				<div class="my-account">
					<form action="UserUpdateController" method="get">
						<table>
						<tr>
								<td>Reg Id:</td><td><input type="Number" name="User_Id" "></td>
							</tr>
							<tr>
								<td>Full Name:</td><td><input type="text" name="User_Name" pattern="[A-Za-z ]{5,40}" title="Enter 5-40 Character" placeholder="Full Name" ></td>
							</tr>
							<tr>
								<td>Email Address:</td><td><input type="email" name="User_Email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" placeholder="Email Address"></td>
							</tr>
							<tr>
								<td>Mobile Number:</td><td><input type="tel" name="User_Mob" pattern="[0-9]{10}" title="Enter 10 Digit Number" placeholder="Mobile Number"></td>
							</tr>
							<tr>
								<td>Username:</td><td><input type="text" name="User_Uname"  title="Enter 8 - 12 Alpha Numeric Characters" placeholder="Username"></td>
							</tr>
						</table>
						<input type="submit" value="Update Info"/>
							<%
String msg=request.getParameter("msg");
		if("valid".equals(msg)){
			%>
			
	<h1>Successfully Updated....!</h1>
		<% } %>

		<%if("invalid".equals(msg)){
			%>
		

<h1>ooppppppsssss!Some thing Went Wrong! Try Again !</h1>
<%} %>
					</form>
					
				
					<div class="password">
						<form action="UserpassController" method="get">
							<table>
								<tr>
									<td>Email:</td><td><input type="email" name="User_Email"  placeholder="Enter your Email"></td>
								</tr>
								<tr>
									<td>New Password:</td><td><input type="password" name="User_pass"  placeholder="New Password"></td>
								</tr>
							</table>
							<input type="hidden" name="User_id" value="">
							<input type="submit" value="Change Password">
							<%
					 String sg=request.getParameter("sg");
					if ("valid".equals(sg)) {
					%>

					<h1>Successfully Changed....!</h1>
					<%
					}
					%>

					<%
					if ("invalid".equals(sg)) {
					%>


					<h1>ooppppppsssss!Some thing Went Wrong! Try Again !</h1>
					<%
					}
					%>
						</form>
						<form action="DeleteUserController" method="get" style="padding-top:46px;padding-bottom:46px;">
							<input type="submit" value="Delete My Account">
						</form>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>