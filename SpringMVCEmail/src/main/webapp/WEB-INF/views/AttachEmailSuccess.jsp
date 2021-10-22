<%@page pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC Seminar 2014</title>
</head>
<body>
	<h2>Send Email Success</h2>
	<ul>
		<li>From: ${mail.from}</li>
		<li>To: ${mail.to}</li>
		<li>Subject: ${mail.subject}</li>
		<li>Body: ${mail.body}</li>
		<li>Attach Image: <img src="${imageUrl}">
		</li>
	</ul>
</body>
</html>