<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/AdmiReg.css">
<title>ForgotPassword</title>
</head>
<body>
<div id='container'>
  <div class='signup'>
     <form action="forgotpassController" method="post">
     <input type="email" name="User_Email" placeholder="Enter Email" required>
      <input type="number" name="User_Mob" placeholder="Enter Mobile Number" required>
<%--It will give a alternative to captcha --%>
      
<input type="password" name="User_pass" placeholder="Enter your New Password to set" required>
<input type="submit" value="Save"> 
     </form>
      <h2><a href="UserLogin.jsp">Login</a></h2>
  </div>
  <div class='whyforgotPassword'>
  <%
  String msg=request.getParameter("msg");
  if("done".equals(msg)){
  %>
   
<h1>Yehhh! Password Changed Successfully!</h1>
<%}%>

  <% if("invalid".equals(msg))
  {
  %>
<h1>ooppppsss! Some thing Went Wrong! Try Again !</h1>
<%} %>
    <h2> Reacher Application</h2>
    <p>This is online Recharge application that will help you buy any kind of Reacher Plan online.</p>
  </div>
</div>
</body>
</html>