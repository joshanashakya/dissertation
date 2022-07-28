

// Java program to compute mod of a big  
// number represented as string 
import java.io.*; 
  
class GFG { 
      
    // Function to compute num (mod a) 
    static int mod(String num, int a) 
    { 
          
        // Initialize result 
        int res = 0; 
  
        // One by one process all digits of 'num' 
        for (int i = 0; i < num.length(); i++) 
            res = (res * 10 + (int)num.charAt(i) 
                                     - '0') % a; 
  
        return res; 
    } 
  
    // Driver program 
    public static void main(String[] args) 
    { 
          
        String num = "12316767678678"; 
          
        System.out.println(mod(num, 10)); 
    } 
} 
  
// This code is contributed by vt_m. 

