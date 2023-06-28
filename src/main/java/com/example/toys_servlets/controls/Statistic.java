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

@WebServlet(urlPatterns = "/statisticServlet")
public class Statistic extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     try {

        int cnt=0;
        int tot=0;
        PollDao pollDao = new PollDao();
        cnt = pollDao.PollDaoCount(cnt);

        ArrayList totStatList = new ArrayList<>();
        totStatList = pollDao.PollDaoTot(tot);

        request.setAttribute("cnt", cnt);

        request.setAttribute("tot", tot);
        request.setAttribute("totStatList", totStatList);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/polls/statistic.jsp");
        requestDispatcher.forward(request, response);

        System.out.println(cnt);

     } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}
}
