package heap;

import java.util.PriorityQueue;

public class _YKthLargestElementInAnArray {
	
	public static int findKthLargest(int[] nums, int k) {
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<>(); 
		for(int i : nums) { 
			minHeap.add(i);
			if(minHeap.size() > k)
				minHeap.remove();
		}
		return minHeap.remove();
	}	

	public static void main(String[] args) {
		
		int[] nums = {3,2,1,5,6,4};
		int k = 2;
		System.out.println(findKthLargest(nums, k));
	}
}

/*
 * Find the kth largest element in an unsorted array. Note that it is
 * the kth largest element in the sorted order, not the kth distinct element.
 * 
 * For example, Given [3,2,1,5,6,4] and k = 2, return 5.
 * 
 * Note: You may assume k is always valid, 1 <= k <= array's length.
 * 
 */
