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
<title>Insert title here</title>
</head>
<body>
	<% String data = (String)request.getAttribute("data"); %>
	<div class="container">
		<h2>수정</h2>
		<div class="panel panel-default">
			<!--<div class="panel-heading"></div> -->
			<div class="panel-body">
				<form class="form-horizontal" action="Boardmodify.do?boardid=<%=data%>" method="post">
				  <div class="form-group">
				    <label class="control-label col-sm-2" for="title">제목:</label>
				    <div class="col-sm-10">
				      <input type="text" name="title" class="form-control" id="title" placeholder="제목입력">
				    </div>
				  </div>
				  <div class="form-group">
				    <label class="control-label col-sm-2" for="contents">내용:</label>
				    <div class="col-sm-10">
				      <textarea placeholder="내용입력" class="form-control" id="contents" name="content" rows="15" cols=""></textarea>
				    </div>
				  </div>
				  
				  <div class="form-group">
				    <div class="col-sm-offset-2 col-sm-10">
				    	<input type="submit" class="btn btn-info btn-sm" value = "작성">
				    	
					  <button type="reset" class="btn btn-warning btn-sm" >취소</button>
				    </div>
				  </div>
				</form>
			</div>
			
			
			
			<!--<div class="panel-body"></div>-->
		</div>
	</div>
</body>
</html>