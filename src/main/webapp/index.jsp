<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--<%!--%>
<%--public void jspInit() throws Exception {--%>
  <%--System.out.println("jspInit invokes");--%>
<%--}--%>
<%--%>--%>
<!DOCTYPE html>
<html>
<meta charset="UTF-8">
  <head>
    <title>Title</title>
  </head>
  <body>
    Hello!
    <br>
    <form action="/handle" method="post">
      <span>Name: </span><input type="text" name="name" value="default"/>
      <span> Age: </span><input type="number" name="age" value="1"/>
      <input type="submit" value="Handle"/>
    </form>
    <a href="/start">StartServlet</a>
    <%--<a href="/forward?fw=true">Forward true Servlet</a>--%>
    <a href="/forward">Forward none Servlet</a>
    <br>
  </body>
</html>
