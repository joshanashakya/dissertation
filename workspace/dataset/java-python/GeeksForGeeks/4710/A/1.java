

// java implementation of above approach 
import java.io.*; 
  
class GFG { 
     
// Function to calculate all the solutions 
static void findsolution(long n, long x, long y) 
{ 
    // there is no solutions 
    if ((y - n + 1) * (y - n + 1) + n - 1 < x || y < n) { 
        System.out.println( "No solution"); 
        return; 
    } 
  
    // print first element as y-n+1 
    System.out.println( y - n + 1); 
  
    // print rest n-1 elements as 1 
    while (n-- > 1) 
            System.out.println( "1"); 
} 
  
// Driver code 
  
    public static void main (String[] args) { 
            // initialize the number of elements 
    // and the value of x an y 
    long n, x, y; 
    n = 5; x = 15; y = 15; 
  
    findsolution(n, x, y); 
    } 
} 
// This code is contributed  
// by ajit 

