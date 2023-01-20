package com.BumbleBee.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.BumbleBee.model.TbMemberDAO;
import com.BumbleBee.model.TbMemberDTO;


public class Login implements Command {
	private static final long serialVersionUID = 1L;

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 데이터 받아오기(id, pw)
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		// 2. 묶어주기
		TbMemberDTO dto = new TbMemberDTO();
		dto.setMbId(id);
		dto.setMbPw(pw);
		TbMemberDAO dao = new TbMemberDAO();
		
		TbMemberDTO user =  dao.login(dto);
		
		if(user != null) {
			// 로그인 성공
			// session영역에 정보 저장(tbmemberdto 저장해야함)
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			System.out.println("성공");
			return "main.jsp";
		}
		else {
			// 로그인 실패
			System.out.println("실패");
			return "main.jsp";
		}
		
	}

}
