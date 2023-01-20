package com.BumbleBee.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.BumbleBee.model.TbBoardDAO;
import com.BumbleBee.model.TbBoardDTO;
import com.BumbleBee.model.TbMemberDTO;

public class Boardwrite implements Command {
	private static final long serialVersionUID = 1L;

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		TbMemberDTO user = (TbMemberDTO)session.getAttribute("user");	// 현재 세션에있는 유저의 아이디 가져오기
		String id = user.getMbId();
		System.out.println(id);
		// 1. 데이터 가져오기 (글제목, 글내용, 작성자 , 등등등)
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		// 2. dto 생성
		TbBoardDTO dto = new TbBoardDTO(); // 나중에 값 넣어주기
		dto.setBoardTitle(title);
		dto.setBoardContent(content);
		dto.setMbId(id);
		// 3. dao 생성
		TbBoardDAO dao = new TbBoardDAO();
		int row = dao.boardWrite(dto);
		if(row > 0) {
			return "Board_List.jsp";
			// 글 작성 성공 - 데이터 가지고갈 필요없이 바로 게시판목록 화면으로 보내기
		}
		else {
			return "Board_List.jsp";
			// 작성 실패 
		}
		
	}

}
