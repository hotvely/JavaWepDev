package com.youtube.model;

import java.util.*;

public class Video {
	private String title;
	private String comment;
	private Date uploadAt;
	private int views;
	private String imgUrl;
	private String fileUrl;

	public Video(String title, String comment, Date uploadAt, 
			int views, String imgUrl, String fileUrl) 
	{
		this.title = title;
		this.comment = comment;
		this.uploadAt = uploadAt;
		this.views = views;
		this.imgUrl = imgUrl;
		this.fileUrl = fileUrl;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getUploadAt() {
		return uploadAt;
	}
	public void setUploadAt(Date uploadAt) {
		this.uploadAt = uploadAt;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getFileUrl() {
		return fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	
	@Override
	public String toString() {
		return "Video [title=" + title + ", comment=" + comment + ", uploadAt=" + uploadAt + ", views=" + views
				+ ", imgUrl=" + imgUrl + ", fileUrl=" + fileUrl + "]";
	}

}
