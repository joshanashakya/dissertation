

// Java implementation of decimal  
// to binary conversion without 
// using arithmetic operators 
import java.io.*; 
  
class GFG { 
      
    // function for decimal to  
    // binary conversion without 
    // using arithmetic operators 
    static String decToBin(int n) 
    { 
        if (n == 0) 
            return "0"; 
      
        // to store the binary  
        // equivalent of decimal 
        String bin = "";  
          
        while (n > 0)  
        { 
            // to get the last binary digit  
            // of the number 'n' and accumulate  
            // it at the beginning of 'bin' 
            bin = ((n & 1) == 0 ? '0' : '1') + bin; 
              
            // right shift 'n' by 1 
            n >>= 1; 
        } 
          
        // required binary number 
        return bin; 
    } 
  
    // Driver program to test above 
    public static void main (String[] args) { 
  
    int n = 38; 
    System.out.println(decToBin(n)); 
    } 
}  
  
// This code is contributed by vt_m 

