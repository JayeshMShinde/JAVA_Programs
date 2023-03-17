package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;;

public final class desgnation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
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
      out.write("            function bulb_light() {\n");
      out.write("                var x = document.getElementById(\"myDIV\");\n");
      out.write("                if (x.innerHTML === \"Hello\") {\n");
      out.write("                    x.innerHTML = \"Swapped text!\";\n");
      out.write("                } else {\n");
      out.write("                    x.innerHTML = \"Hello\";\n");
      out.write("                }\n");
      out.write("            }\n");
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
      out.write("                    <li><a href=\"#\" style=\"color:greenyellow;width:100px\">LOGIN</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class =\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li><button class=\"btn btn-default\" style=\"width:50px;height: 100%\" onclick=\"Darkfun()\"><i class='far fa-lightbulb' ></i></button></li>\n");
      out.write("                </ul>\n");
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
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <form method=\"POST\">\n");
      out.write("    <table>\n");
      out.write("        <tr>\n");
      out.write("            <th>\n");
      out.write("                Designation ID:\n");
      out.write("            </th>\n");
      out.write("            <th>\n");
      out.write("                <input class=\"form-control\" type=\"text\" name=\"txtdesid\"/>\n");
      out.write("            </th>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <th>\n");
      out.write("                Designation Name:\n");
      out.write("            </th>\n");
      out.write("            <th>\n");
      out.write("                <input class=\"form-control\" type=\"text\" name=\"txtdesname\"/>\n");
      out.write("            </th>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <th>\n");
      out.write("                <input class=\"form-control btn btn-success\" type=\"Submit\" value=\"Submit\"/>\n");
      out.write("            </th>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("    </form>\n");
      out.write("    ");
        if (request.getMethod().equals("POST")) {
            int desid = Integer.parseInt(request.getParameter("txtdesid"));
            String desnm = request.getParameter("txtdesname");
            int cnt = st.executeUpdate("insert into DESEGNATION values(" + desid + ",'" + desnm + "')");
            if (cnt > 0) {
                out.println("<h2>Data Added Successfully</h2>");
            } else {
                out.println("<h2>Error....!!!!</h2>");
            }
        }
    
      out.write("\n");
      out.write("    <hr>\n");
      out.write("    ");

        ResultSet rs = st.executeQuery("Select * from DESEGNATION");
    
      out.write("\n");
      out.write("    <div class=\"col-md-9\">\n");
      out.write("        <table border=\"1\"cellpadding=\"5\" cellspacing=\"1\" class=\"table table-bordered\">\n");
      out.write("            <thead style=\"background:greenyellow\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>Designation_Id</th>\n");
      out.write("                    <th>Designation_Name</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    while (rs.next()) {
                        int desgid = rs.getInt("des_id");
                        String desgnm = rs.getString("des_name");
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(desgid);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(desgnm);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container\" style=\"background:lightslategray;height:150px;\">\n");
      out.write("                <br>\n");
      out.write("                <p style=\"color:whitesmoke;text-align: left\">\n");
      out.write("                    <a href=\"#\" class=\"btn btn-info\">Privacy Policy</a>\n");
      out.write("                    &nbsp;\n");
      out.write("                    <a href=\"#\" class=\"btn btn-info\">Disclamers</a>\n");
      out.write("                    &nbsp;\n");
      out.write("                    <a href=\"#\" class=\"btn btn-info\">Terms and Conditions</a>\n");
      out.write("                </p>\n");
      out.write("                <br>\n");
      out.write("                <p style=\"color:whitesmoke;text-align: right\">\n");
      out.write("                    ©2023 by <a href=\"#\" style=\"color:yellow\"> Ciit</a>\n");
      out.write("                </p>\n");
      out.write("                <p style=\"color:whitesmoke;text-align: left\">\n");
      out.write("                    Crafted By <a href=\"#\" style=\"color:yellow\">Jayesh</a>\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
