

// Java implementation of the approach 
  
import java.io.*; 
  
class GFG { 
     
 static int minimumMoves(int k, int l, int r) 
{ 
    // Total elements in the range 
    int count = r - l + 1; 
  
    // If total elements are already divisible by k 
    if (count % k == 0) 
        return 0; 
  
    // Value that must be added to count 
    // in order to make it divisible by k 
    return (k - (count % k)); 
} 
  
// Driver Program to test above function 
    public static void main (String[] args) { 
    int k = 3, l = 10, r = 10; 
    System.out.print(minimumMoves(k, l, r)); 
    } 
} 
// This code is contributed  
// by inder_verma.. 

