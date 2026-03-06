leetcode link: https://leetcode.com/problems/container-with-most-water/description/

11. Container With Most Water

You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

Example 1
    Input: height = [1,8,6,2,5,4,8,3,7]__
    Output: 49__
    Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].__
    In this case, the max area of water (blue section) the container can contain is 49.

Example 2:
    Input: height = [1,1]__
    Output: 1

Constraints:
    n == height.length__
    2 <= n <= 105__
    0 <= height[i] <= 104
