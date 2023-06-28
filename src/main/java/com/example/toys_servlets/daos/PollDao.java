package com.example.toys_servlets.daos;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.catalina.connector.Request;

import com.example.toys_servlets.commons.Commons;

public class PollDao {
    // 통계 참여자 총수 메소드
    public int PollDaoCount(int cnt) {
        cnt = 0;
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
        return cnt;}

    //문항당 답항별 총 수 메소드
    public ArrayList PollDaoTot(int tot){
         ArrayList arrayList = new ArrayList();
        try {
            Commons commons = new Commons();
            Statement statement = commons.getStatement();
            String query = "SELECT QUESTIONS_ID, CHOICE_ID, COUNT(*)\n" + //
                    "FROM statistics\n" + //
                    "GROUP BY QUESTIONS_ID, CHOICE_ID\n" + //
                    "ORDER BY QUESTIONS_ID, CHOICE_ID;";
            ResultSet resultSet = statement.executeQuery(query);
            HashMap hashMap = new HashMap();
             while (resultSet.next()) {
                hashMap = new HashMap();
                hashMap.put("QUESTIONS_ID", resultSet.getString("QUESTIONS_ID"));
                hashMap.put("CHOICE_ID", resultSet.getString("CHOICE_ID"));
                hashMap.put("COUNT(*)", resultSet.getString("COUNT(*)"));
                arrayList.add(hashMap);}

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return arrayList;
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
        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
        try
        {
            int number = 1;
            Commons commons = new Commons();
            Statement statement = commons.getStatement();

            String queryA = "select ques.questions_id, ques.questions\n" +
                    "from question_choice as ques_cho\n" +
                    "inner join questions as ques\n" +
                    "on ques_cho.questions_id = ques.questions_id\n" +
                    "and choice_id = 'C-01';";

            ResultSet resultSet = statement.executeQuery(queryA);
            HashMap<String, String> choiceInfo = new HashMap<>();
            HashMap<String, String> questionInfo = new HashMap<>();
            while (resultSet.next())
            {
                questionInfo.put("Q" + String.valueOf(number), resultSet.getString("questions_id"));
                number = number + 1;
            }

            String queryB = "select cho.choice_id, cho.choice\n" + //
                    "from question_choice as ques_cho\n" + //
                    "inner join choice as cho\n" + //
                    "on ques_cho.choice_id = cho.choice_id\n" + //
                    "and questions_id = 'Q-01';";

            ResultSet resultSet2 = statement.executeQuery(queryB);
            number = 1;
            while (resultSet2.next())
            {
                choiceInfo.put(String.valueOf(number), resultSet2.getString("choice_id"));
                number = number + 1;
            }

            arrayList.add(questionInfo);
            arrayList.add(choiceInfo);
        }

        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return arrayList;
    }

    // 회원상세정보 메소드
    public ArrayList Password(String password) {
        ArrayList arrayList = new ArrayList();
        try {
            Commons commons = new Commons();
            Statement statement = commons.getStatement();
            String query = "SELECT * \n" + //
                    "FROM db_survey_project.respondents;";
            ResultSet resultSet = statement.executeQuery(query);// resultset은 재활용 가능
            HashMap hashMap = new HashMap();
            hashMap = new HashMap();
            hashMap.put("RESPONDENTS", resultSet.getString("RESPONDENTS"));
            hashMap.put("PASSWORDS", resultSet.getString("PASSWORDS"));
            arrayList.add(hashMap);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return arrayList;
    }

}
