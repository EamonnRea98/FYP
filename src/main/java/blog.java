

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yomte
 * 
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


        
public class blog extends HttpServlet{
         @SuppressWarnings("empty-statement")
         protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            //gets the variables from Blog jsp
            String username = request.getParameter("name");
            String blog_type = request.getParameter("blog_type");
            String blog_title = request.getParameter("blog_title");
            String blog_content = request.getParameter("blog_content");
            

            
            mydb db = new mydb();
            Connection con = db.getCon();

            
            Statement stmt = con.createStatement();
            stmt.executeUpdate(blog_content + "','" + "INSERT INTO blog_submissions (username, blog_type, blog_title, blog_content,) VALUES('" + username + "','" + blog_type + "','" + blog_title + "','");

           
            
            out.println("<form action=\"blog.jsp#blog\">");
            out.println(username + ", your post has been added!");
            out.println("<br/>");
            
            out.println("<input type=\"submit\" value=\"Return to home\"/>");
            out.println("</form>");
            out.println("</div>");

        } catch (SQLException ex) {
            Logger.getLogger(Blog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
             try {
                 processRequest(request, response);
             } catch (SQLException ex) {
                 Logger.getLogger(blog.class.getName()).log(Level.SEVERE, null, ex);
             }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
             try {
                 processRequest(request, response);
             } catch (SQLException ex) {
                 Logger.getLogger(blog.class.getName()).log(Level.SEVERE, null, ex);
             }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private static class Blog {

        public Blog() {
        }
    }

}
