<%@page import="Admin.Dao.AdimInterface"%>
<%@page import="Admin.Dao.AdminImpl"%>
<%@page import="Bank.Model.Operator" %>
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
	<form action="AdminViewPlan_Controller" >
		
		
	</form>
	
	<!--     java standard tag librariy (jstl) -->   
	
<% 
  if(!session.isNew())
  {
	  AdminImpl ai=new AdminImpl();
	 List<Operator> lstop=(List<Operator> )session.getAttribute("data");
   %>
   
   <a href="AdminDashBoard.jsp"><button type="submit">BACK</button></a>
   <center><h3>View Plans</h3></center>
   <div class="container p-5">
      <div class="d-flex justify-content-centre">
      <div class="col-sm-12 col-md-12 col-lg-12">
      <div class="card">
        <div class="card-body">
    <table class="table">
      <thead class="text-centre">
				<th scope="col">Id</th>
				<th scope="col">Operator Name</th>
				<th scope="col">Plan Detail</th>
				<th scope="col">Plan Validity</th>
				<th scope="col">Price</th>
			</tr>
			</thead>
     <% for(Operator op : lstop)
     {
    	%>  <tbody class="text-centre">
    	 <tr>
			<td class="table-success"><%=op.getId()%></td>
			<td class="table-success"><%=op.getPlanName()%></td>
			<td class="table-success"><%=op.getCompany()%></td>
			<td class="table-success"><%=op.getpExpiry()%></td>
			<td class="table-success"><%=op.getPrice()%></td>
			<td><a href="Update_deleteOperator.jsp"><input type="submit" value="Edit Operator"> </a></td>
			
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