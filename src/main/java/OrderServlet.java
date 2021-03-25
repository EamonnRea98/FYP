/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author yomte
 */
public class OrderServlet extends HttpServlet {
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  

    response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
       // Obtaining the value in input areas on the forms
       
String email=request.getParameter("orderEmail"); 
String contactno=request.getParameter("orderContactno");
String county=request.getParameter("orderCounty");
String product=request.getParameter("orderProduct");  
String date=request.getParameter("orderDate");
int Quantity = Integer.parseInt(request.getParameter("orderQuantity"));  
String size=request.getParameter("orderSize");
    try{  
    //Creating connection to the database using Driver class and URL for database
Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/my_db","Eamonn","kanturk98");
  
PreparedStatement ps=con.prepareStatement(  
"INSERT INTO Orders (email, Contactno, County, Product, Date, Qty, Size) VALUES (?,?,?,?,?,?,?,?);"); 
  
ps.setString(1,email);
ps.setString(2,contactno);
ps.setString(3,county);
ps.setString(4,product);  
ps.setString(5,date);
ps.setInt(6,Quantity);
ps.setString(7,size);
int i=ps.executeUpdate();  
if(i>0)  

out.print("You are successfully registered...");  
    RequestDispatcher rd=request.getRequestDispatcher("WelcomeServlet");  
        rd.forward(request,response);        


}catch (ClassNotFoundException e2) {System.out.println(e2);} catch (SQLException e2) {  
    System.out.println(e2);
            }
          
out.close();  
	}

}
    
       
    

   