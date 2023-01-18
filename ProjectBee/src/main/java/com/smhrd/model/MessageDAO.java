package com.smhrd.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.db.SqlSessionManager;

public class MessageDAO {
	
	// 필드 ---> 공장 꺼내오기
	private SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
	
	public int join(MessageDTO dto) {
		int row = 0;
		// 1. sqlSession 열어주기
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		try {
		// 2. session사용해서 insert 진행
		row = sqlSession.insert("com.smhrd.model.MessageDAO.join", dto);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			// 3. 자원반납
			sqlSession.close();			
		}
		// 4. 결과값 반환
		return row;
	}

	public MessageDTO login(MessageDTO dto) {
		MessageDTO resultDTO = null;
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		try {
			resultDTO = sqlSession.selectOne("com.smhrd.model.MessageDAO.login", dto);	
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
			
		}
		return resultDTO;
	}

	public int update(MessageDTO dto) {
		int row = 0;
		SqlSession session = sqlSessionFactory.openSession(true);
		try {
			row = session.update("com.smhrd.model.MessageDAO.update", dto);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return row;
	}

	public List<MessageDTO> selectAll() {
		// 0. 반환할 데이터
//		ArrayList<MessageDTO> dtolist = null;
		// List는 ArrayList의 부모이다
		List<MessageDTO> list = null;
		
		// 1. sqlsession 열어주기
		SqlSession session = sqlSessionFactory.openSession(true);

		try {
			// selectList()함수의 리턴값의 자료형이 List(인터페이스)이다.
			// selctList()는 읽어온 데이터 리스트 전체를 받아왔기때문에 하나씩 넣어 주는게 아니라 
			// List를 ArrayList로 강제형변환 시켜 한꺼번에 ArrayList<MessageDTO>에 담아 주는 것이다.
			
			// 2. session select 구문 실행하기
//			dtolist = (ArrayList)session.selectList("com.smhrd.model.MessageDAO.selectAll"); 
			list = session.selectList("com.smhrd.model.MessageDAO.selectAll");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 3. 자원반납
			session.close();
		}
		// 4. 결과값 반환
//		return dtolist;
		return list;
	}
	
}
