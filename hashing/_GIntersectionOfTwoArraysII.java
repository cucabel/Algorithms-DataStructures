package hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class _GIntersectionOfTwoArraysII {

	public static int[] intersect(int[] nums1, int[] nums2) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();		
		ArrayList<Integer> result = new ArrayList<Integer>();

		for (int i = 0; i < nums1.length; i++) {								
			if (map.containsKey(nums1[i]))
				map.put(nums1[i], map.get(nums1[i]) + 1);						
			else																
				map.put(nums1[i], 1);
		}

		for (int i = 0; i < nums2.length; i++) {								
			if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
				result.add(nums2[i]);
				map.put(nums2[i], map.get(nums2[i]) - 1);						
			}																	
		}																		
																				
		int[] r = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			r[i] = result.get(i);
		}

		return r;
	}

	public static void main(String[] args) {
		
		int[] nums1 = {1, 2, 2, 1};
		int[] nums2 = {2, 2};
		
		int[] intersection = intersect(nums1, nums2);
		for (int joint : intersection)
			System.out.println(joint);
		
	}
}

/*
 * Given Two arrays, write a function to compute their intersection.
 * 
 * Example: 
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
 * 
 * Note: 
 * Each element in the result should appear as many times as it shows in both arrays. The result can be in any order.
 * 
 */
