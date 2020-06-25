<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4>Login Page</h4>
<h6>${responseMsg}</h6>
<form action="Login" method="post">
	<div>
	<form>
		<div>
				<label for="email">Email</label>
				<input type="email" name="email">
			</div>
			
			<div>
				<label for="password">Password</label>
				<input type="password" name="password">
			</div>
			<a href="register.jsp">Register</a>
			<a href="password.jsp">Forgot password</a>
			<div>
				<input type="submit" value="Login">
			</div>
		</form>
	</div>
</form>
</body>
</html>