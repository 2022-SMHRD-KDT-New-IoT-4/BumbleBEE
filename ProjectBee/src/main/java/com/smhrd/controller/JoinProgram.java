package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.smhrd.model.MessageDAO;
import com.smhrd.model.MessageDTO;

// 일반클래스 형식으로 변경(POJO, Plain Old Java Object)
public class JoinProgram implements Command {

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 한글 인코딩
		// 2. 데이터 가져오기
		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		
		// 3. 한개의 자료형으로 묶기
		MessageDTO dto = new MessageDTO(email, pw, phone, address);
		MessageDAO dao = new MessageDAO();
		
		int row = dao.join(dto);
		
		if(row > 0) {
			// 5. 로그인 성공했을 때 join_success.jsp 로 이동 - request영역에 사용자의 email담아서 forward방식으로 이동
			// 5-1) request scope에 데이터 저장
			request.setAttribute("email", email);
			// 5-2) rd 도구 꺼내오기
			return "join_success.jsp";
			// 5-3) forward방식 사용하기
			
		}
		else {
			return "main.jsp";
		}
		
		
		
	}

}
