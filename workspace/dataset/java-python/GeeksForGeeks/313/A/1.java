

// Java program to print the length of the longest 
// subarray with all elements greater than X 
  
import java.io.*; 
  
class GFG { 
   
// Function to count number of segments 
static int longestSubarray(int a[], int n, int x) 
{ 
    int count = 0; 
  
    int length = 0; 
  
    // Iterate in the array 
    for (int i = 0; i < n; i++) { 
  
        // check if array element 
        // greater then X or not 
        if (a[i] > x) { 
            count += 1; 
        } 
        else { 
  
            length = Math.max(length, count); 
  
            count = 0; 
        } 
    } 
  
    // After iteration complete 
    // check for the last segment 
    if (count>0) 
        length = Math.max(length, count); 
  
    return length; 
} 
  
// Driver Code 
    public static void main (String[] args) { 
            int []a = { 8, 25, 10, 19, 19, 18, 20, 11, 18 }; 
    int n = a.length; 
    int k = 13; 
  
  System.out.println(longestSubarray(a, n, k)); 
    } 
} 
// This Code is contributed 
// by shs 

