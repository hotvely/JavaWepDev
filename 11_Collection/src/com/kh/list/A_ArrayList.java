package com.kh.list;

import com.kh.list.model.*;

import java.util.*;

public class A_ArrayList
{
	public static void main(String[] args) {
		A_ArrayList app = new A_ArrayList();
		app.method2();
		
		
	}
	
	public void method1()
	{
		List list = new ArrayList();
		list.add("멍멍이");
		list.add("멍뭉이");
		list.add("멍뭉이");
		list.add("고양이");
		list.add("고냥이");
		
		System.out.println(list);
		
	}
	
	public void method2()
	{
		/*
		 * 제네릭  generic
		 * 
		 * - 컴파일 시 타입 체크해 주는 기능
		 * - <> 다이아몬드 연산자 사용ㅎ;
		 * 
		 *  
		 * 컬렉션에서 사용하는 이유
		 * - 명시된 타입의 객체만 저장하도록 제한 두기 위해 사용함
		 * - 컬렉션에 저장된 객체를 꺼내서 사용할 때 매번 형변환을 하지 않아도 됨
		 * 
		 * 
		 * */
		
		ArrayList<Person> list = new ArrayList<>();
		
		
//		1. add(E e) : 리스트 끝에 추가
		list.add(new Person("멍멍이","지붕달린하얀집", 10));
		list.add(new Person("고양이","역삼역3번출구 옆길", 3));
		list.add(new Person("남궁민", "서울숲", 45));
		list.add(new Person("이시언", "상도", 40));
		list.add(new Person("이제훈", "서울숲", 38));
		
//		2. add(int index, E e) : 인덱스를 지정해서 해당 인덱스에 추가
		list.add(0, new Person("호랭이", "지리산꼭대기", 100));
		list.add(3, new Person("판다","중국길림성", 12));
		
//		3. set(int index, E e) : 인덱스값에 지정해서 데이터 값 변경
		list.set(0, new Person("호랭이변경","지리산중턱",99));
		
//		4. size() : 리스트 안에 몇개의 데이터가 있는지?
		System.out.println("list안에 사람수는 : " + list.size());

//		5. remove(int index) : 해당 인덱스 객체 삭제
		System.out.println(list.remove(0) + "삭제");
		
//		6. get(int index) : 해당 인덱스로 객체 가져오기
		System.out.println(list.get(3));

//		7. subList(int index1, int index2) : 추출해서 새로운 list로 반환
		List sub = list.subList(0, 2);
		System.out.println(sub);
		
//		8. addAll(Collection c) : 컬렉션을 통채로 뒤에 추가하는 메서드
		list.addAll(sub);
		
//		9. isEmpty() : 컬렉션이 비어있는지 체크
		ArrayList<Person> list2 = new ArrayList<>();
		System.out.println(list2.isEmpty());
		
		
		//리스트에 저장된 사람 평균 연령 출력
		System.out.println("===========평균 연령?===========");
		int total = 0;
		for(Person p : list)
		{
			total += p.getAge();
		}
		System.out.println(total / list.size());

		// 저장된 사람들의 이름만 출력
		System.out.println("===========list에 저장된 사람===========");
		for(Person p : list)
		{
			System.out.println(p.getName());
		}
		
		// 서울숲에 사는 사람들만 출력
		System.out.println("===========서울숲 사는 사람들 출력===========");
		for(Person p : list)
		{
			if(p.getAddr().equals("서울숲"))
			{
				System.out.println(p.getName());
			}
		}
		
		//나이 순으로 정렬 -> 이름?
		Collections.sort(list);
		System.out.println(list);
		
		
//		10. clear() : list 전체를 null로 초기화
		System.out.println(list);
		System.out.println(list.isEmpty());
		list.clear();
		System.out.println(list);
		
		if(list.isEmpty() == true)
		{
			return;
		}
		
	}
	
	
	public void method3()
	{
//		11. indexOf(Object o) : 해당 객체가 위치하는 인덱스 값 반환해줌
		List<String> list = new ArrayList<>();
		list.add("banana");
		list.add("apple");
		list.add("orange");
		list.add("mango");
		list.add("graph");
		
		System.out.println(list.indexOf("apple"));
		
//		12. sort (오름차순)
		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);		// 원래 reverse 는 뒤에서부터 역순 정렬인데,, 내림차순정렬 하려면 오름차순 정렬후 역순 뽑아주믄 댐
		System.out.println(list);
		
		
		
	}
	
	
	
}