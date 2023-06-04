<%@page import="java.util.List"%>
<%@page import="user.Dao.userImpl"%>
<%@page import="Bank.Model.Operator"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">

<title>Search Plans</title>
</head>
<body style="background: #0088a9">
<style>
.d-flex {
    display: flex!important;
    margin: 134px;
}

.h3,h3{
    font-size: 1.75rem;
    margin: -98px;
}
</style>
   <form class="d-flex" role="search" action="SearchOperator_Controller">
				<input class="form-control me-2" type="search" name="PlanName"
					placeholder="Search" aria-label="Search">
				<button class="btn btn-outline" type="submit">Search</button>
			 </form>
			 <%!  Operator op;
 %>
      <%
  if(!session.isNew())
  {
	op=(Operator)session.getAttribute("data"); 
   %>

   
   <div class="container p-5">
      <div class="d-flex justify-content-centre">
      <div class="col-sm-12 col-md-12 col-lg-12">
      <div class="card">
        <div class="card-body">
    <table class="table">
      <thead class="text-centre">
				
				<th scope="col">Operator Name</th>
				<th scope="col">Plan Detail</th>
				<th scope="col">Plan Validity</th>
				<th scope="col">Price</th>
			</tr>
			</thead>
			
      <tbody class="text-centre">
    	 <tr>
			<td class="table-success"><%=op.getPlanName()%></td>
			<td class="table-success"><%=op.getCompany()%></td>
			<td class="table-success"><%=op.getpExpiry()%></td>
			<td class="table-success"><%=op.getPrice()%></td>
			<td><a href="Recharge.jsp"><input type="submit" value="Recharge Now"> </a></td>
      </tr>
        </tbody>
    	<%} %>
    </table>
         </div>
       </div>
      </div>
    </div>
  </div>
 	
</body>
</html>