

// Java implementation of the approach 
class GFG  
{ 
  
// Function to return the maximum sum 
// of the sub-sequence such that two 
// consecutive elements have a difference of 
// at least 3 in their indices 
// in the given array 
static int max_sum(int a[], int n) 
{ 
  
    int []dp = new int[n]; 
  
    // If there is a single element in the array 
    if (n == 1)  
    { 
  
        // Either select it or don't 
        dp[0] = Math.max(0, a[0]); 
    } 
  
    // If there are two elements 
    else if (n == 2) 
    { 
  
        // Either select the first 
        // element or don't 
        dp[0] = Math.max(0, a[0]); 
  
        // Either select the first or the second element 
        // or don't select any element 
        dp[1] = Math.max(a[1], dp[0]); 
    } 
    else if (n >= 3)  
    { 
  
        // Either select the first 
        // element or don't 
        dp[0] = Math.max(0, a[0]); 
  
        // Either select the first or the second element 
        // or don't select any element 
        dp[1] = Math.max(a[1], Math.max(0, a[0])); 
  
        // Either select first, second, third or nothing 
        dp[2] = Math.max(a[2], Math.max(a[1], Math.max(0, a[0]))); 
  
        int i = 3; 
  
        // For the rest of the elements 
        while (i < n) 
        { 
  
            // Either select the best sum till 
            // previous_index or select the current 
            // element + best_sum till index-3 
            dp[i] = Math.max(dp[i - 1], a[i] + dp[i - 3]); 
            i++; 
        } 
    } 
  
    return dp[n - 1]; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int arr[] = { 1, 2, -2, 4, 3 }; 
    int n = arr.length; 
  
    System.out.println(max_sum(arr, n)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

