<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Dependance Injection</title>
<style>
.form-group {
	margin: 10px;
}
</style>
</head>
<body>
	<form>
		<div class="form-group">
			<div>Username</div>
			<input name="id" value="${user1234.username}">
		</div>
		<div class="form-group">
			<div>Password</div>
			<input name="id" value="${user1234.password}">
		</div>
		<div class="form-group">
			<button>Login</button>
		</div>
	</form>
</body>
</html>
