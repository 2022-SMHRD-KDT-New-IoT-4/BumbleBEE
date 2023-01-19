package com.BumbleBee.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.BumbleBee.model.TbBoardDAO;
import com.BumbleBee.model.TbBoardDTO;

public class Boardlikes implements Command {
	private static final long serialVersionUID = 1L;

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 게시글의 버튼을 눌렀을 때 board_seq에 있는 likes의 값을+1 (수정)
		// 게시글 번호를 가져와야함 어떻게?????????????
		// 흐름 - 1. 게시판에서 게시글을 누른다 - 2. 게시글의 정보를 받아온다(여기서 받아온 데이터가 계속 남아있나?..) 
		// - 3. 좋아요를 누른다 - 4. 게시글 번호를 가져와 likes + 1
		// 2번에서 받아온 데이터중 게시글 번호를 request.setattribte로 저장하고 -> 4번에서 get으로 다시 사용해서 더하기 - 이게 맞아? 맞는듯?
		int seq = (int)request.getAttribute("");
		TbBoardDTO dto = new TbBoardDTO();
		dto.setBoardLikes(seq + 1);
		TbBoardDAO dao = new TbBoardDAO();
		int row = dao.boardLikes(dto);
		if(row > 0) {
			//  + 1 성공 --> 사이트가 안바뀌는게 맞으니까 비동기로 만들어야함. 안되면 그냥 새로고침;
		}
		else {
			// 실패
		}
		
		
		return null;
	}

}
