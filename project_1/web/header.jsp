<%-- 
    Document   : header
    Created on : Feb 13, 2025, 10:17:42 PM
    Author     : Thien
--%>

<%@page import="model.KhachHang"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

        <%
            String url = request.getScheme()+ "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
           
        %>
        
        <div class="header row">
            <div class="col-3">
                <a href="<%=url%>/index.jsp" target="_self"> <img src="<%=url%>/img/logo.png"></a>
            </div>
            <div class="col-6 pt-3">
                <form class="row" action="https://www.w3schools.com/tags/tag_a.asp">
                    <input class="form-control rounded-pill" type="search" placeholder="Search">
                </form>
                <div class="row pt-2 d-flex flex-row justify-content-between mt-auto">
                    <a class="col-4 text-center fs-4 text-decoration-none" href="<%=url%>/index.jsp" target="_self"> Home</a>
                    <a class="col-4 text-center fs-4 text-decoration-none no-wrap" href="<%=url%>/header.jsp" target="_self"> Best Sellers</a>
                    <a class="col-4 text-center fs-4 text-decoration-none" href="<%=url%>/header.jsp" target="_self"> Product</a>
                </div>
            </div>
            <div class="col-3 row d-flex flex-row justify-content-between align-items-center">
                
                <!-- Code lấy session -->
                <%
                    Object obj = session.getAttribute("khachHang");
                    KhachHang khachHang = null;
                    if(obj!=null){
                        khachHang = (KhachHang) obj;
                    }
                %>
                
                <%
                    if(khachHang==null){     
                %>
                    <a class="col-4 text-center fs-4 text-decoration-none" href="<%=url%>/khachhang/login.jsp" target="_self"> Login</a>
                    <a class="col-4 text-center fs-4 text-decoration-none" href="<%=url%>/khachhang/register.jsp" target="_self"> Register</a>
                <%
                    } else { 
                %>
                <div class="col-8 text-center">
                    <ul class="navbar-nav me-auto bg-infor ">
                        <li class="nav-item dropdown">
                            <a style="font-size: 20px;"  class="nav-link dropdown-toggle text-center" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false"> 
                                <%
                                if(khachHang.getHinhAvatar()!=null && khachHang.getHinhAvatar().length()>0) {
                                %>  
                                <img style="width: 36px; border-radius: 50%" src="<%= url+"/uploads/"+khachHang.getHinhAvatar()%>"  alt="nh Avatar"> <%=khachHang.getHoVaTen() %> 
                                <% }else if(khachHang.getHinhAvatar().length()==0){ %>
                                
                                <img style="width: 36px" src="<%=url%>/uploads/accountprofile_icon.png"  alt="nh fdfdfAvatar"> <%=khachHang.getHoVaTen() %>
                                <% } %>
                            </a>
                            <ul class="dropdown-menu " style=" width: 100%">
                                    <li><a class="dropdown-item" href="#">My Order</a></li>
                                    <li><a class="dropdown-item" href="#">Notification <img style="width: 22px; " src="<%=url%>/GUI-icons/notification_icon.png"  alt="Ảnh Avatar"></a></li>
                                    <li><a class="dropdown-item" href="<%=url %>/khachhang/updateprofile.jsp">Update Information</a></li>
                                    <li><a class="dropdown-item" href="<%=url %>/khachhang/resetpassword.jsp">Change Password</a></li>
                                    <li><a class="dropdown-item" href="<%=url %>/khachhang/upload.jsp">Update Avatar</a></li>
                                    <li><hr class="dropdown-divider"></li>
                                    <li><a class="dropdown-item" href="<%=url %>/khach-hang?hanhdong=logout">Log-out</a></li>
                                </ul>
                        </li>
                    </ul>	
                                                        </div>
                <% 
                }
                %>

                    <a class="col-4 text-center fs-4 text-decoration-none no-wrap" href="<%=url%>/header.jsp" target="_self"> Giỏ Hàng</a>
            </div>
        </div>
