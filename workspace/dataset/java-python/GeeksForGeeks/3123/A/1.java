

// Java implementation of the above approach 
import java.io.*; 
  
class GFG  
{ 
      
// Function to count the perfect squares 
static int countOddSquares(int n, int m) 
{ 
    return (int)Math.pow(m, 0.5) - 
            (int)Math.pow(n - 1, 0.5); 
} 
  
// Driver code 
public static void main (String[] args) 
{ 
    int n = 5, m = 100; 
    System.out.println("Count is " + ((m - n + 1) 
                    - countOddSquares(n, m))); 
} 
} 
  
// This code is contributed by ajit.. 

