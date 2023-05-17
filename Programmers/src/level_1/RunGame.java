package level_1;

import java.util.*;

public class RunGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1등부터 현재 등수 순서대로 담긴 문자열 배열 players
		// 해설진이 부른 이름을 담은 문자열 배열 callings
		String[] players = { "mumu", "soe", "poe", "kai", "mine" };
		String[] callings = { "kai", "kai", "mine", "mine" };
		String[] answer = {};
		// players를 list로 변환.
		// List<String> ranking = Arrays.asList(players);
		// players를 hashMap으로 변환 (list로 했더니 시간복잡도 뜸 ㅅㅂ)
		// HashMap<String, Integer> hm = new HashMap<String, Integer>();
		HashMap<String, Integer> hm2 = new HashMap<String, Integer>();

		Integer idx = 0;

		for (String str : players) {
			hm2.put(str, idx);
			idx++;
		}

		// call배열의 0번째 부터 하나씩 옮겨보자 ~
//		rg.changeRank(ranking, call);			
//		rg.changeRank(hm2, call);	
		for (String currentName : callings) {
			// 내 등수 호출
			int myRank = hm2.get(currentName);

			String beforeName = players[myRank - 1];

			players[myRank - 1] = currentName;
			players[myRank] = beforeName;

			hm2.put(currentName, myRank - 1);
			hm2.put(beforeName, myRank);

		}

		answer = players;

//		
		for (String str : answer) {
			System.out.print(str + " ");
		}

	}

//	public void changeRank(List<String> ranking, String[] calls) {
//		// 기존 ranking에 내가 찾고자하는 name이 존재 하는지? 몇번째인지? 있다면 Collections.swap함수 이용해서
//		for (String name : calls) {
//			int idx = ranking.indexOf(name);
//			if (idx != 0)
//				Collections.swap(ranking, idx, idx - 1);
//		}
//	}

//	public void changeRank(HashMap<Integer, String> ranking, String[] calls) {
//		// 기존 ranking에 내가 찾고자하는 name이 존재 하는지? 몇번째인지? 있다면 Collections.swap함수 이용해서
//		for (String name : calls) {
//			Integer idx = null;
//			for (Integer key : ranking.keySet()) {
//				if (name.equals(ranking.get(key))) {
//					idx = key;
//				}
//			}
//
//			if (idx != null)
//				continue;
//			idx = getKey(ranking, name);
//			String tempName = ranking.get(idx - 1);
//
//			ranking.put(idx - 1, name);
//			ranking.put(idx, tempName);
//
//		}
//	}

//	public static <K, V> K getKey(Map<K, V> map, V value) {
//		// 찾을 hashmap 과 주어진 단서 value
//		for (K key : map.keySet()) {
//			if (value.equals(map.get(key))) {
//				return key;
//			}
//		}
//		return null;
//	}

}
