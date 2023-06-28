<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<nav class="navbar navbar-expand">

    <div class="navbar-nav me-auto">
        <a href="/main_List" class="nav-link">회원정보</a>
        <a href="/survey" class="nav-link">설문조사</a>
        <a href="/statisticServlet" class="nav-link">설문통계</a>
    </div>
    <div>
        <form action="">
        <button class="btn btn-danger" formaction="/loginServlet">로그아웃</button>
        </form>
    </div>
</nav>
