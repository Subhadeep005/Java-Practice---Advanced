package com.java.tech.string.program;

public class MaximumOccuranceOfCharacter {

	static final int ASCII_SIZE = 256;

	static char getMaxOccurringChar(String str) {

		int count[] = new int[ASCII_SIZE];

		// Construct character count array from the input string.
		int len = str.length();
		for (int i = 0; i < len; i++)
			count[str.charAt(i)] ++;
		int max = -1;  // Initialize max count
        char result = ' ';   // Initialize result
      
        // Traversing through the string and maintaining the count of each character
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
      
        return result;
	}

	public static void main(String[] args) {

		String str = "sample string";
		System.out.println("Max occurring character is " + getMaxOccurringChar(str));

	}

}
