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
		
		// 2. 현재 접속한 회원의 아이디 가져오기
		HttpSession session = request.getSession();
		TbMemberDTO user = (TbMemberDTO)session.getAttribute("");	
		String id = user.getId();
		// 3. 데이터를 하나로 묶어주기
		TbMemberDTO dto = new TbMemberDTO(id, id, id, null, id, id, id, null, id); // 수정할 데이터 넣기
		// 4. dao
		TbMemberDAO dao = new TbMemberDAO();
		int row = dao.modify(dto);
		if(row > 0) {
			// 성공
		}
		else {
			// 실패
		}
		return null;
	}

}
