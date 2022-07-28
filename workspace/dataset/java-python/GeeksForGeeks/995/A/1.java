

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
static int maxN = 300; 
static int maxM = 300; 
  
// To store the states of DP 
static int dp[][] = new int[maxN][maxM]; 
static boolean v[][] = new boolean[maxN][maxM]; 
  
// Function to return the required length 
static int findLen(int[] arr, int i, 
                   int curr, int n, int m) 
{ 
    // Base case 
    if (i == n) 
    { 
        if (curr == m) 
            return 0; 
        else
            return -1; 
    } 
  
    // If the state has been solved before 
    // return the value of the state 
    if (v[i][curr]) 
        return dp[i][curr]; 
  
    // Setting the state as solved 
    v[i][curr] = true; 
  
    // Recurrence relation 
    int l = findLen(arr, i + 1, curr, n, m); 
    int r = findLen(arr, i + 1, curr & arr[i], n, m); 
    dp[i][curr] = l; 
    if (r != -1) 
        dp[i][curr] = Math.max(dp[i][curr], r + 1); 
    return dp[i][curr]; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int arr[] = { 3, 7, 2, 3 }; 
    int n = arr.length; 
    int m = 3; 
  
    int ans = findLen(arr, 0, ((1 << 8) - 1), n, m); 
    if (ans == -1) 
        System.out.print( 0); 
    else
        System.out.print( ans); 
} 
} 
  
// This code is contributed by Arnab Kundu 

