package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class resetPassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"Pages/login.css\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    \n");
      out.write("        <div class=\"left-side\" id=\"left-side\">\n");
      out.write("            <div class=\"outside-design\">\n");
      out.write("                <div class=\"design-container\">\n");
      out.write("                    <img src=\"Pages/graduation.png\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- ############################################################################################# -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"login-box\" id=\"login-box\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <img src=\"Pages/logo.png\" alt=\"logo_image\">  \n");
      out.write("            </div>\n");
      out.write("            <form action=\"LoginServlent.do\" method=\"POST\">\n");
      out.write("                <div class=\"input\">\n");
      out.write("                    <input type=\"email\" name=\"email\" placeholder=\"Please enter your emai\" required=\"\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input\">\n");
      out.write("                    <input type=\"password\" name=\"password\" placeholder=\"Please enter your passowrd\" required=\"\">\n");
      out.write("                </div>\n");
      out.write("                <button id=\"submit-btn\" type=\"submit\">\n");
      out.write("                    Log in\n");
      out.write("                </button>\n");
      out.write("                <a href=\"resetPassword.jsp\">Forgotten password</a>\n");
      out.write("                <hr>\n");
      out.write("                <span>\n");
      out.write("                    <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty requestScope.loginError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        <div class=\"error-message\" style=\"position: absolute; right: 5%;color: red;\">\n");
      out.write("                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.loginError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </c:if>\n");
      out.write("                </span>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("            <button id=\"create-acc\" onclick=\"showSignUp()\">Create new Account</button>\n");
      out.write("        </div>\n");
      out.write("\n");
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
