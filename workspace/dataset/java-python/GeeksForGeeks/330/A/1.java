

// Java implementation of the approach 
import java.util.*; 
      
class GFG 
{ 
  
// Function to return the count 
// of possible subsets 
static int cntSubsets(int[] arr, int n) 
{ 
  
    // Total possible subsets of n 
    // sized array is (2^n - 1) 
    int max = (int) Math.pow(2, n); 
  
    // To store the required 
    // count of subsets 
    int result = 0; 
  
    // Run from i 000..0 to 111..1 
    for (int i = 0; i < max; i++)  
    { 
        int counter = i; 
  
        // If current subset has consecutive 
        if ((counter & (counter >> 1)) > 0) 
            continue; 
        result++; 
    } 
    return result; 
} 
  
// Driver code 
static public void main (String []arg) 
{ 
    int arr[] = { 3, 5, 7 }; 
    int n = arr.length; 
  
    System.out.println(cntSubsets(arr, n)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

