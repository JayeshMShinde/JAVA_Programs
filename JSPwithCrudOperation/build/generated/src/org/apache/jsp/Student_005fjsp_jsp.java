package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Student;
import dao.Studentdao;
import java.util.*;

public final class Student_005fjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <form method=\"POST\">\n");
      out.write("                <table class=\"form-group\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th>\n");
      out.write("                            Roll No:\n");
      out.write("                        </th>\n");
      out.write("                        <th><input class=\"form-control\" type=\"text\" name=\"txtrno\"></th>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <th>\n");
      out.write("                            Name:\n");
      out.write("                        </th>\n");
      out.write("                        <th><input class=\"form-control\" type=\"text\" name=\"txtname\"></th>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <th>\n");
      out.write("                            English:\n");
      out.write("                        </th>\n");
      out.write("                        <th><input  class=\"form-control\" type=\"text\" name=\"txteng\"></th>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <th>\n");
      out.write("                            Maths:\n");
      out.write("                        </th>\n");
      out.write("                        <th><input class=\"form-control\" type=\"text\" name=\"txtmath\"></th>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <th>\n");
      out.write("                            Science:\n");
      out.write("                        </th>\n");
      out.write("                        <th><input  class=\"form-control\" type=\"text\" name=\"txtsci\"></th>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <th rowspan=\"2\"><input class=\"form-control btn-warning\" type=\"submit\" value=\"Submit\"></th>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        ");

            Studentdao sdao = new Studentdao();
            if (request.getMethod().equals("POST")) {
                int r = Integer.parseInt(request.getParameter("txtrno"));
                String n = request.getParameter("txtname");
                float e = Float.parseFloat(request.getParameter("txteng"));
                float m = Float.parseFloat(request.getParameter("txtmath"));
                float s = Float.parseFloat(request.getParameter("txtsci"));
                Student stud = new Student(r, n, e, m, s);
                String msg = sdao.AddStudent(stud);
                out.println("<h4>" + msg + "</h4>");
            }
            List<Student> lst = sdao.GetStudents();
        
      out.write("\n");
      out.write("        <hr/>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1>Student Details</h1>\n");
      out.write("            <table cellpadding=\"5\" cellspacing=\"1\" class=\"table table-bordered\">\n");
      out.write("                <thead style=\"background-color: lightgray\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Roll No</th>\n");
      out.write("                        <th>Name</th>\n");
      out.write("                        <th>English</th>\n");
      out.write("                        <th>Maths</th>\n");
      out.write("                        <th>Science</th>\n");
      out.write("                        <th>Action</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                        for (Student s : lst) {
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(s.getRno());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(s.getName());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(s.getEnglish());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(s.getMaths());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(s.getScience());
      out.write("</td>\n");
      out.write("                        <td>\n");
      out.write("                            <a href=\"Edit.jsp?rno=");
      out.print(s.getRno());
      out.write("\" class=\"fas btn-default\">&#xf304;</a>\n");
      out.write("                            &nbsp;\n");
      out.write("                            &nbsp;\n");
      out.write("                            <a href=\"Delete.jsp?rno=");
      out.print(s.getRno());
      out.write("\" class=\"fas btn-default\">&#xf2ed;</a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
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
