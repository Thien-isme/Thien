<%-- 
    Document   : loginsuccess
    Created on : Feb 22, 2025, 12:02:22 AM
    Author     : Thien
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String url1= request.getScheme() + "://" + request.getServerName()+":" + request.getServerPort()+request.getContextPath();
        %>
        <h1>Đăng nhập thành công</h1>
        <h1> <a href="<%=url1%>/index.jsp">Trở về trang chủ</a> </h1>
    </body>
</html>