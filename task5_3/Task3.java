package com.task5_3;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
	public static void main(String [] agrs) {
		List<String> names= Arrays.asList("Dilip","Anil","Bhargav","Ajith","Bharath","Eshwar","Akash","Guru","Harsha","Amir");
		 List<String> FilteredNames = names.stream() .filter(name -> name.startsWith("A")).collect(Collectors.toList());
		 System.out.println(FilteredNames);
	
	}
}
