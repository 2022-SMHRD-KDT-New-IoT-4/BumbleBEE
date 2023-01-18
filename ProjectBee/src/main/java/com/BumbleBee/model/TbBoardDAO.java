package com.BumbleBee.model;

import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.db.SqlSessionManager;

public class TbBoardDAO {
	private SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
}
