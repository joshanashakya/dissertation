

// A Dynamic Programming based solution to count number 
// of ways to represent n as sum of four numbers 
class GFG  
{ 
  
static int dp[][][] = new int[5001][5001][5]; 
  
// "parts" is number of parts left, n is the value left 
// "nextPart" is starting point from where we start trying 
// for next part. 
static int countWaysUtil(int n, int parts, int nextPart) 
{ 
    // Base cases 
    if (parts == 0 && n == 0) return 1; 
    if (n <= 0 || parts <= 0) return 0; 
  
    // If this subproblem is already solved 
    if (dp[n][nextPart][parts] != -1) 
    return dp[n][nextPart][parts]; 
  
    int ans = 0; // Initialize result 
  
    // Count number of ways for remaining number n-i 
    // remaining parts "parts-1", and for all part 
    // varying from 'nextPart' to 'n' 
    for (int i = nextPart; i <= n; i++) 
        ans += countWaysUtil(n-i, parts-1, i); 
  
    // Store computed answer in table and return 
    // result 
    return (dp[n][nextPart][parts] = ans); 
} 
  
// This function mainly initializes dp table and 
// calls countWaysUtil() 
static int countWays(int n) 
{ 
    for(int i = 0; i < 5001; i++) 
    { 
        for(int j = 0; j < 5001; j++) 
        { 
            for(int l = 0; l < 5; l++) 
            dp[i][j][l] = -1; 
        } 
    } 
    return countWaysUtil(n, 4, 1); 
} 
  
// Driver program 
public static void main(String[] args)  
{ 
    int n = 8; 
    System.out.println(countWays(n)); 
} 
} 
  
/* This code contributed by PrinciRaj1992 */

