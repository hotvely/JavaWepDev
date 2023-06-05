package com.youtube.controller;
import com.youtube.model.Video;
import java.util.*;

public class VideoController implements VideoControllerImpl {

	Video videoList[] = new Video[10];
	
	@Override
	public void upLoad(Video video) {
		
		videoList[0] = video;
		
	}

	@Override
	public Video[] videoList() {
		
	}

	@Override
	public Video viewVideo(int index) {
		return null;
	}

	@Override
	public Video updateVideo(int idx, Video video) {
		return videoList.set(idx, video);	
	}

	@Override
	public boolean deleteVideo() {
		return false;
	}

}
