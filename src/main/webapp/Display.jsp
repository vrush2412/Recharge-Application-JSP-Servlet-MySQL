<%@page import="user.Dao.ContactImp"%>
<%@page import="user.Dao.Contactinterface"%>
<%@page import="Bank.Model.Contact" %>
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
	<form action="ContactDisplay" >
		
		
	</form>
	
	<% 
  if(!session.isNew())
  {
	 ContactImp ci=new ContactImp();
	 List<Contact> lstop=(List<Contact> )session.getAttribute("empList");
   %>
 <center><h3>User Queries</h3></center>
   <div class="container p-5">
      <div class="d-flex justify-content-centre">
      <div class="col-sm-12 col-md-12 col-lg-12">
      <div class="card">
        <div class="card-body">
    <table class="table">
      <thead class="text-centre">
          <th scope="col">Name</th>
          <th scope="col">Email Id</th>
          <th scope="col">Subject</th>
          <th scope="col">Message</th>
          <th scope="col">Date</th>
        </thead>
 
     <% for(Contact co : lstop)
     {
    	%> <tbody class="text-centre">
    	 <tr>
			<td scope="col"><%=co.getName()%></td>
			<td scope="col"><%=co.getEmail()%></td>
			<td scope="col"><%=co.getSub()%></td>
			<td scope="col"><%=co.getMessage()%></td>
			<td scope="col"><%=co.getDate()%></td>
			
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
	
	<!--     java standard tag librariy (jstl) -->   
	
    
         

</body>
</html>