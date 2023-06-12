package com.kh.file;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamTest
{
	/*
	 * 바이트 기반 스트림
	 * - 데이터를 바이트(byte) 단위로 주고 받는다.
	 * - 그림, 멀티미디어 등의 바이너리 데이터를 읽고 출력할 때 사용함
	 * - InputStream, OutputStream : 바이트 기반 입출력 스트림의 최상위 클래스.
	 * 
	 * 바이트 보조 스트림
	 * - 스트림의 기능을 향상 시키거나 새로운 기능을 추가하기 위해 사용함
	 * - 독립적으로 입출력 실행 불가능함.
	 * */

	// 바이너리 데이터(이미지 파일)를 읽어서 파일로 출력하는 로직 ~
	public static void main(String[] args)
	{
		String fileName = "src/bird.jpg";
		String outfileName = "src/bird_output.jpg";
		
		DataInputStream dis = null;
		DataOutputStream dos = null;
		
		try 
		{
			// 기반 스트림 먼저 생성
			// FileInputStream, FileOutputStream > 파일의 입출력
			FileInputStream fis = new FileInputStream(fileName);
			FileOutputStream fos = new FileOutputStream(outfileName);
			
			
			// 기반 스트림을 이용해서 보조 스트림 만들기
			dis = new DataInputStream(fis);
			dos = new DataOutputStream(fos);
			
			
			// 데이터를 읽어서 출력
			int data = 0;    
			while((data = dis.read()) != -1)
			{
				dos.write(data);
			}
			
			
		} 
		catch (EOFException e)
		{// 입력 도중 예상외 파일 종료 예외;
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				dis.close();
				dos.close();
			}
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}

}
