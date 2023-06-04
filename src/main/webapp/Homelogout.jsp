<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
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
			<li><a href="">Product & Services</a>
				<ul class="submenu">
					<br>
					<br>
					<li><a href="#">Send Money</a></li>
					<li><a href="Display_PlanController">Mobile Recharge</a></li>
					<li><a href="#">TV Recharge</a></li>

				</ul></li>

			<li><a href="#About">About Us</a></li>
			<li><a href="#contact">Contact Us</a></li>
			<li><a href="MyAccount.jsp">MyAccount</a></li>
			<li><a href="SearchOperator.jsp">Search Plans</a></li>
		
			<li><a href="HomePage.jsp">Logout</a></li>
		</ul>
	</div>

	<!-- About Us START -->
	<div class="About" id="about">
		<div class="d-flex p-2">
			<div class="container text-center">
				<div class="row">
					<div class="col"></div>
					<div class="content">
						<div class="info">
							<h2>
								Discover Everything <br>You need to plan <br> your Big
								Day
							</h2>


							<p>
								<b>Search over 69,000 local Professionals</b><br> <b>with
									reviews,pricing and </b><br> <b>many more</b><br> <br>
								<a href="Display_PlanController" class="info-btn"><b>View
										Plans</b></a>
						</div>
					</div>

				</div>
			</div>
		</div>
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


	<br>
	<br>
	<br>
	<br>
	<br>
	<div class="title" id="About">
		<span>About Us</span>
	</div>
	<br>
	<br>
	<br>
	<br>
	<div class="product-card">
		<div class="card">
			<img
				src="https://assets.airtel.in/teams/simplycms/web/images/banner-offring-new.png">
		</div>
		<div class="card">
			<img
				src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQnXBSv8U_pVBJP2rcVkdf3pvvck265sdDGsQ&usqp=CAU">
		</div>
		<div class="card">
			<img
				src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ1vAIDz5Ru9lUqGE-FYkROHkPBu7APd-wmww&usqp=CAU">
		</div>
	</div>
	<div class="product-card">
		<div class="card">
			<img
				src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQkgXWZmm9cHUw4JRmLM60DMFK8t9GHwHDsOw&usqp=CAU">
		</div>
		<div class="card">
			<img
				src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT9wGhJGkJCoNsgzZmCcxj8j4fSDa7zV1bE2w&usqp=CAU">
		</div>
		<div class="card">
			<img
				src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQWmFRPy3CsYfqZzb66RiTT-3CL98iVaNlIIw&usqp=CAU">
		</div>
	</div>
	<br>
	<br>
	<!-- bill form -->

	<!-- footer -->
	<center>


		<div class="footer-container">

			<div class="background">
				<form action="ContactUs_Controller" method="get">
					<div class="container" id="contact">
						<div class="screen">
							<div class="screen-header">
								<div class="screen-header-left">
									<div class="screen-header-button close"></div>
									<div class="screen-header-button maximize"></div>
									<div class="screen-header-button minimize"></div>
								</div>
								<div class="screen-header-right">
									<div class="screen-header-ellipsis"></div>
									<div class="screen-header-ellipsis"></div>
									<div class="screen-header-ellipsis"></div>
								</div>
							</div>
							<div class="screen-body">
								<div class="screen-body-item left">
									<div class="app-title">
										<span>CONTACT</span> <span>US</span>
									</div>
									<div class="app-contact">CONTACT INFO :</div>
								</div>
								<div class="screen-body-item">
									<div class="app-form">
										<div class="app-form-group">
											<input class="app-form-control" placeholder="NAME"
												name="Name">
										</div>
										<div class="app-form-group">
											<input class="app-form-control" placeholder="EMAIL"
												name="Email">
										</div>
										<div class="app-form-group">
											<input class="app-form-control" placeholder="SUBJECT"
												name="Sub">
										</div>
										<div class="app-form-group message">
											<input class="app-form-control" placeholder="MESSAGE"
												name="Message">
										</div>
										<div class="app-form-group message">
											<input type="datetime-local" class="app-form-control"
												placeholder="Add Date" name="Date">
										</div>
										<div class="app-form-group buttons">

											<button class="app-form-button">SEND</button>
										</div>

									</div>

								</div>

							</div>

						</div>
						<br> <br> <br>
						<center>
							<p>&copy; All Right Reserved by Devansh Rai</p>
						</center>

					</div>
			</div>
		</div>

		</form>
</body>

</html>