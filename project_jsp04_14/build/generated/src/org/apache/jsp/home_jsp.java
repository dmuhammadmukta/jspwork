package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
if (user_id == null) {
	response.sendRedirect("login.jsp");
}

Connection connect = null;
Statement statement = null;

String username = null;
String email = null;
String name = null;

try {
	Class.forName("com.mysql.jdbc.Driver");
	connect =  DriverManager.getConnection("jdbc:mysql://" + mysql_host + "/" + mysql_db + "" +"?user=" + mysql_username + "&password=" + mysql_password);
	statement = connect.createStatement();
	ResultSet user_data = statement.executeQuery("SELECT * FROM `users` WHERE `id` = '" + user_id.toString() + "';");
	if (user_data.next()) {
		username = user_data.getString("username");
		email = user_data.getString("email");
		name = user_data.getString("name");
	} else {
		session.removeAttribute("user_id");
		response.sendRedirect("login.jsp");
	}
}  catch (Exception e) {
	out.println(e.getMessage());
	e.printStackTrace();
}
try {
	if (statement != null){
		statement.close();
		connect.close();
	}
} catch (SQLException e) {
}


      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\t\t<style>\n");
      out.write("\t\t\t\t.bg-light{\n");
      out.write("\t\t\t\t\tborder: 5px solid black;\n");
      out.write("\t\t\t\t\tbackground-image: url(assets/img/bk1.jpg);\n");
      out.write("\t\t\t\t\tbackground-size: 100%;\n");
      out.write("\t\t\t\t\tcolor:rgb(17, 101, 255);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\t.sidebar-link black{\n");
      out.write("\t\t\t\t\tbackground-color: aqua;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t</style>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <title>หน้าหลัก</title>\n");
      out.write("\t<link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"assets/css/offcanvas.css\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"assets/css/style.css\" rel=\"stylesheet\">\n");
      out.write("\t<script defer src=\"assets/js/all.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"bg-light\">\n");
      out.write("\t<nav class=\"navbar navbar-expand-lg fixed-top navbar-dark bg-dark\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<a class=\"navbar-brand mb-0 h1\" href=\"#\">JSP Final</a>\n");
      out.write("\t\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbar\">\n");
      out.write("\t\t\t\t<span class=\"navbar-toggler-icon\"></span>\n");
      out.write("\t\t\t</button>\n");
      out.write("\t\t\t<div id=\"navbar\" class=\"collapse navbar-collapse\">\n");
      out.write("\t\t\t\t<ul class=\"navbar-nav mr-auto\">\n");
      out.write("\t\t\t\t\t<li class=\"nav-item active\">\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link\" href=\"#\"><i class=\"fas fa-home\"></i>&nbsp; หน้าหลัก</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\">\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link\" href=\"data.jsp\"><i class=\"fas fa-list\"></i>&nbsp; รายชื่อผู้ใช้</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\">\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link\" href=\"map.jsp\"><i class=\"fas fa-map-marked-alt\"></i>&nbsp; แผนที่</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\">\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link\" href=\"about.jsp\"><i class=\"fas fa-id-card\"></i>&nbsp; ผู้จัดทำ</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<ul class=\"navbar-nav ml-auto\">\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\">\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link\" href=\"logout.jsp\"><i class=\"fas fa-sign-out-alt\"></i>&nbsp; ออกจากระบบ</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</nav>\n");
      out.write("\t<main role=\"main\" class=\"container\">\n");
      out.write("\t\t<div class=\"d-flex align-items-center p-3 my-3 text-white-50 bg-purple rounded shadow-sm pb-2\">\n");
      out.write("\t\t\t<i class=\"fas fa-user-circle fa-5x mr-3\" ></i>\n");
      out.write("\t\t\t<div class=\"lh-100\">\n");
      out.write("\t\t\t\t<h3 class=\"mb-0 text-white\">ยินดีต้อนรับ!</h3>\n");
      out.write("\t\t\t\t<h6>คุณ ");
      out.print(name);
      out.write("</h6>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-lg-3 pb-3\">\n");
      out.write("\t\t\t\t<div class=\"card\">\n");
      out.write("\t\t\t\t\t<ul class=\"list-group list-group-flush\">\n");
      out.write("\t\t\t\t\t\t<li class=\"list-group-item\">\n");
      out.write("\t\t\t\t\t\t\t<a class=\"sidebar-link black\" href=\"#\"><i class=\"fas fa-home\"></i>&nbsp; หน้าหลัก</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li class=\"list-group-item\">\n");
      out.write("\t\t\t\t\t\t\t<a class=\"sidebar-link black\" href=\"data.jsp\"><i class=\"fas fa-list\"></i>&nbsp; รายชื่อผู้ใช้</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li class=\"list-group-item\">\n");
      out.write("\t\t\t\t\t\t\t<a class=\"sidebar-link black\" href=\"map.jsp\"><i class=\"fas fa-map-marked-alt\"></i>&nbsp; แผนที่</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li class=\"list-group-item\">\n");
      out.write("\t\t\t\t\t\t\t<a class=\"sidebar-link black\" href=\"about.jsp\"><i class=\"fas fa-id-card\"></i>&nbsp; ผู้จัดทำ</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<br><br><br>\n");
      out.write("\t\t\t\t\t\t<li class=\"list-group-item\">\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"sidebar-link black\" href=\"logout.jsp\"><i class=\"fas fa-sign-out-alt\"></i>&nbsp; ออกจากระบบ</a>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-9\">\n");
      out.write("\t\t\t\t<div class=\"card\">\n");
      out.write("\t\t\t\t\t<div class=\"card-body\">\n");
      out.write("\t\t\t\t\t\t<h4><i class=\"fas fa-home\"></i>&nbsp; บัญชีผู้ใช้ของฉัน</h4>\n");
      out.write("\t\t\t\t\t\t<div class=\"my-2 p-2\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"media text-muted pt-3\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fas fa-user-tag fa-2x mr-3 fa-fw\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"media-body pb-3 mb-0 lh-125 border-bottom border-gray\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"d-flex justify-content-between align-items-center w-100\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<strong class=\"text-dark\">ชื่อผู้ใช้</strong>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"d-block\">");
      out.print(username);
      out.write("</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"media text-muted pt-3\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fas fa-at fa-2x mr-3 fa-fw\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"media-body pb-3 mb-0 lh-125 border-bottom border-gray\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"d-flex justify-content-between align-items-center w-100\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<strong class=\"text-dark\">ที่อยู่อีเมล</strong>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"d-block\">");
      out.print(email);
      out.write("</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"media text-muted pt-3\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fas fa-edit fa-2x mr-3 fa-fw\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"media-body pb-1 mb-0 lh-125\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"d-flex justify-content-between align-items-center w-100\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<strong class=\"text-dark\">ชื่อ-นามสกุล</strong>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"d-block\">");
      out.print(name);
      out.write("</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li></li>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t    </div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div style=\"background-color:#02afff;text-align:center;padding:30px;margin-top:7px;\n");
      out.write("\t\theight: 85px;border-radius: 2%;color:white;\"> <h5>\n");
      out.write("\t\t<marquee >ขอต้อนรับเข้าสู่ระบบ Java Server Pages!!!        \n");
      out.write("\t\t\t &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  |&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;              \n");
      out.write("\t\t\t ขอต้อนรับเข้าสู่ระบบ Java Server Pages!!!   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;              |    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \n");
      out.write("\t\t\t            ขอต้อนรับเข้าสู่ระบบ Java Server Pages!!!</marquee></h5></div>\n");
      out.write("\n");
      out.write("\t</main>\n");
      out.write("\n");
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
