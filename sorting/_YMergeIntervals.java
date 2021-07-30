package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _YMergeIntervals {

	public static List<Interval> merge(List<Interval> intervals) {

		int n = intervals.size();
		int[] starts = new int[n]; 
		int[] ends = new int[n];
		for (int i = 0; i < n; i++) {
			starts[i] = intervals.get(i).start;
			ends[i] = intervals.get(i).end;
		}

		List<Interval> res = new ArrayList<>();
		for (int i = 0, j = 0; i < n; i++) { 
			if (i == n - 1 || starts[i + 1] > ends[i]) { 
				res.add(new Interval(starts[j], ends[i]));
				j = i + 1; 
			}
		} 
		return res;
	}

	public static void main(String[] args) {
		
		Interval A = new Interval(1, 3); 
		Interval B = new Interval(2, 6);
		Interval C = new Interval(8, 10);
		Interval D = new Interval(15, 18);
		
		List<Interval> intervalsList = new ArrayList<>(Arrays.asList(A, B, C, D));
		System.out.println(merge(intervalsList));
	}
}

/*
 * Given a collection of intervals, merge all overlapping intervals.
 * 
 * For example, Given [1,3],[2,6],[8,10],[15,18], return [1,6],[8,10],[15,18].
 * Since intervals [1,3], and [2,6] overlap, merge them into [1, 6] 
 * 
 */
