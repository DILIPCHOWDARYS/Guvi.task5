package com.task5_2;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;

public class Task2 {
	public static void main(String [] agrs) {
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "ikl");
		List<String> EmptyStrings = strings.stream().filter(s->!s.isEmpty()).collect(Collectors.toList());
		System.out.println(EmptyStrings);
		
		
	}
}
