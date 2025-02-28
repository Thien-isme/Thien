<%
    String url1 = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();;
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <!-- Basic -->
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <!-- Mobile Metas -->
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <!-- Site Metas -->
        <meta name="keywords" content="" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>
            THT Helmet Store

        </title>

        <link rel="shortcut icon" href="<%= url1%>/GUI/images/favicon.png" type="image/x-icon">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>


        <!-- slider stylesheet -->
        <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css" />

        <!-- bootstrap core css -->
        <link rel="stylesheet" type="text/css" href="<%= url1%>/GUI/css/bootstrap.css" />

        <!-- Custom styles for this template -->
        <link href="<%= url1%>/GUI/css/style.css" rel="stylesheet" />
        <!-- responsive style -->
        <link href="<%= url1%>/GUI/css/responsive.css" rel="stylesheet" />
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
        <%@include file="../GUI/header.jsp" %>

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
                        <input type="text" id="username" class="form-control" name="username" value="" />
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
    
    
</body>
</html>