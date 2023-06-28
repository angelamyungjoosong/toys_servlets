package com.example.toys_servlets.controls;

import java.io.IOException;
import java.security.Key;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.toys_servlets.commons.Commons;

@WebServlet(urlPatterns = "/survey")
public class Survey extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        try
        {
            response.setContentType("text/html;charset=UTF-8");

            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/polls/survey.jsp");
            
            String first = request.getParameter("first");
            String second = request.getParameter("second");
            String third = request.getParameter("third");
            String fourth = request.getParameter("fourth");

            String[] answer = {"", first, second, third, fourth};

            int number = 1;
            Commons commons = new Commons();
            Statement statement = commons.getStatement();
            HashMap<String, String> choiceInfo = new HashMap<>();
            HashMap<String, String> questionInfo = new HashMap<>();
            HashMap<String, String> answerInfo = new HashMap<>();
            ArrayList arrayList = new ArrayList<>();
            String queryB = "select cho.choice_id, cho.choice\n" + //
                    "from question_choice as ques_cho\n" + //
                    "inner join choice as cho\n" + //
                    "on ques_cho.choice_id = cho.choice_id\n" + //
                    "and questions_id = 'Q-01';";
            String query = "SELECT *\n" + //
                    "FROM db_survey_project.statistics;";

            ResultSet resultSet2 = statement.executeQuery(queryB);
            while (resultSet2.next())
            {
                choiceInfo.put(String.valueOf(answer[number]), resultSet2.getString("choice_id"));
                number = number + 1;
            }

            String queryA = "select ques.questions_id, ques.questions\n" +
                    "from question_choice as ques_cho\n" +
                    "inner join questions as ques\n" +
                    "on ques_cho.questions_id = ques.questions_id\n" +
                    "and choice_id = 'C-01';";

            ResultSet resultSet = statement.executeQuery(queryA);

            number = 1;
            while (resultSet.next())
            {
                questionInfo.put(String.valueOf(answer[number]), resultSet.getString("questions_id"));
                query = "update statistics\n" + //
                       "set choice_id = '" + choiceInfo.get(String.valueOf(number)) + "'\n" + //
                       "where questions_id = '" + questionInfo.get(String.valueOf(number)) + "';";
                arrayList.add(query);
                number = number + 1;
            }
                // int total = statement.executeUpdate(String.valueOf(arrayList));

            requestDispatcher.forward(request, response);
        }
        
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}