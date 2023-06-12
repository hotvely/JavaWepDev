package com.kh.practice.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.kh.practice.model.Book;

public class BookController {

	String fileName = "src/books.obj";
	// src/books.obj 파일에 저장
	public void fileSave(Book book) {
		
		ObjectOutputStream oos = null;
		
		try
		{
			oos = new ObjectOutputStream(new FileOutputStream(fileName, true));
			oos.writeObject(book);
			oos.flush();
			System.out.println("books.obj 파일에 정보 저장완료");
		}
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
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
				oos.close();
			} 
			catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	// src/books.obj 파일에서 데이터 가져오기
	public List<Book> fileRead() {
		List<Book> tempList = new ArrayList<>();
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try
//		(FileInputStream fis = new FileInputStream(fileName))
		{
			fis = new FileInputStream(fileName);
			
			while(true)
			{
				// while 문 안에서는 ObjectInputStream객체만 생성해 줘야함.;;;;;
				// ㅈㄴ 까다롭네 ㅡㅡ;;
				ois = new ObjectInputStream(fis);
				tempList.add((Book)ois.readObject());
			}
		}
		catch(EOFException e)
		{
			
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				ois.close();
			} 
			catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return tempList;
	}

}
