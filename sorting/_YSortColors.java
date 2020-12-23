package sorting;

import java.util.Arrays;

public class _YSortColors {
	
	public static void sortColors(int[] nums) {
		
		int start = 0;
		int end = nums.length-1;
		int index = 0;
		
		while (index <= end && start < end) {
			if (nums[index] == 0) {
				nums[index] = nums[start];
				nums[start] = 0; 
				start++;
				index++; 
			} else if (nums[index] == 2) {
				nums[index] = nums[end];
				nums[end] = 2; 
				end--; 
			} else {
				index++;
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] nums = {2, 0, 2, 1, 1, 0};
		sortColors(nums);
		System.out.println(Arrays.toString(nums));
	}
}

/*
 * Given an array with n objects colored red, white or blue, sort them
 * so that objects of the same color are adjacent, with the colors in the order
 * red, white and blue.
 * 
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white,
 * and blue respectively.
 * 
 * Note: You are not suppose to use the library's sort function for this
 * problem.
 * 
 */
