<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
    <title>Document</title>
</head>

<body>
    
    <!-- 메인 헤드부분 -->
    <%@ include file="/polls/top_menus.jsp" %>
    
    <!-- 회원 리스트 -->
    <form action="/user_Info">
    <div class="container">
        <table class="table table-bordered table-hover">
            <thead>
                <tr>
                    <th>번호</th>
                    <th>유저이름</th>
                    <th>상세정보</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td class="col-1">1</td>
                    <td class="col-3">홍길동</td>
                    <td>
                        <button type="submit" formaction="/polls/user_info.jsp"> R-01</button>
                    </td>
                </tr>
                <tr>
                    <td>2</td>
                    <td>장길산</td>
                    <td>
                        <button type="submit" formaction="/polls/user_info.jsp">R-02</button>
                    </td>
                </tr>
                <tr>
                    <td>3</td>
                    <td>신사임당</td>
                    <td>
                        <button type="submit" formaction="/polls/user_info.jsp">R-03</button>
                    </td>
                </tr>
                <tr>
                    <td>4</td>
                    <td>김철수</td>
                    <td>
                        <button type="submit" formaction="/polls/user_info.jsp">R-04</button>
                    </td>
                </tr>
            </tbody>
        </table>
    </div>
    </form>

</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>

</html>
