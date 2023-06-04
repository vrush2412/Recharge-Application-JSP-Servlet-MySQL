<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<link rel="stylesheet" href="css/Recharge.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
	crossorigin="anonymous"></script>
</head>
<body>
	<style>
.row>* {
	flex-shrink: 0;
	width: 100%;
	max-width: 50%;
	padding-right: calc(var(- -bs-gutter-x)* .5);
	padding-left: calc(var(- -bs-gutter-x)* .5);
	margin-top: var(- -bs-gutter-y);
}
</style>
	<section class="h-100 bg-dark">
		<div class="container py-5 h-100">
			<div
				class="row d-flex justify-content-center align-items-center h-100">
				<div class="col">
					<div class="card card-registration my-4">
						<div class="row g-0">

							<div class="col-xl-6">
								<div class="card-body p-md-5 text-black">
									<label for="mobileNumber">Mobile Number:</label> <input
										type="number" id="mobileNumber" name="mobileNumber" required><br>
									<br> 
									    
									      <input type="tel" pattern="[1-9]{1}[0-9.]{0,3}" placeholder="Enter Amount" vlaue ="+Amount+" name="Amount" onclick="setText7(this)" required class="name"><br><br>
									<a href="paymentPage.jsp"><button type="button"
											class="btn btn-warning btn-lg ms-2">Next</button></a>
								</div>

							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		</div>
	</section>

</body>
</html>