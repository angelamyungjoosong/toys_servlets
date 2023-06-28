<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html lang="en">
<head>
    <title>survey</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.css">
</head>
<body>
    <!-- top menu -->
    <%@ include file="/polls/tops.jsp" %>
    <%@ include file="/polls/top_menus.jsp" %>
    <div class="container">
        <form action="/main_List">
        <table class="table table-bordered table-hover">
            <thead>
                <tr>
                    <th>번호</th>
                    <th>문항</th>
                    <th>답항</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td class="col-1">1</td>
                    <td class="col-3">교수는 수업 전 강의 목표를 명확히 제시하였습니까?</td>
                    <td>
                        <div class="my-3">
                            <input type="radio" name="first" id="ffchoice" value="1">
                            <label for="ffchoice">(1)전혀 아니다.</label>
                            <input type="radio" name="first" id="fschoice" value="2">
                            <label for="fschoice">(2)아니다.</label>
                            <input type="radio" name="first" id="ftchoice" value="3">
                            <label for="ftchoice">(3)그렇다.</label>
                            <input type="radio" name="first" id="frfchoice" value="4">
                            <label for="frfchoice">(4)매우 그렇다.</label>
                        </div>
                    </td>
                </tr>
                <tr>
                    <td>2</td>
                    <td>강의의 내용은 체계적이고 성의있게 구성되었는가?</td>
                    <td>
                        <div class="my-3">
                            <input type="radio" name="second" id="sfchoice" value="1">
                            <label for="sfchoice">(1)전혀 아니다.</label>
                            <input type="radio" name="second" id="sschoice" value="2">
                            <label for="sschoice">(2)아니다.</label>
                            <input type="radio" name="second" id="stchoice" value="3">
                            <label for="stchoice">(3)그렇다.</label>
                            <input type="radio" name="second" id="srfchoice" value="4">
                            <label for="srfchoice">(4)매우 그렇다.</label>
                        </div>
                    </td>
                </tr>
                <tr>
                    <td>3</td>
                    <td>교수는 강의 내용에 대해 전문적 지식이 있었는가?</td>
                    <td>
                        <div class="my-3">
                            <input type="radio" name="third" id="tfchoice" value="1">
                            <label for="tfchoice">(1)전혀 아니다.</label>
                            <input type="radio" name="third" id="tschoice" value="2">
                            <label for="tschoice">(2)아니다.</label>
                            <input type="radio" name="third" id="ttchoice" value="3">
                            <label for="ttchoice">(3)그렇다.</label>
                            <input type="radio" name="third" id="tfrfchoice" value="4">
                            <label for="tfrfchoice">(4)매우 그렇다.</label>
                        </div>
                    </td>
                </tr>
                <tr>
                    <td>4</td>
                    <td>강의 진행 속도는 적절하였는가?</td>
                    <td>
                        <div class="my-3">
                            <input type="radio" name="fourth" id="frfrchoice" value="1">
                            <label for="frfrchoice">(1)전혀 아니다.</label>
                            <input type="radio" name="fourth" id="frschoice" value="2">
                            <label for="frschoice">(2)아니다.</label>
                            <input type="radio" name="fourth" id="frtchoice" value="3">
                            <label for="frtchoice">(3)그렇다.</label>
                            <input type="radio" name="fourth" id="frfrfchoice" value="4">
                            <label for="frfrfchoice">(4)매우 그렇다.</label>
                        </div>
                    </td>
                </tr>
            </tbody>
        </table>
        <div>
            <button class="w-100 btn btn-primary">제출</button>
        </div>
        </form>
    </div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.js"></script>
</html>