

// Java implementation of the approach 
class GFG  
{ 
  
// Function to return the count of n-digit  
// natural hexadecimal numbers 
static int count(int n) 
{ 
    return (int) (15 * Math.pow(16, n - 1)); 
} 
  
// Driver code 
public static void main(String args[])  
{ 
    int n = 2; 
    System.out.println(count(n)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

