package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class support_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>support</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css\" \n");
      out.write("              integrity=\"sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==\" \n");
      out.write("              crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"Pages/learneDahboard.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Pages/home_page.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"background\"></div>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div class=\"left-nav\">\n");
      out.write("                <div class=\"logo-cont\">\n");
      out.write("                    <img src=\"Pages/logo.png\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"topnav\">\n");
      out.write("                <a href=\"index.html\"><span class=\"glyphicon glyphicon-home\"></span> Home</a>\n");
      out.write("                <a class=\"active\" href=\"support.jsp\"><span class=\"glyphicon glyphicon-comment\"></span> Support</a>\n");
      out.write("                <a href=\"login_signup.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> Sing In</a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"body-cont\">\n");
      out.write("\n");
      out.write("                <div class=\"form-control\">\n");
      out.write("\n");
      out.write("                    <form action=\"SupportServlet.do\" method=\"POST\">\n");
      out.write("\n");
      out.write("                        <div class=\"input\">\n");
      out.write("                            <input type=\"email\" name=\"sender\" required=\"\" placeholder=\"Enter your email...\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"input-query\">\n");
      out.write("                            <textarea id=\"query\" name=\"query\" placeholder=\"Write anything here...\"></textarea>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"input-chk\">\n");
      out.write("                            <input type=\"checkbox\" id=\"high\" name=\"high\" value=\"high\">\n");
      out.write("                            <label for=\"high\"> High Priority</label><br>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <button type=\"submit\" value=\"Send\">Send</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
