<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2023/3/24
  Time: 下午 03:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String a = request.getParameter("user");
    request.setAttribute("user",a);
    System.out.println(a);

%>

<html>
  <head>
    <title>Title</title>
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
  </head>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <style>
      h1,a{
          display: flex;
          justify-content: center;
          align-items: center;
      }
      form{
          position: relative;
          left: 805px;width: 300px;
      }
  </style>


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
  <H1>帳號頁面</H1>
  <form>

      <h1 class="h3 mb-3 fw-normal">Please sign in</h1>

      <div class="form-floating">
          <input type="email" class="form-control" id="floatingInput" name="user" placeholder="name@example.com">
          <label for="floatingInput">Email address</label>
      </div>
      <div class="form-floating">
          <input type="password" class="form-control" id="floatingPassword"  placeholder="Password">
          <label for="floatingPassword">Password</label>
      </div>

      <div class="checkbox mb-3">
          <label>
              <input type="checkbox" value="remember-me"> Remember me
          </label>
      </div>
      <button class="w-100 btn btn-lg btn-primary" type="submit" onclick="checkMember(event)">Sign in</button>
      <p class="mt-5 mb-3 text-muted">© 2022–2023</p>
  </form>

  <a href="/">首頁</a>






  <script>
      function checkMember(event){
           event.preventDefault();
         const userElement = document.getElementById('floatingInput');

         const passwordElement = document.getElementById('floatingPassword');
         const  user2 = userElement.value;
         const  passwd= passwordElement.value;

         var member={
             "user":user2,
             "password":passwd
         }
          // console.log(member)
          $.ajax({
              url : 'http://localhost:8080/Member',
              type : 'POST',
              dataType:'text',
              contentType: "application/json ; charset=utf-8",
              data:JSON.stringify(member),
              success : function(data){

                  document.documentElement.innerHTML = data;
                    checkCookie();

              },
              error : function() {
                  alert("異常！");
              }
          });
      }
      function getCookie(cname){
          var name = cname + "=";
          var ca = document.cookie.split(';');
          for(var i=0; i<ca.length; i++) {
              var c = ca[i].trim();
              if (c.indexOf(name)==0) {

                  return c.substring(name.length,c.length); }
          }
          return "";
      }
      function checkCookie(){
          var user=getCookie("user");

      }
      // var member=JSON.stringify(employeeInfo);
      //


  </script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>

  </body>
</html>
