package org.apache.jsp.WEB_002dINF.views.testgit;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jspx extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div version=\"2.0\" id=\"header\">");
      out.write("<nav class=\"navbar navbar-default\">");
      out.write("<div class=\"container-fluid\">");
      out.write("<div class=\"navbar-header\">");
      out.write("<button aria-expanded=\"false\" data-target=\"#bs-example-navbar-collapse-1\" data-toggle=\"collapse\" class=\"navbar-toggle collapsed\" type=\"button\">");
      out.write("<span class=\"sr-only\">");
      out.write("Toggle navigation");
      out.write("</span>");
      out.write("<span class=\"icon-bar\" />");
      out.write("<span class=\"icon-bar\" />");
      out.write("<span class=\"icon-bar\" />");
      out.write("</button>");
      out.write("<a href=\"#\" class=\"navbar-brand\">");
      out.write("Workshop");
      out.write("</a>");
      out.write("</div>");
      out.write("<div id=\"bs-example-navbar-collapse-1\" class=\"collapse navbar-collapse\">");
      out.write("<ul class=\"nav navbar-nav\">");
      out.write("<li class=\"dropdown\">");
      out.write("<a aria-expanded=\"false\" aria-haspopup=\"true\" role=\"button\" data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"#\">");
      out.write("Student");
      out.write("<span class=\"caret\" />");
      out.write("</a>");
      out.write("<ul class=\"dropdown-menu\">");
      out.write("<li>");
      out.write("<a href=\"#\">");
      out.write("Add new Student");
      out.write("</a>");
      out.write("</li>");
      out.write("<li>");
      out.write("<a href=\"#\">");
      out.write("View Students");
      out.write("</a>");
      out.write("</li>");
      out.write("</ul>");
      out.write("</li>");
      out.write("<li class=\"dropdown\">");
      out.write("<a aria-expanded=\"false\" aria-haspopup=\"true\" role=\"button\" data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"#\">");
      out.write("Address");
      out.write("<span class=\"caret\" />");
      out.write("</a>");
      out.write("<ul class=\"dropdown-menu\">");
      out.write("<li>");
      out.write("<a href=\"#\">");
      out.write("Add new address");
      out.write("</a>");
      out.write("</li>");
      out.write("<li>");
      out.write("<a href=\"#\">");
      out.write("View address");
      out.write("</a>");
      out.write("</li>");
      out.write("</ul>");
      out.write("</li>");
      out.write("</ul>");
      out.write("<form class=\"navbar-form navbar-left\">");
      out.write("<div class=\"form-group\">");
      out.write("<input placeholder=\"Search\" class=\"form-control\" type=\"text\" />");
      out.write("</div>");
      out.write("<button class=\"btn btn-default\" type=\"submit\">");
      out.write("Submit");
      out.write("</button>");
      out.write("</form>");
      out.write("<ul class=\"nav navbar-nav navbar-right\">");
      out.write("<li>");
      out.write("<a href=\"#\">");
      out.write("Link");
      out.write("</a>");
      out.write("</li>");
      out.write("<li class=\"dropdown\">");
      out.write("<a aria-expanded=\"false\" aria-haspopup=\"true\" role=\"button\" data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"#\">");
      out.write("Dropdown ");
      out.write("<span class=\"caret\" />");
      out.write("</a>");
      out.write("<ul class=\"dropdown-menu\">");
      out.write("<li>");
      out.write("<a href=\"#\">");
      out.write("Action");
      out.write("</a>");
      out.write("</li>");
      out.write("<li>");
      out.write("<a href=\"#\">");
      out.write("Another action");
      out.write("</a>");
      out.write("</li>");
      out.write("<li>");
      out.write("<a href=\"#\">");
      out.write("Something else here");
      out.write("</a>");
      out.write("</li>");
      out.write("<li class=\"divider\" role=\"separator\" />");
      out.write("<li>");
      out.write("<a href=\"#\">");
      out.write("Separated link");
      out.write("</a>");
      out.write("</li>");
      out.write("</ul>");
      out.write("</li>");
      out.write("</ul>");
      out.write("</div>");
      out.write("</div>");
      out.write("</nav>");
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
