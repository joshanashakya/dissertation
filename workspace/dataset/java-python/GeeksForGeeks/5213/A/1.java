

// Java implementation of the approach 
import java.io.*; 
  
class GFG  
{ 
  
static int arrSize = 51; 
  
// To store the states of dp 
static int dp[] = new int[arrSize]; 
static boolean v[] = new boolean[arrSize]; 
  
// Function to return the maximized sum 
static int sumMax(int i, int arr[], int n) 
{ 
    // Base case 
    if (i >= n - 1) 
        return 0; 
  
    // Checks if a state is 
    // already solved 
    if (v[i]) 
        return dp[i]; 
    v[i] = true; 
  
    // Recurrence relation 
    dp[i] = Math.max(arr[i] + arr[i + 1] 
                    + sumMax(i + 3, arr, n), 
                sumMax(i + 1, arr, n)); 
  
    // Return the result 
    return dp[i]; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int arr[] = { 1, 1, 1, 1 }; 
    int n = arr.length; 
  
    System.out.println(sumMax(0, arr, n)); 
} 
} 
  
// This code is contributed by anuj_67.. 

