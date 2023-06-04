<%@page import="Bank.Model.User"%>
<%@page import="user.Dao.userImpl"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">

</head>
<body style="background: #0088a9">
 <a href="AdminDashBoard.jsp"><button type="submit">BACK</button></a>
	<form action="DisplayUser_Controller" >
		
		
	</form>
	
	<!--     java standard tag librariy (jstl) -->   
	
<% 
  if(!session.isNew())
  {
	  userImpl ui=new userImpl();
	 List<User> lstop=(List<User> )session.getAttribute("data");
   %>
   
  
   <center><h3>View Registered Users</h3></center>
   <div class="container p-5">
      <div class="d-flex justify-content-centre">
      <div class="col-sm-12 col-md-12 col-lg-12">
      <div class="card">
        <div class="card-body">
    <table class="table">
      <thead class="text-centre">
				<th scope="col">Id</th>
				<th scope="col"> Name</th>
				<th scope="col">Mobile Number</th>
				<th scope="col">User Name</th>
				<th scope="col">Email</th>
			</tr>
			</thead>
     <% for(User us : lstop)
     {
    	%>  <tbody class="text-centre">
    	 <tr>
			<td class="table-success"><%=us.getUser_Id()%></td>
			<td class="table-success"><%=us.getUser_Name()%></td>
			<td class="table-success"><%=us.getUser_Mob()%></td>
			<td class="table-success"><%=us.getUser_Uname()%></td>
			<td class="table-success"><%=us.getUser_Email()%></td>
			
      </tr>
        </tbody>
    	<%} %>
    	<%} %>	
       </table>
         </div>
       </div>
      </div>
    </div>
  </div>
      			
      
</body>
</html>