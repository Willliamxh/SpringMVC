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
    <%--逐个接收请求的参数--%>
    <p>逐个接收请求参数</p>
    <%--get方式没问题 post方式乱码--%>
    <form action="receive-property.do" method="post">
        <%--记得这边写name 别写value 出错过一次--%>
        姓名：<input type="text" name="name"> <br/>
        年龄：<input type="text" name="age"> <br/>
        <input type="submit" value="提交参数">
    </form>

    <br/>
    <br/>

    <p>逐个接收请求参数:请求中参数名称不一样</p>
    <%--get方式没问题 post方式乱码--%>
    <form action="receive-param.do" method="post">
        <%--记得这边写name 别写value 出错过一次--%>
        姓名：<input type="text" name="rname"> <br/>
        年龄：<input type="text" name="rage"> <br/>
        <input type="submit" value="提交参数">
    </form>

    <p>对象接收请求参数:请求中参数和对象属性名一样</p>
    <%--get方式没问题 post方式乱码--%>
    <form action="receive-object.do" method="post">
        <%--记得这边写name 别写value 出错过一次--%>
        姓名：<input type="text" name="name"> <br/>
        年龄：<input type="text" name="age"> <br/>
        <input type="submit" value="对象接收参数">
    </form>




</body>
</html>
