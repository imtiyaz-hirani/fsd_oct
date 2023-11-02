<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">

<style>
.login {
	font-family: monospace;
	font-size: 22px;
	color: #0e0dee
}

a {
	text-decoration: none;
}

a:hover {
	color: #000000
}
</style>
</head>
<body>
	<div class="row mb-4">
		<nav class="navbar bg-body-tertiary">
			<div class="container-fluid">
				<span class="navbar-brand mb-0 h1">Auth System</span>
			</div>
		</nav>
	</div>
	<form action="<%=request.getContextPath() %>/read-signup" method="post">
		<div class="row mt-4">

			<div class="col-md-6">
				<div class="card">
					<div class="card-body">
						<div class="alert alert-primary login" role="alert">Sign Up</div>

						<!--  username -->
						<div class="mb-3">
							<label class="form-label">Name</label> <input type="text"
								class="form-control" placeholder="enter your full name"
								name="name">
						</div>

						<!--  email -->
						<div class="mb-3">
							<label class="form-label">Email</label> 
							<input type="email"
								class="form-control" placeholder="enter your email" 
								name="email">
						</div>

						<!--  job title -->
						<div class="mb-3">
							<label class="form-label">Job Title</label> <select
								class="form-select" name="jobTitle">
								<option selected>Select Your Job Title</option>
								<option value="developer">Developer</option>
								<option value="product_owner">Product Owner</option>
								<option value="tester">Software Tester</option>
							</select>
						</div>

						<!--  EMployee ID? -->
						<div class="mb-3">
							<label class="form-label">Do you have an Employee ID?</label> <br />
							<input type="radio" value="yes" name="employeeId"
								class="form-check-input"> Yes <input type="radio"
								value="no" name="employeeId" class="form-check-input">
							No
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-6">
				<div class="card">
					<div class="card-header">Credentials Info</div>
					<div class="card-body">

						<!-- username -->
						<div class="mb-3">
							<label class="form-label">Username</label> <input type="text"
								class="form-control" placeholder="assign yourself a username"
								name="username">
						</div>
						<!--  password -->
						<div class="mb-3">
							<label class="form-label">Password</label> <input type="password"
								class="form-control" placeholder="assign yourself a password"
								name="password">
						</div>
						<!--  re-password -->
						<div class="mb-3">
							<label class="form-label">Re-Enter Password</label> <input
								type="password" class="form-control"
								placeholder="confirm your password again" 
								name="repassword">
						</div>
						<!-- Button -->
						<div class="mb-3">
							<input type="submit" class="btn btn-outline-primary"
								value="Sign Up">
						</div>


						<!--  signup and reset password Link -->
						<div class="mb-2">
							Already have an Account? <a href="/">Login</a>
						</div>

					</div>
				</div>
			</div>

		</div>
	</form>


</body>
</html>