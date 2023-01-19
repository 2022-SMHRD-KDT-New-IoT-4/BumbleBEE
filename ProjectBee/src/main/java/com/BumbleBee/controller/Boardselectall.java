package com.BumbleBee.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.BumbleBee.model.TbBoardDAO;
import com.BumbleBee.model.TbBoardDTO;


public class Boardselectall implements Command {
	private static final long serialVersionUID = 1L;

	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		TbBoardDAO dao = new TbBoardDAO();
		List<TbBoardDTO> list = dao.boardselectAll();

		if (list != null) {
			request.setAttribute("", list);
		}
		
		
		return null;

	}

}
