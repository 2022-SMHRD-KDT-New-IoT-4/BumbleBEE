package com.BumbleBee.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.BumbleBee.model.TbCommentDAO;
import com.BumbleBee.model.TbCommentDTO;
import com.BumbleBee.model.TbMemberDTO;

public class Commentwrite implements Command {
	private static final long serialVersionUID = 1L;

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 사용자 id 가져오기
		HttpSession session = request.getSession();
		TbMemberDTO user = (TbMemberDTO)session.getAttribute("");
		String id = user.getId();
		// 2. 게시판 seq 가져오기 
		int bd_seq = (int)request.getAttribute("");
		
		// 3. 댓글 내용 
		String content = request.getParameter("");
		
		TbCommentDTO dto = new TbCommentDTO();
		dto.setBoardSeq(bd_seq);
		dto.setId(id);
		dto.setCmtContent(content);
		
		TbCommentDAO dao = new TbCommentDAO();
		int row = dao.commentWrite(dto);
		if(row > 0) {
			// 댓글작성성공
		}
		else {
			// 작성실패
		}
		return null;
	}

}
