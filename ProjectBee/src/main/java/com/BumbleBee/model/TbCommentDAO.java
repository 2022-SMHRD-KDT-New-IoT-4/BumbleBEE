package com.BumbleBee.model;

import org.apache.catalina.connector.Request;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.BumbleBee.db.SqlSessionManager;

public class TbCommentDAO {
	private SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();

	public int commentWrite(TbCommentDTO dto) {
		int row = 0;
		SqlSession session = sqlSessionFactory.openSession(true);
		try {
			row = session.insert("com.BumbleBee.model.TbCommentDAO.commentwrite", dto);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return row;
	}

	public int commentModify(TbCommentDTO dto) {
		int row = 0;
		SqlSession session = sqlSessionFactory.openSession(true);
		try {
			row = session.update("com.BumbleBee.model.TbCommentDAO.commentmodify", dto);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return row;
	}
	
	
}
