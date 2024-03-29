package strings;

import java.util.Arrays;

public class _GLongestCommonPrefix {

	public static String longestCommonPrefix(String[] strs) { 
		StringBuilder result = new StringBuilder(); 

		if (strs != null && strs.length > 0) {

			Arrays.sort(strs); 

			char[] a = strs[0].toCharArray();
			char[] b = strs[strs.length - 1].toCharArray();

			for (int i = 0; i < a.length; i++) {
				if (b.length > i && b[i] == a[i]) {
					result.append(b[i]);
				} else {
					return result.toString(); 
				}							  
			}
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		
		String[] strs = {"aaa", "aab", "ab", "aa"};
		
		System.out.println(longestCommonPrefix(strs)); 
		
	}

}

/*
 * Write a function to find the longest common prefix string amongst an
 * array of strings.
 * 
 */
