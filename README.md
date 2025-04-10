# Instructions  

1. Write a function to calculate the nth Fibonacci number (where F(0) = 0, F(1) = 1, and F(n) = F(n-1) + F(n-2) for n > 1). Your implementation should use memoization to avoid redundant calculations.

2. You are given an array representing the cost of climbing each step of a staircase. Once you pay the cost, you can either climb one or two steps.
You can either start from the step with index 0, or the step with index 1.
Write a function _minCostClimbingStairs(int[] cost)_ that returns the minimum cost to reach the top of the floor (which is one step beyond the last element in the cost array).
For example, if cost = [10, 15, 20], the minimum cost would be 15, by starting at index 1 and going directly to the top.
Your implementation should use memoization to handle overlapping subproblems efficiently.
