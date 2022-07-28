

// Java code to count 
// total perfect Divisors 
import java.io.*; 
  
class GFG  
{ 
      
// Utility function to check  
// perfect square number 
static boolean isPerfectSquare(int n) 
{ 
    int sq = (int) Math.sqrt(n); 
    return (n == sq * sq); 
} 
  
// Returns count all  
// perfect divisors of n 
static int countPerfectDivisors(int n) 
{ 
    // Initialize result 
    int count = 0; 
  
    // Consider every number  
    // that can be a divisor of n 
    for (int i = 1; i * i <= n; ++i) 
    { 
        // If i is a divisor 
        if (n % i == 0) 
        { 
            if (isPerfectSquare(i)) 
                ++count; 
            if (n / i != i &&  
                isPerfectSquare(n / i)) 
                ++count; 
        } 
    } 
    return count; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int n = 16; 
  
    System.out.print("Total perfect " +  
                   "divisors of " + n); 
    System.out.println(" = " +  
               countPerfectDivisors(n)); 
  
    n = 12; 
    System.out.print("Total perfect " +  
                   "divisors of " + n); 
    System.out.println(" = " +  
               countPerfectDivisors(n)); 
} 
} 
  
// This code is contributed by ajit 

