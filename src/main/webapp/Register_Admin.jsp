<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Registrestion</title>
</head>
<link rel="stylesheet" href="css/demo.css">
<body>
<%
String msg=request.getParameter("msg");
		if("valid".equals(msg)){
			%>
			
	<h1 style="color: red;">Successfully Registered ....!</h1>
		<% } %>

		<%if("invalid".equals(msg)){
			%>
		

<h1 style="color: red;">ooppppppsssss!Some thing Went Wrong! Try Again !</h1>
<%} %>
    

    <%--THIS IS FORM FOR SIGNUP PAGE.
  method is post since i want to hide details --%>
  
  <form method="post" action="AdminLogin_Controller">
  
  <div class="login-wrap">
	<div class="login-html">
		<input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Admin Sign In</label>
		<input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">Sign Up</label>
		<div class="login-form">
			<div class="sign-in-htm">
				<div class="group">
					<label for="user" class="label">Email</label>
					<input id="user" type="text" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" name="admin_Email"class="input">
				</div>
				<div class="group">
					<label for="pass" class="label">Password</label>
					<input id="pass" type="password" name="admin_pass" class="input" data-type="password">
				</div>
				<div class="group">
					<input id="check" type="checkbox" class="check" checked>
					<label for="check"><span class="icon"></span> Keep me Signed in</label>
				</div>
				<div class="group">
					<input type="submit" class="button" value="Sign In">
				</div>
				<div class="hr"></div>
				<div class="foot-lnk">
				<a href="User_Register.jsp"><p>Login As User</p></a>
					
				</div>
			</div>
			</form>
			
	
			<!-- Admin Registration from -->
			<form action="Adim_Controller" method="post">
			<div class="sign-up-htm">
			<div class="group">
					<label for="pass" class="label">Registration no:</label>
					<input id="pass" type="Number" name="admin_Id" class="input" required>
				</div>
				<div class="group">
					<label for="user" class="label">Name</label>
					<input id="user" type="text"  name="admin_Name"class="input" required>
				</div>
				<div class="group">
					<label for="pass" class="label">User Name</label>
					<input id="pass" type="text" class="input" name="admin_Uname" required>
				</div>
				
				<div class="group">
					<label for="pass" class="label">Email Address</label>
					<input id="pass" type="text" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" name="admin_Email" class="input" required>
				</div>
				<div class="group">
					<label for="pass" class="label">Password</label>
					<input id="pass" type="password" name="admin_pass" minlength="5" class="input" data-type="password" required>
				</div>
				
				<div class="group">
					<input type="submit" class="button" value="Sign Up">
				</div>
				
				</div>
				</form>
				
				
			</div>
		</div>
	</div>
</div>

  </div>
 
  <%--let us recieve the msg here from controller --%>
  <%
	if (!session.isNew()) {
		String str = (String) session.getAttribute("msg");
		session.invalidate();
	%>
	<h3 style="color: red"><%=str%></h3>
	<%
	}
	%>

 
</body>
</html>
