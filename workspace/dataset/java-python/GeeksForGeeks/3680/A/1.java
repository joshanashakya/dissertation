

// Java code to find the minimum number 
// of jump required to reach  
// (d, 0) from (0, 0). 
import java.io.*; 
  
class GFG { 
  
    // Return the minimum jump of length either a or b 
    // required to reach (d, 0) from (0, 0). 
    static int minJumps(int a, int b, int d) 
    { 
        // Assigning maximum of a and b to b 
        // and assigning minimum of a and b to a. 
        int temp = a; 
        a = Math.min(a, b); 
        b = Math.max(temp, b); 
  
        // if d is greater than or equal to b. 
        if (d >= b) 
            return (d + b - 1) / b; 
  
        // if d is 0 
        if (d == 0) 
            return 0; 
  
        // if d is equal to a. 
        if (d == a) 
            return 1; 
  
        // else make triangle, and only 2 
        // steps required. 
        return 2; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int a = 3, b = 4, d = 11; 
        System.out.println(minJumps(a, b, d)); 
    } 
} 
  
// This code is contributed by vt_m 

