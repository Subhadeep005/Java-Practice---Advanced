package com.java.tech.string.program;

public class LongestSubString {

	public static int longestUniqueSubsttr(String str) {
		int maxLength = 0;
		String st = "";

		if (str.length() == 0)
			return 0;

		else if (str.length() == 1)
			return 1;
		else {

			for (char ch : str.toCharArray()) {
				if (st.contains(str.valueOf(ch))) {
					st = st.substring(str.indexOf(ch) + 1);
				}
				st = st + str.valueOf(ch);
				maxLength = Math.max(st.length(), maxLength);
			}
		}

		return maxLength;
	}

	// Driver code
	public static void main(String[] args) {
		String str = "geeksforgeeks";
		System.out.println("The input string is " + str);

		int len = longestUniqueSubsttr(str);
		System.out.println("The length of the longest " + "non-repeating character " + "substring is " + len);
	}
}
