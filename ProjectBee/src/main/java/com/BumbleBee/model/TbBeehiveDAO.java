package com.BumbleBee.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.BumbleBee.db.SqlSessionManager;

public class TbBeehiveDAO {
	private SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
	
	
	public int modify(TbBeehiveDTO dto) {
		int row = 0;
		SqlSession session = sqlSessionFactory.openSession(true);		
		try {
			row = session.update("com.BumbleBee.model.TbBeehiveDAO.modify", dto);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return row;
	}
	
	
	
	
	public List<TbBeehiveDAO> bhselect() {
		List<TbBeehiveDAO> list = null;
		SqlSession session = sqlSessionFactory.openSession(true);		
		try {
			list = session.selectList("com.BumbleBee.model.TbBeehiveDAO.bhselect");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		
		
		return list;
	}
	
	
	
	
}
