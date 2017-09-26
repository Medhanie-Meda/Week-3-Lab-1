/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;
import service.User;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.UserService;

/**
 *
 * @author 608964
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       String userName = request.getParameter("uName");
       String password = request.getParameter("pass");
       
       User user = new User(userName, password);
       
        request.setAttribute("user", user);
        UserService us = new UserService();        
       
        if(userName == null || userName.trim().isEmpty() || password == null || password.trim().isEmpty()) 
        {            
            request.setAttribute("message", "Both values are required!");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            return;            
        }
        if(us.login(userName, password) == false)
        {
            request.setAttribute("message", "Invalid username or password!");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            return;
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/mainPage.jsp").forward(request, response);
    }
}
