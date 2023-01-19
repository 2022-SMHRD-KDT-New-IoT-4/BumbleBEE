package com.BumbleBee.model;

import java.sql.Date;

public class TbMemberDTO {
		// 회원정보 
	    private String id; // 회원 아이디 
	    private String pw; // 회원 패스워드 
	    private String name; // 회원 이름 
	    private int age;  // 회원 나이 
	    private String job;  // 회원 직업 
	    private String region;     // 회원 지역 
	    private String tel; // 회원 전화번호 
	    private Date joindate; // 회원 가입일자 
	    private String type; // 회원 유형 

	    // 생성자
	    public TbMemberDTO(String id, String pw, String name, int age, String job, String region, String tel,
				Date joindate, String type) {
			super();
			this.id = id;
			this.pw = pw;
			this.name = name;
			this.age = age;
			this.job = job;
			this.region = region;
			this.tel = tel;
			this.joindate = joindate;
			this.type = type;
		}
		
	    public TbMemberDTO() {
	    	
	    }
	    
	    

	    public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id;
	    }

	    public String getPw() {
	        return pw;
	    }

	    public void setPw(String pw) {
	        this.pw = pw;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public String getJob() {
	        return job;
	    }

	    public void setJob(String job) {
	        this.job = job;
	    }

	    public String getRegion() {
	        return region;
	    }

	    public void setRegion(String region) {
	        this.region = region;
	    }

	    public String getTel() {
	        return tel;
	    }

	    public void setTel(String tel) {
	        this.tel = tel;
	    }

	    public Date getJoindate() {
	        return joindate;
	    }

	    public void setJoindate(Date joindate) {
	        this.joindate = joindate;
	    }

	    public String getType() {
	        return type;
	    }

	    public void setType(String type) {
	        this.type = type;
	    }

	    // TbMeer 모델 복사
	    public void CopyData(TbMemberDTO param)
	    {
	        this.id = param.getId();
	        this.pw = param.getPw();
	        this.name = param.getName();
	        this.age = param.getAge();
	        this.job = param.getJob();
	        this.region = param.getRegion();
	        this.tel = param.getTel();
	        this.joindate = param.getJoindate();
	        this.type = param.getType();
	    }

		
	}

