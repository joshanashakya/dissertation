

// java program to find the sum of 
// the series 1+11+111+1111+.... 
import java.io.*; 
  
class GFG { 
  
    // Function for finding summation 
    static int summation(int n) 
    { 
        int sum; 
      
        sum = (int)(Math.pow(10, n + 1) -  
                10 - (9 * n)) / 81; 
      
        return sum; 
    } 
      
    // Driver Code 
    public static void main (String[] args) 
    { 
        int n = 5; 
        System.out.println(summation(n)); 
    } 
} 
  
// This code is contributed by anuj_67. 

