/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline.newairlines;

/**
 *
 * @author Vinee
 */

import java.sql.*;
public class connect {
    Connection c;
    Statement s;
    PreparedStatement pst;
    public connect() {
        try {
//            c = DriverManager.getConnection("jdbc:mysql:///newairlines","sample","");
            c = DriverManager.getConnection("jdbc:mysql:///newairlines","root","");
            s =c.createStatement(); 
         
        }catch(SQLException e){ 
            System.out.println(e);
        }  
    }
}
