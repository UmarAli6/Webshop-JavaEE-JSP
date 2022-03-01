<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Webshop</title>
    <style>
        h1 {text-align: center}
        .myDiv {
            margin: 0 auto;
            border: 5px outset red;
            background-color: lightblue;
            text-align: center;
        }
    </style>
</head>
<body>
<h1> Welcome </h1>
<div class="myDiv">
<form action="LoginServlet" method="post">
    Username:<input type="text" name="username"/><br/>
    Password:<input type="password" name="password"/><br/>
    <input type="submit" value="login"/>
</form>
</div>
<form action="GuestServlet" method="post">
    <input type="submit" value="Continue as Guest"/>
</form>
</body>
</html>
