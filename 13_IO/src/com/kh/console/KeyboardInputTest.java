package com.kh.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
 * IO (Input Output 입출력)
 * - 입출력
 * - 두 대상간의 데이터를 주고 받는것
 * 
 * Stream (스트림)
 * - 데이터를 운반하는 연결 통로의 역활
 * - 연속적인 데이터 흐름을 물(stream)에 비유
 * - 하나의 스트림으로 입출력을 동시에 수행할 수 없음 (단방향 통신)
 * - 입출력을 동시에 수행하려면, 2개의 스트림이 필요함
 * 
 * */

public class KeyboardInputTest {

	//키보드로 데이터를 읽어서 콘솔로 출력하는 로직
	public static void main(String[] args) 
	{
		// 1. 스트림 생성 > 입력 스트림만.. 필요
		InputStreamReader ir = new InputStreamReader(System.in);	// 기반 스트림
		BufferedReader br = new BufferedReader(ir);		// 보조 스트림
		
		// 2. 읽음 > readLine()
		try 
		{
			String line = br.readLine();
			while(line != null)
			{
				System.out.println("Reading Data > " +  line);
				line = br.readLine();
			}
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				br.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		
		
	}

}
