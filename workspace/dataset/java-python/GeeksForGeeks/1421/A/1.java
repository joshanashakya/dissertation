

// Java program to count  
// number of values that  
// satisfy x^2 = 1 mod p  
// where x lies in range [1, n] 
import java.io.*; 
  
class GFG 
{ 
static int findCountOfSolutions(int n,  
                                int p) 
{ 
    // Initialize result 
    int ans = 0; 
  
    // Traverse all numbers  
    // smaller than given  
    // number p. Note that  
    // we don't traverse from  
    // 1 to n, but 1 to p 
    for (int x = 1; x < p; x++) 
    { 
        // If x is a solution,  
        // then count all numbers 
        // of the form x + i*p  
        // such that x + i*p is  
        // in range [1,n] 
        if ((x * x) % p == 1) 
        { 
            // The largest number  
            // in the form of x +  
            // p*i in range [1, n] 
            int last = x + p * (n / p); 
            if (last > n) 
                last -= p; 
  
            // Add count of numbers  
            // of the form x + p*i.  
            // 1 is added for x itself. 
            ans += ((last - x) / p + 1); 
        } 
    } 
    return ans; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int n = 10; 
    int p = 5; 
    System.out.println( 
               findCountOfSolutions(n, p)); 
} 
} 
  
// This code is contributed by ajit 

