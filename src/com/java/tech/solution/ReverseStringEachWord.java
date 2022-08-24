package com.java.tech.solution;

public class ReverseStringEachWord {

	public static void main(String[] args) {

		System.out.println(StringFormatter.reverseWord("my name is khan"));
		System.out.println(StringFormatter.reverseWord("I am sonoo jaiswal"));

	}

}

class StringFormatter {
	public static String reverseWord(String string) {
		
		StringBuilder str = new StringBuilder(string);
		String reverseString = str.reverse().toString();
		
		/*
		 * String words[]=reverseString.split("\\s"); String reverseWord=""; for(String
		 * w:words){ StringBuilder sb=new StringBuilder(w); sb.reverse();
		 * reverseWord+=sb.toString()+" "; } return reverseWord.trim();
		 */
		return reverseString.trim();
	}
}