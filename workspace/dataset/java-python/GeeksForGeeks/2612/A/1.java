

// Java program to maximize the value 
// of x such that n! % (k^x) = 0 
  
import java.util.*; 
  
public class GfG { 
  
    // Function to maximize the value 
    // of x such that n! % (k^x) = 0 
    private static int findX(int n, int k) 
    { 
        int r = n, v, u; 
  
        // Find square root of k and add 1 to it 
        int m = (int)Math.sqrt(k) + 1; 
  
        // Run the loop from 2 to m and k 
        // sould be greater than 1 
        for (int i = 2; i <= m && k > 1; i++) { 
            if (i == m) { 
                i = k; 
            } 
  
            // optimize the value of k 
            for (u = v = 0; k % i == 0; v++) { 
                k /= i; 
            } 
  
            if (v > 0) { 
                int t = n; 
                while (t > 0) { 
                    t /= i; 
                    u += t; 
                } 
  
                // Minimum store 
                r = Math.min(r, u / v); 
            } 
        } 
  
        return r; 
    } 
  
    // Driver Code 
    public static void main(String args[]) 
    { 
        int n = 5; 
        int k = 2; 
  
        System.out.println(findX(n, k)); 
    } 
} 

