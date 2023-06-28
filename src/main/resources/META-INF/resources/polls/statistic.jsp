<%@ page import="java.util.HashMap, java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.css">
    <title>survey</title>
</head>

<body>
    <div class="container_fluid bg-primary p-4">
        <div>
            <div class="row">
                <div class="col text-center text-white">
                    <div class="p-4">
                        <div class="display-5">
                            설문조사
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <nav class="navbar navbar-expand">

        <div class="navbar-nav me-auto">
            <a href="" class="nav-link">회원정보</a>
            <a href="" class="nav-link">설문조사</a>
            <a href="" class="nav-link">설문통계</a>
        </div>
        <div>
            <button class="btn btn-danger">로그아웃</button>
        </div>
    </nav>
    <div class="container">
       <table class="table table-bordered table-hover">
        <thead>
            <thead>
                <th>참여자 총수: 
                    <% String cnt = (String)request.getAttribute("cnt"); %> 명</th>
            </thead>
        </thead>
       </table>


        <table class="table table-bordered table-hover">
            <thead>
                <tr>
                    <th class="col-3">문항</th>
                    <th class="col">(1)전혀 아니다.</th>  
                    <th class="col">(2)아니다.</th>   
                    <th class="col">(3)그렇다.</th>   
                    <th class="col">(4)매우 그렇다.</th>     
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?</td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td>2. 강의의 내용은 체계적이고 성의있게 구성되었는가?</td> 
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td>3. 교수는 강의 내용에 대해 전문적 지식이 있었는가?</td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td>4. 강의 진행 속도는 적절하였는가?</td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                

            </tbody>
        </table>
       
     
    </div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.js"></script>

</html>