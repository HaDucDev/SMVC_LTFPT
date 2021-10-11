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
	<li>Họ và tên: ${name}</li>
	<li>Điểm trung bình: ${mark}</li>
	<li>Chuyên ngành: ${major}</li>
</ul>

</body>
</html>