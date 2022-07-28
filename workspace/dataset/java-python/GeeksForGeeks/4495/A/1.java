

// JAVA implementation to check whether  
// every digit in the binary representation  
// of the given number is set or not 
import java.io.*; 
  
class GFG { 
      
    // function to check if all the  
    // bits are set or not in the  
    // binary representation of 'n' 
    static String areAllBitsSet(int n) 
    { 
        // all bits are not set 
        if (n == 0) 
            return "No"; 
      
        // if true, then all bits are set 
        if (((n + 1) & n) == 0) 
            return "Yes"; 
      
        // else all bits are not set 
        return "No"; 
    } 
      
    // Driver program to test above 
    public static void main (String[] args) { 
    int n = 7; 
    System.out.println(areAllBitsSet(n)); 
    } 
} 
  
// This code is contributed by vt_m 

