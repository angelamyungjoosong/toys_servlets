package com.example.toys_servlets.controls;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.toys_servlets.daos.PollDao;

@WebServlet(urlPatterns = "/loginServlet")
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     try{

         String username = request.getParameter("Username");
        String password = request.getParameter("Password");
     RequestDispatcher requestDispatcher = request.getRequestDispatcher("/polls/login.jsp");
         requestDispatcher.forward(request,response); 
     } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}
}
