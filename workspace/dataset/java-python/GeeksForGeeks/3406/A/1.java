

// Java code for n'th perrin number 
// using Recursion' 
import java.io.*; 
  
class GFG { 
  
    static int per(int n) 
    { 
        if (n == 0) 
            return 3; 
        if (n == 1) 
            return 0; 
        if (n == 2) 
            return 2; 
        return per(n - 2) + per(n - 3); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
  
        int n = 9; 
  
        System.out.println(per(n)); 
    } 
} 
  
// This code is contributed by vt_m. 

