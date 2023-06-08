package com.youtube.impl;

import com.youtube.model.Comment;

// 팀 과제는 이방식으로 interface 사용해서.
public interface CommentImpl
{
	
	//C	 : 댓글 작성	-> 로그인 된 회원만 가능!
	public void addComment(String id, String pass, Comment comment);

	//R	 : 댓글 1개 보기
	public Comment viewComment(int idx);
	
	//U	 : 댓글 수정	-> 로그인한 회원과 댓글 작성자가 일치,
	public void updateComment(int idx, Comment comment);

	//D	 : 댓글 삭제	-> 로그인한 회원과 댓글 작성자가 일치
	public void deleteComment(int idx);

	
}
