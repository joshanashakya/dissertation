

// Java  implementation of above approach 
import java.io.*; 
  
class GFG { 
// Function to find the number of 
// solutions of n = n xor x 
static int numberOfSolutions(int n) 
{ 
    // Number of set bits in n 
    int c = 0; 
  
    while (n>0) { 
        c += n % 2; 
        n /= 2; 
    } 
  
    // We can also write (1 << c) 
    return (int)Math.pow(2, c); 
} 
  
// Driver code 
  
    public static void main (String[] args) { 
        int n = 3; 
    System.out.println( numberOfSolutions(n)); 
    } 
} 
//This code is contributed by anuj_67 

