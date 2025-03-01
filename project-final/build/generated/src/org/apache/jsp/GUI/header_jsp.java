package org.apache.jsp.GUI;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.KhachHang;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

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
      out.write("                    <form class=\"d-flex ms-auto\" role=\"search\" action=\"");
      out.print( url );
      out.write("/san-pham\" method=\"GET\">\r\n");
      out.write("                        <input type=\"hidden\" name=\"hanhdong\" value=\"search\">\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        ");
 String keyword = request.getAttribute("keyword")+"";
                            keyword = keyword.equals("null")?"": keyword;
                        
      out.write("    \r\n");
      out.write("                        <input name=\"keyword\" value=\"");
      out.print( keyword );
      out.write("\" type=\"text\" class=\"form-control text-dark border-0\" placeholder=\"Searching\" aria-label=\"Search\" style=\"outline: none;\">\r\n");
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
