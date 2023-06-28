package com.example.toys_servlets.controls;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.toys_servlets.daos.PollDao;

@WebServlet(urlPatterns = "/user_Info")
public class User_Info extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String pws = request.getParameter("password");

            PollDao pollDao = new PollDao();
            ArrayList<HashMap<String, Object>> respondents = pollDao.Password();
            ArrayList<HashMap<String, String>> passwords = pollDao.Password();

            request.setAttribute("pws", pws);
            request.setAttribute("respondents", respondents);
            request.setAttribute("passwords", passwords);

            // getWriter 전에 charset 설정
            response.setContentType("text/html;charset=UTF-8");

            // 다음 파일 호출
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/polls/user_info.jsp");
            requestDispatcher.forward(request, response);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
