<%-- 
    Document   : details.jsp
    Created on : Apr 25, 2024, 11:07:13 AM
    Author     : Asus
--%>

<%@page import="db.DBConnector"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>detail page</title>
        <style>
            #product_details{
                width: 310px;
                height: 300px;
                border-radius: 10px;
                background-color: #333;
                color: white;
            }
            #h4_4{
                letter-spacing: 1px;
                padding:5px; 
                
            }
            .btn{
               width: 100px;
               height: 35px;
               background-color: rgba(254, 232, 86, 0.717);
               border: none;
               border-radius: 5px;
               color: white;    
               font-weight: 650;
               font-size: 14px;
            }
            
        </style>
    </head>
    <body>
                    <%
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
              %> 
        
              <div id="product_details">
                  <h1>Product details</h1>
                  <h4><%=rs.getString(1)%></h4>
                  <h4><%=rs.getString(2)%></h4>
                  <h4><%=rs.getString(3)%></h4>
                  <h4 id="h4_4"><%=rs.getString(4)%></h4>
              </div>
                  
                                  <%}
              }
              catch(Exception e)
                {
                    System.out.println(e); 
                }
              %>
             
              <table>
                  <tr>
                      <td>
                         <a href="purchase.jsp">
                             <button  class="btn" >Buy Now</button> 
                         </a>
                      </td>
                     <td>
                         <form action ="AddTo" method="post">
                             <input type="hidden" name="Product_Name" value="<%=rs.getString(1)%>">
                             <input type="submit" value="Add to Cart" class="btn" >
                         </form>
                     </td>
                     <td>
                          <a href="show.jsp">
                             <button class="btn"  >Show My Cart</button> 
                          </a>
                     </td> 
                     
</tr>
              </table>
      </body>
</html>
