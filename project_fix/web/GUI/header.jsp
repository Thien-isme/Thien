<%@page import="model.KhachHang"%>
<% String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath(); %>
<% String currentUrl = request.getRequestURI();%>




<!-- header section strats -->

<header class="header_section">
    <nav class="navbar navbar-expand-lg custom_nav-container ">
        <a class="navbar-brand" href="<%=url%>/GUI/index.jsp">
            <span>
                THT Helmet Store
            </span>
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class=""></span>
        </button>

        <div class="collapse navbar-collapse d-flex align-items-center" id="navbarSupportedContent">
            <ul class="navbar-nav  ">
                <li class="nav-item <%= currentUrl.contains("index.jsp") ? "active" : ""%>">
                    <a class="nav-link" href="<%=url%>/GUI/index.jsp">Home <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item <%= currentUrl.contains("shop.jsp") ? "active" : ""%>">
                    <a class="nav-link" href="<%=url%>/GUI/shop.jsp">
                        Shops
                    </a>
                </li>
                <li class="nav-item <%= currentUrl.contains("contact.jsp") ? "active" : ""%>">
                    <a class="nav-link" href="<%=url%>/GUI/contact.jsp">Contact Us</a>
                </li>
            </ul>
            <div class="user_option">

                <%
                    Object obj = session.getAttribute("khachHang");
                    KhachHang khachHang = null;
                    if (obj != null) {
                        khachHang = (KhachHang) obj;
                    }
                %>
                <%
                    if (khachHang == null) {
                %> 

                <a href="../khachhang/login.jsp">
                    <i class="fa fa-user" aria-hidden="true"></i>
                    <span <%= currentUrl.contains("index.jsp") ? "active" : ""%>>
                        Login
                    </span>
                </a>
                <%
                } else {
                %>


                <div class="col-5 text-center">
                    <ul class="navbar-nav me-auto bg-infor" style=" width: 80%">
                        <li class="nav-item dropdown">
                            <a style="font-size: 20px;"  class="nav-link dropdown-toggle text-center" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false"> 

                                <img style="width: 30px; border-radius: 50%" src="<%=url%>/uploads/<%=khachHang.getHinhAvatar()%>"  alt="?nh Avatar">  <%=khachHang.getHoVaTen()%>

                            </a>
                            <ul class="dropdown-menu " style=" width: 100%">

                <div class="col-8 text-center">
                    <ul class="navbar-nav me-auto bg-infor ">
                        <li class="nav-item dropdown">
                            <a style="font-size: 20px;"  class="nav-link dropdown-toggle text-center" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false"> 

                                <img style="width: 30px; border-radius: 50%" src="<%=url%>/GUI/imgsanpham/<%=khachHang.getHinhAvatar()%>"  alt="?nh Avatar">  <%=khachHang.getHoVaTen()%>

                            </a>
                            <ul class="dropdown-menu " style=" width: 126%">

                                <li><a class="dropdown-item" href="#">My Order</a></li>
                                <li><a class="dropdown-item" href="#">Notification <img style="width: 22px; " src="<%=url%>/GUI/images/notification_icon.png"  alt="?nh Avatar"></a></li>
                                <li><a class="dropdown-item" href="<%=url%>/khachhang/update.jsp">Update Information</a></li>
                                <li><a class="dropdown-item" href="<%=url%>/khachhang/resetpassword.jsp">Change Password</a></li>
                                <li><a class="dropdown-item" href="<%=url%>/khachhang/upload.jsp">Update Avatar</a></li>
                                <li><a class="dropdown-item" href="<%=url%>/GUI/getvoucher.jsp">Get Voucher</a></li>
                                <li><hr class="dropdown-divider"></li>
                                <li><a class="dropdown-item" href="<%=url%>/khach-hang?hanhdong=logout">Log-out</a></li>
                            </ul>
                        </li>
                    </ul>	
                </div>
                <%
                    }
                %>                    
                <a href="../khachhang/cart.jsp">
                    <i class="fa fa-shopping-bag" aria-hidden="true"></i>
                </a>
                <form class="d-flex ms-auto" role="search">
                    <div class="input-group">
                        <input type="search" class="form-control text-dark border-0" placeholder="Searching" aria-label="Search" style="outline: none;">
                        <button class="btn btn-dark" type="submit">
                            <i class="fa fa-search"></i>
                        </button>
                    </div>
                </form>
            </div>
        </div>
    </nav>
</header>


<!-- end header section -->

