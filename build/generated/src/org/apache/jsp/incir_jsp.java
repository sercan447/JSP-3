package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class incir_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>JSP Page</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write(" \n");
      out.write("    ");
      out.print( "ne ekmek nede bir yudum su" );
      out.write("\n");
      out.write("    \n");
      out.write("    ");

        double num   = Math.random();
        if(num < 0.95){ 
    
      out.write("\n");
      out.write("    <h2>You'll hava a luck day</h2>\n");
      out.write("    ");
 
    }else {
    
      out.write("\n");
      out.write("    <h2>Well life goes on ...</h2>\n");
      out.write("    ");

    }
    
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <a href=\"");
      out.print( request.getRequestURI() );
      out.write("\"><h3>Try Again duvet</h3><a> \n");
      out.write("            ");
      out.print( request.getRequestURI() );
      out.write("\n");
      out.write("            <br/>\n");
      out.write("            \n");
      out.write("            ");

                out.write("<html>\r\n");
                double nume = Math.random();
                
                if(nume > 0.95){
                 out.write("<h2>0.95 den büyük");
                 out.write("</h2><p>(");
                 out.print(nume);
                 out.write(")</p>\r\n");
                }else {
                    out.write("\r\n   ");
                    out.write("<h2>Kucuk sayi ...");
                    out.write("</h2><p>(");
                    out.print(nume);
                    out.write("]</p>\r\n");
                }   
                    
            
      out.write("\n");
      out.write("            ");

                out.write("<a href=\'");
                out.print(request.getRequestURI());
                out.write("\'>");
                out.write("<h3>Try again</h3></a>\r\n");
                out.write("</html>\r\n");
            
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("</body>\n");
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
