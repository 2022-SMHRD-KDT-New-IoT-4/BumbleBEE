package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
	// FC -> 일반클래스 일을 시킴!
	// 일반클래스가 반드시 지켜야하는 규칙을 작성하는 인터페이스 -> Command라고 명칭
	// *MessageSystem 프로젝트에서 일을 하려면 반드시 Command 형식을 따라야한다. 
	
	
	// interface abstract키워두, final 키워드 생략 가ㅡㄴㅇ
	
	
	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
	
}
