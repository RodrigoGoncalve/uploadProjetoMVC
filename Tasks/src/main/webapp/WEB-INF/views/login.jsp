<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
		<span style="color: red">${msg}</span>
		<form action="/login" method="POST">
			Login: <input type="text" name="login"><br>
			Senha: <input type="password" name="senha"><br>
			<input type="submit" value="Logar">
		</form>
		<br>
</body>
</html>