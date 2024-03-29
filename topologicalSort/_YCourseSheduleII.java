package topologicalSort;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class _YCourseSheduleII { 

	public static int[] findOrder(int numCourses, int[][] prerequisites) {

		int[] incLinkCounts = new int[numCourses];
		List<List<Integer>> adjs = new ArrayList<>(numCourses); 

		int n = incLinkCounts.length;

		while (n-- > 0)
			adjs.add(new ArrayList<>());

		for (int[] edge : prerequisites) {
			incLinkCounts[edge[0]]++;
			adjs.get(edge[1]).add(edge[0]);
		}

		int[] order = new int[incLinkCounts.length];
		Queue<Integer> toVisit = new ArrayDeque<>();

		for (int i = 0; i < incLinkCounts.length; i++) {
			if (incLinkCounts[i] == 0)
				toVisit.offer(i); // add
		}

		int visited = 0;
		while (!toVisit.isEmpty()) {
			int from = toVisit.poll();
			order[visited++] = from; 
			for (int to : adjs.get(from)) {
				incLinkCounts[to]--;
				if (incLinkCounts[to] == 0)
					toVisit.offer(to);
			} 
		} 
		return visited == incLinkCounts.length ? order : new int[0];
	}
	
	public static void main(String[] args) {

		int numCourses = 4;
		int[][] prerequisites = { { 1, 0 }, { 2, 0 }, { 3, 1 }, { 3, 2 } };
		System.out.println(Arrays.toString(findOrder(numCourses, prerequisites))); 
	}
}

/*
 * There are a total of n courses you have to take, labeled from 0 to n - 1.
 * 
 * Some courses may have prerequisites, for example to take course 0 you have to
 * first take course 1, which is expressed as a pair: [0,1]
 * 
 * Given the total number of courses and a list of prerequisite pairs, return
 * the ordering of courses you should take to finish all courses.
 * 
 * There may be multiple correct orders, you just need to return one of them. If
 * it is impossible to finish all courses, return an empty array.
 * 
 * For example:
 * 
 * 2, [[1,0]] 
 * There are a total of 2 courses to take. 
 * To take course 1 you should have finished course 0. 
 * So the correct course order is [0,1]
 * 
 * 4, [[1,0],[2,0],[3,1],[3,2]] 
 * There are a total of 4 courses to take. 
 * To take course 3 you should have finished both courses 1 and 2. 
 * Both courses 1 and 2 should be taken after you finished course 0. 
 * So one correct course order is [0,1,2,3]. 
 * Another correct ordering is[0,2,1,3].
 * 
 */
