<%@ page import="userInterface.ProductInfo" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>UserHome</title>
</head>

<style>
    .button {
        background-color: #4CAF50;
        border-radius: 12px;
        border: none;
        color: white;
        padding: 15px 32px;
        text-align: center;
        text-decoration: none;
        display: inline-block;
        font-size: 16px;
        margin: 4px 2px;
        cursor: pointer;
    }
</style>
<style>
    .myDiv {
        border: 5px outset red;
        background-color: lightblue;
        text-align: center;
    }
</style>
<body>

<%

    Integer uId = (Integer) request.getAttribute("uId");
    List<ProductInfo> products = (List<ProductInfo>) request.getAttribute("pList");
%>

<form action="CartServlet" method="post">
    <input type="hidden" name="uId" value="<%=uId%>">
    <input type="submit" value="Cart">
</form><%

    for (ProductInfo p : products) {
%>

<div class="myDiv" style="width: 800px; margin: 0 auto">
    <h2><%=p.getName()%></h2>
    <p>Price:<%=p.getPrice()%></p>
    <a href ="CartServlet?pId=<%=p.getpId()%>&uId=<%=uId%>">Add to Cart</a>
</div>
<%}%>

</body>
</html>
