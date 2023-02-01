<%@page import="com.BumbleBee.model.TbMemberDTO"%>
<%@page import="com.BumbleBee.model.TbBoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./assets/css/style.css">
    <title>Document</title>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./assets/css/main.css" />
    <noscript>
        <link rel="stylesheet" href="./assets/css/noscript.css" />
    </noscript>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<% TbBoardDTO dto =  (TbBoardDTO)request.getAttribute("board"); %>
	<% TbMemberDTO mdto = (TbMemberDTO)session.getAttribute("user"); %>
	<% if(mdto == null) {
		response.sendRedirect("Start.do");
	} %>
    <article id="boardwrite" class="panel">
            <article id="boardwrite" class="panel">
            <div class="form_box">
                <h3 class="text-warning text-bold">게시글 제목</h3>
				<%= dto.getBoardTitle() %> <br>
				<%= dto.getBoardContent() %> <br>
				<% if(dto.getMbId().equals(mdto.getMbId()) || mdto.getMbId().equals("admin") ) { %>
                <div class="d-flex justify-content-center">
                	<button type="button" onclick="location.href = 'BoardGomodify.do?boardid=<%=dto.getBoardSeq()%>'" class="btn btn-warning btn-sm"" class="btn btn-warning">수정하기</button>
                	<button type="button" onclick="location.href = 'Boarddelte.do?boardid=<%=dto.getBoardSeq()%>'" class="btn btn-warning">삭제</button>
                </div>
                <% } %>
            </div>
            
            </article>
    </article>
</body>
</html>