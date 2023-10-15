package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class studentDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css\" integrity=\"sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"Pages/studentDetails.css\">\n");
      out.write("    <title>Document</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"background\"></div>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"left-nav\">\n");
      out.write("            <div class=\"logo-cont\">\n");
      out.write("                <img src=\"logo.png\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"nav-container \">\n");
      out.write("                <a href=\"\">\n");
      out.write("                    <i class=\"fa-solid fa-house\" ></i> Home\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"nav-container active\">\n");
      out.write("                <a href=\"\">\n");
      out.write("                    <i class=\"fa-solid fa-user\"></i> Account\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"nav-container\">\n");
      out.write("                <a href=\"\">\n");
      out.write("                    <i class=\"fa-solid fa-bell\"></i> Notification\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"nav-container\">\n");
      out.write("                <a href=\"\">\n");
      out.write("                    <i class=\"fa-solid fa-envelope\"></i> Email\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"nav-container logout\">\n");
      out.write("                <a href=\"\">\n");
      out.write("                    <i class=\"fa-solid fa-door-open\"></i>logout\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!--\n");
      out.write("            END : LEFT-NAV\n");
      out.write("            START: TOP-NAV\n");
      out.write("        -->\n");
      out.write("\n");
      out.write("        <div class=\"top-nav\">\n");
      out.write("            <a href=\"https://www.unizulu.ac.za/contact-us/\"><b>contact us</b></a>\n");
      out.write("            <a href=\"https://www.unizulu.ac.za/contact-us/\"><b>about us</b></a>\n");
      out.write("\n");
      out.write("            <form action=\"\">\n");
      out.write("                <i class=\"fa-solid fa-magnifying-glass\"></i>\n");
      out.write("                <input type=\"search\" name=\"search\" placeholder=\"Search for anything\">\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            <div class=\"userProfile\">\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--\n");
      out.write("            END : TOP-NAV\n");
      out.write("            START : BODY-CONT\n");
      out.write("        -->\n");
      out.write("        <div class=\"body-cont\">\n");
      out.write("            <div class=\"form\">\n");
      out.write("                <form action=\"\" >\n");
      out.write("                        <div class=\"edit\">\n");
      out.write("                            <i class=\"fa-solid fa-user\"></i>\n");
      out.write("                            <input type=\"text\" name=\"firstname\" id=\"\" value=\"firstname\" required>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"edit\">\n");
      out.write("                            <i class=\"fa-solid fa-user\"></i>\n");
      out.write("                            <input type=\"text\" name=\"lastname\" id=\"\" value=\"lastName\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"edit\">\n");
      out.write("                            <i class=\"fa-solid fa-envelope\"></i>\n");
      out.write("                            <input type=\"email\" name=\"email\" id=\"\" value=\"email\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"edit\">\n");
      out.write("                            <i class=\"fa-solid fa-lock\"></i>\n");
      out.write("                            <input type=\"password\" name=\"password\" id=\"\" value=\"password\" required>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                            <input type=\"submit\" name=\"\" id=\"\" value=\"submit\" class=\"edit submit\" >\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                </form>\n");
      out.write("                <a href=\"\" >\n");
      out.write("                    <button>Back</button>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
