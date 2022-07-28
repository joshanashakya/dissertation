

// Java program to find the minimum value 
// of maximum absolute difference of 
// all adjacent pairs in an Array 
import java.util.*; 
  
class GFG{ 
   
// Function to find the minimum possible 
// value of the maximum absolute difference. 
static int maximumAbsolute(int arr[], int n) 
{ 
    // To store minimum and maximum elements 
    int mn = Integer.MAX_VALUE; 
    int mx = Integer.MIN_VALUE; 
   
    for (int i = 0; i < n; i++) { 
  
        // If right side element is equals -1 
        // and left side is not equals -1 
        if (i > 0
            && arr[i] == -1
            && arr[i - 1] != -1) { 
            mn = Math.min(mn, arr[i - 1]); 
            mx = Math.max(mx, arr[i - 1]); 
        } 
   
        // If left side element is equals -1 
        // and right side is not equals -1 
        if (i < n - 1
            && arr[i] == -1
            && arr[i + 1] != -1) { 
            mn = Math.min(mn, arr[i + 1]); 
            mx = Math.max(mx, arr[i + 1]); 
        } 
    } 
   
    // Calculating the common integer 
    // which needs to be replaced with 
    int common_integer = (mn + mx) / 2; 
   
    // Replace all -1 elements 
    // with the common integer 
    for (int i = 0; i < n; i++) { 
        if (arr[i] == -1) 
            arr[i] = common_integer; 
    } 
   
    int max_diff = 0; 
   
    // Calculating the maximum 
    // absolute difference 
    for (int i = 0; i < n - 1; i++) { 
        int diff = Math.abs(arr[i] - arr[i + 1]); 
   
        if (diff > max_diff) 
            max_diff = diff; 
    } 
   
    // Return the maximum absolute difference 
    return max_diff; 
} 
   
// Driver Code 
public static void main(String[] args) 
{ 
    int arr[] = { -1, -1, 11, -1, 3, -1 }; 
    int n = arr.length; 
   
    // Function call 
    System.out.print(maximumAbsolute(arr, n)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

