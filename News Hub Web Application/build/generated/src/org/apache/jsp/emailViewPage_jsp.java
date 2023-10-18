package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class emailViewPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>emails</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css\" \n");
      out.write("              integrity=\"sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==\" \n");
      out.write("              crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"Pages/emailView.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"background\"></div>\n");
      out.write("\n");
      out.write("        <!-- \n");
      out.write("            START: LEFT-NAV\n");
      out.write("        -->\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div class=\"left-nav\" id=\"left-side\">\n");
      out.write("\n");
      out.write("                <div class=\"logo-cont\">\n");
      out.write("                    <img src=\"logo.png\" alt=\"Logo\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"nav-container active\">\n");
      out.write("                    <a href=\"\">\n");
      out.write("                        <i class=\"fa-solid fa-envelope\" ></i> Inbox\n");
      out.write("                    </a><span class=\"badge\" style=\"background-color: red\">8</span>\n");
      out.write("                </div> \n");
      out.write("\n");
      out.write("                <div class=\"nav-container\">\n");
      out.write("                    <a href=\"\">\n");
      out.write("                        <i class=\"fa-solid fa-envelope\"></i>Sent\n");
      out.write("                    </a><span class=\"badge\" style=\"background-color: red; list-style-type: circle;\">13</span>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"nav-container\">\n");
      out.write("                    <a href=\"\">\n");
      out.write("                        <i class=\"fa-solid fa-envelope\"></i>Spam\n");
      out.write("                    </a><span class=\"badge\" style=\"background-color: red\">4</span>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"nav-container\">\n");
      out.write("                    <a href=\"\">\n");
      out.write("                        <i class=\"fa-solid fa-envelope\"></i>Outbox\n");
      out.write("                    </a><span class=\"badge\" style=\"background-color: red\">2</span>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"nav-container\">\n");
      out.write("                    <a href=\"\">\n");
      out.write("                        <i class=\"fa-solid fa-envelope\"></i>Drafts\n");
      out.write("                    </a><span class=\"badge\" style=\"background-color: red\">6</span>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"nav-container\">\n");
      out.write("                    <a href=\"\">\n");
      out.write("                        <i class=\"fa-solid fa-envelope\"></i>Deleted\n");
      out.write("                    </a><span class=\"badge\" style=\"background-color: red\">14</span>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"nav-container\">\n");
      out.write("                    <a href=\"\">\n");
      out.write("                        <i class=\"fa-solid fa-envelope\"></i>Archive\n");
      out.write("                    </a><span class=\"badge\" style=\"background-color: red\">8</span>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"nav-container logout\">\n");
      out.write("                    <a href=\"LogoutServlet.do\">\n");
      out.write("                        <i class=\"fa-solid fa-door-open\"></i>logout\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!--\n");
      out.write("    END : LEFT-NAV\n");
      out.write("    START: TOP-NAV\n");
      out.write("            -->\n");
      out.write("\n");
      out.write("            <div class=\"top-nav\" id=\"topNav\">\n");
      out.write("\n");
      out.write("                <button id=\"composeBtn\" ><i class=\"fa-solid fa-pen\"></i><b>compose</b></button>\n");
      out.write("                \n");
      out.write("                <a href=\"staffDashboard.jsp\"><i class=\"fa-solid fa-house\" ></i></a>\n");
      out.write("\n");
      out.write("                <form action=\"\">\n");
      out.write("                    <i class=\"fa-solid fa-magnifying-glass\"></i>\n");
      out.write("                    <input type=\"search\" name=\"search\" placeholder=\"Search emails...\">\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("                <div class=\"userProfile\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"body-cont\">\n");
      out.write("                <form action=\"\" id=\"form\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li class=\".email-summary\">\n");
      out.write("                            <button type=\"submit\">\n");
      out.write("                                <div class=\"sender-name\">\n");
      out.write("                                    <p>firtname lastname</p>\n");
      out.write("                                </div>\n");
      out.write("                           \n");
      out.write("                              <div class=\"subject-line\">\n");
      out.write("                                 eMAIL subject line\n");
      out.write("                              </div>\n");
      out.write("                            </button>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\".email-summary\">\n");
      out.write("                            <button type=\"submit\">\n");
      out.write("                                <div class=\"sender-name\">\n");
      out.write("                                    <p>firtname lastname</p>\n");
      out.write("                                </div>\n");
      out.write("                           \n");
      out.write("                              <div class=\"subject-line\">\n");
      out.write("                                 eMAIL subject line\n");
      out.write("                              </div>\n");
      out.write("                            </button>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\".email-summary\">\n");
      out.write("                            <button type=\"submit\">\n");
      out.write("                                <div class=\"sender-name\">\n");
      out.write("                                    <p>firtname lastname</p>\n");
      out.write("                                </div>\n");
      out.write("                           \n");
      out.write("                              <div class=\"subject-line\">\n");
      out.write("                                 eMAIL subject line\n");
      out.write("                              </div>\n");
      out.write("                            </button>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\".email-summary\">\n");
      out.write("                            <button type=\"submit\">\n");
      out.write("                                <div class=\"sender-name\">\n");
      out.write("                                    <p>firtname lastname</p>\n");
      out.write("                                </div>\n");
      out.write("                           \n");
      out.write("                              <div class=\"subject-line\">\n");
      out.write("                                 eMAIL subject line\n");
      out.write("                              </div>\n");
      out.write("                            </button>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\".email-summary\">\n");
      out.write("                            <button type=\"submit\">\n");
      out.write("                                <div class=\"sender-name\">\n");
      out.write("                                    <p>firtname lastname</p>\n");
      out.write("                                </div>\n");
      out.write("                           \n");
      out.write("                              <div class=\"subject-line\">\n");
      out.write("                                 eMAIL subject line\n");
      out.write("                              </div>\n");
      out.write("                            </button>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\".email-summary\">\n");
      out.write("                            <button type=\"submit\">\n");
      out.write("                                <div class=\"sender-name\">\n");
      out.write("                                    <p>firtname lastname</p>\n");
      out.write("                                </div>\n");
      out.write("                           \n");
      out.write("                              <div class=\"subject-line\">\n");
      out.write("                                 eMAIL subject line\n");
      out.write("                              </div>\n");
      out.write("                            </button>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"compose-email\" id=\"compose\">\n");
      out.write("                    <form action=\"\">\n");
      out.write("                        <div class=\"reciever\">\n");
      out.write("                            <p>To:</p>\n");
      out.write("                            <input type=\"email\" name=\"reciever\" placeholder=\"Email\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"subject\">\n");
      out.write("                            \n");
      out.write("                            <input type=\"text\" name=\"subject\" placeholder=\"Subject line(Optional)\" >\n");
      out.write("                        </div>\n");
      out.write("                        <textarea name=\"content\" placeholder=\"Type something here \"></textarea>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <script src=\"Pages/script.js\"></script>\n");
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
