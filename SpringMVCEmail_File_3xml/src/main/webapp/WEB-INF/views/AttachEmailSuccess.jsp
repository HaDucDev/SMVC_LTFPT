<%--
  Created by IntelliJ IDEA.
  User: Windows 10
  Date: 10/22/2021
  Time: 2:12 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Send Email Success</title>
</head>
<body>
<h2>Send Email Success</h2>
<ul>
    <li>From: ${mail.from}</li>
    <li>To: ${mail.to}</li>
    <li>Subject: ${mail.subject}</li>
    <li>Body: ${mail.body}</li>
    <li>Attach image :
        <img src="${imageUrl}">
    </li>
</ul>
</body>
</html>

