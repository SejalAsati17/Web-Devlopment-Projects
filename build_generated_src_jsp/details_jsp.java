package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import db.DBConnector;
import java.sql.Statement;
import java.sql.ResultSet;

public final class details_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>detail page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <h1>Product details</h1>\n");
      out.write("                    ");

             Statement st = DBConnector.getStatement();
             ResultSet rs=null;
             String Product_Name = request.getParameter("Product_Name");
             System.out.println(Product_Name);
             String query = ("Select * from product where Product_Name='"+Product_Name+"'");
             
             try
             {
             rs= st.executeQuery(query);
             if(rs.next())
              {
              
      out.write(" \n");
      out.write("        \n");
      out.write("         \n");
      out.write("               <h4>");
      out.print(rs.getString(1));
      out.write("</h4>\n");
      out.write("              <h4>");
      out.print(rs.getString(2));
      out.write("</h4>\n");
      out.write("              <h4>");
      out.print(rs.getString(3));
      out.write("</h4>\n");
      out.write("              <h4>");
      out.print(rs.getString(4));
      out.write("</h4>\n");
      out.write("                  \n");
      out.write("                                  ");
}
              }
              catch(Exception e)
                {
                    System.out.println(e); 
                }
              
      out.write("\n");
      out.write("              <h1> First, login to purchase</h1>\n");
      out.write("              <table>\n");
      out.write("                  <tr>\n");
      out.write("                      <td>\n");
      out.write("              <a href=\"purchase.jsp\">\n");
      out.write("                   <button class=\"Buy_Now\" >Buy Now</button> \n");
      out.write("              </a>\n");
      out.write("                     </td>\n");
      out.write("                     <td>\n");
      out.write("                         <form action =\"AddTo\" method=\"post\">\n");
      out.write("                             <input type=\"hidden\" name=\"Product_Name\" value=\"");
      out.print(rs.getString(1));
      out.write("\">\n");
      out.write("                             <input type=\"submit\" value=\"Add to Cart\" class=\"Add_To\">\n");
      out.write("                         </form>\n");
      out.write("                     </td>\n");
      out.write("                     <td>\n");
      out.write("                          <a href=\"show.jsp\">\n");
      out.write("                             <button class=\"Show_btn\" >Show My Cart</button> \n");
      out.write("                          </a>\n");
      out.write("                     </td> \n");
      out.write("                     \n");
      out.write("</tr>\n");
      out.write("              </table>\n");
      out.write("      </body>\n");
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
