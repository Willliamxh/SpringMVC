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
    <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        $(function (){
            //绑定事件
            $("#btnAjax").on("click",function (){
                // alert("button click");
                $.ajax({
                    // url:"return-void-ajax.do",
                    // url:"doStudentJson.do",
                    // url:"doListJsonArray.do",
                    url:"doStringData.do",
                    data:{
                        name:"lisi",
                        age:20,
                    },
                    // dataType:"json",
                    dataType:"text",
                    success:function(resp){
                        // resp = XMLHttpRequest.responseText;
                        // alert("resp==="+resp.name+"====="+resp.age);
                        // $.each(resp,function(i,n){
                        // // n  {"name":"李四同学","age":26}
                        // alert("n name="+n.name+"====age="+n.age);
                        // })

                        alert("resp=="+resp);
                    }

                })
            })
        })

    </script>
</head>
<body>
    <%--我一旦发起这个请求，中央调度器就能接受到 因为和do匹配了
        接下来就是处理请求
    --%>
    <p>控制器方法返回String-逻辑视图名称</p>
    <form action="return-string-view.do" method="post">
        <%--记得这边写name 别写value 出错过一次--%>
        姓名：<input type="text" name="name"> <br/>
        年龄：<input type="text" name="age"> <br/>
        <input type="submit" value="提交参数">
    </form>

    <br>
    <br>
    <p>控制器方法返回String-完整视图路径</p>
    <form action="return-string-view2.do" method="post">
        <%--记得这边写name 别写value 出错过一次--%>
        姓名：<input type="text" name="name"> <br/>
        年龄：<input type="text" name="age"> <br/>
        <input type="submit" value="提交参数">
    </form>


    <br/>
    <br/>

    <button id="btnAjax" >发起ajax的请求</button>






</body>
</html>
