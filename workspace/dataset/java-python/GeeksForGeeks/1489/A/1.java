

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
static int MAX = 10000; 
static int MAX_ELEMENT = 50; 
  
static int [][][] dp = new int[MAX_ELEMENT][MAX_ELEMENT][MAX]; 
  
// Function to return the maximum xor for a 
// subset of size j from the given array 
static int Max_Xor(int arr[], int i,  
                   int j, int mask, int n) 
{ 
    if (i >= n)  
    { 
  
        // If the subset is complete then return 
        // the xor value of the selected elements 
        if (j == 0) 
            return mask; 
        else
            return 0; 
    } 
  
    // Return if already calculated for some 
    // mask and j at the i'th index 
    if (dp[i][j][mask] != -1) 
        return dp[i][j][mask]; 
  
    // Initialize answer to 0 
    int ans = 0; 
  
    // If we can still include elements in our subset 
    // include the i'th element 
    if (j > 0) 
        ans = Max_Xor(arr, i + 1, j - 1,  
                      mask ^ arr[i], n); 
  
    // Exclude the i'th element 
    // ans store the max of both operations 
    ans = Math.max(ans, Max_Xor(arr, i + 1, j,  
                                mask, n)); 
  
    return dp[i][j][mask] = ans; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 2, 5, 4, 1, 3, 7, 6, 8 }; 
    int n = arr.length; 
    int k = 3; 
  
    for(int i = 0; i < MAX_ELEMENT; i++) 
    { 
        for(int j = 0; j < MAX_ELEMENT; j++) 
        { 
            for(int l = 0; l < MAX; l++) 
            dp[i][j][l] = -1; 
        } 
    } 
  
    System.out.println(Max_Xor(arr, 0, k, 0, n)); 
} 
} 
  
// This code is contributed by Princi Singh 

