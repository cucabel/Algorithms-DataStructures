package greedy;

public class _YGasStation {

	public static int canCompleteCircuit(int[] gas, int[] cost) {

		int start = 0, total = 0, tank = 0;

		for (int i = 0; i < gas.length; i++)
			if ((tank = tank + gas[i] - cost[i]) < 0) { 
				start = i + 1; 
				total += tank;
				tank = 0; 
			}

		return (total + tank < 0) ? -1 : start; // 
	}

	public static void main(String[] args) {

		int[] gas = {1,2,3,4,5};
		int[] cost = {3,4,5,1,2};
		System.out.println(canCompleteCircuit(gas, cost));
		
	}
}

/* 
 * Note:
 * - If there exists a solution, it is guaranteed to be unique. 
 * - Both input arrays are non-empty and have the same length. 
 * - Each element in the input arrays is a non-negative integer.
 * 
 * Example 1:
 * Input: 
 * gas = [1,2,3,4,5] 
 * cost = [3,4,5,1,2]
 * Output: 3
 * 
 * Explanation: 
 * Start at station 3 (index 3) and fill up with 4 unit of gas. Your tank = 0 + 4 = 4 
 * Travel to station 4. Your tank = 4 - 1 + 5 = 8 
 * Travel to station 0. Your tank = 8 - 2 + 1 = 7 
 * Travel to station 1. Your tank = 7 - 3 + 2 = 6 
 * Travel to station 2. Your tank = 6 - 4 + 3 = 5 
 * Travel to station 3. Your tank = 5 - 5 = 5. Your gas is just enough to travel back to station 3.
 * Therefore, return 3 as the starting index.
 * 
 * Example 2:
 * 
 * Input: 
 * gas = [2,3,4] 
 * cost = [3,4,3]
 * Output: -1
 * 
 * Explanation: 
 * You can't start at station 0 or 1, as there is not enough gas to travel to the next station. 
 * Let's start at station 2 and fill up with 4 unit of gas. Your tank = 0 + 4 = 4 
 * Travel to station 0. Your tank = 4 - 3 + 2 = 3
 * Travel to station 1. Your tank = 3 - 3 + 3 = 3 
 * You cannot travel back to station 2, as it requires 4 unit of gas but you only have 3. 
 * Therefore, you can't travel around the circuit once, no matter where you start.
 * 
 */ 
