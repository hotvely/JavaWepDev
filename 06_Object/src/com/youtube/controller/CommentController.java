package com.youtube.controller;

import java.util.*;
import com.youtube.model.*;

// 개인과제는 이런 식으로 하세여~
public class CommentController 
{
	
	List<Comment> comments = new ArrayList<>();
	UserController uc = new UserController();

	
	//C	 : 댓글 작성	-> 로그인 된 회원만 가능!
	public void addComment(String id, String pass, Comment comment)
	{
		if(uc.login(id, pass))
		{
			comments.add(comment);
			
			
		}
		
	}
	
	
	//R	 : 댓글 1개 보기
	public Comment viewComment(int idx)
	{
		
		return comments.get(idx);
	}
	
	
	//U	 : 댓글 수정	-> 로그인한 회원과 댓글 작성자가 일치,
	public void updateComment(int idx, Comment comment)
	{
		comments.set(idx, comment);
	}
	
		
	//D	 : 댓글 삭제	-> 로그인한 회원과 댓글 작성자가 일치
	public void deleteComment(int idx)
	{
		comments.remove(idx);
	}
	
	
	
}
