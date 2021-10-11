<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Spring MVC</title>
<base href="${pageContext.servletContext.contextPath}/">
</head>
<body>
	<h2>SINH VIÊN</h2>
	<form action="student" method="post">

		<div>Họ và tên</div>
		<input name="name" />
		<div>Điểm trung bình</div>
		<input name="mark" />
		<div>Chuyên ngành</div>
		<!-- cùng chung name nên chỉ chọn 1 trong 2 -->
		<label> <input type="radio" name="major" value="APP" /> Ứng
			dụng phần mềm
		</label> <label> <input type="radio" name="major" value="WEB" />
			Thiết kế trang web
		</label>
		
		<hr>
		<button>Lưu</button>

	</form>
</body>
</html>