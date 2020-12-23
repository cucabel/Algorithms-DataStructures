package dynamicProgramming;

public class _YUniquePaths {

	public static int uniquePaths(int m, int n) {
		
		if (m == 0 || n == 0) {
			return 0;
		}
		
		int[][] numberOfPaths = new int[m][n];
		
		for (int i = 0; i < m; i++)
			numberOfPaths[i][0] = 1;

		for (int j = 0; j < n; j++)
			numberOfPaths[0][j] = 1;

		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++)
				numberOfPaths[i][j] = numberOfPaths[i - 1][j] + numberOfPaths[i][j - 1];
		}
			
		return numberOfPaths[m - 1][n - 1];			
	}
	
	public static void main(String[] args) {
		System.out.println(uniquePaths(3, 7));
	}

}

/*
 * A robot is located at the top-left corner of a m x n grid
 * 
 * The robot can only move either down or right at any point in time. The robot
 * is trying to reach the bottom-right corner of the grid (marked 'Finish' in
 * the diagram below).
 * 
 * Below is a 3 x 7 grid. How many possible unique paths are there?
 * 
 * Note: m and n will be at most 100.
 * 
 */
