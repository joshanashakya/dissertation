

// Java program to find the sum of 
// first n natural numbers which are 
// not positive powers of k 
import java.io.*; 
  
class GFG { 
    
  
  
// Function to return the sum of 
// first n natural numbers which are 
// not positive powers of k 
static int find_sum(int n, int k) 
{ 
    // sum of first n natural numbers 
    int total_sum = (n * (n + 1)) / 2; 
  
    int power = k; 
    while (power <= n) { 
  
        // subtract all positive powers 
        // of k which are less than n 
        total_sum -= power; 
  
        // next power of k 
        power *= k; 
    } 
  
    return total_sum; 
} 
  
// Driver code 
  
    public static void main (String[] args) { 
        int n = 11, k = 2; 
  
    System.out.println(find_sum(n, k)); 
    } 
} 
// This code is contributed by inder_verma.. 

