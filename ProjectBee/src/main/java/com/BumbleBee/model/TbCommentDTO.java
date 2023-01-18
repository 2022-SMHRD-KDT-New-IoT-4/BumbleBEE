package com.BumbleBee.model;

import java.sql.Date;

//댓글 
public class TbCommentDTO {

 // 댓글 순번 
 private Double cmtSeq;

 // 원글 순번 
 private Double boardSeq;

 // 댓글 내용 
 private String cmtContent;

 // 댓글 작성일자 
 private Date cmtDt;

 // 댓글 작성자 
 private String mbId;

 // 댓글 공감수 
 private Double cmtShares;

 public Double getCmtSeq() {
     return cmtSeq;
 }

 public void setCmtSeq(Double cmtSeq) {
     this.cmtSeq = cmtSeq;
 }

 public Double getBoardSeq() {
     return boardSeq;
 }

 public void setBoardSeq(Double boardSeq) {
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

 public String getMbId() {
     return mbId;
 }

 public void setMbId(String mbId) {
     this.mbId = mbId;
 }

 public Double getCmtShares() {
     return cmtShares;
 }

 public void setCmtShares(Double cmtShares) {
     this.cmtShares = cmtShares;
 }

 // TbComment 모델 복사
 public void CopyData(TbCommentDTO param)
 {
     this.cmtSeq = param.getCmtSeq();
     this.boardSeq = param.getBoardSeq();
     this.cmtContent = param.getCmtContent();
     this.cmtDt = param.getCmtDt();
     this.mbId = param.getMbId();
     this.cmtShares = param.getCmtShares();
 }
}