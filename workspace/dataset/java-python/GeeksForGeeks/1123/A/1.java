

import java.util.*; 
  
// Java implementation of the approach 
class GFG  
{ 
  
    // Function to return the maximized median 
    static double getMaxMedian(int[] arr, int n, int k)  
    { 
        int size = n + k; 
  
        // Sort the array 
        Arrays.sort(arr); 
  
        // If size is even 
        if (size % 2 == 0) 
        { 
            double median = (double) (arr[(size / 2) - 1] 
                    + arr[size / 2]) 
                    / 2; 
            return median; 
        } 
  
        // If size is odd 
        double median1 = arr[size / 2]; 
        return median1; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        int[] arr = {3, 2, 3, 4, 2}; 
        int n = arr.length; 
        int k = 2; 
        System.out.print((int)getMaxMedian(arr, n, k)); 
  
    } 
} 
  
/* This code contributed by PrinciRaj1992 */

