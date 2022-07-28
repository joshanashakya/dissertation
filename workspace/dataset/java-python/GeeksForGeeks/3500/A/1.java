

// A Dynamic Programming based Java program to find 
// minimum jumps to reach last building from first. 
import java.util.*; 
  
class GFG  
{ 
  
    static int R = 4; 
    static int C = 3; 
  
    static boolean isSafe(int x, int y)  
    { 
        return (x < R && y < C); 
    } 
  
    // Lookup table used for memoization. 
    static int[][] dp = new int[R][C]; 
  
    /* Returns minimum jump path from (0, 0) to (m, n) 
    in hight[R][C]*/
    static int minJump(int height[][], int x, int y)  
    { 
        // if we visited it before 
        if (dp[x][y] != -1) 
        { 
            return dp[x][y]; 
        } 
  
        if (x == R - 1 && y == C - 1)  
        { 
            return (dp[x][y] = 0); 
        } 
  
        // Find minimum jumps if we go through diagonal 
        int diag = Integer.MAX_VALUE; 
        if (isSafe(x + 1, y + 1))  
        { 
            diag = minJump(height, x + 1, y + 1) 
                    + Math.abs(height[x][y] - height[x + 1][y + 1]); 
        } 
  
        // Find minimum jumps if we go through down 
        int down = Integer.MAX_VALUE; 
        if (isSafe(x + 1, y)) 
        { 
            down = minJump(height, x + 1, y) 
                    + Math.abs(height[x][y] - height[x + 1][y]); 
        } 
  
        // Find minimum jumps if we go through right 
        int right = Integer.MAX_VALUE; 
        if (isSafe(x, y + 1))  
        { 
            right = minJump(height, x, y + 1) 
                    + Math.abs(height[x][y] - height[x][y + 1]); 
        } 
  
        // return minimum jump 
        dp[x][y] = Math.min(Math.min(down, right), diag); 
        return dp[x][y]; 
    } 
  
    /* Driver program to test above functions */
    public static void main(String[] args) 
    { 
        int height[][] = {{5, 4, 2}, 
        {9, 2, 1}, 
        {2, 5, 9}, 
        {1, 3, 11}}; 
        for (int i = 0; i < R; i++) { 
            for (int j = 0; j < C; j++) { 
                dp[i][j] = -1; 
            } 
        } 
        System.out.println(minJump(height, 0, 0)); 
    } 
} 
  
/* This code is contributed by PrinciRaj1992 */

