package com.BumbleBee.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.BumbleBee.model.TbMemberDAO;
import com.BumbleBee.model.TbMemberDTO;


public class Select implements Command {
	private static final long serialVersionUID = 1L;

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. DAO 생성하기
		TbMemberDAO dao = new TbMemberDAO();
		// 2. selectAll 메소드를 실행
		List<TbMemberDTO> list = dao.selectAll();
				
		if(list != null) {
			// 3. 성공했다면, 사용자들의 정보를 request 영역에 담아서
			request.setAttribute("list", list);
			// 4. forward방식으로 select.jsp로 이동 
//			response.sendRedirect("select.jsp"); ?? 외않됌
			return "select.jsp";
		}
		else {
			return "main.jsp";
		}
		
		
		
		
		
	}

}
