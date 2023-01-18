package com.BumbleBee.model;

import java.sql.Date;

public class TbBoardDTO {
	// 게시판 
	
	// TbBoard 모델 복사
	public void CopyData(TbBoardDTO param)
	{
		this.boardSeq = param.getBoardSeq();
		this.boardTitle = param.getBoardTitle();
		this.boardContent = param.getBoardContent();
		this.boardFile = param.getBoardFile();
		this.boardDt = param.getBoardDt();
		this.mbId = param.getMbId();
		this.boardViews = param.getBoardViews();
		this.boardLikes = param.getBoardLikes();
	}

	    // 글 순번 
	    private Double boardSeq;

	    // 글 제목 
	    private String boardTitle;

	    // 글 내용 
	    private String boardContent;

	    // 글 첨부파일 
	    private String boardFile;

	    // 글 작성일자 
	    private Date boardDt;

	    // 글 작성자 
	    private String mbId;

	    // 글 조회수 
	    private Double boardViews;

	    // 글 좋아요수 
	    private Double boardLikes;

	    public Double getBoardSeq() {
	        return boardSeq;
	    }

	    public void setBoardSeq(Double boardSeq) {
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
	        return mbId;
	    }

	    public void setMbId(String mbId) {
	        this.mbId = mbId;
	    }

	    public Double getBoardViews() {
	        return boardViews;
	    }

	    public void setBoardViews(Double boardViews) {
	        this.boardViews = boardViews;
	    }

	    public Double getBoardLikes() {
	        return boardLikes;
	    }

	    public void setBoardLikes(Double boardLikes) {
	        this.boardLikes = boardLikes;
	    }

	}