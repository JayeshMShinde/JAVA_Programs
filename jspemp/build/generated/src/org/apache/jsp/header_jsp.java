package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;;

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
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                background-color: white;\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dark-mode{\n");
      out.write("                background-color: black;\n");
      out.write("                color: whitesmoke;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            function Darkfun() {\n");
      out.write("                var element = document.body;\n");
      out.write("                element.classList.toggle(\"dark-mode\");\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "tiger");
            Statement st = con.createStatement();
        
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"nav navbar-inverse\" style=\"width:100%\">\n");
      out.write("                <ul class =\"nav navbar-nav\">\n");
      out.write("                    <li><a href=\"header.jsp\" style=\"font:inherit\">CIIT</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class =\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li><a onclick=\"Darkfun()\" style=\"color:greenyellow;width:45px\"><i class='far fa-lightbulb' ></i></a></li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class =\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li><a href=\"#\" style=\"color:greenyellow;width:80px\">LOGIN</a></li>\n");
      out.write("                </ul>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3\" style=\"min-height: 500px;border-right: 1px solid gray;\">\n");
      out.write("                    <ul class=\"list-group\">\n");
      out.write("                        <li class=\"list-group-item\">\n");
      out.write("                            <a href=\"dashboard.jsp\" class=\"btn btn-primary\" style=\"width:100%\">Dashboard</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"list-group-item\">\n");
      out.write("                            <a href=\"state.jsp\" class=\"btn btn-primary\" style=\"width:100%\">State</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"list-group-item\">\n");
      out.write("                            <a href=\"city.jsp\" class=\"btn btn-primary\" style=\"width:100%\">City</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"list-group-item\">\n");
      out.write("                            <a href=\"desgnation.jsp\" class=\"btn btn-primary\" style=\"width:100%\">Designation</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"list-group-item\">\n");
      out.write("                            <a href=\"Employee.jsp\" class=\"btn btn-primary\" style=\"width:100%\">Employee</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-9\">\n");
      out.write("                    <div style=\"min-height: 500px;width:100%\">\n");
      out.write("\n");
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
