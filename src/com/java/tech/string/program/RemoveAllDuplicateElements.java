package com.java.tech.string.program;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class RemoveAllDuplicateElements {

	public static void removeDuplicate(String str) {
		
		char c[] = str.toCharArray();
		
		HashSet<Character> hashSet = new HashSet<>();
		
		for(Character x : c) {
			hashSet.add(x);
		}
		
		 for (char x : hashSet)
	            System.out.print(x);
	}
	
public static void removeDuplicate1(String str) {
		System.out.println();
		HashSet<String> hashSet = new HashSet<>();
		
		Arrays.stream(str.split("")).filter(x -> hashSet.add(x)).collect(Collectors.toSet()).forEach(System.out::print);
	}
	
	public static void main(String[] args) {
		String str= "geeksforgeeks";
		removeDuplicate(str);
		removeDuplicate1(str);
	}

}
