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

public class Load2 implements Command {
	private static final long serialVersionUID = 1L;

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TbBeehiveDAO dao = new TbBeehiveDAO();
		TbBeehiveDTO list = dao.bhselectid();
		TbBeehiveDTO list2 = dao.bhselectone(list);
		
		Gson gson=new Gson();
		String info=gson.toJson(list2);
		response.setContentType("test/json");			
		PrintWriter out = response.getWriter();
		out.print(info);
		return null;
	}

}
