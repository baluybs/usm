<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="register" method="post">
		<div>
			<div>
				<label for="name">Name</label>
				<input type="text" name="name">
			</div>
			<div>
				<label for="email">Email</label>
				<input type="email" name="email">
			</div>
			<div>
				<label for="contactNumber">contact Number</label>
				<input type="tel" name="contactNumber">
			</div>
			<div>
				<label for="password">Password</label>
				<input type="password" name="password">
			</div>
			<div>
				<input type="submit" value="register">
			</div>
		</div>
	</form>
</body>
</html>