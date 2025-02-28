package org.apache.jsp.GUI;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.SanPham;
import java.util.List;
import database.SanPhamDAO;
import model.KhachHang;

public final class shop_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/GUI/header.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');

    String url1 = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
    SanPhamDAO sanPhamDAO = new SanPhamDAO();
    List<String> listColor = sanPhamDAO.selectColor();

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <!-- Basic -->\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("        <!-- Mobile Metas -->\n");
      out.write("        <meta\n");
      out.write("            name=\"viewport\"\n");
      out.write("            content=\"width=device-width, initial-scale=1, shrink-to-fit=no\"\n");
      out.write("            />\n");
      out.write("        <!-- Site Metas -->\n");
      out.write("        <meta name=\"keywords\" content=\"\" />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <meta name=\"author\" content=\"\" />\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/favicon.png\" type=\"image/x-icon\" />\n");
      out.write("\n");
      out.write("        <title>THT Helmet Store</title>\n");
      out.write("\n");
      out.write("        <!-- slider stylesheet -->\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            type=\"text/css\"\n");
      out.write("            href=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css\"\n");
      out.write("            />\n");
      out.write("\n");
      out.write("        <!-- bootstrap core css -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(url1);
      out.write("/GUI/css/bootstrap.css\" />\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"");
      out.print(url1);
      out.write("/GUI/css/style.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- responsive style -->\n");
      out.write("        <link href=\"");
      out.print(url1);
      out.write("/GUI/css/responsive.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("        <!-- Boostrap t? bài c? -->\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\" integrity=\"sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js\" integrity=\"sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"hero_area\">\n");
      out.write("            <!-- header section strats -->\n");
      out.write("            ");
      out.write('\r');
      out.write('\n');
 String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath(); 
      out.write('\r');
      out.write('\n');
 String currentUrl = request.getRequestURI();
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- header section strats -->\r\n");
      out.write("<header class=\"header_section\">\r\n");
      out.write("    <nav class=\"navbar navbar-expand-lg custom_nav-container \">\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"");
      out.print(url);
      out.write("/GUI/index.jsp\">\r\n");
      out.write("            <span>\r\n");
      out.write("                THT Helmet Store\r\n");
      out.write("            </span>\r\n");
      out.write("        </a>\r\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("            <span class=\"\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("\r\n");
      out.write("        <!--<div class=\"collapse navbar-collapse d-flex align-items-center\" id=\"navbarSupportedContent\">-->\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("            <ul class=\"navbar-nav  \">\r\n");
      out.write("                <li class=\"nav-item ");
      out.print( currentUrl.contains("index.jsp") ? "active" : "");
      out.write("\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"");
      out.print(url);
      out.write("/GUI/index.jsp\">Home <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item ");
      out.print( currentUrl.contains("shop.jsp") ? "active" : "");
      out.write("\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"");
      out.print(url);
      out.write("/GUI/shop.jsp\">\r\n");
      out.write("                        Shops\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item ");
      out.print( currentUrl.contains("contact.jsp") ? "active" : "");
      out.write("\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"");
      out.print(url);
      out.write("/GUI/contact.jsp\">Contact Us</a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <div class=\"user_option\">\r\n");
      out.write("\r\n");
      out.write("                ");

                    Object obj = session.getAttribute("khachHang");
                    KhachHang khachHang = null;
                    if (obj != null) {
                        khachHang = (KhachHang) obj;
                    }
                
      out.write("\r\n");
      out.write("                ");

                    if (khachHang == null) {
                
      out.write(" \r\n");
      out.write("\r\n");
      out.write("                <a href=\"");
      out.print( url);
      out.write("/khachhang/login.jsp\">\r\n");
      out.write("                    <i class=\"fa fa-user\" aria-hidden=\"true\"></i>\r\n");
      out.write("                    <span ");
      out.print( currentUrl.contains("index.jsp") ? "active" : "");
      out.write(">\r\n");
      out.write("                        Login\r\n");
      out.write("                    </span>\r\n");
      out.write("                </a>\r\n");
      out.write("                ");

                } else {
                
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-4 text-center\">\r\n");
      out.write("                    <ul class=\"navbar-nav me-auto bg-infor \">\r\n");
      out.write("                        <li class=\"nav-item dropdown\">\r\n");
      out.write("                            <a style=\"font-size: 20px;\"  class=\"nav-link dropdown-toggle text-center\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\"> \r\n");
      out.write("\r\n");
      out.write("                                <img style=\"width: 30px; height: 30px; border-radius: 50%\" src=\"");
      out.print(url);
      out.write("/uploads/");
      out.print(khachHang.getHinhAvatar());
      out.write("?v=");
      out.print(System.currentTimeMillis());
      out.write("\"  alt=\"\"> \r\n");
      out.write("\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"dropdown-menu \" >\r\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"#\">My Order</a></li>\r\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"");
      out.print(url);
      out.write("/khachhang/update.jsp\">Update Information</a></li>\r\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"");
      out.print(url);
      out.write("/khachhang/resetpassword.jsp\">Change Password</a></li>\r\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"");
      out.print(url);
      out.write("/GUI/getvoucher.jsp\">Get Voucher</a></li>\r\n");
      out.write("                                <li><hr class=\"dropdown-divider\"></li>\r\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"");
      out.print(url);
      out.write("/khach-hang?hanhdong=logout\">Log-out</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\t\r\n");
      out.write("                </div>\r\n");
      out.write("                ");

                    }
                
      out.write("                    \r\n");
      out.write("                <a href=\"");
      out.print( url);
      out.write("/khachhang/cart.jsp\">\r\n");
      out.write("                    <i class=\"fa fa-shopping-bag\" aria-hidden=\"true\"></i>\r\n");
      out.write("                </a>\r\n");
      out.write("                <form class=\"d-flex ms-auto\" role=\"search\">\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <input type=\"search\" class=\"form-control text-dark border-0\" placeholder=\"Searching\" aria-label=\"Search\" style=\"outline: none;\">\r\n");
      out.write("                        <button class=\"btn btn-dark\" type=\"submit\">\r\n");
      out.write("                            <i class=\"fa fa-search\"></i>\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("</header>\r\n");
      out.write("<!-- end header section -->");
      out.write("\n");
      out.write("            <!-- end header section -->\n");
      out.write("        </div>\n");
      out.write("        <!-- end hero area -->\n");
      out.write("\n");
      out.write("        <!-- shop section -->\n");
      out.write("\n");
      out.write("        <section class=\"shop_section layout_padding\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"heading_container heading_center\">\n");
      out.write("                    <h2>Products</h2>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"filter-container\">\n");
      out.write("                    <form action=\"");
      out.print(url1);
      out.write("/san-pham\" method=\"get\">\n");
      out.write("                        <input type=\"hidden\" name=\"hanhdong\" value=\"searchByConditions\">\n");
      out.write("\n");
      out.write("                        <select class=\"filter\" id=\"category-filter\" name=\"types\">\n");
      out.write("                            <option value=\"\">");
      out.print(request.getAttribute("types"));
      out.write(" </option>\n");
      out.write("                            <option value=\"fullface\">Fullface</option>\n");
      out.write("                            <option value=\"half\">1/2</option>\n");
      out.write("                            <option value=\"three\">3/4</option>\n");
      out.write("                        </select>\n");
      out.write("\n");
      out.write("                        <select class=\"filter\" id=\"brand-filter\" name=\"color\">\n");
      out.write("                            <option value=\"\">");
      out.print(request.getAttribute("color"));
      out.write(" </option>\n");
      out.write("                            ");

                                for (String color : listColor) {


                            
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(color);
      out.write('"');
      out.write('>');
      out.print(color);
      out.write("</option>\n");
      out.write("                            ");
                                }
                            
      out.write("\n");
      out.write("                        </select>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <select class=\"filter\" id=\"status-filter\" name=\"size\">\n");
      out.write("                            <option value=\"\">");
      out.print(request.getAttribute("size"));
      out.write(" </option>\n");
      out.write("                            <option value=\"S\">S</option>\n");
      out.write("                            <option value=\"M\">M</option>\n");
      out.write("                            <option value=\"L\">L</option>\n");
      out.write("                            <option value=\"XL\">XL</option>\n");
      out.write("                        </select>\n");
      out.write("\n");
      out.write("                        <select class=\"filter\" id=\"price-filter\" name=\"price\">\n");
      out.write("                            <option value=\"\">");
      out.print(request.getAttribute("price"));
      out.write(" </option>\n");
      out.write("                            <option value=\"0-500000\">$0-50000</option>\n");
      out.write("                            <option value=\"500000-1000000\">$500000-1000000</option>\n");
      out.write("                            <option value=\"1000000-3000000\">$1000000-3000000</option>\n");
      out.write("                        </select>\n");
      out.write("                        <button>Submit</button>\n");
      out.write("                    </form>\n");
      out.write("                    <select class=\"filter\" id=\"sort-filter\">\n");
      out.write("                        <option value=\"\">Sort By</option>\n");
      out.write("                        <option value=\"price-asc\">Price: Low to High</option>\n");
      out.write("                        <option value=\"price-desc\">Price: High to Low</option>\n");
      out.write("                        <option value=\"newest\">Newest Arrivals</option>\n");
      out.write("                    </select>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    ");
  SanPhamDAO dao = new SanPhamDAO();

                        ArrayList<SanPham> list = (ArrayList < SanPham >) session.getAttribute("list");
                        if(list==null){
                            list = dao.selectAll();
                        }
                        float soLuongPage = (float) list.size() / 16 + 1;
                        int indexTrang = 0;
                        String value = request.getParameter("value");

                        System.out.println(
                                "value = " + value);

                        if (value
                                == null || value.equals(
                                        "null")) {
                            indexTrang = 1;
                        } else {
                            indexTrang = Integer.parseInt(request.getParameter("value"));
                        }

                        if (list
                                != null && !list.isEmpty()) {
                            int i = 0;
                            for (SanPham sanPham : list) {

                                if (i < indexTrang * 16 && i >= (indexTrang - 1) * 16) {


                    
      out.write("             \n");
      out.write("                    <div class=\"col-sm-6 col-md-4 col-lg-3\">\n");
      out.write("                        <div class=\"box\">\n");
      out.write("                            <a href=\"");
      out.print(url);
      out.write("/sanpham/product-details.jsp\">\n");
      out.write("                                <div class=\"img-name\">\n");
      out.write("                                    <h6 class=\"col-12 text-center\">");
      out.print(sanPham.getTensanpham());
      out.write(' ');
      out.print(sanPham.getMasanpham());
      out.write("  </h6>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"img-box\">\n");
      out.write("                                    <img src=\"");
      out.print(url1);
      out.write("/GUI/imgsanpham/");
      out.print(sanPham.getHinhanhsanpham());
      out.write("\" alt=\"\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"detail-box row\">\n");
      out.write("                                    <h6 class=\"col-12 text-center\">\n");
      out.write("                                        Price\n");
      out.write("                                        <span> $");
      out.print(sanPham.getGiaban());
      out.write(" </span>\n");
      out.write("                                    </h6>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"text-center\">\n");
      out.write("                                    <button class=\"img-name \">\n");
      out.write("                                        <h6 class=\"col-12 text-center\">Add to card</h6>\n");
      out.write("                                    </button>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"new\">\n");
      out.write("                                    <span> New </span>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>        \n");
      out.write("\n");
      out.write("                    ");

                                }
                                i++;
                            }
                        }
                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!--Chuyển trang để hiện thêm sản phẩm-->\n");
      out.write("                <div class=\"d-flex justify-content-center\" >\n");
      out.write("                    <nav aria-label=\"Page navigation example\">\n");
      out.write("                        <ul class=\"pagination\">\n");
      out.write("                            <li class=\"page-item\"><a class=\"page-link\" href=\"\">Previous</a></li>\n");
      out.write("                                ");

                                    if (soLuongPage
                                            > 0) {
                                        for (int i = 1; i < soLuongPage; i++) {

                                
      out.write("   \n");
      out.write("                            <li class=\"page-item\"><a class=\"page-link\" href=\"");
      out.print(url);
      out.write("/GUI/shop.jsp?value=");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</a></li>\n");
      out.write("                                ");
                            }
                                    }
                                
      out.write("\n");
      out.write("                            <li class=\"page-item\"><a class=\"page-link\" href=\"\">Next</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"btn-box\">\n");
      out.write("                    <a href=\"\"> View All Products </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- end shop section -->\n");
      out.write("\n");
      out.write("        <!-- info section -->\n");
      out.write("        <section class=\"info_section layout_padding2-top\">\n");
      out.write("            <div class=\"social_container\">\n");
      out.write("                <div class=\"social_box\">\n");
      out.write("                    <a href=\"\">\n");
      out.write("                        <i class=\"fa fa-facebook\" aria-hidden=\"true\"></i>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"info_container\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6 col-lg-4\">\n");
      out.write("                            <h6>Text</h6>\n");
      out.write("                            <p>text</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6 col-lg-4\">\n");
      out.write("                            <h6>Text</h6>\n");
      out.write("                            <p>Text</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6 col-lg-4\">\n");
      out.write("                            <h6>Text</h6>\n");
      out.write("                            <div class=\"info_link-box\">\n");
      out.write("                                <a href=\"\">\n");
      out.write("                                    <i class=\"fa fa-map-marker\" aria-hidden=\"true\"></i>\n");
      out.write("                                    <span> text </span>\n");
      out.write("                                </a>\n");
      out.write("                                <a href=\"\">\n");
      out.write("                                    <i class=\"fa fa-phone\" aria-hidden=\"true\"></i>\n");
      out.write("                                    <span>text</span>\n");
      out.write("                                </a>\n");
      out.write("                                <a href=\"\">\n");
      out.write("                                    <i class=\"fa fa-envelope\" aria-hidden=\"true\"></i>\n");
      out.write("                                    <span>text</span>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- footer section -->\n");
      out.write("            <footer class=\"footer_section\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <p>&copy; <span id=\"displayYear\"></span> All Rights Reserved By</p>\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
      out.write("            <!-- footer section -->\n");
      out.write("        </section>\n");
      out.write("        <!-- end info section -->\n");
      out.write("\n");
      out.write("        <script src=\"\"></script>\n");
      out.write("        <script src=\"");
      out.print(url1);
      out.write("js/bootstrap.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js\"></script>\n");
      out.write("        <script src=\"");
      out.print(url1);
      out.write("js/custom.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
