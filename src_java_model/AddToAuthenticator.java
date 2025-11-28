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
public class AddToAuthenticator {
   public boolean isAddTo(String Product_Name){
       try{
            Statement st=DBConnector.getStatement();
           String query=  "Insert into AddTo(`Product_Name`) values('"+Product_Name+"')";
             int i= st.executeUpdate(query);
            if(i>0)
        {
            return true;
        }
        
        }
       
       catch(SQLException e){
           System.out.println(e);
       }
       return false;
   }
    
}
