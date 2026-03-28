/* 62 There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.

Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.

The test cases are generated so that the answer will be less than or equal to 2 * 109. */


/*Approach 1 TopDown */

package DynamicProgramming;

import java.util.*;

class UniquqPath {

    public int uniquePaths(int m, int n) {
        int memo[][] = new int[m][n];
        for(int i = 0; i < m; i++){
            Arrays.fill(memo[i], -1);
        }

        return uniquePathRecursive(0, 0, m, n, memo);
    }

    public int uniquePathRecursive(int x, int y, int m, int n, int[][] memo) {
        if(x == m - 1 && y == n - 1){
            return 1;
        }

        if(memo[x][y] != -1){
            return memo[x][y];
        }

        int rightPaths = 0;
        int downPaths = 0;

        if(x < m - 1){
            rightPaths = uniquePathRecursive(x + 1, y, m, n, memo);
        }

        if(y < n - 1){
            downPaths = uniquePathRecursive(x, y + 1, m, n, memo);
        }

        memo[x][y] = rightPaths + downPaths;

        return memo[x][y];
    }
}