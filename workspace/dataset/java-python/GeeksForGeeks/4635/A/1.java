

// Formula based Java program  
// to find sum of all divisors 
// of n. 
import java.io.*; 
import java.math.*; 
  
class GFG { 
      
    // Returns sum of all 
    // factors of n. 
    static int sumofoddFactors(int n) 
    { 
        // Traversing through  
        // all prime factors. 
        int res = 1; 
      
        // ignore even factors by 
        // removing all powers 
        // of 2 
        while (n % 2 == 0) 
            n = n / 2; 
      
        for (int i = 3; i <= Math.sqrt(n); i++) 
        { 
      
            // While i divides n, print i  
            // and divide n 
            int count = 0, curr_sum = 1; 
            int curr_term = 1; 
            while (n % i == 0) 
            { 
                count++; 
      
                n = n / i; 
      
                curr_term *= i; 
                curr_sum += curr_term; 
            } 
      
            res *= curr_sum; 
              
        } 
      
        // This condition is to handle 
        // the case when n is a  
        // prime number. 
        if (n >= 2) 
            res *= (1 + n); 
      
        return res; 
    } 
      
    // Driver code 
    public static void main(String args[]) 
                        throws IOException 
    { 
        int n = 30; 
        System.out.println(sumofoddFactors(n)); 
    } 
} 
  
/* This code is contributed by Nikita Tiwari.*/

