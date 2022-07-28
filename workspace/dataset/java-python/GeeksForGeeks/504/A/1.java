

// Java program to find the  
// value at n-th place in  
// the given sequence 
  
import java.io.*; 
  
class GFG 
{ 
  
    // Definition of findNumber function 
    static int findNumber(int n) 
    { 
          
        // Finding x from equation  
        // n = x(x + 1)/2 + 1 
        int x = (int)Math.floor((-1 +  
                Math.sqrt(1 + 8 * n - 8)) / 2); 
  
        // Base of current block 
        int base = (x * (x + 1)) / 2 + 1; 
  
        // Value of n-th element 
        return n - base + 1; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 55; 
          
        System.out.println(findNumber(n)); 
    } 
} 
  
// This code is contributed by Ajit. 

