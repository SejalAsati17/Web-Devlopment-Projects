<%-- 
    Document   : show
    Created on : Apr 28, 2024, 10:59:21 AM
    Author     : Asus
--%>


<%@page import="java.sql.ResultSet"%>
<%@page import="db.DBConnector"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
        #wishlist{
             width: 280px;
             height: 300px;
             border-radius: 10px;
             background-color: gray;
             color: white;
             padding: 10px;
        }
    </style>
    <body>
       
          <%
             Statement st = DBConnector.getStatement();
             ResultSet rs=null;
            
             String query = ("Select Product_Name from addto" );
             
             try
             {
             rs= st.executeQuery(query);
             while(rs.next())
              {
              %> 
        
               <div id="wishlist">
                   <h3>My wish list</h3>
                   
                          <h4><%=rs.getString(1)%></h4> 
                          
               </div>
              
                  
                                  <%}
              }
              catch(Exception e)
                {
                    System.out.println(e); 
                }
              %>
    </body>
</html>
