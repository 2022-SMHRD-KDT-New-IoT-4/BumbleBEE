<%@page import="com.BumbleBee.model.TbBeehiveDTO"%>
<%@page import="com.BumbleBee.model.TbBoardDTO"%>
<%@page import="java.util.List"%>
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
	<% TbMemberDTO user = (TbMemberDTO)session.getAttribute("user"); %>
	<% List<TbBoardDTO> list = (List)request.getAttribute("list"); %>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
   
            


            <article id="board" class="panel">
                <header>
                    <h2 class="text-warning">게시판</h2>
                </header>
                <form action="#" method="post">
                    <div class="board_list_wrap">
                        <table class="board_list">
                            <caption>게시판 목록</caption>
                            <thead>
                                <tr>
                                    <th>번호</th>
                                    <th>제목</th>
                                    <th>글쓴이</th>
                                    <th>작성일</th>
                                    <th>조회수</th>

                                </tr>
                            </thead>
                            <tbody>
                            	<% for(int i = 0;i < list.size();i++) { %>
                            	<tr>
                            		<td><%=list.get(i).getBoardSeq() %></td>
                            		<td> <a href = "BoardSelect.do?boardid=<%=list.get(i).getBoardSeq()%>"><%=list.get(i).getBoardTitle()%></a></td>
                            		<td><%=list.get(i).getMbId() %></td>
                            		<td><%=list.get(i).getBoardDt() %></td>
                            		<td><%=list.get(i).getBoardViews() %></td>
                            	</tr>
                            	<% } %>
                            	
                                
                            </tbody>
                        </table>
                        <div class="page">
                            <a href=""> ≪ </a>
                            <a href="">＜</a>
                            <a href="">[1]</a>
                            <a href="">[2]</a>
                            <a href="">[3]</a>
                            <a href="">[4]</a>
                            <a href="">[5]</a>
                            <a href="">＞</a>
                            <a href="">≫</a>
                        </div>
                        <br>
                        <div class="modal">
                            <div class="modal_body"> 
                                <article id="boardwrite" class="panel">
       
                                <article id="boardwrite" class="panel">
                                <div class="form_box">
                                    <h3 class="text-warning text-bold">게시글 작성</h3>
                                    <input class="input_field" type="text" placeholder="글쓴이의 이름은?" ><br>
                                    <input class="input_field" type="password" placeholder="글 비밀번호" ><br>
                                    <input class="input_field" type="text" placeholder="제목을 입력해주세요." ><br>
                                    <textarea class="textarea_field" placeholder="내용을 입력해주세요."></textarea><br>
                                    <div class="d-flex justify-content-center">
                                        <a href="http://121.179.35.58:5500/main.html#board" class="btn btn-warning" role="button">글쓰기</a>
                                    </div>
                                </div>
                                </article>
                        </article></div>

                            
                          </div>
                        <div class="d-flex justify-content-center">
                            
                            <a href = "Boardgowrite.do">글쓰기</a>
                        </div>
                        
                        
                        <!--  
                        <script>
                            const modal = document.querySelector('.modal');
                            const btnOpenPopup = document.querySelector('.btn-open-popup');

                            btnOpenPopup.addEventListener('click', evt => {
                                alert("안녕하세요");
                                evt.stopPropagation();          //이벤트 전파 막음
                                evt.preventDefault();           //기본동작을 막음
                                if(modal){
                                    modal.style.display = 'block';
                                }
                            });
                        </script> -->

                    </div>
                </form>
            </article>





            <!--양봉정보-->

        </div>
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