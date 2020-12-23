package backTracking;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class _RWordLadderII {

	static Map<String, List<String>> map;
	static List<List<String>> results;

	public static List<List<String>> findLadders(String start, String end, Set<String> dict) {

		results = new ArrayList<>(); 					

		if (dict.size() == 0)
			return results;

		int min = Integer.MAX_VALUE;

		Queue<String> queue = new ArrayDeque<>(); 		
		queue.add(start);

		map = new HashMap<>(); 							

		Map<String, Integer> ladder = new HashMap<>();	

		for (String string : dict)						
			ladder.put(string, Integer.MAX_VALUE);
		ladder.put(start, 0);

		dict.add(end); 									

		while (!queue.isEmpty()) {

			String word = queue.poll(); 
			int step = ladder.get(word) + 1;

			if (step > min)
				break;

			for (int i = 0; i < word.length(); i++) {

				StringBuilder builder = new StringBuilder(word); 

				for (char ch = 'a'; ch <= 'z'; ch++) {
					builder.setCharAt(i, ch);

					String new_word = builder.toString();

					if (ladder.containsKey(new_word)) { 

						if (step > ladder.get(new_word))
							continue;
						else if (step < ladder.get(new_word)) {
							queue.add(new_word); 
							ladder.put(new_word, step); 
						} else
							;

						if (map.containsKey(new_word))
							map.get(new_word).add(word); 

						else {
							List<String> list = new LinkedList<String>();
							list.add(word);
							map.put(new_word, list);
						}

						if (new_word.equals(end))
							min = step;

					} 
				} 
			} 
		} 

		LinkedList<String> result = new LinkedList<>();
		backTrace(end, start, result); 

		return results;
	}

	private static void backTrace(String word, String start, List<String> list) {

		if (word.equals(start)) {
			list.add(0, start);
			results.add(new ArrayList<String>(list));
			list.remove(0);
			return;
		}

		list.add(0, word);

		if (map.get(word) != null)
			for (String s : map.get(word)) 
				backTrace(s, start, list); 
										   
		list.remove(0);
	}

	public static void main(String[] args) {

		String start = "hit";
		String end = "cog";
		Set<String> dict = new HashSet<>();
		dict.add("hot");
		dict.add("dot");
		dict.add("dog");
		dict.add("lot");
		dict.add("log");
		dict.add("cog");

		System.out.println(findLadders(start, end, dict));
	}
}

/*

Given two words (beginWord and endWord), and a dictionary's word list, find the length of shortest transformation sequence from 
beginWord to endWord, such that:

- Only one letter can be changed at a time
- Each transformed word must exist in the word list. Note that beginWord is not a transformed word.

Note:
Return an empty list if there is no such transformation sequence.
All words have the same length
All words contain only lower case alphabetic characters
You may assume no duplicates in the word list
You may assume beginWord and endWord are non-empty and are not the same

For example,

Given:

beginWord = "hit"
endWord = "cog"
wordList = ["hot", "dot", "dog", "lot", "log", "cog"]
return
	[
		["hit", "hot", "dot", "dog", "cog"],
		["hit", "hot", "lot", "log", "cog"]	
	]
	
*/
