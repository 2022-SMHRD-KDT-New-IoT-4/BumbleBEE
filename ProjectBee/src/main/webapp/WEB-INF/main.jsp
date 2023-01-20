<%@page import="com.BumbleBee.model.TbMemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Forty by HTML5 UP</title>
		<meta charset="UTF-8" />
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="assets/css/main.css" />
	</head>
	<body>
		<%  // 1. session영역에 저장되어있는 데이터 가져오기
			TbMemberDTO user = (TbMemberDTO)session.getAttribute("user");
		%>
		
		<!-- Wrapper -->
			<div id="wrapper">
	
				<!-- Header -->
					<header id="header" class="alt">
						<a href="index.html" class="logo"><strong>Forty</strong> <span>by HTML5 UP</span></a>
						<nav>
						
						<%	if(user != null) { 
								if(user.getMbId().equals("admin")) { %>
									<a href= Select.do>회원관리</a>
								<%} else { %>
									<a href= GoModify.do>개인정보수정</a>
								<%} %>
								<a href= Boardmain.do>게시판 이동</a>
								<a href= Logout.do>로그아웃</a>
								<a href= Withdrawal.do>계정탈퇴</a>
						<% 	} else { %>
								<a href='#menu'>로그인</a>
						<% 	}  %>
								
							<!-- 로그인 후 Logout.jsp로 이동할 수 있는'로그아웃'링크와 '개인정보수정'링크를 출력하시오. -->
						</nav>
					</header>

				<!-- Menu -->
					<nav id="menu">	
						<ul class="links">
							<li><h5>로그인</h5></li>
								<form action="Login.do" method="post">
									<li><input type="text"  placeholder="id 입력하세요" name = "id"></li>
									<li><input type="password"  placeholder="PW를 입력하세요" name = "pw"></li>
									<li><input type="submit" value="LogIn" class="button fit"></li>
								</form>
						</ul>
						<ul class="actions vertical">
							<li><h5>회원가입</h5></li>
								<form action="Register.do" method="post">
									<li><input type="text"  placeholder="id 입력하세요" name = "id"></li>
									<li><input type="password"  placeholder="PW를 입력하세요" name = "pw"></li>
									<li><input type="text"  placeholder="이름를 입력하세요" name = "name"></li>
									<li><input type="text"  placeholder="나이 입력하세요" name = "age"></li>
									<li><input type="text"  placeholder="직업 입력하세요" name = "job"></li>
									<li><input type="text"  placeholder="지역 입력하세요" name = "region"></li>
									<li><input type="text"  placeholder="전화번호 입력하세요" name = "tel"></li>
									<li><input type="submit" value="JoinUs" class="button fit"></li>
								</form>
						</ul>
						
						
					</nav>			
				<!-- Banner -->
					<section id="banner" class="major">
						<div class="inner">
							<header class="major">
								
							<%
								if(user != null) {
									// 로그인 성공했다면
									out.print("<h1>" + user.getMbId() + "님 환영합니다!</h1>");
								}
								else {
									// 로그인 실패했다면
									out.print("<h1>로그인 한 세션아이디를 출력해주세요</h1>");
								}
							%>
								<!-- 로그인 후 로그인 한 사용자의 세션아이디로 바꾸시오.
									 ex)smart님 환영합니다 -->
							</header>
							<div class="content">
								<p>아래는 지금까지 배운 웹 기술들입니다.<br></p>
								<ul class="actions">
									<li><a href="#one" class="button next scrolly">확인하기</a></li>
								</ul>
							</div>
						</div>
					</section>

				<!-- Main -->
					<div id="main">

						<!-- One -->
							<section id="one" class="tiles">
								<article>
									<span class="image">
										<img src="images/pic01.jpg" alt="" />
									</span>
									<header class="major">
										<h3><a href="#" class="link">HTML</a></h3>
										<p>홈페이지를 만드는 기초 언어</p>
									</header>
								</article>
								<article>
									<span class="image">
										<img src="images/pic02.jpg" alt="" />
									</span>
									<header class="major">
										<h3><a href="#" class="link">CSS</a></h3>
										<p>HTML을 디자인해주는 언어</p>
									</header>
								</article>
								<article>
									<span class="image">
										<img src="images/pic03.jpg" alt="" />
									</span>
									<header class="major">
										<h3><a href="#" class="link">Servlet/JSP</a></h3>
										<p>Java를 기본으로 한 웹 프로그래밍 언어/스크립트 언어</p>
									</header>
								</article>
								<article>
									<span class="image">
										<img src="images/pic04.jpg" alt="" />
									</span>
									<header class="major">
										<h3><a href="#" class="link">JavaScript</a></h3>
										<p>HTML에 기본적인 로직을 정의할 수 있는 언어</p>
									</header>
								</article>
								<article>
									<span class="image">
										<img src="images/pic05.jpg" alt="" />
									</span>
									<header class="major">
										<h3><a href="#" class="link">MVC</a></h3>
										<p>웹 프로젝트 중 가장 많이 사용하는 디자인패턴</p>
									</header>
								</article>
								<article>
									<span class="image">
										<img src="images/pic06.jpg" alt="" />
									</span>
									<header class="major">
										<h3><a href="#" class="link">Web Project</a></h3>
										<p>여러분의 최종프로젝트에 웹 기술을 활용하세요!</p>
									</header>
								</article>
							</section>
					<!-- Two -->
							<section id="two">
								<div class="inner">
									<header class="major">
										<h2>나에게 온 메세지 확인하기</h2>
									</header>
									<p></p>
									<ul class="actions">
										<li>로그인을 하세요.</li>
										<li><a href="#" class="button next scrolly">전체삭제하기</a></li>
									</ul>
								</div>
							</section>

					</div>

				<!-- Contact -->
					<section id="contact">
						<div class="inner">
							<section>
								
								<div class="field half first">
										<label for="name">Name</label>
										<input type="text"  id="name" placeholder="보내는 사람 이름" />
									</div>
									<div class="field half">
										<label for="email">Email</label>
										<input type="text"  id="email" placeholder="보낼 사람 이메일"/>
									</div>

									<div class="field">
										<label for="message">Message</label>
										<textarea  id="message" rows="6"></textarea>
									</div>
									<ul class="actions">
										<li><input id = "btn_msg" type="button" value="Send Message" class="special" /></li>
										<li><input type="reset" value="Clear" /></li>
									</ul>
								
							</section>
							
							<section class="split">
								<section>
									<div class="contact-method">
										<span class="icon alt fa-envelope"></span>
										<h3>Email</h3>
										<a href="#">
											<% if(user != null) {
													out.print(user.getMbId());
											} %>
										</a>
										<!-- 로그인 한 사용자의 이메일을 출력하시오 -->
									</div>
								</section>
								<section>
									<div class="contact-method">
										<span class="icon alt fa-phone"></span>
										<h3>Phone</h3>
										<span><% if(user != null) {
													out.print(user.getMbTel());
											} %></span>
										<!-- 로그인 한 사용자의 전화번호를 출력하시오 -->
									</div>
								</section>
								<section>
									<div class="contact-method">
										<span class="icon alt fa-home"></span>
										<h3>Address</h3>
										<span><% if(user != null) {
													out.print(user.getMbRegion());
											} %></span>
										<!-- 로그인 한 사용자의 집주소를 출력하시오 -->
									</div>
								</section>
							</section>					
						</div>
					</section>

				<!-- Footer -->
					<footer id="footer">
						<div class="inner">
							<ul class="icons">
								<li><a href="#" class="icon alt fa-twitter"><span class="label">Twitter</span></a></li>
								<li><a href="#" class="icon alt fa-facebook"><span class="label">Facebook</span></a></li>
								<li><a href="#" class="icon alt fa-instagram"><span class="label">Instagram</span></a></li>
								<li><a href="#" class="icon alt fa-github"><span class="label">GitHub</span></a></li>
								<li><a href="#" class="icon alt fa-linkedin"><span class="label">LinkedIn</span></a></li>
							</ul>
							<ul class="copyright">
								<li>&copy; Untitled</li><li>Design: <a href="https://html5up.net">HTML5 UP</a></li>
							</ul>
						</div>
					</footer>

			</div>

		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/jquery.scrolly.min.js"></script>
			<script src="assets/js/jquery.scrollex.min.js"></script>
			<script src="assets/js/skel.min.js"></script>
			<script src="assets/js/util.js"></script>
			<!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
			<script src="assets/js/main.js"></script>
			
			
			<script type="text/javascript">
			// 1. 필요한 태그 가져오기
			// 2. 태그들에 이벤트 리스너 달아주기
			$('#btn_msg').on('click', function(){
				// 3. 기능을 작성
				// ---> 버튼을 클릭하면 AjaxTest쪽으로 비동기통신을 사용하여 데이터 전송
				var text = $('#message').val();				
				$.ajax({
					url : 'Ajax.do',
					// 보내줄 데이터를 적는 property - 쿼리스트링, 객체 방식으로 전송
					data : {msg:text}, 
					success : function(result) {
						console.log('성공!');
						console.log(result);
					},
					error : function() {
						console.log('실패..');
					}
				})
				
			});
			
			
			
			</script>
	</body>
</html>

