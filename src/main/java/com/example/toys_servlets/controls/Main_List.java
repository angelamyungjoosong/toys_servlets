package com.example.toys_servlets.controls;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "main_List")
public class Main_List extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resposne) throws ServletException, IOException
    {
        try
        {
            String url = "jdbc:mysql://192.168.0.42:3306/db_cars";
            String user = "yojulab";
            String password = "!yojulab*";

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");

            Survey survey = new Survey();
            Statement statement = connection.createStatement();

            String query = "SELECT * FROM  db_poll.question_choice;\n" + //
                    "";
            ResultSet resultSet = statement.executeQuery(query);
        }
        
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
