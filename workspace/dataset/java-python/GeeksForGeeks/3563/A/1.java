

// Java program for count number 
// of trailing zeros in N! * M! 
import java.io.*; 
  
class GFG { 
      
    // Returns number of zeros in factorial n 
    static int trailingZero(int x) 
    { 
        // dividing x by powers  
        // of 5 and update count 
        int i = 5, count = 0; 
          
        while (x > i) { 
              
            count = count + x / i; 
            i = i * 5; 
        } 
        return count; 
    } 
      
    // Returns count of trailing zeros in M! x N! 
    static int countProductTrailing(int M, int N) 
    { 
    return trailingZero(N) + trailingZero(M); 
    } 
      
    // Driver program 
    public static void main(String args[]) 
    { 
        int N = 67, M = 98; 
        System.out.println(countProductTrailing(N, M)); 
    } 
} 
  
  
/* This code is contributed by Nikita Tiwari.*/

