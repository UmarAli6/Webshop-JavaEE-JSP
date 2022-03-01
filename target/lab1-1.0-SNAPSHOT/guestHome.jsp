<%@ page import="userInterface.ProductInfo" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>GuestHome</title>
</head>
<style>
    .myDiv {
        border: 5px outset red;
        background-color: lightblue;
        text-align: center;
    }
</style>
<body>
<%
    List<ProductInfo> cart = (List<ProductInfo>) request.getAttribute("pList");
    for (ProductInfo p : cart) {
%>
<div class="myDiv" style="width: 800px; margin: 0 auto">
    <h2><%=p.getName()%></h2>
    <p>Price:<%=p.getPrice()%></p>
</div>

<%}%>
</body>
</html>
