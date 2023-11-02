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

.msg{
	color: red;
}
</style>
</head>
<body>
	<%
		String msg = (String) request.getAttribute("msg");
	%>
	<div class="row mb-4">
		<nav class="navbar bg-body-tertiary">
			<div class="container-fluid">
				<span class="navbar-brand mb-0 h1">Auth System</span>
			</div>
		</nav>
	</div>

	<div class="row mt-4">
		<div class="col-md-4"></div>
		<div class="col-md-4">
			<div class="card">
				<div class="card-body">

					<div class="alert alert-primary login" role="alert">Login</div>
					<%
						if (msg != null) {
					%>
					<div class="msg mb-3">
						<%=msg%>
					</div>
					<%
						}
					%>

					<form action="<%=request.getContextPath()%>/process-login"
						method="post">
						<!--  username -->
						<div class="mb-3">
							<label class="form-label">Username</label> <input type="text"
								class="form-control"
								placeholder="enter your registered username" name="username">
						</div>

						<!--  password -->
						<div class="mb-3">
							<label class="form-label">Password</label> <input type="password"
								class="form-control" placeholder="enter your password"
								name="password">
						</div>

						<!-- Button -->
						<div class="mb-3">
							<input type="submit" class="btn btn-outline-primary"
								value="login">
						</div>
					</form>

					<!--  signup and reset password Link -->
					<div class="mb-2">
						<a href="<%=request.getContextPath()%>/sign-up">Sign Up</a>
					</div>
					<div class="mb-3">
						<a href="#">Reset Password</a>
					</div>
				</div>
			</div>
		</div>
		<div class="col-md-4"></div>
	</div>



</body>
</html>