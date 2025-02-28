<%-- 
    Document   : viaemailbeforeresetpassword
    Created on : Feb 23, 2025, 1:00:02 AM
    Author     : Thien
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    String url1 = request.getScheme()+ "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();;
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="<%=url1%>/css/style.css">
    </head>
    <body>
            <%@include file="../header.jsp" %>
        <%
            String error = request.getAttribute("error")+"";
            error = error.equals("null")?"":error;
            
            if(khachHang==null){ 
        %>
        <h1 class="red">Bạn chưa đăng nhập</h1>
        <% 
            }else {
        %>
        <form class="p-4 border rounded shadow bg-light" method="post" action="<%=url%>/khach-hang">
            <input type="hidden" name="hanhdong" value="viaemailbeforeresetpassword">
                    <h1 class="text-center">VIA Email</h1>
                    <div> <span class="red"> fsf<%=error%> </span> </div>
                    <!-- Username or Email input -->
                    <div data-mdb-input-init class="form-outline mb-2">
                        <label class="form-label" for="sortOTP">Nhập mã Xác thực</label>
                        <input type="text" id="sortOTP" class="form-control" name="sortOTP" />
                    </div>
                    
                    <div class="row mb-2">
                        <input type="submit" class="btn btn-primary" value="Confirm Reset Password" />
                    </div>
            
        </form>
        <% } %>
 
                    
    </body>
</html>
