

// Java implementation of the approach 
import java.util.*; 
  
class solution 
{ 
  
// Function to return the required sum 
static long getSum(int n, int d) 
{ 
    long sum = 0; 
    for (int i = 1; i <= n; i++) { 
  
        // If the unit digit is d 
        if (i % 10 == d) 
            sum += i; 
    } 
    return sum; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int n = 30, d = 3; 
    System.out.println(getSum(n, d)); 
     
} 
} 

