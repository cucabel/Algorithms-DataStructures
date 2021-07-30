package strings;

import java.util.Stack;

public class _GValidParentheses {
	
	public static boolean isValid(String s) {
		
		Stack<Character> stack = new Stack<>();
		
		for (char c : s.toCharArray()) { 
			if (c == '(')				 
				stack.push(')');		 
			else if (c == '{') 
				stack.push('}');
			else if (c == '[') 
				stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c) 
				return false;
			}
		return stack.isEmpty(); 
	}
	
	public static void main(String[] args) {
		
		String s = "())";
		System.out.println(isValid(s));
	
	}

}

/*
 * Given a string containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid
 * but "(]" and "([)]" are not
 * 
 * 					| | 
 * 			( ( ) ( ( ) ) ( ) ) 
 * 			| 				  | 
 * 
 */
