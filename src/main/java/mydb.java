
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yomte
 */
public class mydb {
    Connection con;

    /**
     *
     * @return
     */
    public Connection getCon() throws SQLException
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db","Eamonn","kanturk98");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(mydb.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    }
}
