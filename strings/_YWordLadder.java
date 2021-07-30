package strings;

import java.util.HashSet;
import java.util.Set;

public class _YWordLadder { 

	public static int ladderLenght(String beginWord, String endWord, Set<String> wordDict) {

		Set<String> reached = new HashSet<>();
		reached.add(beginWord);
		wordDict.add(endWord);

		int distance = 1;

		while (!reached.contains(endWord)) {

			Set<String> toAdd = new HashSet<>(); 

			for (String each : reached) {
				for (int i = 0; i < each.length(); i++) {

					char[] chars = each.toCharArray();

					for (char ch = 'a'; ch <= 'z'; ch++) {

						chars[i] = ch;
						String word = new String(chars);

						if (wordDict.contains(word)) {
							toAdd.add(word);
							wordDict.remove(word);
						}
					}

				}
			}

			distance++;

			if (toAdd.size() == 0)
				return 0;

			reached = toAdd;
		}
		return distance;
	}

	public static void main(String[] args) {
		
		 String beginWord = "hit";
		 String endWord = "cog";
		 Set<String> wordDict = new HashSet<>();
		 wordDict.add("hot");
		 wordDict.add("dot");
		 wordDict.add("dog");
		 wordDict.add("lot");
		 wordDict.add("log");
		 wordDict.add("cog");
		 		 
		 System.out.println(ladderLenght(beginWord, endWord, wordDict));

	}

}

/* 
 * Given two words (beginWord and endWord), and a dictionary's word list, find
 * the length of shortest transformation sequence from beginWord to endWord,
 * such that:
 * 
 * - Only one letter can be changed at a time 
 * - Each transformed word must exist in the word list. 
 * Note: that beginWord is not a transformed word.
 * 
 * Note: 
 * Return an empty list if there is no such transformation sequence. 
 * All words have the same length 
 * All words contain only lower case alphabetic characters 
 * You may assume no duplicates in the word list 
 * You may assume beginWord and endWord are non-empty and are not the same
 * 
 * For example,
 * 
 * Given:
 * 
 * beginWord = "hit" 
 * endWord = "cog" 
 * wordList = ["hot", "dot", "dog", "lot", "log", "cog"] 
 * As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog" 
 * return its length
 * 
 */
