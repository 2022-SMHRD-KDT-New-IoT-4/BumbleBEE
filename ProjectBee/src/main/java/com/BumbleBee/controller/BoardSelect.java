package com.BumbleBee.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.BumbleBee.model.TbBoardDAO;
import com.BumbleBee.model.TbBoardDTO;

public class BoardSelect implements Command {
	private static final long serialVersionUID = 1L;

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 여기서 쿼리스트링값 가져와서 request영역에 다시 들고 가야함??
		StringBuffer requestURL = request.getRequestURL();
		String queryString = request.getQueryString();
		String data = null;
		if(queryString == null) {
			data = requestURL.toString();
		} else {
			data = requestURL.append('?').append(queryString).toString();
		}
		data = data.substring(data.indexOf("=") + 1);
		
		TbBoardDTO dto = new TbBoardDTO();
		dto.setBoardSeq(Integer.parseInt(data));
		TbBoardDAO dao = new TbBoardDAO();
		TbBoardDTO board = dao.select(dto);
		if(board != null) {
			request.setAttribute("board", board);
		}
		System.out.println(data);
		return "board.jsp";
	}

}
