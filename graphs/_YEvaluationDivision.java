package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class _YEvaluationDivision {  
	
	public static double[] calcEquation(String[][] equations, double[] values, String[][] queries) {

		HashMap<String, ArrayList<String>> pairs = new HashMap<>();
		HashMap<String, ArrayList<Double>> valuesPair = new HashMap<>();

		for (int i = 0; i < equations.length; i++) {

			String[] equation = equations[i]; 

			if (!pairs.containsKey(equation[0])) { 
				pairs.put(equation[0], new ArrayList<String>());
				valuesPair.put(equation[0], new ArrayList<Double>());
			}

			if (!pairs.containsKey(equation[1])) {
				pairs.put(equation[1], new ArrayList<String>());
				valuesPair.put(equation[1], new ArrayList<Double>());
			}

			pairs.get(equation[0]).add(equation[1]); 
			pairs.get(equation[1]).add(equation[0]);
			valuesPair.get(equation[0]).add(values[i]); 
			valuesPair.get(equation[1]).add(1 / values[i]);
		}

		double[] result = new double[queries.length];
		for (int i = 0; i < queries.length; i++) {
			String[] query = queries[i];
			result[i] = dfs(query[0], query[1], pairs, valuesPair, new HashSet<String>(), 1.0);
			if (result[i] == 0.0)
				result[i] = -1.0;
		}
		return result;
	}

	private static double dfs(String start, String end, HashMap<String, ArrayList<String>> pairs,
			HashMap<String, ArrayList<Double>> values, HashSet<String> set, double value) {

		if (set.contains(start))
			return 0.0;
		if (!pairs.containsKey(start))
			return 0.0;
		if (start.equals(end))
			return value;

		set.add(start);

		ArrayList<String> strList = pairs.get(start); 
		ArrayList<Double> valueList = values.get(start);
		double tmp = 0.0;
		
		for (int i = 0; i < strList.size(); i++) {
			tmp = dfs(strList.get(i), end, pairs, values, set, value * valueList.get(i));
			if (tmp != 0.0) {
				break;
			}
		}

		set.remove(start); 
		return tmp;
	}

	public static void main(String[] args) {
		
		String[][] equations =  { {"a", "b"}, {"b", "c"} };
		double[] values =  {2.0, 3.0};
		String[][] queries = { {"a", "c"}, {"b", "a"}, {"a", "e"}, {"a", "a"}, {"x", "x"} };
		
		double[] results = calcEquation(equations, values, queries);
		for (double result : results)
			System.out.println(result);
	}
}

/*
 * Equations are given in the format A / B = k, where A and B are variables
 * represented as strings, and k is a real number (floating point number). 
 * Given some queries, return the answers. 
 * If the answer does not exist, return -1.0.
 * 
 * Example: 
 * Given 
 * a / b = 2.0, 						equations = [ ["a", "b"], ["b", "c"] ],
 * b / c = 3.0. 						values = [2.0, 3.0], 
 * queries are: 						queries = [ ["a", "c"], ["b", "a"], ["a", "e"], ["a", "a"], ["x", "x"] ].
 * a / c = ?, 
 * b / a = ?, 
 * a / e = ?, 
 * a / a = ?, 
 * x / x = ?. 
 * return [6.0, 0.5, -1.0, 1.0, -1.0 ].
 * 
 * The input is: vector > equations, vector & values, vector > queries, 
 * where equations.size() == values.size(), and the values are positive. 
 * This represents the equations. 
 * Return vector.
 * 
 * The input is always valid. You may assume that evaluating the queries will
 * result in no division by zero and there is no contradiction.
 * 
 */
