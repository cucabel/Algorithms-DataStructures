package binarySearch;

public class _GSearchInsertPosition {

	public static int searchInsert(int[] A, int target) {
		
		int left = 0;
		int right = A.length - 1;
		
		while (left <= right) {
			int mid = (left + right) / 2; 
			if (A[mid] == target)
				return mid;
			else if (A[mid] > target)
				right = mid - 1;
			else
				left = mid + 1;
		}
		return left;
	}
	
	public static void main(String[] args) {
		
		int[] A = {1, 3, 5, 6};
		int[] B = {1, 3, 5, 6};
		int[] C = {1, 3, 5, 6};
		int[] D = {1, 3, 5, 6};
		
		System.out.println(searchInsert(A, 5));
		System.out.println(searchInsert(B, 2));
		System.out.println(searchInsert(C, 7));
		System.out.println(searchInsert(D, 0)); 
	}
}

/*
 * Given a sorted array and a target value, return the index if the target is found. 
 * If not, return the index where it would be if it were inserted in order.
 * 
 * You may assume no duplicates in the array.
 * 
 * Here are few examples.
 * [1,3,5,6], 5 ? 2
 * [1,3,5,6], 2 ? 1 
 * [1,3,5,6], 7 ? 4
 * [1,3,5,6], 0 ? 0 
 * 
 */
