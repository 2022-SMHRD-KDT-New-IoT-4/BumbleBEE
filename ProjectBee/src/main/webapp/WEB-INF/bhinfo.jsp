<%@page import="com.BumbleBee.model.TbBeehiveDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="refresh" content="5; url=http://localhost:8081/ProjectBee/BhSelect.do">
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
</head>
<body>
	<% List<TbBeehiveDTO> list = (List)request.getAttribute("list"); %>
	<table>
		
		 <div class="chart-container" style="position: relative; height:40vh; width:30vw">
		 <canvas id="myChart" width="1800" height="800"></canvas>
		 </div>
  <script>
  const labels = ['1','2','3','4','5','6','7','8','9','10','11','12','13','14','15','16','17','18','19','20','21','22','23','24    (H)'];

  const data = {
    labels: labels,
    datasets: [{
      label: '온도',
      backgroundColor: 'rgb(255, 99, 132)',
      borderColor: 'rgb(255, 99, 132)',

      data: [
      <%for(int i = 0;i < 24;i++) { %>
      <%= list.get(i).getBhTemp() %>
      ,
      <% } %>
      ],
    },
	    {
	      label: '습도',
	      backgroundColor: 'rgb(0, 191, 255)',
	      borderColor: 'rgb(0, 191, 255)',
	      data: [
	    	  <%for(int i = 0;i < 24;i++) { %>
	          <%= list.get(i).getBhHumid() %>
	          ,
	          <% } %>
	      ],
	    },
	  {
	      label: '무게',
	      backgroundColor: 'rgb(255, 255, 0)',
	      borderColor: 'rgb(255, 255, 0)',
	      data: [
	    	  <%for(int i = 0;i < 24;i++) { %>
	          <%= list.get(i).getBhWeight()/1000 %>
	          
	          ,
	          <% } %>
	      ],
	    }]
	  };

  const config = {
    type: 'line',
    data: data,
    options: {
    	responsive:false,
        text: '월간 거북목',
        	 indexAxis: '',
    }
  };
  
  const myChart = new Chart(
		    document.getElementById('myChart'),
		    config
		  );
</script>
	</table>
</body>
</html>