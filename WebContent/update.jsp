<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="update" method="post">
		<div>
			<div>
				<label for="name">Name</label>
				<input type="text" name="name" value="${registerDTO.name}">
			</div>
			<div>
				<label for="email">Email</label>
				<input type="email" name="email" value="${registerDTO.email}" readonly="readonly">
			</div>
			<div>
				<label for="contactNumber">Contact Number</label>
				<input type="tel" name="contactNumber" value="${registerDTO.contactNumber}">
			</div>
			<div>
				<label for="password">Password</label>
				<input type="password" name="password" value="${registerDTO.password}">
			</div>
			<div>
				<input type="submit" value="update">
			</div>
		</div>
	</form>
</body>
</html>