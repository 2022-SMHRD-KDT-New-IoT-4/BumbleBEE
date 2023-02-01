<%@page import="com.BumbleBee.model.TbMemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>회원정보 페이지</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
  </head>
  <body>
    <% TbMemberDTO dto = (TbMemberDTO)session.getAttribute("user"); %>

    <article class="container">
        <div class="page-header">
            <div class="col">
                <h3>회원정보</h3>
            </div>
        </div>
        <div class="col">
            <form action="GoModify.do" method="post" role="form">

                <div class="form-group">
                    <label for="mbname">이름</label>
					<%= dto.getMbName() %>
                </div>

                <div class="form-group">
                    <label for="mbage">나이</label>
                    <%= dto.getMbAge() %>
                </div>

                <div class="form-group">
                    <label for="mbjob">직업</label>
                    <%= dto.getMbJob() %>
                </div>

                <div class="form-group">
                    <label for="mbtel">전화번호</label>
                    <%= dto.getMbTel() %>
                </div>

                <div class="form-group">
                    <label for="mbregion">지역</label>
                    <%= dto.getMbRegion() %>
                </div>
          
<br>
<br>

                <div class="form-group text-center">
                
                	<a href = "Main.do" class="btn btn-primary" name="mbrevise">돌아가기</a>
                	<a href = "GoModify.do" class="btn btn-primary" name="mbrevise">정보수정</a>
                	<a href = "Withdrawal.do" class="btn btn-warning" name="mbquit">회원탈퇴</a>
                
                </div>
            </form>
        </div>

    </article>
   
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
  </body>
</html>