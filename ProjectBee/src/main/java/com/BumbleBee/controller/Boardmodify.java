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

public class Boardmodify implements Command {
	private static final long serialVersionUID = 1L;

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		TbMemberDTO user = (TbMemberDTO)session.getAttribute("user");	
		String id = user.getMbId();
		
		// 1. 수정할 데이터 가져오기
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		// 2. dto
		TbBoardDTO dto = new TbBoardDTO();
		dto.setBoardTitle(title);
		dto.setBoardContent(content);
		dto.setMbId(id);
		
		TbBoardDAO dao = new TbBoardDAO();
		int row = dao.boardModify(dto);
		if(row > 0) {
			// 수정 성공 수정한 게시글로 이동? or 게시글목록으로 이동
		}
		else {
			// 수정 실패 시 사이트 이동 없음
		}
		
		return null;
	}

}
