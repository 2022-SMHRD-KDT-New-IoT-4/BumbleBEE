package com.BumbleBee.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.BumbleBee.model.TbBeehiveDAO;
import com.BumbleBee.model.TbBeehiveDTO;
import com.google.gson.Gson;

public class Load implements Command {
	private static final long serialVersionUID = 1L;

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		TbBeehiveDAO dao = new TbBeehiveDAO();
		List<TbBeehiveDTO> list = dao.bhselect();
		Gson gson=new Gson();
		String info=gson.toJson(list);
		response.setContentType("test/json");			
		PrintWriter out = response.getWriter();
		out.print(info);
		return null;
	}

}
