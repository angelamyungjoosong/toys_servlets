package com.example.toys_servlets.controls;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.toys_servlets.daos.PollDao;

@WebServlet(urlPatterns = "/loginServlet")
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     try{

          // get params from query //user에게 로그인 내용을 받아 날아올때
            String Username = request.getParameter("Username");
            String Password = request.getParameter("Password");


            // login

            HttpSession httpSession = request.getSession(false); // Session이 있으면 쓰고 없으면 만들어줌(create여부를 결정)
              String usernameSession = (String) httpSession.getAttribute("Username");
            if (httpSession != null && usernameSession != null ) { // JSESSION 있음 - 로그인 되었다는 표시가 됨
            }
                else if ("홍길동".equals(Username) && "1111".equals(Password)) {
                    httpSession = request.getSession();
                    httpSession.setAttribute("Username", Username);
                    httpSession.setAttribute("Password", Password);

                } else if ("장길산".equals(Username) && "2222".equals(Password))
                 {httpSession = request.getSession();
                    httpSession.setAttribute("Username", Username);
                    httpSession.setAttribute("Password", Password);
                    
                } else if ("신사임당".equals(Username) && "3333".equals(Password))
                 {httpSession = request.getSession();
                    httpSession.setAttribute("Username", Username);
                    httpSession.setAttribute("Password", Password);
                    
                } else if ("김철수".equals(Username) && "4444".equals(Password))
                 {httpSession = request.getSession();
                    httpSession.setAttribute("Username", Username);
                    httpSession.setAttribute("Password", Password);}

     RequestDispatcher requestDispatcher = request.getRequestDispatcher("/polls/login.jsp");
     requestDispatcher.forward(request,response); }
   
     catch (Exception e) {
        System.out.println(e.getMessage());
    }
}
    }
