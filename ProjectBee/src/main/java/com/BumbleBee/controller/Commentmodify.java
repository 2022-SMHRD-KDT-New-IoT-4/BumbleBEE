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

public class Commentmodify extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 댓글 수정 버튼은 세션에 로그인한 회원id와 값이 같은 댓글에만 보이게 해야한다.
		
		// 수정 조건 1. 작성자 id, 2. 게시글 번호, 3. 댓글 번호
		HttpSession session = request.getSession();
		TbMemberDTO user = (TbMemberDTO)session.getAttribute("");
		// 수정할 내용 가져오기
		String content = (String)request.getParameter("");
		TbCommentDTO dto = new TbCommentDTO();
		dto.setBoardSeq(0);
		dto.setCmtContent(content);
		dto.setId(user.getId());
		
		TbCommentDAO dao = new TbCommentDAO();
		
		int row = dao.commentModify(dto);
		
		
		return null;
		
	}

}
