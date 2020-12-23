package greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class _YQueueReconstructionByHeigth {

	public static int[][] reconstructQueue(int[][] people) {

		Arrays.sort(people, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) { 
				return o1[0] != o2[0] ? -o1[0] + o2[0] : o1[1] - o2[1]; 
			} 
		});  

		List<int[]> res = new LinkedList<>();

		for (int[] cur : people) { 
			res.add(cur[1], cur); 
		} 
		
		return res.toArray(new int[people.length][]);
	}
	
	public static void main(String[] args) {
		
		int[][] people = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
		System.out.println(Arrays.deepToString(reconstructQueue(people)));
	}
}

/*
 * Suppose you have a random list of people standing in a queue. Each
 * person is described by a pair of integers (h, k), where h is the height of
 * the person and k is the NUMBER OF PEOPLE IN FRONT OF THIS PERSON WHO HAVE A
 * HEIGHT GREATER THAN OR EQUAL TO H. Write an algorithm to reconstruct the
 * queue.
 * 
 * Note: The number of people is less than 1,100.
 * 
 * Example
 * 
 * Input: [[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
 * Output: [[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
 * 
 * E.g. 
 * input: [[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]] 
 * subArray after step 1: [[7,0], [7,1]] 
 * subArray after step 2: [[7,0], [6,1], [7,1]] ... 
 * 
 */
