<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="../css/style.css">
    <style>
        /* Đảm bảo toàn bộ trang có chiều cao 100% */
        html, body {
            height: 100%;
            margin: 0;
            padding: 0;
        }

        /* Sử dụng Flexbox để căn chỉnh layout */
        .full-height {
            display: flex;
            flex-direction: column;
            height: 100vh;
        }

        /* Nội dung chính chiếm phần còn lại của màn hình */
        .main-content {
            flex: 1;
            display: flex;
            justify-content: center;
            align-items: center;
        }
    </style>
</head>
<body
    <%
         String error = request.getAttribute("error")+"";
            if(error == null || error.equals("null")){
            error = "";
            }
    %>        

    <div class="full-height">
        <!-- Header -->
        <%@include file="../header.jsp" %>
        <%
            if(khachHang==null){ 
        %>
        <h1 class="red">Bạn chưa đăng nhập</h1>
        <% 
            }else {
        %>
        <!-- Phần chính (Login form) sẽ căn giữa -->
        <div class="main-content">
            <div class="container">
                <form class="p-4 border rounded shadow bg-light" method="post" action="<%=url%>/khach-hang">
                    <input type="hidden" name="hanhdong" value="resetpassword">
                    <h1 class="text-center">Reset Password</h1>
                    <div> <span class="red"><%=error%></span> </div>
                    <!-- Username input -->
                    <div data-mdb-input-init class="form-outline mb-2">
                        <label class="form-label" for="username">Username</label>
                        <input type="text" id="username" class="form-control" name="username" value="<%=khachHang.getTenDangNhap()%>" />
                    </div>

                    <!-- password hiện tại input -->
                    <div data-mdb-input-init class="form-outline mb-2">
                        <label class="form-label" for="password">Password</label>
                        <input type="text" id="password" class="form-control" name="password" />
                    </div>
                    
                    <!-- NewPassword input -->
                    <div data-mdb-input-init class="form-outline mb-2">
                        <label class="form-label" for="newPassword">New Password</label>
                        <input type="text" id="newPassword" class="form-control" name="newPassword" />
                    </div>
                    
                    <!-- NewPassword input -->
                    <div data-mdb-input-init class="form-outline mb-2">
                        <label class="form-label" for="newPasswordConfirm">New Password Confirm</label>
                        <input type="password" id="newPasswordConfirm" class="form-control" name="newPasswordConfirm" />
                    </div>

                    <div class="row mb-2">
                        <input type="submit" class="btn btn-primary" value="Reset Password" />
                    </div>
                </form>
            </div>
        </div>

        <!-- Footer -->
    </div>
    
    <% } %>
</body>
</html>