<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>register</title>

<style type="text/css">

*{
	
	margin: 0;
	padding: 0;
	
}
body{
	
	background-color: #F8F8F8;
}
.card{
	
	left: 35%;
	margin-top: 5px;
}
.head{
  
  text-align: center;
  font-size: 30px;
  font-style: italic;
}

</style>
</head>
<body>
<%@include file="Header.jsp" %>
	<div class="card" style="width: 40rem;">
		<div class="card-body">
		      <h2 class="head">Register Form</h2>
			<form action=" <% request.getContextPath(); %>register" method="post">
			    
				<div class="form-group">
					<label for="exampleInputPassword1">Name</label> <input
						type="text" name="name" class="form-control"
						placeholder="Full Name">
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">UserName</label> <input
						type="text" name="username" class="form-control" 
						placeholder="UserName">
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1">Email address</label> <input
						type="email"  name="email"  class="form-control" 
						aria-describedby="emailHelp" placeholder="Enter email">
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">Password</label> <input
						type="password" name="password"  class="form-control" 
						placeholder="Password">
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">Status</label> <input
						type="text" name="status"  class="form-control" id="exampleInputPassword1"
						placeholder="User Status">
				</div>

				<button type="submit" class="btn btn-primary">Submit</button>
			</form>

		</div>
	</div>



	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>