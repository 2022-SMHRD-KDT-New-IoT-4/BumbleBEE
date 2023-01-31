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

public class Boarddelete implements Command {
	private static final long serialVersionUID = 1L;

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. delete할 글 번호 가져오기
		StringBuffer requestURL = request.getRequestURL();
		String queryString = request.getQueryString();
		String data = null;
		if(queryString == null) {
			data = requestURL.toString();
		} else {
			data = requestURL.append('?').append(queryString).toString();
		}
		data = data.substring(data.indexOf("=") + 1);
		// 1-2. web에서는 세션에 로그인 되어있는 사용자의 id와 글쓴이의 id가 같은 경우에만 삭제버튼이 보이도록 구현
		// - 비교하기위해서 글쓴이의 id를 가지고 가야함 (로그인한 정보는 이미 세션에 있기때문에) --> 다른 servlet에 따로 만들어야하나?.. ㅁ?ㄹ
		
		
		
		// 2. dto에 글 번호 가져가기
		TbBoardDTO dto = new TbBoardDTO();
		dto.setBoardSeq(Integer.parseInt(data));
		// 3. dao.boarddelete로 데이터 삭제 여부
		TbBoardDAO dao = new TbBoardDAO();
		int row = dao.boardDelete(dto);
		if(row > 0) {
			// 삭제 성공
			return "redirect:/Boardmain.do";
			// -> 삭제 성공했을때 백업게시판에 등록 -> DB트리거가 자동으로 실행해주는 건가???? 
		} 
		else {
			return "Main.do";
			// 삭제 실패
		}
		
	}

}
