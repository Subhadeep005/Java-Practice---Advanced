package com.java.tech.string.program;

import java.util.HashSet;

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
	
	public static void main(String[] args) {
		String str= "geeksforgeeks";
		removeDuplicate(str);
	}

}
