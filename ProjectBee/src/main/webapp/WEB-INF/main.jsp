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
    <link rel="stylesheet" href="./assets/css/style.css">
    <noscript>
    <link rel="stylesheet" href="./assets/css/noscript.css" />
    </noscript>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <!-- <link rel="stylesheet" href="modal_style.css"> -->
    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
    <script src="https://code.jquery.com/jquery-3.6.3.min.js"></script>

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
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
    <!-- Wrapper-->
    <div id="wrapper">

        <!-- Nav -->
        <nav id="nav">
        	<a href="#" class="icon solid fa-home glyphicon glyphicon-home dark"><span>Home</span></a>

        	<!--  <a href="#login" class="icon solid fa-key"><span>로그인</span></a> -->
            <!-- <a href="#member" class="icon solid fa-user-plus"><span>회원가입</span></a>  -->
            <a href="#dashboard" class="icon solid fa-table"><span>대시보드</span></a>
           	<a href="#weather" class="icon solid fa-cloud"><span>날씨정보</span></a>
            <a href="#inform" class="icon solid fa-folder"><span>양봉정보</span></a>
            <a href="Boardmain.do" class="icon solid fa-book"><span>게시판</span></a>
            
            
            
        </nav>

        <nav class="navbar fixed-top">
            <div class="container-fluid">
                <a class="navbar-brand -4 fw-bold" href="#">Smart BeeHive</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas"
                    data-bs-target="#offcanvasNavbar" aria-controls="offcanvasNavbar">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="offcanvas offcanvas-end" tabindex="-1" id="offcanvasNavbar"
                    aria-labelledby="offcanvasNavbarLabel">
                    <div class="offcanvas-header">
						<a href = "Logout.do"><h5 class="offcanvas-title text-warning" id="offcanvasNavbarLabel">로그아웃</h5></a>
						<a href = "GoSelect.do"><h5 class="offcanvas-title text-warning" id="offcanvasNavbarLabel">회원정보 수정</h5></a>
                    	<!-- <h5 class="offcanvas-title text-warning" id="offcanvasNavbarLabel">로그인이 필요합니다</h5>  -->
                        <button type="button" class="btn-close btn-warning" data-bs-dismiss="offcanvas"
                            aria-label="Close"></button>
                    </div>
                    
                    <hr color="gold">
				
                </div>
            </div>
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
            <% if(user != null) { %>
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
              <% } else { %>
               <a href = "Logout.do">로그아웃</a>
               <% } %>
            </article>
            
<!-- 
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
 -->
            <!-- 회원가입끝 -->

            <!-- 제품소개 화살표 -->
            <article id="work" class="panel">
                <header>
                    <h2 class="text-warning text-bold">Smart Beehive 소개</h2>
                    <h6 class="text-warning">농가 소득과 꿀벌을 지키는 비가드</64>
                </header>
                <div class="container text-left">

                    <div class="row">
                        <div class="col">
                            <div class="card" style="width: 40rem;">
                                <img src="http://rda.go.kr/webzine/2022/04/images/sub1-2_img03.jpg"
                                    class="card-img-top">
                                <div class="card-body">
                                    <h5 class="card-title">스마트 벌통 비-가드(Bee-Guard)</h5>
                                    <p class="card-text">스마트 벌통은 꿀벌의 생육을 온전하게 관리할 수 있고</p>
                                    <p class="card-text">말벌로부터의 피해를 예방하는 스마트 비가드 IOT 시스템입니다.</p>
                                    </p>

                                </div>
                            </div>
                        </div>


                        <div class="col">
                            <div class="card" style="width: 40rem;">
                                <img src="https://image.newsis.com/2021/02/14/NISI20210214_0000690069_web.jpg?rnd=20210214050513"
                                    class="card-img-top">
                                <div class="card-body">
                                    <h5 class="card-title">스마트 벌통(Smart Beehive)</h5>
                                    <p class="card-text">벌통의 온도와 습도를 데이터를 편리하게 수집 관리 할수 있으며,
                                    <p class="card-text">압력센서이용 분봉및 병충해 예상시 미리 알려줍니다.</p>
                                </div>
                            </div>
                        </div>


                        <div class="col">
                            <div class="card" style="width:40rem;">
                                <img src="https://cdn.newspenguin.com/news/photo/202203/10913_32455_2928.jpg"
                                    class="card-img-top">
                                <div class="card-body">
                                    <h5 class="card-title">스마트 말벌 포획기(Wasp capture machine)</h5>
                                    <p class="card-text">양봉 농가의 최대의 적 흑등말벌 피해, 스마트 말벌 포획기는 말벌유인액이 떨어지지 않도록 알려주며,
                                        유인액이 굳지 않도록 자동으로 관리해 줍니다.
                                    </p>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
                <div class="container text-center">
                    <a href="#" class="center btn btn-warning">HOME</a>
                </div>

            </article>
            <!-- 대쉬보드  시작-->
            
            <article id="dashboard" class="panel">
                <header>
                    <h2 class="text-warning">대시보드</h2>
                    <p>나의 벌통 현재 온도와 습도, 분봉여부를 확인하세요</p>
                    <br>

                </header>
               
                <table class="table table-bordered text-center ">
                    <h5 class="text-center ">벌통의 온도 · 습도 · 무게</h5>
                    <br>

                    <tr class="bg-warning">
                        <td>번호</td>
                        <td>온도</td>
                        <td>습도</td>
                        <td>무게</td>
                    </tr>
                    <tr>
                        <td>
                            1
                        </td>
                        <td>
                            33
                        </td>
                        <td>
                            45
                        </td>
                        <td>
                            15
                        </td>
                    </tr>
                    <tr>
                        <td>
                            2
                        </td>
                        <td>
                            23
                        </td>
                        <td>
                            34
                        </td>
                        <td>
                            15
                        </td>
                    </tr>
                    <tr>
                        <td>
                            3
                        </td>
                        <td>
                            18
                        </td>
                        <td>
                            29
                        </td>
                        <td>
                            19
                        </td>
                    </tr>
                    <tr>
                        <td>
                            4
                        <td>
                            32
                        </td>
                        <td>
                            41
                        </td>
                        <td>
                            12
                        </td>
                    </tr>
                    <tr>
                        <td>
                            5
                        <td>
                            23
                        </td>
                        <td>
                            37
                        </td>
                        <td>
                            12
                        </td>
                    </tr>
                </table>
                <br>
                <table class="table table-bordered text-center">
                    <h5 class="text-center">말벌 포획기</h5>
                    <br>
                    <tr class="bg-warning">
                        <td>
                            번호
                        </td>
                        <td>
                            포획 수량(마리)
                        </td>
                        <td>
                            유인액 잔량(%)
                        </td>
                    </tr>
                    <tr>
                        <td>
                            1
                        </td>
                        <td>
                            3
                        </td>
                        <td>
                            50
                        </td>
                    </tr>
                    <tr>
                        <td>
                            2
                        </td>
                        <td>
                            3
                        </td>
                        <td>
                            50
                        </td>
                    </tr>
                    <tr>
                        <td>
                            2
                        </td>
                        <td>
                            3
                        </td>
                        <td>
                            50
                        </td>
                    </tr>
                </table>
                <div class="chart-container" style="position: relative; height:40vh; width:30vw">
       				<canvas id="myChart" width="600" height="300"></canvas>
      			 </div>
      			 <script>
             	var t = [];
           		var h = [];
           		var w = [];
             	var t2 = [];
           		var h2 = [];
           		var w2 = [];
    function loadFn() {
		console.log('실행');
		
		
		const random = () => {
			  return Math.round(Math.random() * 100) + 20
			}
		const random1 = () => {
			  return Math.round(Math.random() * 10) + 20
			}
		const random2 = () => {
			  return Math.round(Math.random() * 25) + 40
			}
		const random3 = () => {
			  return Math.random() * 10
			}
		
		const randomData = () => {
			  return [
			    random(),
			    random(),
			    random(),
			    random(),
			    random(),
			    random(),
			    random(),
			    random(),
			    random(),
			    random(),
			    random(),
			    random()
			  ]
			}
		
        $.ajax({
            url: "Load.do",		// 데이터를 가져올 경로 설정
            dataType : "json",
            success: function(info){	// 데이터를 가져왔을때 동작. 매개변수로 data 입력
            
            	$.each(info, function(index, obj) {
            		t.push(Number(obj.bhTemp));
            		h.push(Number(obj.bhHumid));
            		w.push(Number(obj.bhWeight)/100);
            		
            		//t.push(Math.floor(Math.random() * 30));
            	});
            	t.reverse();
        		h.reverse();
        		w.reverse();
            	
            	const labels = ['1','2','3','4','5','6','7','8','9','10','11','12','13','14','15','16','17','18','19','20','21','22','23','24    (H)'];

  const data = {
    labels: labels,
    datasets: [{
      label: '온도',
      backgroundColor: 'rgb(255, 99, 132)',
      borderColor: 'rgb(255, 99, 132)',

      data: t,
    },
       {
         label: '습도',
         backgroundColor: 'rgb(0, 191, 255)',
         borderColor: 'rgb(0, 191, 255)',
         data: h,
       },
     {
         label: '무게',
         backgroundColor: 'rgb(255, 255, 0)',
         borderColor: 'rgb(255, 255, 0)',
         data: w,
       }]
     };

  const config = {
    type: 'line',
    data: data,
    options: {
       responsive:false,
       text: '',
       indexAxis: ''
    }
  };

  const myChart = new Chart(
          document.getElementById('myChart'),
          config
        );
  
  const next = () =>  { $.ajax({
      url: "Load2.do",		// 데이터를 가져올 경로 설정
      dataType : "json",
      success: function(info){	// 데이터를 가져왔을때 동작. 매개변수로 data 입력
      console.log(info);

      		t2 =Number(info[0].bhTemp);
      		h2 =Number(info[0].bhHumid);
      		w2 =Number(info[].bhWeight)/1000;

      	var n = [];
      	n.push(t2);
      	n.push(h2);
      	n.push(w2);
      	myChart.data.datasets[0].data.push(n[0]); //데이터 추가
		myChart.data.datasets[1].data.push(n[1]); //데이터 추가
		myChart.data.datasets[2].data.push(n[2]); //데이터 추가
		myChart.update() //업데이트
      }
  	})
  }
//  let randomUserCount1 = 0
//  let randomUserCount2 = 0
//  let randomUserCount3 = 0
	const fakeUsersCount = () => {
//		  randomUserCount1 = random1();
//		  randomUserCount2 = random2();
//		  randomUserCount3 = random3();
		  myChart.data.datasets[0].data.splice(0, 1) //데이터 삭제
		  myChart.data.datasets[1].data.splice(0, 1) //데이터 삭제
		  myChart.data.datasets[2].data.splice(0, 1) //데이터 삭제
		  next();
		}

		setInterval(() => { //특정 시간에 한번씩 반복하게끔 하는 메소드
		  fakeUsersCount()
		}, 5000)
            },
            error : function(){
                alert('실패 ㅠㅠ');
    		}
        }) 	
     }
   	loadFn();
   	

 </script>
 
 
 
            </article>
            <!-- 대쉬보드 끝 -->

            <!--날씨-->
            <article id="weather" class="panel ">

                <h2 class="text-warning  text-bold">날씨정보</h2>
                <br>
                <form action="#">

                    <body onload="DefaultScreen()">
                        <center>
                            <div class="weather">
                                <h1 id="Para1"></h1>
                                <p></p><input type="text" id="cityInput" placeholder="지역을 입력하세요(ENG)"></p>
                                <a href="#link" class="btn btn-warning" onclick="GetInfo()">지역 입력</a>

                                <br>
                                <br>
                                <h2 id="cityName"></h2>
                                <br>
                                <br>
                                <br>
                                <br>
                            </div>
                            <br>
                            <br>
                            <br>
                            <br>
                            <br>
                            <br>
                            <br>
                            <br>
                            <br>
                            <br>

                        </center>

                        <div id="weatherContainer">
                            <div id="iconsContainer">
                                <div class="icons">
                                    <p class="weather" id="day1"></p>
                                    <div class="image"><img src="dots.png" class="imgClass" id="img1"></div>
                                    <p class="minValues" id="day1Min">Loading...</p>
                                    <p class="maxValues" id="day1Max">Loading...</p>
                                    <p class="humidity" id="day1humidity"></p>


                                </div>
                                <div class="icons">
                                    <p class="weather" id="day2"></p>
                                    <div class="image"><img src="dots.png" class="imgClass" id="img2"></div>
                                    <p class="minValues" id="day2Min">Loading...</p>
                                    <p class="maxValues" id="day2Max">Loading...</p>
                                    <p class="humidity" id="day2humidity"></p>

                                </div>
                                <div class="icons">
                                    <p class="weather" id="day3"></p>
                                    <div class="image"><img src="dots.png" class="imgClass" id="img3"></div>
                                    <p class="minValues" id="day3Min">Loading...</p>
                                    <p class="maxValues" id="day3Max">Loading...</p>
                                    <p class="humidity" id="day3humidity"></p>

                                </div>
                                <div class="icons">
                                    <p class="weather" id="day4"></p>
                                    <div class="image"><img src="dots.png" class="imgClass" id="img4"></div>
                                    <p class="minValues" id="day4Min">Loading...</p>
                                    <p class="maxValues" id="day4Max">Loading...</p>
                                    <p class="humidity" id="day4humidity"></p>


                                </div>
                                <span class="icons">
                                    <p class="weather" id="day5"></p>
                                    <div class="image"><img src="dots.png" class="imgClass" id="img5"></div>
                                    <p class="minValues" id="day5Min">Loading...</p>
                                    <p class="maxValues" id="day5Max">Loading...</p>
                                    <p class="humidity" id="day5humidity"></p>
                            </div>
                        </div>

                </form>
            </article>


            <!--날씨 정보끝-->
            <!--양봉정보-->
            <article id="inform" class="panel ">
                <header>
                    <h2 class="text-warning  text-bold">양봉정보</h2>
                </header>
                <div class="container text-center">
                    <div class="row">
                        <div class="col">
                            <div class="card" style="width: 18rem;">
                                <img src="http://rda.go.kr/webzine/2022/04/images/sub1-2_img03.jpg"
                                    class="card-img-top">
                                <div class="card-body">
                                    <h5 class="card-title">양봉협회</h5>
                                    <p class="card-text"> 사단법인 한국양봉협회
                                    </p>
                                    <br>
                                    <a href="https://www.korapis.or.kr/jsp/main.jsp" class="btn btn-warning">이동하기</a>
                                </div>
                            </div>
                        </div>
                        <div class="col">
                            <div class="card" style="width: 18rem;">
                                <img src="https://image.newsis.com/2021/02/14/NISI20210214_0000690069_web.jpg?rnd=20210214050513"
                                    class="card-img-top">
                                <div class="card-body">
                                    <h5 class="card-title">사양관리 방법</h5>
                                    <p class="card-text">계절별 사양관리 방법 공개.</p>
                                    <br>
                                    <a href="https://www.korapis.or.kr/jsp/sub3-3.jsp" class="btn btn-warning">이동하기</a>
                                </div>
                            </div>
                        </div>
                        <div class="col">
                            <div class="card" style="width: 18rem;">
                                <img src="https://cdn.newspenguin.com/news/photo/202203/10913_32455_2928.jpg"
                                    class="card-img-top">
                                <div class="card-body">
                                    <h5 class="card-title">품질검사 접수</h5>
                                    <p class="card-text">협회 양봉산물연구소 품질검사.
                                    </p>
                                    <br>
                                    <a href="https://www.korapis.or.kr/jsp/sub5-3.jsp" class="btn btn-warning">이동하기</a>
                                </div>
                            </div>
                        </div>
                        <div class="col">
                            <div class="card" style="width: 18rem;">
                                <img src="https://image.newsis.com/2021/02/14/NISI20210214_0000690069_web.jpg?rnd=20210214050513"
                                    class="card-img-top">
                                <div class="card-body">
                                    <h5 class="card-title">한국의 밀원 식물</h5>
                                    <p class="card-text">밀원식물 (꽃) 정보 확인 하기</p>
                                    <br>
                                    <a href="https://www.korapis.or.kr/book_beeplant/index.html"
                                        class="btn btn-warning">이동하기</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </article>
            <!--양봉정보끝-->

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
                                <tr>
                                    <td>N</td> <!--변수처리-->
                                    <td class="board_list_wrap2">
                                        <a href="/" class="">테스트 입니다1</a>
                                    </td>
                                    <td>관리자</td>
                                    <td>2023-01-20</td>
                                    <td>123123</td>
                                </tr>
                                <tr>
                                    <td>N</td> <!--변수처리-->
                                    <td class="board_list_wrap2">
                                        <a href="#">테스트 입니다2</a>
                                    </td>
                                    <td>관리자</td>
                                    <td>2023-01-20</td>
                                    <td>123123</td>
                                </tr>
                                <tr>
                                    <td>N</td> <!--변수처리-->
                                    <td class="board_list_wrap2">
                                        <a href="#">테스트 입니다3</a>
                                    </td>
                                    <td>관리자</td>
                                    <td>2023-01-20</td>
                                    <td>123123</td>
                                </tr>
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
                            
                            <button type="submit" class="btn-open-popup btn-warning">게시글 작성</button>
                        </div>
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
                        </script>

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