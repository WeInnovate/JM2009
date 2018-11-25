<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
</head>
<body>
<div class="container">
	<form action="process-registration.jsp" method="post">
		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="inputEmail4">Email</label> <input type="email"
					class="form-control" name="email" id="inputEmail4" placeholder="Email">
			</div>
			<div class="form-group col-md-6">
				<label for="inputPassword4">Password</label> <input type="password"
					class="form-control" name="password" id="inputPassword4" placeholder="Password">
			</div>
		</div>
		<div class="form-group">
			<label for="inputAddress">Address</label> <input type="text" name="street1"
				class="form-control" id="inputAddress" placeholder="1234 Main St">
		</div>
		<div class="form-group">
			<label for="inputAddress2">Address 2</label> <input type="text" name="street2"
				class="form-control" id="inputAddress2"
				placeholder="Apartment, studio, or floor">
		</div>
		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="inputCity">City</label> <input type="text" name="city" required	
					class="form-control" id="inputCity">
			</div>
			<div class="form-group col-md-4">
				<label for="inputState">State</label> <select id="inputState" name="state"
					class="form-control">
					<option selected>Choose...</option>
					<option value="Karnataka">Karnataka</option>
					<option value="Andhra Pradesh">Andhra Pradesh</option>
					<option value="Tamilnadu">Tamilnadu</option>
					<option value="UP">UP</option>
				</select>
			</div>
			<div class="form-group col-md-2">
				<label for="inputZip">Zip</label> <input type="text" name="zip"
					class="form-control" id="inputZip">
			</div>
		</div>
		<div class="form-group">
			<div class="form-check">
				<input class="form-check-input" type="checkbox" name="courses" value="Core Java" id="gridCheck">
				<label class="form-check-label" for="gridCheck"> Core Java</label>
				&nbsp;
				<input class="form-check-input" type="checkbox" name="courses" value="Advance Java" id="gridCheck">
				<label class="form-check-label" for="gridCheck"> Advance Java</label>
					&nbsp;
				<input class="form-check-input" type="checkbox" name="courses" value="Java Frameworks" id="gridCheck">
				<label class="form-check-label" for="gridCheck"> Java Frameworks</label>
			</div>
		</div>
		<div class="form-group">
			<div class="form-check">
				<input class="form-check-input" type="radio" name="gender" value="Male" id="gridCheck">
				<label class="form-check-label" for="gridCheck"> Male</label>
				&nbsp;
				<input class="form-check-input" type="radio" name="gender" value="Female" id="gridCheck">
				<label class="form-check-label" for="gridCheck"> Female</label>
				
			</div>
		</div>
		<button type="submit" class="btn btn-primary btn-block">Register</button>
	</form>
</div>
</body>
</html>