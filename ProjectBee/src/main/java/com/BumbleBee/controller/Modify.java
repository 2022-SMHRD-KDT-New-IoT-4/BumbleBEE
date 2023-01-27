package com.BumbleBee.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.BumbleBee.model.TbMemberDAO;
import com.BumbleBee.model.TbMemberDTO;


public class Modify implements Command {
	private static final long serialVersionUID = 1L;

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 수정할 데이터 가져오기
		String pw = request.getParameter("mbpw");
		String name = request.getParameter("mbname");
		int age = Integer.parseInt(request.getParameter("mbage"));
		String job = request.getParameter("mbjob");
		String tel = request.getParameter("mbtel");
		String region = request.getParameter("mbregion");
		
		// 2. 현재 접속한 회원의 아이디 가져오기
		HttpSession session = request.getSession();
		TbMemberDTO user = (TbMemberDTO)session.getAttribute("user");	
		String id = user.getMbId();
		// 3. 데이터를 하나로 묶어주기
		TbMemberDTO dto = new TbMemberDTO(id, pw, name, age, job, region, tel); // 수정할 데이터 넣기
		// 4. dao
		TbMemberDAO dao = new TbMemberDAO();
		int row = dao.modify(dto);
		if(row > 0) {
			// 성공
			return "main.jsp";
		}
		else {
			// 실패
			return "main.jsp";
		}
		
	}

}
