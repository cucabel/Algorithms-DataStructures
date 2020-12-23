package sorting;

public class _GValidAnagram {

		public static boolean isAnagram(String s, String t) {

			int[] alphabet = new int[26];

			for (int i = 0; i < s.length(); i++)
				alphabet[s.charAt(i) - 'a']++; 
			
			for (int i = 0; i < t.length(); i++)
				alphabet[t.charAt(i) - 'a']--;

			for (int i : alphabet)
				if (i != 0)
					return false;

			return true;
		}

		public static void main(String[] args) {
			
			String s = "anagram", t = "nagaram";
			System.out.println(isAnagram(s, t));
		}
}

/*
 * Given two strings s and t, write a function to determine if t is an
 * anagram of s. an anagram occurs when a word can be transformed in other 
 * one changing the order of the letters
 * 
 * For example, 
 * s = "anagram", t = "nagaram", return true. 
 * s = "rat", t = "car", return false.
 * 
 * Note: You may assume the string contains only lowercase alphabets.
 * 
 */
