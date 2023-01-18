package com.smhrd.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AjaxTest implements Command{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Ajax요청을 처리하는 POJO
		
		// 받아온 데이터 가져오기
		// ---> servlet이랑 동일함
		String msg = request.getParameter("msg");
		System.out.println(msg);
		// AjaxTest에서 데이터를 돌려주기??
		// 비동기통신 데이터를 돌려주기 위해는서는 반드시 페이지에 출력 !
		// 0 . 한글 인코딩 잡아주기
		response.setContentType("text/html;charset=UTF-8");
		// 1. PrintWriter객체 가져오기
		PrintWriter out = response.getWriter();
		// 2. 화면에 출력하기(Ajax사용 시 결과값을 돌려주는 방법)
		out.print("결과값 돌려줌");
		
		
		return null;
	}

}
