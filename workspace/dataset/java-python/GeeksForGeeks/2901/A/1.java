

// Java implementation of the approach 
import java.io.*; 
  
class GFG  
{ 
      
// Function to find the required sets 
static void find_set(int n) 
{ 
  
    // Impossible case 
    if (n <= 2)  
    { 
        System.out.println ("-1"); 
        return; 
    } 
  
    // Sum of first n-1 natural numbers 
    int sum1 = (n * (n - 1)) / 2; 
    int sum2 = n; 
        System.out.println (sum1 + " " +sum2 ); 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
  
    int n = 8; 
    find_set(n); 
} 
} 
  
// This code is contributed by jit_t. 

