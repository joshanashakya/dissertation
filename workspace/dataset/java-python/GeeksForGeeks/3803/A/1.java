

// Java implementation of the approach 
class GFG 
{ 
  
// Function to find the permutation of 
// the first N natural numbers such that 
// the sum of (i % Pi) is maximum possible 
// and return the maximum sum 
static int Max_Sum(int n) 
{ 
    return (n * (n - 1)) / 2; 
} 
  
// Driver code 
public static void main (String[] args) 
{ 
    int n = 8; 
  
    // Function call 
    System.out.println(Max_Sum(n)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

