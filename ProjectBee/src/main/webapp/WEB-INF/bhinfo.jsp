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
</head>
<body>
	<% List<TbBeehiveDTO> list = (List)request.getAttribute("list"); %>
	<table>
		<tr>
			<td>순서</td>
			<td>온도</td>
			<td>습도</td>
			<td>무게</td>
		</tr>
		<% for(int i = 0;i < list.size(); i++) { %>
			<tr>
				<td><%=list.get(i).getBhSeq()%> </td>
				<td><%=list.get(i).getBhTemp()%></td>
				<td><%=list.get(i).getBhHumid()%></td>
				<td><%=list.get(i).getBhWeight()%></td>
			</tr>
		<% } %>
		 <div class="chart-container" style="position: relative; height:40vh; width:30vw">
		 <canvas id="myChart" width="700" height="500"></canvas>
		 </div>
  <script>
  const labels = ['1','2','3','4','5','6','7','8','9','10','11','12'];

  const data = {
    labels: labels,
    datasets: [{
      label: 'Temperature',
      backgroundColor: 'rgb(255, 99, 132)',
      borderColor: 'rgb(255, 99, 132)',
    
      data: [0, 10, 5, 2, 20, 30, 45, 12, 23, 56, 75, 200],
    },
	    {
	      label: 'Humidity',
	      backgroundColor: 'rgb(0, 191, 255)',
	      borderColor: 'rgb(0, 191, 255)',
	      data: [190,35,105,75,25,64,72,88,9,17,50,190],
	    },
	  {
	      label: 'Weigt',
	      backgroundColor: 'rgb(255, 255, 0)',
	      borderColor: 'rgb(255, 255, 0)',
	      data: [3,35,105,75,1,234,72,88,324,464,542,190],
	    }]
	  };

  const config = {
    type: 'line',
    data: data,
    options: {
    	responsive:false,
    	
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