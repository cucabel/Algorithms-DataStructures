package hashing;

import java.util.HashSet;

public class _GLongestPalindrome {

	public static int longestPalindrome(String s) {							
																			
		if (s == null || s.length() == 0)									
			return 0;														

		HashSet<Character> hs = new HashSet<Character>();
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (hs.contains(s.charAt(i))) {			
				hs.remove(s.charAt(i));				
				count++;
			} else {								
				hs.add(s.charAt(i));
			}
		}

		if (!hs.isEmpty())										
			return count * 2 + 1;					
		
		return count * 2;							
	}
	
	public static void main(String[] args) {
		
		System.out.println(longestPalindrome("abccccdd"));
		
	}
}

/*
 * Given a string which consists of lowerCase or upperCase letters, find
 * the length of the longest palindrome that can be built with those letters.
 * Palindrome: reads the same backwards as forwards
 * 
 * This is case sensitive, for example "Aa" is not considered a palindrome here.
 * 
 * Note: Assume the length of given string will not exceed 1,010.
 * 
 * Example: 
 * Input: "abccccdd" 
 * Output: 7 
 * Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
 * 
 */
