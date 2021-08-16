<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
<style type="text/css">
* {
	margin: 0;
	padding: 0;
}

body {
	background-color: black;
}

.title {
	margin-top: 250px;
	font-style: italic;
	text-align: center;
	color: white;
}
</style>
</head>
<body>
	<h2 class="title">
		<%=request.getAttribute("status") %>
	</h2>
	<h2 class="title">
		Welcome :<%=request.getAttribute("username") %></h2>

</body>
</html>