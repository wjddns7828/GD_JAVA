package com.min.edu.example;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class DistinctStream {
	
	@Test
	public void distinctWithList() {
		List<Integer> nums = List.of(1,1,2,2,2,3,3,3,3,4,4,4,4,4,5,5,5,5,5,6,6,6,6,7,7,7,8,8,8,9,9,9);
		
		//중복 제거
		List<Integer> distinctNum = nums.stream().distinct().collect(Collectors.toList());
//		System.out.println(distinctNum);
		assertThat(distinctNum).hasSize(9);
		
	}
	@Test
	public void distincWithSet() {
		List<Integer> nums = List.of(1,1,2,2,2,3,3,3,3,4,4,4,4,4,5,5,5,5,5,6,6,6,6,7,7,7,8,8,8,9,9,9);
		Set<Integer> distinctSet = nums.stream().collect(Collectors.toSet());
		System.out.println(distinctSet);
	}
}
