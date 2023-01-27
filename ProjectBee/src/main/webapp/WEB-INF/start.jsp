<%@page import="com.BumbleBee.model.TbMemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<!--
    Astral by HTML5 UP
	html5up.net | @ajlkn
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>

<head>
    <title>Welcome to BeeHive</title>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./assets/css/main.css" />
    <link rel="stylesheet" href="style.css">
    <noscript>
    <link rel="stylesheet" href="./assets/css/noscript.css" />
    </noscript>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <link rel="stylesheet" href="modal_style.css">

</head>
<style>
    a {
        text-decoration: none;
        color: black;
    }

    a :hover {
        text-decoration: underline;
    }

    .modal {
        position: absolute;
        top: 0;
        left: 0;

        width: 100%;
        height: 100%;

        display: none;

        background-color: #ffffff
    }
</style>

<body class="is-preload">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
    <!-- Wrapper-->
    <div id="wrapper">

        <!-- Nav -->
        <nav id="nav">
        	

        	<a href="#login" class="icon solid fa-key"><span>로그인</span></a>
            <a href="#member" class="icon solid fa-user-plus"><span>회원가입</span></a>
            
        </nav>
        
        <!-- Main -->
        <div id="main">

            <!-- Me -->
            <article id="home" class="panel intro">
                <header>
                    <h1 class="text-warning">SMART BEEHIVE</h1>
                    <p>양봉관리를 더 스마트하게</p>
                </header>
                <a href="#work" class="jumplink pic">
                    <span class="text-warning arrow icon solid fa-chevron-righ t"><span>See my work</span></span>

                </a>
            </article>
            <!-- 로그인 -->
            <article id="login" class="panel">
                <header>
                    <h2 class="text-warning">로그인</h2>
                </header>
                <form action="Login.do" method="post">
                    <div>
                        <div class="row">
                            <div class="col-6">
                                <input type="text" name="mbid" placeholder="아이디를 입력하세요" />
                            </div>
                            <div class="col-6 ">
                                <input type="text" name="mbpw" placeholder="비밀번호를 입력하세요" />
                            </div>
                            <div class="col-6">
                            </div>
                            <!-- <button type="button" class="btn btn-warning">로그인</button> -->
                            <input type="submit" value="로그인" class="btn btn-warning">
                        </div>
                    </div>
                </form>
            </article>

            <article id="member" class="panel">
                <header>
                    <h2 class="text-warning">회원가입</h2>
                </header>
                <div class="col-sm-12 col-md-offset-3 ">
                    <form method="post" role="form" action="Register.do">
                        <div class="form-group">
                            <label for="mbid">아이디</label>
                            <input type="text" name="mbid" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="mbpw">비밀번호</label>
                            <input type="password" name="mbpw" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="mbname">이름</label>
                            <input type="text" name="mbname" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="mbage">나이</label>
                            <input type="text" name="mbage" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="mbjob">직업</label>
                            <input type="text" name="mbjob" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="mbtel">전화번호</label>
                            <input type="text" name="mbtel" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="mbregion">지역</label>
                            <input type="text" name="mbregion" class="form-control">
                        </div>
                        <br>

                        <div class="form-group text-center">
                        <input type="submit" value="가입하기">                           
                        

                        </div>
                    </form>
                </div>

            </article>


            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
                crossorigin="anonymous"></script>

            <!-- 회원가입끝 -->

        <!-- Footer -->
        <div id="footer">
            <ul class="copyright text-warning">
                <li>&copy; Untitled.</li>
                <li>Design: Bumble Bee</li>
            </ul>
        </div>
    </div>
    <!-- Scripts -->
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/js/browser.min.js"></script>
    <script src="assets/js/breakpoints.min.js"></script>
    <script src="assets/js/util.js"></script>
    <script src="assets/js/main.js"></script>
</body>

</html>