package divideAndConquer;

public class _GReverseString {

	public static String reverseString(String s) {
		
		int length = s.length();

		if (length <= 1)
			return s;

		String leftStr = s.substring(0, length / 2); 
		String rightStr = s.substring(length / 2, length); 

		return reverseString(rightStr) + reverseString(leftStr); 
	}

	public static void main(String[] args) {

		String s = "hello";
		System.out.println(reverseString(s));
	}
}

/*
 * Write a function that takes a string as input and returns the string reversed.
 * 
 * Example: Given s = "hello", return "olleh".
 * 
 */
