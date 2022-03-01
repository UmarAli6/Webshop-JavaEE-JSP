<%@ page import="userInterface.ProductInfo" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <title>Webshop</title>
</head>
<body>
    <%
        List<ProductInfo> list = (List<ProductInfo>) request.getAttribute("list");
        for (ProductInfo p : list) {
    %>

    <h2><%=p.toString()%></h2>

    <%
        }
    %>
</body>
</html>