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
	<form action="update" method="post">

		<div>Họ và tên</div>
		<input name="name" value="${student.name}" />
		<div>Điểm trung bình</div>
		<input name="mark" value="${student.mark}" />
		
		<div>Chuyên ngành</div>
		<!-- cùng chung name nên chỉ chọn 1 trong 2 -->
		<label> 
		<input type="radio" name="major" value="APP" ${student.major=='APP'?'checked':''}/>
		 Ứng dụng phần mềm
		</label> 
		<!-- dòng mới thêm có nghĩa là nếu dữ liệu ở bean là APP thì checked là chọn ko thì để trống -->
		<label> 
		<input type="radio" name="major" value="WEB" ${student.major=='WEB'?'checked':''}/>
			Thiết kế trang web
		</label>

		<hr>
		<button>Cập nhật</button>

	</form>
</body>
</html>