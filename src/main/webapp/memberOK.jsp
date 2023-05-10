<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2023/4/10
  Time: 下午 12:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Object a = request.getAttribute("user");
    String b = request.getParameter("floatingInput");

    System.out.println(a);
    System.out.println(2);
//    System.out.println(b);
%>
<html>
<head>
    <title>Title</title>
</head>
<script>


</script>
<body>
<p>${user}登入成功!</p>
<p>1111</p>
</body>
</html>
