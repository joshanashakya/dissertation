

// Java implementation of the above approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function to return the minimum difference  
// between N and a power of 2 
static int minAbsDiff(int n) 
{ 
    // Power of 2 closest to n on its left 
    int left = (int)Math.pow(2, (int)(Math.log(n) / 
                                Math.log(2))); 
  
    // Power of 2 closest to n on its right 
    int right = left * 2; 
  
    // Return the minimum abs difference 
    return Math.min((n - left), (right - n)); 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int n = 15; 
    System.out.println(minAbsDiff(n)); 
} 
} 
  
// This code is contributed by  
// Surendra_Gangwar 

