package org.apache.jsp.WEB_002dINF.views.testgit.student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class create_jspx extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div version=\"2.0\" id=\"footer\">");
      out.write("<div class=\"container\">");
      out.write("<div class=\"col-lg-6\">");
      out.write("<form method=\"POST\">");
      out.write("<div class=\"form-group\">");
      out.write("<div class=\"input-group\">");
      out.write("<span id=\"add-on1\" class=\"input-group-addon\">");
      out.write("First Name");
      out.write("</span>");
      out.write("<input aria-describedby=\"add-on1\" class=\"form-control\" id=\"firstname\" name=\"firstname\" type=\"text\" />");
      out.write("</div>");
      out.write("<br />");
      out.write("<div class=\"input-group\">");
      out.write("<span id=\"add-on2\" class=\"input-group-addon\">");
      out.write("Last Name");
      out.write("</span>");
      out.write("<input aria-describedby=\"add-on2\" class=\"form-control\" id=\"lastname\" name=\"lastname\" type=\"text\" />");
      out.write("</div>");
      out.write("<br />");
      out.write("<div class=\"input-group\">");
      out.write("<span id=\"add-on3\" class=\"input-group-addon\">");
      out.write("Age");
      out.write("</span>");
      out.write("<input aria-describedby=\"add-on3\" class=\"form-control\" id=\"age\" name=\"age\" type=\"number\" />");
      out.write("</div>");
      out.write("<br />");
      out.write("<div class=\"input-group\">");
      out.write("<span id=\"add-on3\" class=\"input-group-addon\">");
      out.write("Village");
      out.write("</span>");
      out.write("<input aria-describedby=\"add-on3\" class=\"form-control\" id=\"village\" name=\"village\" type=\"text\" />");
      out.write("</div>");
      out.write("<br />");
      out.write("<div class=\"input-group\">");
      out.write("<span id=\"add-on3\" class=\"input-group-addon\">");
      out.write("House No.");
      out.write("</span>");
      out.write("<input aria-describedby=\"add-on3\" class=\"form-control\" id=\"houseNo\" name=\"houseNo\" type=\"text\" />");
      out.write("</div>");
      out.write("<br />");
      out.write("<div class=\"input-group\">");
      out.write("<span id=\"add-on3\" class=\"input-group-addon\">");
      out.write("Road");
      out.write("</span>");
      out.write("<input aria-describedby=\"add-on3\" class=\"form-control\" id=\"road\" name=\"road\" type=\"text\" />");
      out.write("</div>");
      out.write("<br />");
      out.write("<div class=\"col-lg6\">");
      out.write("<div class=\"btn-group\">");
      out.write("<button class=\"btn btn-primary\" id=\"submit\" type=\"submit\">");
      out.write("Submit");
      out.write("</button>");
      out.write("</div>");
      out.write("<div class=\"btn-group\">");
      out.write("<button class=\"btn btn-danger\" id=\"reset\" type=\"reset\">");
      out.write("Reset");
      out.write("</button>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("</form>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
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
