<%--
  Created by IntelliJ IDEA.
  User: William_XH
  Date: 2021/6/11
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>第一个SpringMVC</title>
</head>
<body>
    <%--我一旦发起这个请求，中央调度器就能接受到 因为和do匹配了
        接下来就是处理请求
    --%>
    <a href="first.do">发起some.do的Get的请求</a>
    <br/>

    <form action="first.do" method="post">
        <input type="submit" value="post请求">
    </form>



    <br>


</body>
</html>
