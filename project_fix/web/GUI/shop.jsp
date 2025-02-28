<%
    String url1 = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();;
%>

<%@page import="model.SanPham"%>
<%@page import="java.util.List"%>
<%@page import="database.SanPhamDAO"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
    <head>
        <!-- Basic -->
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <!-- Mobile Metas -->
        <meta
            name="viewport"
            content="width=device-width, initial-scale=1, shrink-to-fit=no"
            />
        <!-- Site Metas -->
        <meta name="keywords" content="" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <link rel="shortcut icon" href="images/favicon.png" type="image/x-icon" />

        <title>THT Helmet Store</title>

        <!-- slider stylesheet -->
        <link
            rel="stylesheet"
            type="text/css"
            href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css"
            />

        <!-- bootstrap core css -->
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css" />

        <!-- Custom styles for this template -->
        <link href="css/style.css" rel="stylesheet" />
        <!-- responsive style -->
        <link href="css/responsive.css" rel="stylesheet" />

        <!-- Boostrap t? bài c? -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    </head>

    <body>
        <div class="hero_area">
            <!-- header section strats -->
            <%@include file="header.jsp" %>
            <!-- end header section -->
        </div>
        <!-- end hero area -->

        <!-- shop section -->

        <section class="shop_section layout_padding">
            <div class="container">
                <div class="heading_container heading_center">
                    <h2>Products</h2>
                </div>

                <div class="filter-container">
                    <div class="filter-group">
                        <select class="filter" id="category-filter">
                            <option value="">Category</option>
                            <option value="rings">Rings</option>
                            <option value="watches">Watches</option>
                            <option value="flowers">Flowers</option>
                            <option value="teddy-bears">Teddy Bears</option>
                        </select>

                        <select class="filter" id="price-filter">
                            <option value="">Price</option>
                            <option value="0-100">$0 - $100</option>
                            <option value="100-300">$100 - $300</option>
                            <option value="300-500">$300 - $500</option>
                        </select>

                        <select class="filter" id="status-filter">
                            <option value="">Status</option>
                            <option value="new">New</option>
                            <option value="used">Used</option>
                        </select>

                        <select class="filter" id="brand-filter">
                            <option value="">Brand</option>
                            <option value="brand-a">Brand A</option>
                            <option value="brand-b">Brand B</option>
                            <option value="brand-c">Brand C</option>
                        </select>
                    </div>

                    <select class="filter" id="sort-filter">
                        <option value="">Sort By</option>
                        <option value="price-asc">Price: Low to High</option>
                        <option value="price-desc">Price: High to Low</option>
                        <option value="newest">Newest Arrivals</option>
                    </select>
                </div>

                <div class="row">
                    <%  SanPhamDAO dao = new SanPhamDAO();

                        List<SanPham> list = dao.selectAll();
                        float soLuongPage = (float) list.size() / 16 + 1;
                        int indexTrang = 0 ;
                        String value = request.getParameter("value");
                        System.out.println("value = " +value);
                        
                        if(value == null || value.equals("null")){
                            indexTrang = 1;
                        }else{
                            indexTrang = Integer.parseInt(request.getParameter("value")) ;
                        }
                         
                        
                       
                        
                        if (list != null && !list.isEmpty()) {
                            int i = 0;
                            for (SanPham sanPham : list) {
                                
                                if (i<indexTrang*16 && i >= (indexTrang-1)*16 ) {
                                   
                                
                    %>             
                    <div class="col-sm-6 col-md-4 col-lg-3">
                        <div class="box">
                            <a href="<%=url%>/sanpham/product-details.jsp">
                                <div class="img-name">
                                    <h6 class="col-12 text-center"><%=sanPham.getTensanpham()%></h6>
                                </div>
                                <div class="img-box">
                                    <img src="<%=url1%>/GUI/imgsanpham/<%=sanPham.getHinhanhsanpham()%>" alt="" />
                                </div>
                                <div class="detail-box row">
                                    <h6 class="col-12 text-center">
                                        Price
                                        <span> $<%=sanPham.getGiaban()%> </span>
                                    </h6>
                                </div>
                                <div class="text-center">
                                    <button class="img-name ">
                                        <h6 class="col-12 text-center">Add to card</h6>
                                    </button>
                                </div>

                                <div class="new">
                                    <span> New </span>
                                </div>
                            </a>
                        </div>
                    </div>        

                    <%
                        }
                                i++;
                            }
                        }
                    %>
                </div>



                <!--Chuyển trang để hiện thêm sản phẩm-->
                <div class="d-flex justify-content-center" >
                    <nav aria-label="Page navigation example">
                        <ul class="pagination">
                            <li class="page-item"><a class="page-link" href="">Previous</a></li>
                                <%
                                    if (soLuongPage > 0) {
                                        for (int i = 1; i < soLuongPage; i++) {

                                %>   
                            <li class="page-item"><a class="page-link" href="<%=url%>/GUI/shop.jsp?value=<%=i%>"><%=i%></a></li>
                            <%                            }
                                }
                            %>
                            <li class="page-item"><a class="page-link" href="">Next</a></li>
                        </ul>
                    </nav>
                </div>



                <div class="btn-box">
                    <a href=""> View All Products </a>
                </div>
            </div>
        </section>

        <!-- end shop section -->

        <!-- info section -->
        <section class="info_section layout_padding2-top">
            <div class="social_container">
                <div class="social_box">
                    <a href="">
                        <i class="fa fa-facebook" aria-hidden="true"></i>
                    </a>
                </div>
            </div>
            <div class="info_container">
                <div class="container">
                    <div class="row">
                        <div class="col-md-6 col-lg-4">
                            <h6>Text</h6>
                            <p>text</p>
                        </div>
                        <div class="col-md-6 col-lg-4">
                            <h6>Text</h6>
                            <p>Text</p>
                        </div>
                        <div class="col-md-6 col-lg-4">
                            <h6>Text</h6>
                            <div class="info_link-box">
                                <a href="">
                                    <i class="fa fa-map-marker" aria-hidden="true"></i>
                                    <span> text </span>
                                </a>
                                <a href="">
                                    <i class="fa fa-phone" aria-hidden="true"></i>
                                    <span>text</span>
                                </a>
                                <a href="">
                                    <i class="fa fa-envelope" aria-hidden="true"></i>
                                    <span>text</span>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- footer section -->
            <footer class="footer_section">
                <div class="container">
                    <p>&copy; <span id="displayYear"></span> All Rights Reserved By</p>
                </div>
            </footer>
            <!-- footer section -->
        </section>
        <!-- end info section -->

        <script src="js/jquery-3.4.1.min.js"></script>
        <script src="js/bootstrap.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js"></script>
        <script src="js/custom.js"></script>
    </body>
</html>
