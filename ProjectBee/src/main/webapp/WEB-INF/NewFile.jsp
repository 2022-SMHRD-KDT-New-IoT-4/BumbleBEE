<%@page import="com.google.gson.JsonObject"%>
<%@page import="com.google.gson.JsonArray"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.3.min.js" integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU=" crossorigin="anonymous"></script>
</head>
<body>

	
	
	<%
	// 데이터베이스에 연결
    String url = "jdbc:oracle:thin:@gjaischool-b.ddns.net:1525:xe";
    String user = "cgi_5_0117_4";
    String password = "smhrd4";
    
    // 드라이버를 가져옴
    Class.forName("oracle.jdbc.driver.OracleDriver");
    
    // 접속 정보를 활용해서 연결 객체를 생성
    Connection conn = DriverManager.getConnection(url, user, password);
    PreparedStatement pstmt;
    
    ResultSet rs = null;
    
    // 쿼리문을 통해 데이터를 ResultSet에 담기
    String sql = "SELECT BHWEIGHT, BHTEMP, BHHUMID FROM TBBEEHIVE";
    
    pstmt = conn.prepareStatement(sql);
    rs = pstmt.executeQuery();
    
    // Json 형태로 변환
    JsonArray array = new JsonArray();	// [], JSON 배열 생성 
    while(rs.next()) {
    	JsonObject obj = new JsonObject();	// {}, JSON 객체 생성
        obj.put("BHWEIGHT", rs.getInt("BHWEIGHT"));	// obj.put("key","value")
        obj.put("BHTEMP", rs.getString("BHTEMP"));
        obj.put("BHHUMID", rs.getString("BHHUMID"));
    
        array.add(obj);
    }
    
    out.print(array.toJSONString);	// Ajax는 출력된 데이터를 전송하므로 데이터를 출력해줘야 한다
      
%>
	
	
	
	
	<button class="btn">요청</button>
</body>
</html>