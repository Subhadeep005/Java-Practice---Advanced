package com.java.tech.string.program;

import java.util.Arrays;

public class LongestCommonPrefix {

	private String longestCommonPrefix(String[] s) {

		Arrays.sort(s);

		// for (int i = 0; i < s.length; i++) { System.out.print(s[i]+","); }

		int minLen = Math.min(s[0].length(), s[s.length - 1].length());

		int i = 0;
		while (i < minLen && s[0].charAt(i) == s[s.length - 1].charAt(i)) {
			i++;
		}

		String result = s[s.length - 1].substring(0, i);

		return result;
	}

	public static void main(String[] args) {
		LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
		String[] input = { "geeksforgeeks", "geeks", "geek", "geezer" };
		System.out.println("The longest Common Prefix is : " + longestCommonPrefix.longestCommonPrefix(input));
	}

}
