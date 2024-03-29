package dynamicProgramming;

public class _GMaximumSubarray {

	public static int maxSubArray(int[] A) {
		int n = A.length;

		int[] dp = new int[n];
		dp[0] = A[0]; 
		int max = dp[0]; 

		for (int i = 1; i < n; i++) {
			dp[i] = A[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
			max = Math.max(max, dp[i]);  
		}

		return max;
	}

	public static void main(String[] args) {
		
		int[] A = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(A));
	}
}

/*
 * Find the contiguous sub-array within an array (containing at least one number) which has the largest sum.
 * 
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4], 
 * the contiguous sub-array [4,-1,2,1] has the largest sum = 6.
 * 
 */
