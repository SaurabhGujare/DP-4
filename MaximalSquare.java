// Time Complexity : O(n*m)
// Space Complexity : O(n*m)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
public class MaximalSquare {
    class Solution {
        public int maximalSquare(char[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;
            int[][] dp = new int[m+1][n+1];
            int max=0;
            for(int i=1; i<=m; i++) {
                for(int j=1;j<=n;j++) {
                    if(matrix[i-1][j-1] == '1') {
                        dp[i][j]=Math.min(dp[i-1][j-1], Math.min(dp[i][j-1],dp[i-1][j])) +1;
                        max = Math.max(max, dp[i][j]);
                    }
                }
            }
            return max*max;
        }
    }
}
