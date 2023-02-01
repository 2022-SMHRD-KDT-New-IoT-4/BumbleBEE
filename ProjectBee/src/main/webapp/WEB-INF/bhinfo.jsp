<%@page import="com.BumbleBee.model.TbBeehiveDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
<script src="https://code.jquery.com/jquery-3.6.3.min.js"></script>
</head>

<script>
    function loadFn() {
		alert('실행');
		
        $.ajax({
            url: "Load.do",		// 데이터를 가져올 경로 설정
            type: "get",		// 데이터를 가져오는 방식
            dataType : "json",
            success: function(info){	// 데이터를 가져왔을때 동작. 매개변수로 data 입력
            	var t = []
           		var h = [];
           		var w = [];
            	$.each(info, function(index, obj) {
            		//t.push(Number(obj.bhTemp));
            		t.push(Math.floor(Math.random() * 30));
            	})
            	$.each(info, function(index, obj) {
            		//h.push(Number(obj.bhHumid));
            		h.push(Math.floor(Math.random() * 100));
            	})
            	$.each(info, function(index, obj) {
            		//w.push(Number(obj.bhWeight)/1000);
            		w.push(Math.floor(Math.random() * 50));
            	})
            	
            	
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
            indexAxis: '',
    }
  };

  const myChart = new Chart(
          document.getElementById('myChart'),
          config,
          setInterval(loadFn(),2000)
        );
  myChart.update();
            },
            error : function(){
                alert('실패 ㅠㅠ');
    		}
        }) 	
     }
 </script>
 <style>
	button {
	margin-left: 1000px;
	margin-top: 500px;
}
</style>
 <body>
 		<div class="chart-container" style="position: relative; height:40vh; width:30vw">
       	<canvas id="myChart" width="1800" height="800"></canvas>
       </div>
    <button onclick="loadFn()">클릭</button> 
	<!-- <div id="result"> -->

	
 </body>
</html>