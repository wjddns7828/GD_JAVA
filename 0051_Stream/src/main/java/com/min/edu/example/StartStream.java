package com.min.edu.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Filter;
import java.util.stream.Collectors;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.min.edu.beans.Person;
import com.min.edu.mockdata.MockData;

public class StartStream {
	
	
//	@Test
	@DisplayName("예전 처리방식 테스트 함")
	public void oldApproch() throws IOException {
		//1. 사람들 중에서(People.Json) 검색 
		//2. 나이는 18세 이하 10명만 출력
		
		List<Person> people =  MockData.getPeople();//peopleJson에서 자바 객체로 변환 해줌
		System.out.println(people);
		List<Person> choicePeople = new ArrayList<Person>();
		
		int limit = 10;
		int cnt = 0;
		
		for (Person person : people) {
			if(person.getAge()<18) {
				choicePeople.add(person);
				cnt++;
			}
			if(cnt == limit) {
				break;
			}
		}//for
		
		//메소드를 참조
		choicePeople.forEach(System.out::println);	
	}
	@Test
	public void newApprochStream() throws IOException {
		List<Person> people =  MockData.getPeople();
		//1.people의 리스트를 Stream으로 만든다.
		//
		List<Person> choicePeople = people.stream().
				filter(p->p.getAge()<=18).//2. 중간 판단연산자를 작성
				limit(10).//3. 중간 갯수제한을 작성한ㄷ
				collect(Collectors.toList());
				choicePeople.forEach(System.out::println);
	}	
	
	//list에 문자열 중에서 한개 같은 문자열을 찾아서 만들고 싶다
	public List<String> find(List<String> member,String str){
		List<String> result = new ArrayList<String>();
		for (String s : member) {
			if(s.equals(str)) {
				result.add(s);
			}
		}
		return result;
	}
	
	public List<String> findStream(List<String> member,String str){
		return member.stream().filter(mem->member.equals(str)).collect(Collectors.toList());
	}
}
