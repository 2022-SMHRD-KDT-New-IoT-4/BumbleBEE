package com.smhrd.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.model.MessageDAO;
import com.smhrd.model.MessageDTO;

public class SelectAllProgram implements Command {

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. DAO 생성하기
		MessageDAO dao = new MessageDAO();
		// 2. selectAll 메소드를 실행
		List<MessageDTO> dtolist = dao.selectAll();
		if(dtolist != null) {
			// 3. 성공했다면, 사용자들의 정보를 request 영역에 담아서
			request.setAttribute("userinfo", dtolist);
			// 4. forward방식으로 select.jsp로 이동 
//			response.sendRedirect("select.jsp"); ?? 외않됌

		}
		return "select.jsp";
	}

}
