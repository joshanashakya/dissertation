

// Java program to find largest x such that p*x divides n! 
import java.io.*; 
  
class GFG  
{ 
    // Function that returns largest power of p  
    // that divides n! 
    static int Largestpower(int n, int p) 
    { 
        // Initialize result 
        int ans = 0; 
  
        // Calculate x = n/p + n/(p^2) + n/(p^3) + .... 
        while (n > 0) 
        { 
            n /= p; 
            ans += n; 
        } 
        return ans; 
    } 
  
    // Driver program 
    public static void main (String[] args)  
    { 
        int n = 10; 
        int p = 3; 
        System.out.println(" The largest power of " + p + " that divides "
                + n + "! is " + Largestpower(n, p)); 
          
          
    } 
} 

