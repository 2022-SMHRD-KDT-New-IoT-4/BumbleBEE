package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.model.MessageDAO;
import com.smhrd.model.MessageDTO;

public class UpdateProgram implements Command {

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 한글 인코딩
		
		// 2. 요청받은 데이터 꺼내오기
		String pw = request.getParameter("pw");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		
		// 2-2. 로그인한 사용자의 이메일 가져오기
		HttpSession session = request.getSession();
		MessageDTO user = (MessageDTO)session.getAttribute("user");	
		String email = user.getEmail();
		
		// 3. 데이터를 하나로 묶어주기
		MessageDTO dto = new MessageDTO(email, pw, phone, address);
		
		// 4. DAO 꺼내오기
		MessageDAO dao = new MessageDAO();
		
		// 5. database update할 수 있는 기능 사용하기
		int row = dao.update(dto);
		// 6. 단 수정 성공했을 때 새로운 사용자 정보를 다시 session 저장하기
		if(row > 0) {
			// 기존에 저장되어있던 사용자 정보를 새로운 dto로 덮어씌우는 개념
			session.setAttribute("user", dto);
		}
		// 7. main.jsp로 이동
		return "main.jsp";
	}

}
