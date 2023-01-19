package com.BumbleBee.model;

import java.sql.Date;

//댓글 
public class TbCommentDTO {

	private int cmtSeq; // 댓글 순번
	private int boardSeq; // 원글 순번
	private String cmtContent; // 댓글 내용
	private Date cmtDt; // 댓글 작성일자
	private String id; // 댓글 작성자
	private int cmtShares; // 댓글 공감수

	public TbCommentDTO(int cmtSeq, int boardSeq, String cmtContent, Date cmtDt, String id, int cmtShares) {
		super();
		this.cmtSeq = cmtSeq;
		this.boardSeq = boardSeq;
		this.cmtContent = cmtContent;
		this.cmtDt = cmtDt;
		this.id = id;
		this.cmtShares = cmtShares;
	}
	
	public TbCommentDTO() {
		
	}
	
	
	public int getCmtSeq() {
		return cmtSeq;
	}

	public void setCmtSeq(int cmtSeq) {
		this.cmtSeq = cmtSeq;
	}

	public int getBoardSeq() {
		return boardSeq;
	}

	public void setBoardSeq(int boardSeq) {
		this.boardSeq = boardSeq;
	}

	public String getCmtContent() {
		return cmtContent;
	}

	public void setCmtContent(String cmtContent) {
		this.cmtContent = cmtContent;
	}

	public Date getCmtDt() {
		return cmtDt;
	}

	public void setCmtDt(Date cmtDt) {
		this.cmtDt = cmtDt;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getCmtShares() {
		return cmtShares;
	}

	public void setCmtShares(int cmtShares) {
		this.cmtShares = cmtShares;
	}

	// TbComment 모델 복사
	public void CopyData(TbCommentDTO param) {
		this.cmtSeq = param.getCmtSeq();
		this.boardSeq = param.getBoardSeq();
		this.cmtContent = param.getCmtContent();
		this.cmtDt = param.getCmtDt();
		this.id = param.getId();
		this.cmtShares = param.getCmtShares();
	}
}