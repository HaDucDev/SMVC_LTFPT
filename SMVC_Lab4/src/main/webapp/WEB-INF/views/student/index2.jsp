<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Spring MVC</title>
<base href="${pageContext.servletContext.contextPath}/">
<style>
li {
	list-style: none;
	line-height: 25px;
}

li>label {
	display: inline-block;
	text-align: right;
	width: 150px;
	font-variant: small-caps;
	font-weight: bold;
}
</style>
</head>
<body>
	<h1>EL & JSTL</h1>
	<ul>
		<li><label>Họ và tên:</label> ${bean.name}</li>
		<li><label>Điểm TB:</label> ${bean.mark}</li>
		<li><label>Chuyên ngành:</label> ${bean.major}</li>
		<c:if test="${bean.mark >= 9}">
			<li><label>Danh hiệu:</label> ONG VÀNG</li>
		</c:if>

	</ul>
	<ul>
		<li><label>Họ và tên:</label> ${list[0].name}</li>
		<li><label>Điểm TB:</label> ${list[0].mark}</li>
		<li><label>Chuyên ngành:</label> ${list[0].major}</li>
		<c:if test="${list[0].mark >= 9}">
			<li><label>Danh hiệu:</label> ONG VÀNG</li>
		</c:if>

	</ul>
	<ul>

		<!-- 	<li>Truy xuất cách 1</li> -->
		<li><label>Họ và tên:</label> ${map['NHL'].name}</li>
		<li><label>Điểm TB:</label> ${map['NHL'].mark}</li>
		<li><label>Chuyên ngành:</label> ${map['NHL'].major}</li>
		<c:if test="${map['NHL'].mark >= 9}">
			<li><label>Danh hiệu:</label> ONG VÀNG</li>
		</c:if>

	</ul>

	<%-- <ul>
	<li>Truy xuất cách 2</li>
		<li><label>Họ và tên:</label> ${map.NHL.name}</li>
		<li><label>Điểm TB:</label> ${map.NHL.mark}</li>
		<li><label>Chuyên ngành:</label> ${map.NHL.major}</li>
	</ul> --%>
</body>
</html>