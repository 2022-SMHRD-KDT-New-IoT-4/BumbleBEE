package com.BumbleBee.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.json.JSONParser;

import com.BumbleBee.model.SensorInfo;
import com.BumbleBee.model.TbCommentDAO;
import com.BumbleBee.model.TbCommentDTO;
import com.google.gson.Gson;

/**
 * Servlet implementation class Commentdelete
 */
@WebServlet("/api/info")
public class InfoWrite extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 아두이노 요청을 읽어오는 구간
		String bodyJson = "";
        
		StringBuilder stringBuilder = new StringBuilder();
        BufferedReader br = null;        //
        
        try {
            String line = "";
          	//body내용 inputstream에 담는다.
            InputStream inputStream = request.getInputStream();
            if (inputStream != null) {
                br = new BufferedReader(new InputStreamReader(inputStream));
                //더 읽을 라인이 없을때까지 계속
                while ((line = br.readLine()) != null) {
                    stringBuilder.append(line);
                }
            }
        } catch (IOException e) {
        	e.printStackTrace();
        } 
 
        // 읽어온 데이터를 json으로 파싱하는 구간
    	Gson gson = new Gson();    	
    	SensorInfo info = gson.fromJson(stringBuilder.toString(), SensorInfo.class);
    			    	
    	System.out.println("Humidity: " + info.getHumidity() +  ", Temperature: " + info.getTemperature() + ", Weight: " + info.getWeight());
	}
}
