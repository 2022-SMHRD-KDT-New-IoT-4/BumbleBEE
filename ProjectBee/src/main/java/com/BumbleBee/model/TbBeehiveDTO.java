package com.BumbleBee.model;

import java.sql.Date;

//벌통 정보 
public class TbBeehiveDTO {

	private int bhSeq; // 벌통 순번
	private String ownerId; // 소유자 아이디
	private Double bhWeight; // 벌통 무게
	private Double bhTemp; // 벌통 온도
	private Double bhHumid; // 벌통 습도
	private Date bhTime; // 측정 시간

	public TbBeehiveDTO(int bhSeq, String ownerId, Double bhWeight, Double bhTemp, Double bhHumid,
			Date bhTime) {
		super();
		this.bhSeq = bhSeq;
		this.ownerId = ownerId;
		this.bhWeight = bhWeight;
		this.bhTemp = bhTemp;
		this.bhHumid = bhHumid;
		this.bhTime = bhTime;
	}

	public TbBeehiveDTO() {
		
	}

	public int getBhSeq() {
		return bhSeq;
	}

	public void setBhSeq(int bhSeq) {
		this.bhSeq = bhSeq;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public Double getBhWeight() {
		return bhWeight;
	}

	public void setBhWeight(Double bhWeight) {
		this.bhWeight = bhWeight;
	}

	public Double getBhTemp() {
		return bhTemp;
	}

	public void setBhTemp(Double bhTemp) {
		this.bhTemp = bhTemp;
	}

	public Double getBhHumid() {
		return bhHumid;
	}

	public void setBhHumid(Double bhHumid) {
		this.bhHumid = bhHumid;
	}

	public Date getBhTime() {
		return bhTime;
	}

	public void setBhTime(Date bhTime) {
		this.bhTime = bhTime;
	}

	// TbBeehive 모델 복사
	public void CopyData(TbBeehiveDTO param) {
		this.bhSeq = param.getBhSeq();
		this.ownerId = param.getOwnerId();
		this.bhWeight = param.getBhWeight();
		this.bhTemp = param.getBhTemp();
		this.bhHumid = param.getBhHumid();
		this.bhTime = param.getBhTime();
	}
}