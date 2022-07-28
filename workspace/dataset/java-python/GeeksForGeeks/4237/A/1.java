

// Java program to find maximum score we can get 
// by removing elements from either end. 
  
public class GFG { 
  
    static final int MAX = 50; 
  
    static int solve(int dp[][], int a[], int low, int high, 
            int turn) { 
        // If only one element left. 
        if (low == high) { 
            return a[low] * turn; 
        } 
  
        // If already calculated, return the value. 
        if (dp[low][high] != 0) { 
            return dp[low][high]; 
        } 
  
        // Computing Maximum value when element at  
        // index i and index j is to be chosed. 
        dp[low][high] = Math.max(a[low] * turn + solve(dp, a, 
                low + 1, high, turn + 1), 
                a[high] * turn + solve(dp, a, 
                        low, high - 1, turn + 1)); 
  
        return dp[low][high]; 
    } 
  
// Driven Program 
    public static void main(String args[]) { 
        int arr[] = {1, 3, 1, 5, 2}; 
        int n = arr.length; 
  
        int dp[][] = new int[MAX][MAX]; 
  
        System.out.println(solve(dp, arr, 0, n - 1, 1)); 
  
    } 
} 
  
/*This code is contributed by 29AjayKumar*/

