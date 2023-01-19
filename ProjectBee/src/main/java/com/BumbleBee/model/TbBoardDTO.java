package com.BumbleBee.model;

import java.sql.Date;

public class TbBoardDTO {
	// 게시판
	private int boardSeq; // 글 순번
	private String boardTitle; // 글 제목
	private String boardContent; // 글 내용
	private String boardFile; // 글 첨부파일
	private Date boardDt; // 글 작성일자
	private String id; // 글 작성자
	private int boardViews; // 글 조회수
	private int boardLikes; // 글 좋아요

	// TbBoard 모델 복사
//	public void CopyData(TbBoardDTO param)
//	{
//		this.boardSeq = param.getBoardSeq();
//		this.boardTitle = param.getBoardTitle();
//		this.boardContent = param.getBoardContent();
//		this.boardFile = param.getBoardFile();
//		this.boardDt = param.getBoardDt();
//		this.mbId = param.getMbId();
//		this.boardViews = param.getBoardViews();
//		this.boardLikes = param.getBoardLikes();
//	}

	public TbBoardDTO(int boardSeq, String boardTitle, String boardContent, String boardFile, Date boardDt,
			String id, int boardViews, int boardLikes) {
		super();
		this.boardSeq = boardSeq;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.boardFile = boardFile;
		this.boardDt = boardDt;
		this.id = id;
		this.boardViews = boardViews;
		this.boardLikes = boardLikes;
	}

	public TbBoardDTO() {

	}

	public int getBoardSeq() {
		return boardSeq;
	}

	public void setBoardSeq(int boardSeq) {
		this.boardSeq = boardSeq;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public String getBoardFile() {
		return boardFile;
	}

	public void setBoardFile(String boardFile) {
		this.boardFile = boardFile;
	}

	public Date getBoardDt() {
		return boardDt;
	}

	public void setBoardDt(Date boardDt) {
		this.boardDt = boardDt;
	}

	public String getMbId() {
		return id;
	}

	public void setMbId(String id) {
		this.id = id;
	}

	public int getBoardViews() {
		return boardViews;
	}

	public void setBoardViews(int boardViews) {
		this.boardViews = boardViews;
	}

	public int getBoardLikes() {
		return boardLikes;
	}

	public void setBoardLikes(int boardLikes) {
		this.boardLikes = boardLikes;
	}

}