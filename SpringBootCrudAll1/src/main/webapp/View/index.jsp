<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- Bootstrap 5 Link -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="container mt-4">
		<h2 class="text-center">Student Registration Form 1</h2><br>
		<form action="next" method="post">
			<div class="col-md-4 offset-md-4 mb-2">
				<label for="name">Enter Name</label> <input type="text"
					class="form-control" id="name" name="name">
			</div>
			<div class="col-md-4 offset-md-4 mb-2">
				<label for="email">Enter Email</label> <input type="email"
					class="form-control" id="email" name="email">
			</div>
			<div class="col-md-4 offset-md-4 mb-2">
				<label for="mob">Enter Mobile Number</label> <input type="tel"
					class="form-control" id="mob" name="mobile">
			</div>
			<div class="col-md-4 offset-md-4 mb-2">
				<label for="pass">Enter Password</label> <input type="password"
					class="form-control" id="pass" name="pass">
			</div>
			<div class="col-md-4 offset-md-4 mt-4 text-center">
				<input type="submit" class="btn btn-info btn-lg" value="Register">
			</div>
		</form>
	</div>
</body>
</html>