

// Java Program to find nth centered  
// pentadecagonal number 
  
import java.io.*; 
  
class GFG { 
      
    // centered pentadecagonal function 
    static long center_pentadecagonal_num(long n) 
    { 
      
        // Formula to calculate nth 
        // centered pentadecagonal number 
        return (15 * n * n - 15 * n + 2) / 2; 
    } 
      
    // Driver Code 
    public static void main (String[] args)  
    { 
      
        long n = 3; 
        System.out.print(n + "th number : "); 
        System.out.println(  
                  center_pentadecagonal_num(n)); 
          
        n = 10; 
        System.out.print( n + "th number : "); 
        System.out.println( 
                 center_pentadecagonal_num(n)); 
    } 
} 
  
// This code is contributed by ajit. 

