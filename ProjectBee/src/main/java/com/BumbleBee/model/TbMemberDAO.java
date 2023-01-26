package com.BumbleBee.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.BumbleBee.db.SqlSessionManager;

public class TbMemberDAO {
	private SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
	public int register(TbMemberDTO dto) {
		int row = 0;
		SqlSession session = sqlSessionFactory.openSession(true);
		try {
			row = session.insert("com.BumbleBee.model.TbMemberDAO.register", dto);
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			session.close();
		} 
		return row;
		
	}
	public TbMemberDTO login(TbMemberDTO dto) {
		SqlSession session = sqlSessionFactory.openSession(true);
		TbMemberDTO user = null;
		try {
			user = session.selectOne("com.BumbleBee.model.TbMemberDAO.login", dto);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return user;
	}
	public int modify(TbMemberDTO dto) {
		SqlSession session = sqlSessionFactory.openSession(true);
		int row = 0;
		try {
			row = session.update("com.BumbleBee.model.TbMemberDAO.modify", dto);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		
		return row;
	}
	public List<TbMemberDTO> selectAll() {
		SqlSession session = sqlSessionFactory.openSession(true);
		List list = null;
		try {
			list = session.selectList("com.BumbleBee.model.TbMemberDAO.selectAll");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}
	public int withdrawal(TbMemberDTO dto) {
		int row = 0;
		SqlSession session = sqlSessionFactory.openSession(true);
		
		try {
			row = session.delete("com.BumbleBee.model.TbMemberDAO.withdrawal", dto);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return row;
	}
}
