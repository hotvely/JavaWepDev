package com.youtube.impl;

import com.youtube.model.Video;

public interface VideoControllerImpl {

	// 영상 업로드
	public void upLoad(Video video);

	// 영상 목록
	public Video[] videoList();

	// 영상 재생
	public Video viewVideo(int index);

	// 영상 수정
	public Video updateVideo();

	// 영상 삭제
	public boolean deleteVideo();
}
