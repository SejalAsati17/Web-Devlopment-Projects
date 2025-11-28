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
import model.RegistrationAuthenticator;
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
   public class RegisterChecker extends HttpServlet {
   
    
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException{
       response.sendRedirect("register.html");
       
   }
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException{
        String UserEmail= request.getParameter("UserEmail");
        String UserPassword= request.getParameter("UserPassword");
        String UserAddress= request.getParameter("UserAddress");
        String UserCity= request.getParameter("UserCity");
        String UserState= request.getParameter("UserState");
        RegistrationAuthenticator ra= new RegistrationAuthenticator();
        if(ra.isRegister(UserEmail, UserPassword,UserAddress,UserCity,UserState)){
              HttpSession session= request.getSession(true);
              session.setAttribute("UserEmail",UserEmail);
             session.setAttribute("UserPassword",UserPassword);
             session.setAttribute("Usercity",UserAddress);
             session.setAttribute("UserAddress",UserCity);
             session.setAttribute("UserCity",UserState);
             response.sendRedirect("index.html");
        }
        else{
            
              response.sendRedirect("register.html");
          }
        }
}

