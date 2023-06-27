package com.example.toys_servlets.daos;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

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

    // 회원 리스트 메소드
    public ArrayList selectAll(String unique_id) {
        ArrayList arrayList = new ArrayList();
        try {
            Commons commons = new Commons();
            Statement statement = commons.getStatement();
            String query = "SELECT * \n" + //
                    "FROM db_survey_project.respondents;";
            ResultSet resultSet = statement.executeQuery(query);// resultset은 재활용 가능
            HashMap hashMap = new HashMap();
            while (resultSet.next()) {
                hashMap = new HashMap();
                hashMap.put("RESPONDENTS", resultSet.getString("RESPONDENTS"));
                hashMap.put("RESPONDENTS_ID", resultSet.getString("RESPONDENTS_ID"));
                arrayList.add(hashMap);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return arrayList;
    }

    public ArrayList Survey()
    {
        int number = 1;
        int second_number = 1;
        ArrayList arrayList = new ArrayList();
        try
        {
            Commons commons = new Commons();
            Statement statement = commons.getStatement();
            String query = "select *\n" + //
                    "from question_choice;";
            ResultSet resultSet = statement.executeQuery(query);
            HashMap<String, String> questionInfor = new HashMap<>();
            HashMap<String, String> choiceInfor = new HashMap<>();
            while (resultSet.next())
            {
                query = "select cho.choice_id, cho.choice\n" + //
                        "from question_choice as ques_cho\n" + //
                        "inner join choice as cho\n" + //
                        "on ques_cho.choice_id = cho.choice_id\n" + //
                        "and questions_id = 'Q-01';";
                // second_number = second_number + 1;
                ResultSet resultSet_second = statement.executeQuery(query);
                while (resultSet_second.next())
                {
                    // questionInfor.put();
                    if (number < 5)
                    {
                        choiceInfor.put(String.valueOf(number), resultSet_second.getString("choice_id"));
                        number = number + 1;
                    }
                }
                // questionInfor.put()
                second_number = second_number + 1;
            }
        }

        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return arrayList;
    }
}
