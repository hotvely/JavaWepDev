package com.kh.map;

import java.util.*;
import java.util.Map.*;
import com.kh.map.model.*;

/*
 * Map
 * - key - value 쌍으로 저장
 * - 순서 X
 * - 중복 : 값(중복값 OK) 키(중복X)
 * 
 * hashMap
 * - map 인터페이스를 구현한 대표적인 컬렉션 클래스
 * 
 * 
 * 
 * */
public class A_HashMap {

	public static void main(String[] args) 
	{
		A_HashMap a = new A_HashMap();
		a.method2();
		
		
	}

	
	public void method1()
	{
		Map<String, Integer> map = new HashMap<>();
		
		map.put("빈 디젤", 90);
		map.put("제이슨 모모아", 100);
		map.put("제이슨 스타뎀", 90);
		map.put("미셸 로드리게즈", 85);
		
		System.out.println(map);
		System.out.println(map.get("빈 디젤"));
		// 1. Key만 가져오기 : keySet()
		Set<String> key = map.keySet();
		
		// 2. Value만 가져오기
		Collection<Integer> values = map.values();
				
		// 3. Key에 해당하는 value 가져오기
		Iterator<String> iter = key.iterator();
		System.out.println(iter.next());
		
		while(iter.hasNext())
		{
			System.out.println(map.get(iter.next()));
		}
		for(String keyValue : key)
		{
			System.out.println(keyValue + " / " + map.get(keyValue));
		}
		
		// 4. entrySet() : map 컬렉션에 있는 Entry(key,value 로 이루어진 객체)를
		//					set 컬렉션에 담아서 반환해줌;???!?
		
		
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> entry : entrySet)
		{
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		List<Integer> keySetList = new ArrayList<>(map.values());
		Collections.sort(keySetList);
		for(Integer i : keySetList)
		{
			System.out.println(i);
		}
		
//		Collections.sort(keySetList, (o1, o2) -> (map.get(o1).compareTo(map.get(o2))));
//		for(String i : keySetList)
//		{
//			System.out.println(i);
//		}
		
		/*
		 * 총 점
		 * 평 균
		 * 최고점수
		 * 최저점수
		 * 
		 * */
		int total = 0;
		for(String keyValue : key) 
		{
			total += map.get(keyValue);
		}
//		Iterator<Integer> valueIter = map.values().iterator();
//		while(valueIter.hasNext())
//		{
//			total += valueIter.next();			
//		}
		System.out.println("total > " + total);
		
		//-------------------------------------------------------
		
		System.out.println("avg > " +  (double)total / map.size());
		
		//--------------------------------------------------------
		
		System.out.println("최고 점수 > " + Collections.max(values));
		System.out.println("최저 점수 > " + Collections.min(values));
//		List arr = new ArrayList<>(value);
//		Collections.sort(arr);
//		System.out.println("최저 점수 > " + arr.get(0));
//		Collections.reverse(arr);
//		System.out.println("최고 점수 > " + arr.get(0));
		
	}
	
	
	public void method2()
	{
		Map<String, Snack> map = new HashMap<>();		
		{
			map.put("웨하스", new Snack("치즈", 240));
			map.put("웨하스", new Snack("딸기", 255));
			map.put("고래밥", new Snack("양념치킨", 173));
			map.put("자유시간", new Snack("아몬드", 232));
			map.put("칸쵸", new Snack("딸기 요거트", 880));
			map.put("홈런볼", new Snack("초코", 270));
			map.put("스윙칩", new Snack("볶음고추", 347));
			map.put("나쵸", new Snack("치즈", 486));
			map.put("꼬깔콘", new Snack("매콤달콤", 175));
			map.put("후렌치파이", new Snack("딸기", 900));
		}
		
		System.out.println(map);
		System.out.println(map.size());
		
		//key 값
		Snack snack = map.get("웨하스");
		System.out.println(snack);
		
		
		// key값에 해당하는 Entry객체 삭제
		map.remove("꼬깔콘");
		System.out.println(map);
		System.out.println(map.size());
		
		System.out.println("--------------------------------------------------------------");

		// 1. 홈런볼에 해당하는 과자 정보 출력 : snack [flavor = 초코, calorie = 270]
		// 2. 후렌치파이의 맛 정보 출력 : 딸기
		
		
		System.out.println(map.get("홈런볼"));
		System.out.println(map.get("후렌치파이").getFlavor());
		
		// 3. 맛에 딸기가 들어간 과자들의 칼로리 평균?
		int totalCal = 0;
		int count = 0;
		for(String key : map.keySet())
		{
			if(map.get(key).getFlavor().contains("딸기"))
			{
				totalCal += map.get(key).getCalorie();
				count++;
			}
		}
		System.out.println("Calroie avg > " + (double)totalCal / count);
		
		
		System.out.println("--------------------------------------------------------------");
		
	}
	
	
	
}
