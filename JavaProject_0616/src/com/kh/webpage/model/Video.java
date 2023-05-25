package com.kh.webpage.model;

import java.util.Date;

public class Video {

	// 영상이 가지고 있는 타이틀 정보
	public String title;
	// 영상 시간
	public float playTime;
	// 영상 파일 주소
	public String fileUrl;

	// 영상 업로드
	public void upLoad() {
		// 영상 업로드..

	}

	// ------------------ 생성자
	public Video() {}
	
	public Video(String title, float playTime, String fileUrl) {
		super();
		this.title = title;
		this.playTime = playTime;
		this.fileUrl = fileUrl;
	}
	// ------------------ 생성자

	
	
	// 영상 목록
	public void videoList() {
		
	}

	// 영상 재생
	public void viewVideo() {
	}

	// 영상 수정
	public void updateVideo() {
		
	}

//	// 영상 삭제
//	public void deleteVideo() {
//	}

}
