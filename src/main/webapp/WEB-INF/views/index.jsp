<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 4/14/2022
  Time: 4:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Simple Dictionary</title>
  </head>
  <body>
  <form action="/translate" method="post">
    <label>Word</label>
    <input type="text" name="word">
    <input type="submit" value="Translate">
  </form>
  </body>
</html>
