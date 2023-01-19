package com.BumbleBee.model;

import java.sql.Date;

//벌통 정보 
public class TbBeehiveDTO {

	private int bhSeq; // 벌통 순번
	private String id; // 소유자 아이디
	private Double bhWeight; // 벌통 무게
	private Double catcherWeight; // 포획기 무게
	private Double bhTemp; // 벌통 온도
	private Double bhHumid; // 벌통 습도
	private Date bhTime; // 측정 시간

	public int getBhSeq() {
		return bhSeq;
	}

	public void setBhSeq(int bhSeq) {
		this.bhSeq = bhSeq;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Double getBhWeight() {
		return bhWeight;
	}

	public void setBhWeight(Double bhWeight) {
		this.bhWeight = bhWeight;
	}

	public Double getCatcherWeight() {
		return catcherWeight;
	}

	public void setCatcherWeight(Double catcherWeight) {
		this.catcherWeight = catcherWeight;
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
		this.id = param.getId();
		this.bhWeight = param.getBhWeight();
		this.catcherWeight = param.getCatcherWeight();
		this.bhTemp = param.getBhTemp();
		this.bhHumid = param.getBhHumid();
		this.bhTime = param.getBhTime();
	}
}