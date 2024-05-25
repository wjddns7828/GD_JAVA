package com.min.edu.set;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.google.common.collect.Sets;

public class Set_Feature {
	
	public void set_Check2() {
		Set<String> sets=new HashSet<String>();
		String a = "가", b = "나", c = "다";
		String d = new String("다");
		
		//contains는 hashcode로 검색
		sets.add(a);
		sets.add(b);
		sets.add(c);
		
		//삭제
		System.out.println(sets.size());
		sets.remove(d);
		System.out.println(sets.contains("다"));
		System.out.println(sets.size());
		
		
		//JCF -> Array로 변경
		
//		String[] strArr = (String[])sets.toArray();
//		System.out.println(Arrays.toString(strArr));
		
		Object[] objArr = sets.toArray();
		System.out.println(Arrays.toString(objArr));
		
		for (int i = 0; i< objArr.length; i++) {
			String s = (String) objArr[i];
			System.out.println(i+"."+s);
		}
		
		
		for (Object o : objArr) {
			System.out.println((String)o);
		}
		
		
	}
	public void set_Check() {
		Set<String> sets=new HashSet<String>();
		String a = "가", b = "나", c = "다";
		String d = new String("다");
		
		System.out.println("C의 원래 hashcode"+System.identityHashCode(c));
		System.out.println("D의 원래 hashcode"+System.identityHashCode(d));
		
		sets.add(a);
		sets.add(b);
		sets.add(c);
		sets.add(d); //기존 값 유지합니다.
		//출력은 set의 정의에 의해서 순서가 없다.
		for (String s : sets) {
			System.out.println(s+"/"+System.identityHashCode(s));
		}
		//비교 
		System.out.println(sets.contains("다"));
		System.out.println(sets.contains(d));//D의 주소가 아닌 값으로 판단함
		
		//출력
		//enhanced for << 향상 된 for
		//순서가 없기 때문에 Iterator Design
		Iterator<String> iter =  sets.iterator();
		
		
		while(true) {
		if (iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
			System.out.println(iter.hasNext());
		}else {
			break;
		}
		}
	}
	public void set_Use() {
		Set<Integer> set = new HashSet<Integer>();



		Integer i =(int)(Math.random()*10);

		//		System.out.println(i);
		//		System.out.println(i.hashCode());
		//		System.out.println(System.identityHashCode(i));



		int loopCnt=0;
		while (true) {
			loopCnt++;
			Integer n = (int)(Math.random()*45);
			set.add(n);
			if(set.size()==5) {
				break;
			}
		}//while
		System.out.println("중복되지 않는 set객체 출력");
		System.out.println(set);
		System.out.println("반복 횟수"+loopCnt);
		Integer[] arryI = set.toArray(new Integer[0]);
		System.out.println(arryI);
		System.out.println(Arrays.toString(arryI));

		System.out.println(set.contains(3));

		int[] result = {3,4,6,8,1};
		int succcessCnt = 0;
		for (int j = 0; j < result.length; j++) {
			boolean isc = set.contains(result[j]);
			if(isc == true) {
				succcessCnt++;
			}
		}
		switch (succcessCnt) {
		case 3:
			System.out.println("오늘은 로또를 구입하자");
			break;

		default:
			System.out.println("공부를 열심히 하자");
			break;
		}

		//import / 외부 라이브러리 사용 / package는 라이브러리 개발 2단위 이상
		Set<Integer> inset = Sets.newHashSet();
	}
}
