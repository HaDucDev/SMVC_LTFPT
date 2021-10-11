<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Spring</title>
<base href="${pageContext.servletContext.contextPath}/">
</head>
<body>
<h3>Thông tin sinh viên</h3>
<ul>
	<li>Họ và tên: ${student123.name}</li>
	<li>Điểm trung bình: ${student123.mark}</li>
	<li>Chuyên ngành: ${student123.major}</li>
</ul>

</body>
</html>