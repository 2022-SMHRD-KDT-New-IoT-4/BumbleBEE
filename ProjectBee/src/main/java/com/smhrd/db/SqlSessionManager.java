package com.smhrd.db;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionManager {
	
	public static SqlSessionFactory sqlSessionFactory;
	// 객체를 생성하는 순간 실행되는 부분
	// static : 고정된 값을 공유하는 공간
	// ---> 하나의 설계도면으로 여러개의 객체를 만들더라도
	// 		각각의 객체는 모두 동일한 값을 공유한다.
	// 생성자와 유사한 영역 컨트롤f11 -> jvm -> static영역찾아 실행
	static {
		// 1. 설정 파일을 읽을건지 경로를 문자열로 지정
		String resource = "com/smhrd/db/mybatis-config.xml";
		// 2. 설정 파일을 읽어서 데이터베이스 연결하기
		InputStream inputStream;
		
		try {
			inputStream = Resources.getResourceAsStream(resource);
			 sqlSessionFactory =
					new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// sqlsessionfactory를 사용해서 db연결, 종료, 실행, 관리하는 sqlsession 생성 
	public static SqlSessionFactory getSqlSession() {
		return sqlSessionFactory;
	}
	
	
	
	
	
	
	
}
