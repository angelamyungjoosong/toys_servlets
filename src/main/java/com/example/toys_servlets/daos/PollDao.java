package com.example.toys_servlets.daos;

import java.sql.ResultSet;
import java.sql.Statement;

import com.example.toys_servlets.commons.Commons;

public class PollDao{
    //통계 참여자 총수 메소드
    public int PollDaoCountServlet(){
      
        try {
            Commons commons = new Commons();
            Statement statement = commons.getStatement();
            String query = "SELECT COUNT(*) \n" + //
                    "FROM (SELECT COUNT(*) \n" + //
                    "FROM statistics\n" + //
                    "GROUP BY RESPONDENTS_ID)AS CNT;\n" + //
                    "";
                    
           ResultSet resultSet = statement.executeQuery(query); 
           int cnt = resultSet.getInt(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return cnt;
}
}