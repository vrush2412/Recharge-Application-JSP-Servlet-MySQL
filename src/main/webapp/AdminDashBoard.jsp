<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
	crossorigin="anonymous"></script>
<link rel="stylesheet" href="css/UserDashBoard.css">
<link rel="stylesheet" href="css/home.css">
<link rel="stylesheet" href="css/Contact.css">
<link rel="stylesheet" href="css/Nav.css">
<!-- USER DASHBOARD -->
<title>User DashBoard</title>
</head>
<body>
	<div id="Home">
		<ul class="menu cf">
			<li><a href="#Home">Home</a></li>
			<li><a href="User_Register.jsp">PLans</a>
				<ul class="submenu"><br><br>
					
					<li><a href="AdminViewPlan_Controller">View Plans</a></li>
					<li><a href="Add_Operator.jsp">Add Operators</a></li>

				</ul></li>

			
			<li><a href="ContactDisplay">View Queries</a></li>
           <li><a href="DisplayUser_Controller">View Users</a></li>
			<li><a href="HomePage.jsp">Logout</a></li>
		</ul>
	</div>
	
       <!-- About Us START -->
       <div class="About" id="about">
       <div class="d-flex p-2"> 
        <div class="container text-center">
        <div class="row">
          <div class="col">
          
          </div>
          
        </div>
      </div></div>
       <!-- About Us END -->
       <!-- What make Us Uniques -->
       <div class="team" id="Team"></div>
       <div class="container text-center">
        <div class="row align-items-center">
        
          <div class="col">
           <h5>What Makes Us Uniques</h5> 
          </div>
        </div>
      </div>
      <div class="container text-center">
        <div class="row">
          <div class="col">
           <i class="bi bi-phone-flip"></i>
            <h6>MOBILE RECHARGE</h6>
          </div>
          <div class="col order-5">
           <i class="bi bi-tv"></i>
            <h6>TV RECHARGE</h6>
            
          </div>
          <div class="col order-1">
          <i class="bi bi-cash-coin"></i>
           <h6>Privacy First Approach</h6>
          </div>
        </div>
      </div>
    </div>
        <!--  End -->

</body>
</html>