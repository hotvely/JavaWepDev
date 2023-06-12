package com.kh.file;

import java.io.File;
import java.io.IOException;

/*
 * File 클래스
 * - 파일과 디렉토리를 다루는데 사용되는 클래스
 * 
 * 
 * */
public class FileTest {

	public static void main(String[] args) 
	{
		// 존재하는 경로 까지 지정해 주면 해당 위치에 파일을 생성한다~
		File file = new File("src/test.txt");
		System.out.println("파일명 > " + file.getName());
		System.out.println("절대 경로 > " + file.getAbsolutePath());
		System.out.println("상대 경로 > " + file.getPath());
		System.out.println("파일 용량 > " + file.length());
		System.out.println("파일 존재여부 > " + file.exists());
		System.out.println("파일 여부 > " + file.isFile());
		System.out.println("디렉토리 여부 > " + file.isDirectory());
		
		System.out.println();
		
		//만약에 존재하지 않는 경로를 제시하면 IOException 발생
		File newFile = new File("src/temp/text.txt");
		if(!newFile.exists())
		{
			// 폴더 만들기..
			File tempDir = new File("src/temp");
			tempDir.mkdir();
			
			// 이후에 파일 생성하기
			try 
			{
				newFile.createNewFile();
			} 
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
		
	}

}
