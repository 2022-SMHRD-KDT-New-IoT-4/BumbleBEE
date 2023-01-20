package com.BumbleBee.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.BumbleBee.db.SqlSessionManager;

public class TbBoardDAO {
	private SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();

	public int boardWrite(TbBoardDTO dto) {
		SqlSession session = sqlSessionFactory.openSession(true);
		int row = 0;
		try {
			row = session.insert("com.BumbleBee.model.TbBoardDAO.boardwrite", dto);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return row;
	}

	public int boardModify(TbBoardDTO dto) {
		SqlSession session = sqlSessionFactory.openSession(true);
		int row = 0;
		try {
			row = session.update("com.BumbleBee.model.TbBoardDAO.boardmodify", dto);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return 0;
	}

	public int boardDelete(TbBoardDTO dto) {
		SqlSession session = sqlSessionFactory.openSession(true);
		int row = 0;
		try {
			row = session.delete("com.BumbleBee.model.TbBoardDAO.boarddelete", dto);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return 0;
	}

	public void boardAddfile(TbBoardDTO dto) {
		
	}

	public int boardLikes(TbBoardDTO dto) {
		SqlSession session = sqlSessionFactory.openSession(true);
		int row = 0;
		try {
			row = session.update("com.BumbleBee.model.TbBoardDAO.boardlikes", dto);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return 0;
	}

	public List<TbBoardDTO> boardselectAll() {
		List<TbBoardDTO> list = null;
		SqlSession session = sqlSessionFactory.openSession(true);
		try {
			list = session.selectList("com.BumbleBee.model.TbBoardDAO.boardselectall");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		
		
		return list;
	}
}
