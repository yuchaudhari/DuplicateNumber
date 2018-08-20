package com.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CountDuplicate {
	public static Set<Integer> findMax(Integer arr[]){  
		
		Set<Integer> allItems = new HashSet();
		Set<Integer> duplicates = Arrays.stream(arr)
		        .filter(n -> !allItems.add(n)) 
		        .collect(Collectors.toSet());
		System.out.println(duplicates);
        return duplicates;  
    }  
}
