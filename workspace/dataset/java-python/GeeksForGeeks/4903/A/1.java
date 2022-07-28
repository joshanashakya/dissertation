

// Java  program to find Maximum difference  
// between two elements such that larger  
// element appears after the smaller number 
  
import java.io.*; 
  
class GFG { 
/* The function assumes that there are  
at least two elements in array. The  
function returns a negative value if the 
array is sorted in decreasing order and  
returns 0 if elements are equal */
static int maxDiff(int arr[], int n) 
{ 
    // Initialize Result 
    int maxDiff = -1;  
      
    // Initialize max element from right side 
    int maxRight = arr[n-1];  
  
    for (int i = n-2; i >= 0; i--) 
    { 
        if (arr[i] > maxRight) 
            maxRight = arr[i]; 
        else
        { 
            int diff = maxRight - arr[i]; 
            if (diff > maxDiff) 
            { 
                maxDiff = diff; 
            } 
        } 
    } 
    return maxDiff; 
} 
  
/* Driver program to test above function */
    public static void main (String[] args) { 
        int arr[] = {1, 2, 90, 10, 110}; 
        int n = arr.length; 
  
// Function calling 
    System.out.println ("Maximum difference is " + maxDiff(arr, n)); 
    } 
//This code is contributed by Tushil..     
} 

