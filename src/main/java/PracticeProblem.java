import java.util.*;
public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int fib(int num) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		return fibHelper(num, map);
	}

	public static int fibHelper(int num, HashMap<Integer, Integer> map) {

		//base cases
		if (num == 0) {
			return 0;
		}

		if (num == 1) {
			return 1;
		}
		//check the map
		if (map.containsKey(num)) {
			return map.get(num);
		}

		//recursive call
		int value = fibHelper(num-1, map) + fibHelper(num-2, map);

		//add to map
		map.put(num, value);

		//return
		return value;
	}

	public static int minCostClimbingStairs(int[] cost) {
		HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>(); 
		int n = cost.length;
		if (n == 1) {
			return cost[0];
		}
		return Math.min(minCost(n - 1, cost, memo), minCost(n - 2, cost, memo));
	}	

	public static int minCost(int i, int[] cost, HashMap<Integer, Integer> memo) {
		if (i < 0) {
			return 0;
		}
		
		if (i == 0 || i == 1) {
			return cost[i];
		}

		if (memo.containsKey(i)) {
			return memo.get(i);
		}

		int result = cost[i] + Math.min(minCost(i - 1, cost, memo), minCost(i - 2, cost, memo));
		memo.put(i, result);
		return result;
	}
}
