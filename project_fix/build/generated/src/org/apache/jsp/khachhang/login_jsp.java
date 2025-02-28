package org.apache.jsp.khachhang;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.SanPham;
import java.util.List;
import database.SanPhamDAO;
import model.KhachHang;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    String url1 = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <!-- Basic -->\r\n");
      out.write("        <meta charset=\"utf-8\" />\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("        <!-- Mobile Metas -->\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\r\n");
      out.write("        <!-- Site Metas -->\r\n");
      out.write("        <meta name=\"keywords\" content=\"\" />\r\n");
      out.write("        <meta name=\"description\" content=\"\" />\r\n");
      out.write("        <meta name=\"author\" content=\"\" />\r\n");
      out.write("        <title>\r\n");
      out.write("            THT Helmet Store\r\n");
      out.write("\r\n");
      out.write("        </title>\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"");
      out.print( url1);
      out.write("/GUI/images/favicon.png\" type=\"image/x-icon\">\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\" integrity=\"sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js\" integrity=\"sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- slider stylesheet -->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css\" />\r\n");
      out.write("\r\n");
      out.write("        <!-- bootstrap core css -->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print( url1);
      out.write("/GUI/css/bootstrap.css\" />\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom styles for this template -->\r\n");
      out.write("        <link href=\"");
      out.print( url1);
      out.write("/GUI/css/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <!-- responsive style -->\r\n");
      out.write("        <link href=\"");
      out.print( url1);
      out.write("/GUI/css/responsive.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("        <!-- Voucher style -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(url1);
      out.write("/GUI/css/voucher.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"hero_area\">\r\n");
      out.write("            <!-- header -->\r\n");
      out.write("            ");
      out.write('\r');
      out.write('\n');
 String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath(); 
      out.write('\r');
      out.write('\n');
 String currentUrl = request.getRequestURI();
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- header section strats -->\r\n");
      out.write("\r\n");
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
      out.write("        <div class=\"collapse navbar-collapse d-flex align-items-center\" id=\"navbarSupportedContent\">\r\n");
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
      out.write("                <a href=\"../khachhang/login.jsp\">\r\n");
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
      out.write("\r\n");
      out.write("                <div class=\"col-5 text-center\">\r\n");
      out.write("                    <ul class=\"navbar-nav me-auto bg-infor\" style=\" width: 80%\">\r\n");
      out.write("                        <li class=\"nav-item dropdown\">\r\n");
      out.write("                            <a style=\"font-size: 20px;\"  class=\"nav-link dropdown-toggle text-center\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\"> \r\n");
      out.write("\r\n");
      out.write("                                <img style=\"width: 30px; border-radius: 50%\" src=\"");
      out.print(url);
      out.write("/uploads/");
      out.print(khachHang.getHinhAvatar());
      out.write("\"  alt=\"?nh Avatar\">  ");
      out.print(khachHang.getHoVaTen());
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"dropdown-menu \" style=\" width: 100%\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-8 text-center\">\r\n");
      out.write("                    <ul class=\"navbar-nav me-auto bg-infor \">\r\n");
      out.write("                        <li class=\"nav-item dropdown\">\r\n");
      out.write("                            <a style=\"font-size: 20px;\"  class=\"nav-link dropdown-toggle text-center\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\"> \r\n");
      out.write("\r\n");
      out.write("                                <img style=\"width: 30px; border-radius: 50%\" src=\"");
      out.print(url);
      out.write("/GUI/imgsanpham/");
      out.print(khachHang.getHinhAvatar());
      out.write("\"  alt=\"?nh Avatar\">  ");
      out.print(khachHang.getHoVaTen());
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"dropdown-menu \" style=\" width: 126%\">\r\n");
      out.write("\r\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"#\">My Order</a></li>\r\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"#\">Notification <img style=\"width: 22px; \" src=\"");
      out.print(url);
      out.write("/GUI/images/notification_icon.png\"  alt=\"?nh Avatar\"></a></li>\r\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"");
      out.print(url);
      out.write("/khachhang/update.jsp\">Update Information</a></li>\r\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"");
      out.print(url);
      out.write("/khachhang/resetpassword.jsp\">Change Password</a></li>\r\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"");
      out.print(url);
      out.write("/khachhang/upload.jsp\">Update Avatar</a></li>\r\n");
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
      out.write("                <a href=\"../khachhang/cart.jsp\">\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- end header section -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!-- header -->\r\n");
      out.write("\r\n");
      out.write("            <section class=\"bg-light p-3 p-md-4 p-xl-5\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row justify-content-center\">\r\n");
      out.write("                        <div class=\"col-12 col-xxl-11\">\r\n");
      out.write("                            <div class=\"card border-light-subtle shadow-sm\">\r\n");
      out.write("                                <div class=\"row g-0\">\r\n");
      out.write("                                    <div class=\"col-12 col-md-6\">\r\n");
      out.write("                                        <img class=\"img-fluid rounded-start w-100 h-100 object-fit-cover\" loading=\"lazy\" src=\"");
      out.print(url1);
      out.write("/GUI/imgsanpham/kkk.jpg\" alt=\"\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-12 col-md-6 d-flex align-items-center justify-content-center\">\r\n");
      out.write("                                        <div class=\"col-12 col-lg-11 col-xl-10\">\r\n");
      out.write("                                            <div class=\"card-body p-3 p-md-4 p-xl-5\">\r\n");
      out.write("                                                <div class=\"row\">\r\n");
      out.write("                                                    <div class=\"col-12\">\r\n");
      out.write("                                                        <div class=\"mb-5\">\r\n");
      out.write("                                                            <div class=\"text-center mb-4\">\r\n");
      out.write("                                                                <a href=\"#!\">\r\n");
      out.write("                                                                    <img src=\"");
      out.print(url1);
      out.write("/GUI/imgsanpham/2.png\" alt=\"BootstrapBrain Logo\" width=\"175\" height=\"57\">\r\n");
      out.write("                                                                </a>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                            <h4 class=\"text-center\">Login</h4>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"row\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <form action=\"");
      out.print( url);
      out.write("/khach-hang\" method=\"POST\">\r\n");
      out.write("                                                    <input class=\"form-control\" name=\"hanhdong\" value=\"login\" type=\"hidden\">\r\n");
      out.write("                                                    <div class=\"row gy-3 overflow-hidden\">\r\n");
      out.write("                                                        <div class=\"col-12\">\r\n");
      out.write("                                                            <div class=\"form-floating mb-3\">\r\n");
      out.write("                                                                <input type=\"text\" class=\"form-control\" name=\"username\" id=\"username\" placeholder=\"\" required>\r\n");
      out.write("                                                                <label for=\"username\" class=\"form-label\">User name</label>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"col-12\">\r\n");
      out.write("                                                            <div class=\"form-floating mb-3\">\r\n");
      out.write("                                                                <input type=\"password\" class=\"form-control\" name=\"password\" id=\"password\" value=\"\" placeholder=\"Password\" required>\r\n");
      out.write("                                                                <label for=\"password\" class=\"form-label\">Password</label>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"col-12\">\r\n");
      out.write("                                                            <div class=\"form-check\">\r\n");
      out.write("                                                                <input class=\"form-check-input\" type=\"checkbox\" value=\"\" name=\"remember_me\" id=\"remember_me\">\r\n");
      out.write("                                                                <label class=\"form-check-label text-secondary\" for=\"remember_me\">\r\n");
      out.write("                                                                    Keep me logged in\r\n");
      out.write("                                                                </label>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"col-12\">\r\n");
      out.write("                                                            <div class=\"d-grid\">\r\n");
      out.write("                                                                <button class=\"btn btn-dark btn-lg\" type=\"submit\">Sign in</button>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </form>\r\n");
      out.write("                                                <div class=\"row\">\r\n");
      out.write("                                                    <div class=\"col-12\">\r\n");
      out.write("                                                        <div class=\"d-flex gap-2 gap-md-4 flex-column flex-md-row justify-content-md-center mt-5\">\r\n");
      out.write("                                                            <a href=\"");
      out.print(url1);
      out.write("/khachhang/register.jsp\" class=\"link-secondary text-decoration-none\">Create new account</a>\r\n");
      out.write("                                                            <a href=\"");
      out.print(url1);
      out.write("/khachhang/resetpassword.jsp\" class=\"link-secondary text-decoration-none\">Forgot password</a>\r\n");
      out.write("                                                        </div> \r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"");
      out.print( url1);
      out.write("/GUI/js/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print( url1);
      out.write("/GUI/js/bootstrap.js\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js\">\r\n");
      out.write("    </script>\r\n");
      out.write("    <script src=\"");
      out.print( url1);
      out.write("/GUI/js/custom.js\"></script>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- end hero area -->\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
