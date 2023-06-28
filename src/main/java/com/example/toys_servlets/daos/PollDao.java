package com.example.toys_servlets.daos;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import com.example.toys_servlets.commons.Commons;


public class PollDao{
    //통계 참여자 총수 메소드
    public int PollDaoCountServlet(){
        int cnt = 0;
        try {
            Commons commons = new Commons();
            Statement statement = commons.getStatement();
            String query = "SELECT COUNT(*) \n" + //
                    "FROM (SELECT COUNT(*) \n" + //
                    "FROM statistics\n" + //
                    "GROUP BY RESPONDENTS_ID)AS CNT;\n" + //
                    "";
                    
           ResultSet resultSet = statement.executeQuery(query); 
           cnt = resultSet.getInt(query);
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
