<%@page import="com.BumbleBee.model.TbBoardDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판 목록</title>

<style>
@import url(http://fonts.googleapis.com/earlyaccess/nanumgothic.css);
body {
	font-family: 'Nanum Gothic', sans-serif;
}
</style>

<script type="text/javascript">
	function move(url){
		location.href=url;
	}
</script>
</head>

<body>
	<%List<TbBoardDTO> list = (List)request.getAttribute("list"); %>
	<marquee behavior="alternate" scrolldelay="100" direction="right">
		지훈이의 홈페이지입니다.</marquee>
	<table class="bbs" width="800" height="200" border="2" bgcolor="D8D8D8">
		<colgroup>
			<col width="50" />
			<col width="500" />
			<col width="100" />
			<col width="50" />
		</colgroup>
		<thead>
			<tr>
				<th>번 호</th>
				<th>제 목</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>조 회</th>
			</tr>
		</thead>
		<tbody>
			
			<% for(TbBoardDTO dto : list) { %>
								<tr>
									<td><%=dto.getBoardSeq() %></td>
									<td><%=dto.getBoardTitle() %></td>
									<td><%=dto.getMbId() %></td>								
									<td><%=dto.getBoardDt() %></td>								
									<td><%=dto.getBoardViews() %></td>								
								</tr>
						<% 	} %>
		</tbody>
				
	</table>
		<input type="button" value="처음으로" onclick="move('Boardmain.do');" />
		<input type="button" value="글쓰기" onclick="move('Boardgowrite.do');" />

</body>
</html>