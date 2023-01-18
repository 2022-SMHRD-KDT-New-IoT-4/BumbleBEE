package com.BumbleBee.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.BumbleBee.model.TbMemberDAO;
import com.BumbleBee.model.TbMemberDTO;


public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 데이터 받아오기(id, pw)
		
		// 2. 묶어주기
		TbMemberDTO dto = new TbMemberDTO();
		dto.setId("");
		dto.setPw("");
		TbMemberDAO dao = new TbMemberDAO();
		TbMemberDTO userinfo =  dao.login(dto);
		
		if(userinfo != null) {
			// 로그인 성공
			// session영역에 정보 저장(tbmemberdto 저장해야함)
		}
		else {
			// 로그인 실패
		}
		return null;
		
	}

}
