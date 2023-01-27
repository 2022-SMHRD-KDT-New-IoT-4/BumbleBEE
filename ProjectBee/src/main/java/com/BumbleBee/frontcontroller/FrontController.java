package com.BumbleBee.frontcontroller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.BumbleBee.controller.BhSelect;
import com.BumbleBee.controller.BoardGomodify;
import com.BumbleBee.controller.Boardgowrite;
import com.BumbleBee.controller.Boardmain;
import com.BumbleBee.controller.Boardwrite;
//import com.BumbleBee.controller.Boarddelete;
//import com.BumbleBee.controller.Boardlikes;
//import com.BumbleBee.controller.Boardmodify;
import com.BumbleBee.controller.Command;
import com.BumbleBee.controller.GoMain;
import com.BumbleBee.controller.GoModify;
import com.BumbleBee.controller.GoSelect;
import com.BumbleBee.controller.Login;
import com.BumbleBee.controller.Modify;
import com.BumbleBee.controller.Logout;
import com.BumbleBee.controller.Register;
import com.BumbleBee.controller.Select;
import com.BumbleBee.controller.Start;
import com.BumbleBee.controller.Withdrawal;


// ---> 확장자 패턴 .do로 끝나는 모든 요청을 처리하겠다!
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<String, Command> map = null;
	// 초기화 메소드
	@Override
	public void init() throws ServletException {
		// 우리만의 새로운 자료형을 하나 만들자!
		// Collection 중 하나 HashMap - 순서없이 저장되는 가변적인 자료구조(Collection)
		map = new HashMap<>();
		// HashMap<Key로 지정할 자료형, Value로 들어갈 자료형>
		// 1) HashMap에 데이터 추가하기 
		map.put("Main.do", new GoMain());
		map.put("Register.do", new Register());
		map.put("Login.do", new Login());
		map.put("Withdrawal.do", new Withdrawal());
		map.put("Logout.do", new Logout());
		map.put("GoModify.do", new GoModify());
		map.put("Modify.do", new Modify());
		map.put("Select.do", new Select());
		map.put("GoSelect.do", new GoSelect());
		

		map.put("Boardmain.do", new Boardmain());
		map.put("Boardgowrite.do", new Boardgowrite());
		map.put("Boardwrite.do", new Boardwrite());
		map.put("BoardGomodify.do", new BoardGomodify());
//		map.put("Boardmodify.do", new Boardmodify());
//		map.put("Boarddelte.do", new Boarddelete());
//		map.put("Boardlikes.do", new Boardlikes());
		
		
		map.put("BhSelect.do", new BhSelect());
		map.put("Start.do", new Start());
		
	}
	
	
	
	
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 모든 요청을 한군데에서 처리하게끔 만들기
		// ---> url에 따라서 서로 다른 기능을 수행
		// 		ex) Login.do -> select 쿼리문 실행
		// 			Join.do --> insert 쿼리문 실행
		
		// url구분할 수 있어야 한다. 
		// 1) uri 가져오기
		String uri = request.getRequestURI();
//		System.out.println("요청 uri : " + uri);
		// 2) 프로젝트 경로 가져오기
		String path = request.getContextPath();
//		System.out.println("요청 path : " + path);
		// 3) uri에서 경로만 잘라내기
		String finalurl = uri.substring(path.length() + 1);
//		System.out.println("잘라낸 url : " + finalurl);
		
		// FrontController + Command Pattern + 확장url Pattern
		
		// 1. 모든 일반클래스를 표현할 수 있는 자료형 선언
		Command com = null;
		// 2. 한글 인코딩 잡아주기
		request.setCharacterEncoding("UTF-8");
		
		// 2-2. map안에 저장되어있는 일반클래스 꺼내오기
		com = map.get(finalurl);
		
		// 3. 일반클래스에게 일을 시키는 작업
		String rdPath = com.execute(request, response);
		if(rdPath == null) {
			//  아무런 일도안함 -> Ajax 비동기통신방식(페이지 이동 X)
		} else if(rdPath.contains("redirect:/")){
			response.sendRedirect(rdPath.substring("redirect:/".length()));
		}else {
			// 4. 페이지 응답 돌려주기
			request.getRequestDispatcher("WEB-INF/" + rdPath).forward(request, response);
		}
	}


}
