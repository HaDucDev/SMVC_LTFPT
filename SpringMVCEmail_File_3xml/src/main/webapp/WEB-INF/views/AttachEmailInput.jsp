<%--
  Created by IntelliJ IDEA.
  User: Windows 10
  Date: 10/22/2021
  Time: 2:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Send Mail</title>
</head>
<body>
<h2>Send Email Form</h2>
${error}
<form:form action="send" method="post" enctype="multipart/form-data" modelAttribute="mail">
    <div>From:</div>
    <form:input path="from"/>
    <div>To:</div>
    <form:input path="to"/>
    <div>Subject:</div>
    <form:input path="subject"/>
    <div>Body:</div>
    <form:textarea path="body" rows="3" cols="30"/>
    <div>Attachment File:</div>
    <input name="attachment" type="file">
    <hr>
    <input type="submit" value="Send">
</form:form>
</body>
</html>

