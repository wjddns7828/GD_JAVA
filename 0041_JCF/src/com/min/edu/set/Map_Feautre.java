package com.min.edu.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class Map_Feautre {
	public void map_Check() {
		Map<String, Integer> maps = 
				new HashMap<String, Integer>();
		//Key와 Value로 입력해야 한다.
		//Key는 중복 안됨, value는 중복가능
		//Key가 중복된 값이 있다면? Value의 처리는?
		
		maps.put("가", 10);
		maps.put("나", 20);
		maps.put("다", 30);
		maps.put("라", 40);
		maps.put("마", 50);
		

		System.out.println(maps.get("라"));
		//Key를 알지 못하면 값을 추출 할 수 없음
		System.out.println(maps.get(""));	
	}
	public void map_use() {
		Map<String, Integer> maps = 
				new HashMap<String, Integer>();
		//Key와 Value로 입력해야 한다.
		//Key는 중복 안됨, value는 중복가능
		//Key가 중복된 값이 있다면? Value의 처리는?
		
		maps.put("가", 10);
		maps.put("나", 20);
		maps.put("다", 30);
		maps.put("라", 40);
		maps.put("마", 50);
		maps.put("마", 50);
		
		for (Map.Entry<String, Integer> entry : maps.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key+"/"+val);
		}
		
		String rm = "10";
		Integer rmI = 10;
		
		maps.remove(rm);
		maps.remove(rmI);
		System.out.println(maps);
		System.out.println(maps.remove("마", 50));
		System.out.println(maps);
		System.out.println(maps.containsKey("사"));
		System.out.println(maps.containsKey("가"));
		System.out.println(maps.containsValue(10));
		System.out.println(maps.containsValue(50));
		//출력
		Set<String> keys = maps.keySet();//맵의 키 값들을 모두 set타입으로 만들어 줌
		System.out.println("맵의 키들 ; " +keys);
		Iterator<String> iter =  keys.iterator();
		while (iter.hasNext()) {
			String mapkey = iter.next();
			System.out.println(maps.get(mapkey));
		}		
	}
}
