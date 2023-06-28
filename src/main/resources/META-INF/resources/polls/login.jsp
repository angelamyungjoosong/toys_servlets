<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
   

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.css">
    <title>login</title>
</head>
<body>
   <!-- top menu -->
   <%@ include file="/polls/tops.jsp" %>
   <nav class="navbar navbar-expand">

    <div class="navbar-nav me-auto">
        <a href="/main_List" class="nav-link">회원정보</a>
        <a href="/survey" class="nav-link">설문조사</a>
        <a href="/statisticServlet" class="nav-link">설문통계</a>
    </div>
   
</nav>

    <div class="container justify-content-center w-50">
        <table class="table table-bordered table-hover">
            <form action="/survey"  method="get">
                <thead>
                    <th><div class="text-center">로그인</div></th>
                </thead>
                <tbody>
                    <tr>
                        <td>
                            <label class="form-label" for="">Username</label><input name="Username" class="form-control"
                                type="text">
                                <label class="form-label" for="">Password</label><input name="Password" class="form-control"
                                type="text">
                                <hr>
                     <div class =  "text-end">
                            <button class="btn btn-primary">LOG IN</button>
                        </div>
                        </td>
                    </tr>
                </tbody>
        </table>
    </div>



</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.js"></script>

</html>
