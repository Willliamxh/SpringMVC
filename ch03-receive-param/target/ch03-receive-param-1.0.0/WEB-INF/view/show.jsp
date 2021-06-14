<%--
  Created by IntelliJ IDEA.
  User: William_XH
  Date: 2021/6/11
  Time: 15:23
  To change this template use File | Settings | File Templates.
  show.jsp应该被受到保护，不应该能被用户直接访问到
  丢到 WEB-INF 里面，因为WEB-INF是受保护的，通过浏览器是访问不了的

--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>show</title>
</head>
<body>
    /WEB-INF/view/show.jsp,显示request作用域中的数据</br>
    <h3>myname数据:${myname}</h3>
    <h3>myage数据:${myage}</h3>

</body>
</html>
