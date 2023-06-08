package com.kh.webpage.controller;

import com.kh.webpage.model.Video;
import java.util.*;

public class VideoController {
	
	ArrayList<Video> videoList = new ArrayList<>();

	
	public void upLoad(Video video) {
		
		videoList.add(video);
		
	}

	
	public ArrayList<Video> videoList() {
		
		
		return videoList;
	}

	
	public Video viewVideo(int index) 
	{
		return videoList.get(index);
	}

	
	public Video updateVideo(int idx, Video video) 
	{
		return videoList.set(idx, video);	
	}

	
	public boolean deleteVideo(Video video)
	{
		return videoList.remove(video);
	}
	
	
	
}
