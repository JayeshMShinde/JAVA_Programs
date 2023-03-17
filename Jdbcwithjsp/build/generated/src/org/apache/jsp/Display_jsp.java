package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class Display_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <a href=\"Addstudent.jsp\">Add Student</a>\n");
      out.write("        ");

            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from tblStudent");
        
      out.write("\n");
      out.write("        <h1>ALL STUDENT</h1>\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Roll No</th>\n");
      out.write("                    <th>Name</th>\n");
      out.write("                    <th>English</th>\n");
      out.write("                    <th>Maths</th>\n");
      out.write("                    <th>Science</th>                   \n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    while(rs.next()){
                        int r = rs.getInt("rno");
                        String n = rs.getString("name");
                        float e = rs.getFloat("english");
                        float m = rs.getFloat("maths");
                        float s = rs.getFloat("science");
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(r );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(n );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(e );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(m );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(s );
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                                
                    }
                
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
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
