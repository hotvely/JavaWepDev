package com.kh.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 문자 기반 스트림
 * - 문자 데이터를 읽고 출력할 때 사용함
 * - Reader, Writer > 문자 기반 입출력 스트림의 최상위 클래스
 * 
 * */
class test
{
	String str;
	int number;
	
	public test() {}
	public test(String str, int number) {this.str = str; this.number = number;}
	
}
public class FileReadingTest {

	/*
	 * 
	 * */
	String fileName = "src/test.txt";
	String outfileName = "src/result.txt";
	
	public static void main(String[] args) 
	{
		FileReadingTest f = new FileReadingTest();

		f.fileSave();
//		f.fileRead();
		
//		f.method1();
		f.method3();
		
		
	}

	public void fileSave()
	{
		test t = new test("gjtgjt", 10);
		// try - with - resource 구문..?? -> 사용한 리소스를 자동으로 close() 해줌;
		// FileWriter > 파일을 생성하고 데이터를 문자 단위로 저장
		try (FileWriter fw = new FileWriter(fileName))
		{
			fw.write("IO Stream test ing...\n");
			fw.write("is okay?");
			fw.write("음.. 객체 데이터 넘기고 싶은딩 ㅠ\n");
			
			fw.flush(); 		// 강제로 자료 출력..
			
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public void fileRead()
	{
		//FileReader 를 이용해서 파일에서 데이터를 문자 단위로 읽어올 예정
		try(FileReader fr = new FileReader(fileName))
		{
				int data = 0;
				while((data = fr.read()) != -1)
				{
					// 문자단위로 받아옴;;
					System.out.print((char)data);
				}
			
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 파일에 있는 내용을 읽어서 한 줄 단위로 콘솔에 출력하는 로직
	public void method1()
	{
//		BufferedReader > 버퍼는 데이터가 쌓이기를 기다렸다가 꽉 차게 되면 데이터를 전송함
		try(BufferedReader br = new BufferedReader(new FileReader(fileName)))
		{
			String line = "";
			while((line = br.readLine()) != null)
			{
				System.out.println(line);
			}

			
			br.close();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	// 파일에 있는 내용을 읽어서 또 다른 파일로 출력하는 로직
	public void method2()
	{
		/*
		 * BufferedReader, BufferedWriter 
		 * > 입출력 효율을 높이기 위해 버퍼를 사용하는 보조 스트림
		 * - 라인(line) 단위로 입출력이 편리해짐
		 * - String readLine() > 한 라인만 읽음 (BufferedReader 내부 함수)
		 * - void newLine() > 라인 구분자(개행문자)를 출력함 (BufferedWriter 내부 함수) 
		 * 
		 * 
		 * */
		BufferedWriter bw = null;
		BufferedReader br = null;
		
		try 
		{
			br = new BufferedReader(new FileReader(fileName));
			bw = new BufferedWriter(new FileWriter(outfileName, true));
			
			String line = "";
			while((line = br.readLine()) != null)
			{
				bw.write(line);
				bw.newLine();
			}
			
			
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				bw.close();
				br.close();
			}
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		
	}
	
	// 파일에 있는 내용을 읽어서 또다른 파일로 출력하는 로직
	public void method3()
	{
		BufferedReader br = null;
		
		/*
		 * PrintWriter > 프린터와 유사하게 출력하는 print(), println()
		 * 				 메서드를 가지고 있는 보조 스트림
		 * */
		PrintWriter pw = null;
		
		try {
			br = new BufferedReader(new FileReader(fileName));
			pw = new PrintWriter(new FileWriter(outfileName, true), true);
			
			String line = "";
			while((line = br.readLine()) != null)
			{
				pw.println(line);
			}
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				br.close();
				pw.close();
			} 
			catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
	}
	
	
}
