<%-- 
    Document   : upload
    Created on : Feb 23, 2025, 11:16:07 PM
    Author     : Thien
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    </head>
    <body>
        <%@include file="../header.jsp" %>
        <% 
            if (khachHang == null) {
        %>
        <h1>Bạn chưa đăng nhập</h1>
        <% 
        } else { 
        %>
        <div class="container">
            <img style="width: 50px" src="<%=url%>/uploads/<%=khachHang.getHinhAvatar()%>">
            <form class="file-upload" method="post" action="<%=url%>/khach-hang" enctype="multipart/form-data">
                <h1><%=url%></h1>
                <input type="hidden" name="hanhdong" value="updateavatar">
                <div class="row mb-5 gx-5">
                    <!-- Contact detail -->
                    <label class="form-control">Chọn file</label>
                    <input class="form-control" type="file" id="avatar" name="avatar">
                    
                    
                </div> <!-- Row END -->

                <!-- button -->
                <div class="gap-3 d-md-flex justify-content-md-end text-center">
                    <button type="submit" class="btn btn-primary btn-lg">Update profile</button>
                </div>
            </form> <!-- Form END -->
        </div>
        
        <%}%>


    </body>
    
    <script>
    if (window.location.search.includes("refresh=true")) {
        setTimeout(() => {
            location.reload();
        }, 1000); // Refresh sau 1 giây
    }
</script>
</html>
