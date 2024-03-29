

// Java program for Smallest 
// sum contiguous subarray | Set 2 
import java.io.*; 
  
class GFG  
{ 
  
// function to find the  
// smallest sum contiguous 
// subarray 
static int smallestSumSubarr(int arr[], 
                             int n) 
{ 
    // First invert the  
    // sign of the elements 
    for (int i = 0; i < n; i++) 
        arr[i] = -arr[i]; 
  
    // Apply the normal Kadane  
    // algorithm But on the  
    // elements Of the array  
    // having inverted sign 
    int sum_here = arr[0],  
        max_sum = arr[0]; 
  
    for (int i = 1; i < n; i++)  
    { 
        sum_here = Math.max(sum_here +  
                            arr[i], arr[i]); 
        max_sum = Math.max(max_sum,  
                           sum_here); 
    } 
  
    // Invert the answer 
    // to get minimum val 
    return (-1) * max_sum; 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int arr[] = {3, -4, 2, -3,  
                -1, 7, -5}; 
  
    int n = arr.length; 
  
    System.out.print("Smallest sum: " +  
            smallestSumSubarr(arr, n)); 
} 
} 
  
// This code is contributed  
// by inder_verma. 

