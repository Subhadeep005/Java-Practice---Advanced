package com.java.tech.string.program;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class PrintDuplicateCharacterFromString {
	
public static void printDuplicate(String str) {
		
		char c[] = str.toCharArray();
		
		HashSet<Character> hashSet = new HashSet<>();
		HashSet<Character> hashSet1 = new HashSet<>();
		
		for(Character x : c) {
			if(!(hashSet.add(x)))
				//System.out.print(x);
				hashSet1.add(x);
		}
		for (char x : hashSet1)
            System.out.print(x);
	            
	}

public static void printDuplicate1(String str) {
	System.out.println();
	HashSet<String> hashSet = new HashSet<>();
	
	Arrays.stream(str.split("")).filter(x -> !(hashSet.add(x))).collect(Collectors.toSet()).forEach(System.out::print);
}

	public static void main(String[] args) {
		String str= "geeksforgeeks";
		printDuplicate(str);
		printDuplicate1(str);
	}

}
