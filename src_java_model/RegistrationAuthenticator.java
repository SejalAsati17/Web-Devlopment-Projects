/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBConnector;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Asus
 */
public class RegistrationAuthenticator {
    public boolean isRegister(String UserEmail,String UserPassword,String UserAddress,String UserCity,String UserState ){
        try{
            Statement st=DBConnector.getStatement();
           String query= "INSERT into userdetails(`Email`,`Password`,`Address`,`City`,`State`) values('"+UserEmail+"','"+UserPassword+"','"+UserAddress+"','"+UserCity+"','"+UserState+"')";
           int i= st.executeUpdate(query);
            if(i>0)
        {
            return true;
        }
        
        }
           catch(SQLException e)
           {
               System.out.println(e);
           }
        return false;
     }
 }
    
