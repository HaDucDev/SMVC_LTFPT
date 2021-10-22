<%@page pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC Seminar 2014</title>
</head>
<body>
	<h2>Send Email Form</h2>
	${error}
	<form:form action="send.htm" method="post"
		enctype="multipart/form-data" modelAttribute="mail">
		<div>From:</div>
		<form:input path="from" />
		<div>To:</div>
		<form:input path="to" />
		<div>Subject:</div>
		<form:input path="subject" />
		<div>Body:</div>
		<form:textarea path="body" rows="3" cols="30" />
		<div>Attachment File:</div>
		<input name="attachment" type="file">
		<hr>
		<input type="submit" value="Send">
	</form:form>
</body>
</html>