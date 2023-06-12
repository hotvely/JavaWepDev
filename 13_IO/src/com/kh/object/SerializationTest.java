package com.kh.object;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.*;

import com.kh.object.model.Person;

public class SerializationTest {

	public static void main(String[] args) {
		SerializationTest s = new SerializationTest();
//		
//		s.fileSave();
//		s.fileRead();
//		
		s.objectsSave();
		s.objectsRead();
	}
	
	// 직렬화( serialization ) > 객체를 데이터 스트림으로 만드는것;
	public void fileSave()
	{
		String fileName = "src/person.obj";
		ObjectOutputStream oos = null;
		
		try 
		{
			// 1. stream 생성
			// FileOutputStream > 파일 출력에 사용되는 기본 바이트 스트림 클래스
			// ObjectOutputStream > 객체 단위로 출력 시에 사용되는 보조 바이트 스트림 클래스
			oos = new ObjectOutputStream(new FileOutputStream(fileName, true));

			
			// 2. file에 저장할 객체 생성
			Person p = new Person("제니", 27, "jennierubyjane");
		
			
			// 3. 데이터 날림
			oos.writeObject(p);
			System.out.println("person.obj 파일에 정보 저장");
			
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
	
	// 역직렬화 ( deserialization ) > 저장된 내용이나 전송받은 내용을 다시 복원 하는 것
	public void fileRead()
	{
		// FileInputStrea > 파일로 부터 데이터를 읽어 들이기 위해 사용하는 기본 바이트 스트림 클래스
		// ObjectInputStream > 스트림으로 부터 객체 단위로 읽기 위해 사용되는 보조 바이트 스트림 클래스
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/person.obj")))
		{
			Person p = (Person)ois.readObject();
			System.out.println(p);
			
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	// 여러개의 객체 저장
	public void objectsSave()
	{
		List<Person> list = Arrays.asList(
				new Person("제니", 27,"jennierubyjane"),
				new Person("지수", 28, "sooyaa___"),
				new Person("로제", 26, "roses_are_rosie"),
				new Person("뷔", 27, "thv"),
				new Person("지민", 27,"j.m"));
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/objects.obj"))) 
		{
			for(Person person : list) 
			{
				oos.writeObject(person);
			}
			System.out.println("objects.obj파일에 정보 저장");
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
	}
	
	
	public void objectsRead()
	{
		// FileInputStrea > 파일로 부터 데이터를 읽어 들이기 위해 사용하는 기본 바이트 스트림 클래스
		// ObjectInputStream > 스트림으로 부터 객체 단위로 읽기 위해 사용되는 보조 바이트 스트림 클래스
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/objects.obj")))
		{
			while(true)
			{
				System.out.println(ois.readObject());
			}
		} 
		catch (EOFException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
