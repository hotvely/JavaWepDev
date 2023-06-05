package com.kh.list;

import java.util.*;

/*
 * vector
 * - 동기화된 (synchronized) 메서드로 구현됨
 * - 멀티 쓰레드 관련 자료구조
 * 
 * stack
 * - 마지막에 저장한 것을 제일 먼저 꺼내는 LIFO(Last in First out)
 * 
 * queue
 * -처음에 저장한 것을 제일 먼저 꺼내는 FIFO (First in First out)
 * 
 * */

public class B_Other 
{
	public static void main(String[] args) {
		B_Other b = new B_Other();
		b.method2();
		
		
	}
	
	
	public void method1()
	{
		Vector<Integer> v = new Vector<>();
		v.add(0);
		v.add(1);
		
		v.trimToSize();
		
		
		
		v.add(3);
		v.add(4);
		v.ensureCapacity(3);		//capacity
		
		v.setSize(10);
		v.clear();
		v = null;
		System.out.println(v);
//		System.out.println("size : " + v.size());
//		System.out.println("capacity : " + v.capacity());

		
	}
	
	public void method2()
	{
		Stack<Integer> st = new Stack<>();
		st.push(5);
		st.push(4);
		st.push(3);
		st.push(2);
		st.push(1);
		st.push(0);
		System.out.println(st.size());
		for(int i  = 0 ;i<6; i++)
		{
			System.out.println(st.pop());
		}

//		Integer a = st.pop();
//		System.out.println(a);
		System.out.println(st);
		
	}
	
	public void method3() {
		Queue q = new LinkedList();
		q.offer(0);
		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.poll();
		q.add(4);
		q.remove();
		q.add(5);
		q.add(6);
		q.add(7);
		q.remove();
		
		System.out.println(q);
	}
	
	
}
