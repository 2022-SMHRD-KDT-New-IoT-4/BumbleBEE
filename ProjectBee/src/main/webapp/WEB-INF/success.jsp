<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%String id = (String)request.getAttribute("id");%>
	
	<%if(id != null) {
		out.print(id);
	}
	else {
		out.print("실패");
	}
	%>
		
</body>
</html>