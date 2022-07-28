

import java.util.Arrays; 
  
// A memoization based implementation for 
// counting ways to reach a score using  
// 1 and 2 with consecutive 2 allowed 
class GfG  
{ 
  
    static int MAX = 101; 
    static int dp[][] = new int[MAX][2]; 
  
    static int CountWays(int n, int flag)  
    { 
        // if this state is already visited return 
        // its value 
        if (dp[n][flag] != -1)  
        { 
            return dp[n][flag]; 
        } 
  
        // base case 
        if (n == 0) 
        { 
            return 1; 
        } 
  
        // 2 is not scored last time so we can 
        // score either 2 or 1 
        int sum = 0; 
        if (flag == 0 && n > 1)  
        { 
            sum = sum + CountWays(n - 1, 0) + 
                    CountWays(n - 2, 1); 
        }  
          
        // 2 is scored last time so we can only score 1 
        else 
        { 
            sum = sum + CountWays(n - 1, 0); 
        } 
  
        return dp[n][flag] = sum; 
    } 
  
    public static void main(String[] args)  
    { 
        int n = 5; 
        for (int i = 0; i < MAX; i++)  
        { 
            Arrays.fill(dp[i], -1); 
        } 
        System.out.println(CountWays(n, 0)); 
    } 
} 
  
/* This code contributed by PrinciRaj1992 */

