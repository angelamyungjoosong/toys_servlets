package com.example.toys_servlets.daos;

import java.sql.ResultSet;
import java.sql.Statement;

import com.example.toys_servlets.commons.Commons;

public class PollDao {
    // 통계 참여자 총수 메소드
    public int PollDaoCountServlet() {
        int cnt = 0;
        try {
            Commons commons = new Commons();
            Statement statement = commons.getStatement();
            String query = "SELECT count(*) as cnt\n" + //
                    "FROM (select count(*)\n" + //
                    "from statistics\n" + //
                    "group by respondents_id) as t_cnt;";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                cnt = resultSet.getInt("cnt");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return cnt;
    }
}