<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Register</title>
<link rel="stylesheet" href="css/AdmiReg.css">
<link rel="stylesheet" href="css/demo.css">
</head>
<body>
<!-- User login page -->
  <form method="post" action="UserLogin_Controller">
  
  <div class="login-wrap">
	<div class="login-html">
		<input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Sign In</label>
		<input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">Sign Up</label>
		<div class="login-form">
			<div class="sign-in-htm">
				<div class="group">
					<label for="user" class="label">Email</label>
					<input id="user" type="text" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" name="User_Email" class="input" required>
				</div>
				<div class="group">
					<label for="pass" class="label">Password</label>
					<input id="pass" type="password" name="User_pass" class="input" data-type="password" required>
				</div>
				<div class="group">
					<input id="check" type="checkbox" class="check" checked required>
					<label for="check"><span class="icon"></span> Keep me Signed in</label>
				</div>
				<div class="group">
					<input type="submit" class="button" value="Sign In" required>
				</div>
				<div class="hr"></div>
				<div class="foot-lnk">
				<a href="Register_Admin.jsp"><p>Login As Admin</p></a>
					<a href="forgotpassword.jsp">Forgot Password?</a>
				</div>
			</div>
			</form>
			
	
			<!-- User Registration from -->
			<form action="UserRegister_Controller" method="post">
			<div class="sign-up-htm">
			<div class="group">
					<label for="pass" class="label">Registration no:</label>
					<input id="pass" type="Number" name="User_Id" class="input" required>
				</div>
				<div class="group">
					<label for="user" class="label">Name</label>
					<input id="user" pattern="[A-z]{1,15}" type="text" name="User_Name" class="input" required>
				</div>
				<div class="group">
					<label for="pass" class="label">Mobile No:</label>
					<input id="pass" type="text" name="User_Mob" class="input" required>
				</div>
				<div class="group">
					<label for="pass" class="label">User Name</label>
					<input id="pass" type="text" class="input" name="User_Uname" required>
				</div>
				
				<div class="group">
					<label for="pass" class="label">Email Address</label>
					<input id="pass" type="text" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" name="User_Email" class="input" required>
				</div>
				<div class="group">
					<label for="pass" class="label">Password</label>
					<input id="pass" type="password" name="User_pass" minlength="5" class="input" data-type="password" required>
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