package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/config.jsp");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");


String mysql_host = "localhost";
String mysql_username = "root";
String mysql_password = "";
String mysql_db = "jsp_final";


      out.write('\n');
      out.write('\n');


Object user_id = session.getAttribute("user_id");
if (user_id != null) {
	response.sendRedirect("home.jsp");
}

Connection connect = null;
Statement statement = null;

String error_text = null;

if ("POST".equalsIgnoreCase(request.getMethod())) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		connect =  DriverManager.getConnection("jdbc:mysql://" + mysql_host + "/" + mysql_db + "" +"?user=" + mysql_username + "&password=" + mysql_password);
		statement = connect.createStatement();
		if (!statement.executeQuery("SELECT * FROM `users` WHERE `username` = '" + request.getParameter("username") + "';").next()) {
			if (request.getParameter("password").equals(request.getParameter("confirm_password"))) {
				statement.execute("INSERT INTO `users` (`id`, `username`, `password`, `email`, `name`) VALUES (NULL, '" + request.getParameter("username") + "', '" + request.getParameter("password") + "', '" + request.getParameter("email") + "', '" + request.getParameter("name") + "');");
				response.sendRedirect("login.jsp?registered=" + request.getParameter("username"));
			} else {
				error_text = "รหัสผ่านทั้งสองช่องไม่ตรงกัน";
			}
		} else {
			error_text = "มีชื่อผู้ใช้นี้อยู่ในระบบอยู่แล้ว";
		}
	}  catch (Exception e) {
		error_text = e.getMessage();
	}
	try {
		if (statement != null){
			statement.close();
			connect.close();
		}
	} catch (SQLException e) {
	}
}


      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("\t<style>\n");
      out.write("\t\t.m1{\n");
      out.write("\t\t\n");
      out.write("\t\t\tdisplay: block;\n");
      out.write("\t\t\tmargin: 0 auto;\n");
      out.write("\t\t\twidth: 50%;\n");
      out.write("\t\t   \n");
      out.write("\t\t}\n");
      out.write("\t\t.b1{\n");
      out.write("\t\t\tbackground-color: rgb(15, 120, 190);\n");
      out.write("\t\t\tcolor:white;\n");
      out.write("\t\t\twidth: 230px;\n");
      out.write("\t\t\theight: 50px;\n");
      out.write("\t\t\tborder-radius: 30%;\n");
      out.write("\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\t\t.b2{\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tcolor:white;\n");
      out.write("\t\t\twidth: 152px;\n");
      out.write("\t\t\theight: 50px;\n");
      out.write("\t\t\tborder-radius: 30%;\n");
      out.write("\t\t}\n");
      out.write("\t\t.b3{\n");
      out.write("\t\t\tborder: 5px solid black;\n");
      out.write("\t\t\tbackground-image: url(assets/img/bk.jpg);\n");
      out.write("\t\t}\n");
      out.write("\t</style>\n");
      out.write("\t\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <title>สมัครผู้ใช้ใหม่</title>\n");
      out.write("    <link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"assets/css/floating-labels.css\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"assets/css/style.css\" rel=\"stylesheet\">\n");
      out.write("\t\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"b3\">\n");
      out.write("    <form action=\"register.jsp\" method=\"POST\" class=\"form-signup\">\n");
      out.write("\t\t<img class=\"m1\" src=\"assets/img/add.png\" >\n");
      out.write("        <div class=\"text-center mb-4\">\n");
      out.write("            <i class=\"fas fa-user-plus fa-4x mb-4\"></i>\n");
      out.write("            <h1 class=\"h3 mb-2 font-weight-normal\">สมัครผู้ใช้ใหม่</h1>\n");
      out.write("        </div>\n");
      out.write("\t\t");


		if (error_text != null) {
		
      out.write("\n");
      out.write("\t\t<div class=\"alert alert-danger alert-dismissible fade show\" role=\"alert\">\n");
      out.write("\t\t\t<i class=\"fas fa-exclamation-triangle\"></i>&nbsp; ");
      out.print(error_text);
      out.write("\n");
      out.write("\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">\n");
      out.write("\t\t\t\t<span aria-hidden=\"true\">&times;</span>\n");
      out.write("\t\t\t</button>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t");

		}

		
      out.write("\n");
      out.write("        <div class=\"form-label-group\">\n");
      out.write("            <input type=\"text\" name=\"username\" id=\"username\" class=\"form-control\" placeholder=\"ชื่อผู้ใช้\" value=\"");
 if (request.getParameter("username") != null) { out.print(request.getParameter("username")); } 
      out.write("\" required autofocus>\n");
      out.write("            <label for=\"username\">ชื่อผู้ใช้</label>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"form-label-group\">\n");
      out.write("            <input type=\"email\" name=\"email\" id=\"email\" class=\"form-control\" placeholder=\"ที่อยู่อีเมล\" value=\"");
 if (request.getParameter("email") != null) { out.print(request.getParameter("email")); } 
      out.write("\" required>\n");
      out.write("            <label for=\"email\">ที่อยู่อีเมล</label>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"form-label-group\">\n");
      out.write("            <input type=\"text\" name=\"name\" id=\"name\" class=\"form-control\" placeholder=\"ชื่อ-นามสกุล\" value=\"");
 if (request.getParameter("name") != null) { out.print(request.getParameter("name")); } 
      out.write("\" required>\n");
      out.write("            <label for=\"name\">ชื่อ-นามสกุล</label>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"form-label-group\">\n");
      out.write("            <input type=\"password\" name=\"password\" id=\"password\" class=\"form-control\" placeholder=\"รหัสผ่าน\" required>\n");
      out.write("            <label for=\"password\">รหัสผ่าน</label>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"form-label-group\">\n");
      out.write("            <input type=\"password\" name=\"confirm_password\" id=\"confirm_password\" class=\"form-control\" placeholder=\"ยืนยันรหัสผ่าน\" required>\n");
      out.write("            <label for=\"confirm_password\">ยืนยันรหัสผ่าน</label>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<button  class=\"b1\" type=\"submit\">สมัครผู้ใช้ใหม่</button>\n");
      out.write("\t\t<button class=\"b2\" ><a href=\"login.jsp\"> ลงชื่อเข้าใช้</a></button>\n");
      out.write("        \n");
      out.write("    </form>\n");
      out.write("\t<script defer src=\"assets/js/jquery-3.4.1.min.js\"></script>\n");
      out.write("\t<script defer src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
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
