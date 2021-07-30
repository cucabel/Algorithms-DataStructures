package strings;

import java.util.LinkedList;
import java.util.List;

public class _YLetterCombinationsOfAPhoneNumber { 

	public static List<String> letterCombinations(String digits) {

		LinkedList<String> ans = new LinkedList<>();

		if (digits == null || digits.length() == 0)
			return ans;

		String[] mapping = new String[] { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

		ans.add("");

		for (int i = 0; i < digits.length(); i++) {
			int x = Character.getNumericValue(digits.charAt(i));
			while (ans.peek().length() == i) {
												
				String t = ans.remove();
				for (char s : mapping[x].toCharArray())
					ans.add(t + s);
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		
		String digits = "23";
		System.out.println(letterCombinations(digits));

	}

}

/*
 * Given a digit string, return all possible letter combinations that the
 * number could represent.
 * 
 * A mapping of digit to letters (just like on the telephone buttons) is given below.
 * 
 * Note: Although the above answer is in lexicographical order, your answer
 * could be in any order you want.
 * 
 * Input: Digit string "23" | 2 ABC | 3 DEF
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * 
 */
