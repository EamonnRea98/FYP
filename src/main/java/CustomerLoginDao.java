/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;  
/**
 *
 * @author yomte
 */
//Used this as reference https://www.javatpoint.com/example-of-login-form-in-servlet"
public class CustomerLoginDao {
   public static boolean validate(String name,String pass){  
boolean status=false;  
try{  
Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/my_db","Eamonn","kanturk98");  
      
PreparedStatement ps=con.prepareStatement(  
"select * from Users where name=? and pass=?");  
ps.setString(1,name);  
ps.setString(2,pass);  
      
ResultSet rs=ps.executeQuery();  
status=rs.next();  
          
}catch(Exception e){System.out.println(e);}  
return status;  
}  
}  