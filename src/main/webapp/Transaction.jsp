<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="text-center">
		<form action="">
			<div class="row mx-auto" style="width: 600px">
				<div class="col-6 mx-auto p-2">
					<p>
					<h5 class="text-end ">Choose Service Provider</h5>
					</p>
				</div>
				<div class="col-6 mx-auto p-2 ">
					<div class="mx-auto p-2">
						<select id="inputState" class="form-select" name="sim">
							<option selected>Airtel</option>
							<option>Jio</option>
							<option>VI</option>
						</select>
					</div>
				</div>
			</div>
			<h5>
				<input type="submit" name="done"
					style="background-color: #DDA0DD; padding: 10px; border-radius: 10px">
			</h5>
	</div>
	</form>
	</div>

	<%
	String sim;
	%>
	<%
	sim = (String) session.getAttribute("sim");
	if (sim != null) {
	%>
	<h1 class="text-center" style="padding-top: 15px">Choose Plan for
		Recharging</h1>
	<div class="row mx-auto" style="width: 1000px">
		<div class="row row-cols-1 row-cols-md-2 g-4">
			<div class="col mx-auto">
				<div class="card" style="border-radius: 20px; border-color: black">
					<div class="card-body" name="planName">
						<h4 class="card-title text-center"><%=sim%>
							Family Plan
						</h4>
						<p class="card-text text-center">
							Validity :365 days <br> Users :4 <br> Data :Unlimited <br>
							Calling :Unlimited<br> Messaging:Unlimited
						</p>
						<div class="d-flex justify-content-center">
							<form action="DashboardController">
								<button type="submit" name="Family_Pack" style="background-color: #DDA0DD; padding: 10px; border-radius: 10px">2999</button>
							</form>
						</div>
					</div>
				</div>
			</div>
			<div class="col mx-auto">
				<div class="card" style="border-radius: 20px; border-color: black">
					<div class="card-body" name="planName">
						<h4 class="card-title text-center"
							style="border-radius: 20px; border-color: black"><%=sim%>
							Super Saver
						</h4>
						<p class="card-text text-center">
							Validity :28 days <br> Users :1 <br> Data :2GB/day <br>
							Calling :Unlimited<br> Messaging:Unlimited
						</p>
						<div class="d-flex justify-content-center">
							<form action="DashboardController">
								<button type="submit" name="Super_Saver" 
									style="background-color: #DDA0DD; padding: 10px; border-radius: 10px">299</button>
							</form>
						</div>
					</div>
				</div>
			</div>
			<div class="col mx-auto">
				<div class="card" style="border-radius: 20px; border-color: black">
					<div class="card-body" name="planName">
						<h4 class="card-title text-center"><%=sim %>
							Combo Pack
						</h4>
						<p class="card-text text-center">
							Validity :84 days <br> Users :2 <br> Data :2.5GB/day <br>
							Calling :Unlimited<br> Messaging:Unlimited
						</p>
						<div class="d-flex justify-content-center">
							<form action="DashboardController">
								<button type="submit" name="Combo_Pack"
									style="background-color: #DDA0DD; padding: 10px; border-radius: 10px">600</button>
							</form>
						</div>
					</div>
				</div>
			</div>
			<div class="col mx-auto">
				<div class="card" style="border-radius: 20px; border-color: black">
					<div class="card-body text-center">
						<h4 class="card-title" name="planName"><%=sim %>
							Super Fast
						</h4>
						<p class="card-text text-center">
							Validity :28 days <br> Users :1 <br> Data :4GB/day <br>
							Calling :Unlimited<br> Messaging:Unlimited
						</p>
						<div class="d-flex justify-content-center">
							<form action="DashboardController">
								<button type="submit" name="Super_Fast"
									style="background-color: #DDA0DD; padding: 10px; border-radius: 10px">399</button>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%
	}
	%>
</body>
</html>