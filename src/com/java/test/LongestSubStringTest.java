package com.java.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.java.tech.string.program.LongestSubString;


class LongestSubStringTest {
	
	LongestSubString longestSubString = new LongestSubString();

	@Test
	void testLongestUniqueSubsttr() {
		//assertEquals(7, longestSubString.longestUniqueSubsttr("geeksforgeeks"));
		
		if(8 > longestSubString.longestUniqueSubsttr("geeksforgeeks"))
			fail("Test fail");
	}

}
