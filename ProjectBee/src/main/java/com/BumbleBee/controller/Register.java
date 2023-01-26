package com.BumbleBee.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.BumbleBee.model.TbMemberDAO;
import com.BumbleBee.model.TbMemberDTO;

public class Register implements Command {
	private static final long serialVersionUID = 1L;

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 데이터 가져오기(입력한 모든 값)
		String id = request.getParameter("mbid");
		String pw = request.getParameter("mbpw");
		int age = Integer.parseInt(request.getParameter("mbage"));
		String region = request.getParameter("mbregion");
		String job = request.getParameter("mbjob");
		String name = request.getParameter("mbname");
		String tel = request.getParameter("mbtel");
		// 2. 묶어주기(생성자에 매개변수로 넣어주기)
		TbMemberDTO dto = new TbMemberDTO(id, pw, name, age, job, region, tel);
		System.out.println(id + pw + age + region + job + name + tel);
		
		// 3. dao함수 호출
		TbMemberDAO dao = new TbMemberDAO();
		int row = dao.register(dto);
		
		if(row > 0) {
			// 성공 후 데이터를 가지고 이동할 페이지
			request.setAttribute("id", id);
			return "success.jsp";
		}
		else {
			// 실패 후 이동할 페이지
			return "main.jsp";
		}
		
		
		
	}

}
