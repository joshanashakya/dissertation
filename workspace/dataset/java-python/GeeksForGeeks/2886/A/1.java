

// Java code to finding the value  
// of f(n) mod 5 for given n. 
import java.io.*; 
  
class GFG  
{ 
    // function for f(n) mod 5 
    static int fnMod(int n) 
    { 
        // if n % 5 == 1 return 4 
        if (n % 5 == 1) 
            return 4; 
      
        // else return 0 
        else
            return 0; 
    } 
      
    // Driver program 
    public static void main (String[] args) 
    { 
        int n = 10; 
        System.out.println(fnMod(n)); 
        n = 11; 
        System.out.println(fnMod(n)); 
  
    } 
} 
  
// This code is contributed by vt_m. 

