

// Java implementation of the approach 
import java.util.*; 
  
class solution 
{ 
  
// Function to return the minimum required difference 
static int findMinDifference(int arr[], int n) 
{ 
    // Sort the given array 
    Arrays.sort(arr); 
  
    // When minimum element is removed 
    int diff1 = arr[n - 1] - arr[1]; 
  
    // When maximum element is removed 
    int diff2 = arr[n - 2] - arr[0]; 
  
    // Return the minimum of diff1 and diff2 
    return Math.min(diff1, diff2); 
} 
  
// Driver Code 
public static void  main(String args[]) 
{ 
    int arr[] = { 1, 2, 4, 3, 4 }; 
    int n = arr.length; 
  
    System.out.print(findMinDifference(arr, n)); 
  
} 
} 
// This code is contributed by 
// Sanjit_Prasad 

