package com.BumbleBee.model;

import java.sql.Date;

public class TbMemberDTO {// 회원정보 

	    // 회원 아이디 
	    




		private String mbId;
		// 회원 패스워드 
	    private String mbPw;

	    // 회원 이름 
	    private String mbName;

	    // 회원 나이 
	    private int mbAge;

	    // 회원 직업 
	    private String mbJob;

	    // 회원 지역 
	    private String mbRegion;

	    // 회원 전화번호 
	    private String mbTel;

	    // 회원 가입일자 
	    private Date mbJoindate;

	    // 회원 유형 
	    private String mbType;


	    public TbMemberDTO(String mbId, String mbPw, String mbName, int mbAge, String mbJob, String mbRegion,
				String mbTel) {
			super();
			this.mbId = mbId;
			this.mbPw = mbPw;
			this.mbName = mbName;
			this.mbAge = mbAge;
			this.mbJob = mbJob;
			this.mbRegion = mbRegion;
			this.mbTel = mbTel;
			
		}
	    

		public TbMemberDTO() {
			super();
		}
	    
	    
	    public String getMbId() {
	        return mbId;
	    }

	    public void setMbId(String mbId) {
	        this.mbId = mbId;
	    }

	    public String getMbPw() {
	        return mbPw;
	    }

	    public void setMbPw(String mbPw) {
	        this.mbPw = mbPw;
	    }

	    public String getMbName() {
	        return mbName;
	    }

	    public void setMbName(String mbName) {
	        this.mbName = mbName;
	    }

	    public int getMbAge() {
	        return mbAge;
	    }

	    public void setMbAge(int mbAge) {
	        this.mbAge = mbAge;
	    }

	    public String getMbJob() {
	        return mbJob;
	    }

	    public void setMbJob(String mbJob) {
	        this.mbJob = mbJob;
	    }

	    public String getMbRegion() {
	        return mbRegion;
	    }

	    public void setMbRegion(String mbRegion) {
	        this.mbRegion = mbRegion;
	    }

	    public String getMbTel() {
	        return mbTel;
	    }

	    public void setMbTel(String mbTel) {
	        this.mbTel = mbTel;
	    }

	    public Date getMbJoindate() {
	        return mbJoindate;
	    }

	    public void setMbJoindate(Date mbJoindate) {
	        this.mbJoindate = mbJoindate;
	    }

	    public String getMbType() {
	        return mbType;
	    }

	    public void setMbType(String mbType) {
	        this.mbType = mbType;
	    }

	    // TbMember 모델 복사
//	    public void CopyData(TbMemberDTO param)
//	    {
//	        this.mbId = param.getMbId();
//	        this.mbPw = param.getMbPw();
//	        this.mbName = param.getMbName();
//	        this.mbAge = param.getMbAge();
//	        this.mbJob = param.getMbJob();
//	        this.mbRegion = param.getMbRegion();
//	        this.mbTel = param.getMbTel();
//	        this.mbJoindate = param.getMbJoindate();
//	        this.mbType = param.getMbType();
//	    }
	}

