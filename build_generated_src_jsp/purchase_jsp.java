package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class purchase_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"/css/purchase.css\" rel=\"stylesheet\"type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"row\">\n");
      out.write("  <div class=\"col-75\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <form action=\"/action_page.php\">\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-50\">\n");
      out.write("            <h3>Billing Address</h3>\n");
      out.write("            <label for=\"fname\"><i class=\"fa fa-user\"></i> Full Name</label>\n");
      out.write("            <input type=\"text\" id=\"fname\" name=\"firstname\" placeholder=\"John M. Doe\">\n");
      out.write("            <label for=\"email\"><i class=\"fa fa-envelope\"></i> Email</label>\n");
      out.write("            <input type=\"text\" id=\"email\" name=\"email\" placeholder=\"john@example.com\">\n");
      out.write("            <label for=\"adr\"><i class=\"fa fa-address-card-o\"></i> Address</label>\n");
      out.write("            <input type=\"text\" id=\"adr\" name=\"address\" placeholder=\"542 W. 15th Street\">\n");
      out.write("            <label for=\"city\"><i class=\"fa fa-institution\"></i> City</label>\n");
      out.write("            <input type=\"text\" id=\"city\" name=\"city\" placeholder=\"New York\">\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-50\">\n");
      out.write("                <label for=\"state\">State</label>\n");
      out.write("                <input type=\"text\" id=\"state\" name=\"state\" placeholder=\"NY\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-50\">\n");
      out.write("                <label for=\"zip\">Zip</label>\n");
      out.write("                <input type=\"text\" id=\"zip\" name=\"zip\" placeholder=\"10001\">\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-50\">\n");
      out.write("            <h3>Payment</h3>\n");
      out.write("            <label for=\"fname\">Accepted Cards</label>\n");
      out.write("            <div class=\"icon-container\">\n");
      out.write("              <i class=\"fa fa-cc-visa\" style=\"color:navy;\"></i>\n");
      out.write("              <i class=\"fa fa-cc-amex\" style=\"color:blue;\"></i>\n");
      out.write("              <i class=\"fa fa-cc-mastercard\" style=\"color:red;\"></i>\n");
      out.write("              <i class=\"fa fa-cc-discover\" style=\"color:orange;\"></i>\n");
      out.write("            </div>\n");
      out.write("            <label for=\"cname\">Name on Card</label>\n");
      out.write("            <input type=\"text\" id=\"cname\" name=\"cardname\" placeholder=\"John More Doe\">\n");
      out.write("            <label for=\"ccnum\">Credit card number</label>\n");
      out.write("            <input type=\"text\" id=\"ccnum\" name=\"cardnumber\" placeholder=\"1111-2222-3333-4444\">\n");
      out.write("            <label for=\"expmonth\">Exp Month</label>\n");
      out.write("            <input type=\"text\" id=\"expmonth\" name=\"expmonth\" placeholder=\"September\">\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-50\">\n");
      out.write("                <label for=\"expyear\">Exp Year</label>\n");
      out.write("                <input type=\"text\" id=\"expyear\" name=\"expyear\" placeholder=\"2018\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-50\">\n");
      out.write("                <label for=\"cvv\">CVV</label>\n");
      out.write("                <input type=\"text\" id=\"cvv\" name=\"cvv\" placeholder=\"352\">\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <label>\n");
      out.write("          <input type=\"checkbox\" checked=\"checked\" name=\"sameadr\"> Shipping address same as billing\n");
      out.write("        </label>\n");
      out.write("        <input type=\"submit\" value=\"Continue to checkout\" class=\"btn\">\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div class=\"col-25\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <h4>Cart\n");
      out.write("        <span class=\"price\" style=\"color:black\">\n");
      out.write("          <i class=\"fa fa-shopping-cart\"></i>\n");
      out.write("          <b>4</b>\n");
      out.write("        </span>\n");
      out.write("      </h4>\n");
      out.write("      <p><a href=\"#\">Product 1</a> <span class=\"price\">$15</span></p>\n");
      out.write("      <p><a href=\"#\">Product 2</a> <span class=\"price\">$5</span></p>\n");
      out.write("      <p><a href=\"#\">Product 3</a> <span class=\"price\">$8</span></p>\n");
      out.write("      <p><a href=\"#\">Product 4</a> <span class=\"price\">$2</span></p>\n");
      out.write("      <hr>\n");
      out.write("      <p>Total <span class=\"price\" style=\"color:black\"><b>$30</b></span></p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
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
