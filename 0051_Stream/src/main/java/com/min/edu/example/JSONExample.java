package com.min.edu.example;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/*
 * Json은 키와 값으로 구성되어있는 문자열이다
 * 파일 혹은 문자열의 Json구조를 쉽게 선택하거나 탐색하기 쉽도록 JSON객체로 만든다.<==> JCF객체와 호환됨
 * {"키1":"값1"}, {"키2" : "값2","키3","값3"}.....반복 } ==>JsonObject
 * {"키",[{"ID":"값1"},{"ID":"값2"},{"ID":"값3"}]}==>JSON Array
 * 
 */

public class JSONExample {
	public static void main(String[] args) {
		String json = "{\"name\":\"산군\",\"address\":\"흰산\"}";
		System.out.println("String like json"+json);
		
		Gson gObj = new Gson();
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "산군");
		map.put("address", "흰산");
		
		//MAP to JSON
		String jsonMap = gObj.toJson(map);
		System.out.println("Map 객체를 Json형태의 문자열로 변경"+jsonMap);
		
		//JSON to Map
		Map mapjson = gObj.fromJson(jsonMap, Map.class);
		System.out.println("JSON 문자열을 Map으로 바꿔준것"+mapjson.toString());
		
		
		//JSON 객체를 생성하는 방법
		//MAP을 통해서 라이브러리(Library)를 사용하고 JSON String으로 변경
		//MAP => Library => JSON String
		JsonObject obj = new JsonObject();
		obj.addProperty("name", "녹치");
		obj.addProperty("id", "nokchi");
		obj.addProperty("password", "단약");
		obj.addProperty("age", "100");
		
		System.out.println("JsonObject로 작성" + obj);
		
		//String 형태의 json이던, json파일을 읽어오던 일단 사용해야함 
		//Json객체의 내부값을 가져오는 방법
		//타입에 따라서 가져왜야함
		JsonElement ele = obj.get("name");
		System.out.println(ele.toString());
		
		System.out.println("JSON String :"+obj.get("name").getAsString());
		System.out.println("JSON Integer :"+obj.get("age").getAsInt());
		
		
		//JSON Array
		JsonObject book1 = new JsonObject();
		book1.addProperty("name", "자바의 정석");
		book1.addProperty("publisher", "한빛 미디어");
		book1.addProperty("price", "38000");
		
		JsonObject book2 = new JsonObject();
		book2.addProperty("name", "오라클");
		book2.addProperty("publisher", "오라클");
		book2.addProperty("price", "28000");
		
		
		
		JsonArray bookStore = new JsonArray();
		bookStore.add(book1);
		bookStore.add(book2);
		
		JsonObject shop = new JsonObject();
		
		shop.add("shop",bookStore);
		System.out.println(shop.toString());
		JsonElement ele2 = shop.get("shop");
		JsonArray jArr = ele2.getAsJsonArray();
		System.out.println(jArr.get(0).getAsJsonObject().get("name").getAsString());
//		System.out.println(bookStore.toString());
//		System.out.println(book1.toString());
//		System.out.println(book2.toString());
		
		
	}			
}
