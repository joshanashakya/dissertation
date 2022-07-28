

// Java implementation of the above approach 
class GFG 
{ 
      
// Function to return the minimum difference  
// between N and a power of 2 
static int minAbsDiff(int n) 
{ 
    // Power of 2 closest to n on its left 
    int left = 1 << ((int)Math.floor(Math.log(n) / Math.log(2))); 
  
    // Power of 2 closest to n on its right 
    int right = left * 2; 
  
    // Return the minimum abs difference 
    return Math.min((n - left), (right - n)); 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int n = 15; 
    System.out.println(minAbsDiff(n)); 
} 
} 
  
// This code is contributed by chandan_jnu 

