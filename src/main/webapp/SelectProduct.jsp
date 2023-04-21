<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2023/3/20
  Time: 下午 08:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">

</head>
<body>
<nav class="navbar navbar-expand-lg bg-body-tertiary">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Navbar</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item" >
                    <a class="nav-link active"  aria-current="page" href="Member">登入帳號</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="SelectProduct">搜尋系統</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<a href="/" id="index">首頁</a>

<form id="form" method="get">
    <input type="text" name="town" placeholder="輸入地區">
    <button>提交</button>
</form>

<c:if test="${empty product}">
    <p>現在沒有任何資料</p>
</c:if>
<c:if test="${ not empty product}">
<table class="table table-striped-columns">
    ${applicationScope.product}
    <thead>
    <tr>
        <th>編號</th>
        <th>景點名稱</th>
        <th>地區</th>
        <th>地址</th>
        <th>電話</th>
        <th>門票</th>
        <th>圖片</th>
    </tr>

    </thead>
  <c:forEach var="item" items="${product}">
    <tbody>
      <tr>
      <td>${item.id}</td>
      <td>${item.name}</td>
      <td>${item.town}</td>
      <td>${item.address}</td>
      <td>${item.tel}</td>
      <td>${item.tickets}</td>
          <td><img src=${item.picture} ></td>
      </tr>
    <tbody>
  </c:forEach>
</table>
</c:if>
</body>
<style type="text/css">
    #index{
        display: flex;
        justify-content: center;
        align-items: center;
    }
    p , form{
        display: flex;
        justify-content: center;
        align-items: center;
    }


    td img{
    width: 200px    ;
    height: 100px;
}

</style>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</html>
