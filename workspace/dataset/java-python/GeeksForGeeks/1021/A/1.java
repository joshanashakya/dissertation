

//Java implementation of the approach 
import java.io.*; 
  
class GFG  
{ 
      
// Function that returns true if all  
// the elements of the array can be  
// made equal with the given operation 
static boolean isPossible(int n, int k, int arr[]) 
{ 
  
    // To store the sum of the array elements 
    // and the maximum element from the array 
    int sum = arr[0]; 
    int maxVal = arr[0]; 
  
    for (int i = 1; i < n; i++)  
    { 
        sum += arr[i]; 
        maxVal = Math.max(maxVal, arr[i]); 
    } 
  
    if ((float)maxVal > (float)(sum + k) / n) 
        return false; 
  
    return true; 
} 
  
    // Driver code 
    public static void main (String[] args)  
    { 
      
        int k = 8; 
        int arr[] = { 1, 2, 3, 4 }; 
        int n = arr.length; 
  
        if (isPossible(n, k, arr)) 
            System.out.println ("Yes"); 
        else
            System.out.println( "No"); 
    } 
} 
  
// This code is contributed by @Tushil.  

