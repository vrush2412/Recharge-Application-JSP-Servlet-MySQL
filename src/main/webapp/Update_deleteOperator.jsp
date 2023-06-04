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
<a href="AdminDisplayPlan.jsp"><button type="submit">BACK</button></a>
	<div class="container">

		<div class="notification-bar"></div>
		<div class="nav"></div>
		<div class="main">
			<div class="my-account">
				<form action="UpdateOperator_Controller" method="get">
					<table>
						<tr>
							<td>Id:</td>
							<td><input type="Number" name=" id"></td>
						</tr>
						<tr>
							<td>Plan Name:</td>
							<td><input type="text" name=" PlanName"
								title="Enter 5-40 Character" placeholder="plan Name"></td>
						</tr>
						<tr>
							<td>Plan Expiry:</td>
							<td><input type="text" name=" pExpiry"
								placeholder=" Enter plan validity" required></td>
						</tr>
						<tr>
							<td>Price:</td>
							<td><input type="Number" name="price" placeholder="price"
								required></td>
						</tr>

					</table>
					<input type="submit" value="Update Plan" />
					<%
					String msg = request.getParameter("msg");
					if ("valid".equals(msg)) {
					%>

					<h1>Successfully Updated....!</h1>
					<%
					}
					%>

					<%
					if ("invalid".equals(msg)) {
					%>


					<h1>ooppppppsssss!Some thing Went Wrong! Try Again !</h1>
					<%
					}
					%>
				</form>

				<div class="password">
					<form action="Deleteplan_Controller" method="get">
						<table>
							<tr>
								<td>Plan Id:</td>
								<td><input type="Number" name="id"
									placeholder="Enter Plan Id" required></td>
							</tr>
						</table>
						<input type="submit" value="Delete Plan">
					</form>
					<%
					String str = request.getParameter("str");
					if ("valid".equals(str)) {
					%>

					<h1>Successfully Deleted....!</h1>
					<%
					}
					%>

					<%
					if ("invalid".equals(str)) {
					%>


					<h1>ooppppppsssss!Some thing Went Wrong! Try Again !</h1>
					<%
					}
					%>
				</div>
			</div>
		</div>
	</div>

</body>
</html>