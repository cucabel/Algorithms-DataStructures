package greedy;

public class _YJumpGame {
	
	public static boolean canJump(int[] nums) {
		
		int lastGoodIndexPosition = nums.length-1; 
		for (int i = nums.length-1; i>=0; i--) { 
			if (i + nums[i] >= lastGoodIndexPosition) {
				lastGoodIndexPosition = i;
			}
		}
		return lastGoodIndexPosition == 0; 
	}

	public static void main(String[] args) {
		
		int[] nums = {2,3,1,1,4};
		System.out.println(canJump(nums));
	}
}

/*
 * Given an array of non-negative integers, you are initially positioned
 * at the first index of the array.
 * 
 * Each element in the array represents your maximum jump length at that
 * position.
 * 
 * Determine if you are able to reach the last index.
 * 
 * For example: 
 * A = [2,3,1,1,4], return true. | can jump one or two positions from the index 0
 * A = [3,2,1,0,4], return false.
 * 
 */
