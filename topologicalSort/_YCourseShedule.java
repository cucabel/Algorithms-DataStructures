package topologicalSort;

import java.util.LinkedList;
import java.util.Queue;

public class _YCourseShedule { 
	
	public static boolean canFinish(int numCourses, int[][] prerequisites) {

		// i -> j
		int[][] matrix = new int[numCourses][numCourses]; 
		int[] indegree = new int[numCourses];
		// *
		
		for (int i = 0; i < prerequisites.length; i++) {
			int ready = prerequisites[i][0];
			int pre = prerequisites[i][1];
			if (matrix[pre][ready] == 0)
				indegree[ready]++; 
			matrix[pre][ready] = 1;
		}

		int count = 0; 
		Queue<Integer> queue = new LinkedList<>();

		for (int i = 0; i < indegree.length; i++) { 
			if (indegree[i] == 0)
				queue.offer(i); 
		}

		while (!queue.isEmpty()) {
			int course = queue.poll(); 
			count++;
			for (int i = 0; i < numCourses; i++) { 
				if (matrix[course][i] != 0) { 
					if (--indegree[i] == 0) 
						queue.offer(i);
				}
			}
		}
		return count == numCourses;
	}
	
	public static void main(String[] args) {
		
		int numCourses = 4;
		int[][] prerequisites = {{1, 0}, {2, 1}, {3, 2}};
		
		System.out.println(canFinish(numCourses, prerequisites));
	}
}

/*
 * There are a total of n courses you have to take, labelled from 0 to n - 1.
 * 
 * Some courses may have prerequisites, for example to take course 0 you have to
 * first take course 1, which is expressed as a pair: [0,1]
 * 
 * Given the total number of courses and a list of prerequisite pairs, is it
 * possible for you to finish all courses?
 * 
 * For example:
 * 
 * 2, [[1,0]] There are a total of 2 courses to take. To take course 1 you
 * should have finished course 0. So it is possible.
 * 
 * 2, [[1,0],[0,1]] There are a total of 2 courses to take. To take course 1 you
 * should have finished course 0, and to take course 0 you should also have
 * finished course 1. So it is impossible.
 * 
 */
