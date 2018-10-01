<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>JSP variables scope example</title>
</head>
<body>
<c:set var="name" value="Yura" scope="page"/>
On this page: <c:out value="${name}"/>
<a href="test.jsp">Test page</a>
</body>
</html>
