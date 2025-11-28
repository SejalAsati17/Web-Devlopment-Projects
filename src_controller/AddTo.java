/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.AddToAuthenticator;

/**
 *
 * @author Asus
 */
/**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
public class AddTo extends HttpServlet {

     public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException{
       response.sendRedirect("index.jsp");
       
   }
      public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException{
      String Product_Name= request.getParameter("Product_Name");
      System.out.println(Product_Name);
      AddToAuthenticator at= new AddToAuthenticator();
      if(at.isAddTo(Product_Name)){
           HttpSession session= request.getSession(true);
              session.setAttribute("Product_Name",Product_Name);
              response.sendRedirect("details.jsp");
      }
      else{
          response.sendRedirect("index.jsp");
      }
}
}