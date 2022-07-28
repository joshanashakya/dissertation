

// Java code to find the count of odd 
// numbers in n-th row of Pascal's  
// Triangle 
import java.io.*; 
  
class GFG { 
      
    /* Function to get no of set 
    bits in binary representation  
    of positive integer n */
    static int countSetBits(int n) 
    { 
        long count = 0; 
        while (n > 0) 
        { 
            count += n & 1; 
            n >>= 1; 
        } 
          
        return (int)count; 
    } 
      
    static int countOfOddsPascal(int n) 
    { 
          
        // Count number of 1's in binary 
        // representation of n. 
        int c = countSetBits(n); 
          
        // Number of odd numbers in n-th 
        // row is 2 raised to power the 
        // count. 
        return (int)Math.pow(2, c); 
    } 
      
    // Driver code 
    public static void main (String[] args) 
    { 
        int n = 20;  
        System.out.println( 
                     countOfOddsPascal(n)); 
    } 
} 
  
// This code is contributed by anuj_67. 

