<%@ page import="java.util.HashMap, java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.css">
    <!-- <link rel="stylesheet" href="../css/commons.css"> -->
</head>
<body>
    <!-- 메인 헤드부분 -->
    <%@ include file="/polls/top_menus.jsp" %>

    <!-- 회원 상세정보 -->
    <div class="container">
        <div class="row">
            <div class="card">
                <div class="card-header bg-success text-white">
                    <% ArrayList<HashMap<String, Object>> respondents = (ArrayList<HashMap<String, Object>>) request.getAttribute("respondents");
                    if (respondents.size() > 0) {
                        HashMap<String, Object> respondent = respondents.get(0);
                        String userName = (String) respondent.get("RESPONDENTS");
                        out.println(userName);
                    } %>
                    정보
                </div>
                <div class="card-body">
                    <div class="card-text">UserName :
                        <%  if (respondents.size() > 0) {
                            HashMap<String, Object> respondent = respondents.get(0);
                            String userName = (String) respondent.get("RESPONDENTS");
                            out.println(userName);
                        } %>
                    </div>
                    <div class="card-text">PassWord :
                        <% ArrayList<HashMap<String, String>> passwords = (ArrayList<HashMap<String, String>>) request.getAttribute("passwords");
                        if (passwords.size() > 0) {
                            HashMap<String, String> passwordRecord = passwords.get(0);
                            String password = passwordRecord.get("PASSWORDS");
                            out.println(password);
                        } %>
                    </div>
                </div>
            </div>
        </div>
    </div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.js"></script>
</body>
</html>
