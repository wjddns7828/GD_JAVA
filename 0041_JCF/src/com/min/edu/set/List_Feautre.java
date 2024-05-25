package com.min.edu.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class List_Feautre {
	public void list_Check() {
		//		lists.add(111);
		//		lists.add(222);
		//		lists.add(333);
		//		
		//		for (int i = 0; i < lists.size(); i++) {
		//			System.out.println(lists.get(i));
		//		}
		List<Integer> lists = 
				new ArrayList<Integer>();

		int n1 = 20, n2=30, n3=40; // 기본타입 ** WrapperClass 해당 기본 타입과 쌍으로 되어 있는 참조 타입.

		//		Integer i = new Integer(10); // 1.8에서는 WrapperClass / 1.9부터는 자동으로 변환 됨 ==> Auto-Boxing, Auto-UnBoxing
		//		int n = i.intValue();

		lists.add(n1);//0
		lists.add(n2);//1
		lists.add(n3);//2
		lists.add(n3);//3

		System.out.println(lists.get(0));//index로만 출력 가능 한다.

		System.out.println(lists);
		n3 = 100;
		System.out.println(lists);

		int n4 =30; //기본타입
		Integer n5 = n4; //참조타입

		//		remove
		//		int n6=3;
		//		System.out.println(lists.remove(n4)); //기본타입이면 인덱스 번호로 인식함 30번 째 인덱스를 삭제해라 라고 해석하면 됨
		//		System.out.println(lists.remove(n6)); //기본타입이면 인덱스 번호로 인식함


		System.out.println(lists.remove(n5)); //
		System.out.println(lists);




	}//Check

	public void list_iterator() {
		List<String> lists = new ArrayList<String>();


		lists.add("A");
		lists.add("B");
		lists.add("C");
		lists.add("D");
		lists.add("E");

		for (int i = 0; i < lists.size(); i++) {
			System.out.println(lists.get(i));
		}

		//제네릭 사용시
		for (String s : lists) {//제네릭 : object
			System.out.println(s);//출력
		}

		//제네릭 미사용시
		for (Object s : lists) {//제네릭 : object
			System.out.println(s);// s ==> ObjectType  ==> toString() 을하면 자동 출력
			String ss = (String) s; // 오브젝트는 다운캐스딩을 잘하자
		}
		Iterator<String> iter = lists.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}//이터레이터

	}
	public void list_contain() {
		List <Integer> lists = new ArrayList<Integer>();
		
		lists.add(10);
		lists.add(100);
		lists.add(1000);
		
		boolean isc = lists.contains(100);
		System.out.println(isc);
		
//		int find = 1000;
		Integer find = 1000;
		boolean iscF = lists.contains(find);
		System.out.println(iscF);
		
		
		lists.clear();//비우기
		System.out.println(lists.size());
		
		List <String> listsString = new ArrayList<String>();
		listsString.add("A");
		listsString.add("B");
		listsString.add("C");
		listsString.add("D");
		listsString.add("E");
		
		System.out.println(listsString.indexOf("B"));
		
		//Array로 변경
		int [] num = {1,2,3,4};
		String[] str = {"JAVA","HTML","DATABASE"};
		List<String> strsList = Arrays.asList(str);
		System.out.println(strsList);
		System.out.println(strsList.getClass());
		
	}

}