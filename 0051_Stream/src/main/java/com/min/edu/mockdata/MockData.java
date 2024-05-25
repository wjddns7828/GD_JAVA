package com.min.edu.mockdata;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;

import com.google.common.io.Resources;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.min.edu.beans.Car;
import com.min.edu.beans.Person;
import com.min.edu.beans.PersonDTO;

/*
 * 
 *src/test/resources 에 있는 json파일(Car.json , Person.json)파일을
 *JSON 객체로 만들어 줌
 *JSON -> JAVA객체로 만들어줌 
 *
 */
public class MockData {
	
	@SuppressWarnings("serial")
	public static List<Person> getPeople() throws IOException{
		//Json파일을 읽어서 0101..데이터로 읽어 메모리에 할당함
		InputStream inputStream = Resources.getResource("people.json").openStream();
		String json = IOUtils.toString(inputStream,StandardCharsets.UTF_8);
		Type listType = new TypeToken<ArrayList<Person>>() {}.getType();
		System.out.println(listType);
		return new Gson().fromJson(json, listType);
	}
	@SuppressWarnings("serial")
	public static List<Car> getCar() throws IOException{
		//Json파일을 읽어서 0101..데이터로 읽어 메모리에 할당함
		InputStream inputStream = Resources.getResource("cars.json").openStream();
		String json = IOUtils.toString(inputStream,StandardCharsets.UTF_8);
		Type listType = new TypeToken<ArrayList<Car>>() {}.getType();
		System.out.println(listType);
		return new Gson().fromJson(json, listType);
	}	
}
