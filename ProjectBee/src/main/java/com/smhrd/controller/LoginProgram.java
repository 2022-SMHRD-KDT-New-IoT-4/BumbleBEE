package com.smhrd.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.model.MessageDAO;
import com.smhrd.model.MessageDTO;

public class LoginProgram implements Command {

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 한글 인코딩 잡아주기
		// 2. 요청받은 데이터 꺼내오기(email, pw 2개)

		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
		// 3. 요청받은 데이터를 하나로 묶기
		MessageDTO dto = new MessageDTO();
		dto.setEmail(email);
		dto.setPw(pw);
		// 4. DAO를 생성
		MessageDAO dao = new MessageDAO();
		// 5. dao를 사용해서 database에서 데이터를 조회
		MessageDTO result = dao.login(dto);
		
		if(result != null) {
			HttpSession session = request.getSession();
			session.setAttribute("user", result);
			return "main.jsp";
		} else {
			return "main.jsp";
		}
		
	}

}
