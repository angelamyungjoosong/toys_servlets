<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <html lang="en">

    <head>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.css">
        <title>login</title>
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
                <a href="/main_List" class="nav-link">회원정보</a>
                <a href="/survey" class="nav-link">설문조사</a>
                <a href="/statisticServlet" class="nav-link">설문통계</a>
            </div>

        </nav>
        <div class="container justify-content-center w-50">
            <table class="table table-bordered table-hover">
                <form action="">
                    <thead>
                        <th>
                            <div class="text-center">로그인</div>
                        </th>
                    </thead>
                    <tbody>
                        <tr>
                            <td>
                                <label class="form-label" for="">Username</label><input name="Username"
                                    class="form-control" type="text">
                                <label class="form-label" for="">Password</label><input name="Password"
                                    class="form-control" type="text">
                                <hr>
                                <div class="text-end">
                                    <form action="/main_List">
                                    <button class="btn btn-primary">Login</button>
                                    </form>
                                </div>
                            </td>
                        </tr>
                    </tbody>
            </table>
        </div>
    </body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.js"></script>

    </html>