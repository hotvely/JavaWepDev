package com.kh.practice2;

import com.kh.practice2.exception.DuplicateNameException;
import com.kh.practice2.exception.RecordNotFoundException;

public class Application {

	public static void main(String[] args) {
		
		try
		{
			throw new DuplicateNameException();
		}
		catch(DuplicateNameException e)
		{
			System.out.println(e.getMessage());
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		try
		{
			throw new RecordNotFoundException();
		}
		catch(RecordNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}

}
