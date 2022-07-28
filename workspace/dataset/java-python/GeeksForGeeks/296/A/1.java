

// Java implementation of the above approach  
import java.util.*; 
  
class GFG  
{ 
    static final int M = 1000000007; 
  
    // Iterative function to calculate  
    // (x^y)%p in O(log y)  
    static long power(long x, int y, int p)  
    {  
      
        // Initialize result  
        long res = 1;  
      
        // Update x if it is greater  
        // than or equal to p  
        x = x % p;  
      
        while (y > 0) 
        {  
      
            // If y is odd then multiply  
            // x with the result  
            if ((y & 1) == 1)  
                res = (res * x) % p;  
      
            // y must be even now  
            y = y >> 1; // y = y/2  
            x = (x * x) % p;  
        }  
        return res;  
    }  
      
    // Function to return n^(-1) mod p  
    static long modInverse(long n, int p)  
    {  
        return power(n, p - 2, p);  
    }  
      
    // Function to return (nCr % p) using  
    // Fermat's little theorem  
    static long nCrModPFermat(long n, int r, int p)  
    {  
        // Base case  
        if (r == 0)  
            return 1;  
      
        // Fill factorial array so that we  
        // can find all factorial of r, n  
        // and n-r  
        long fac[] = new long[(int)n + 1];  
        fac[0] = 1;  
        int i ; 
        for ( i = 1; i <= n; i++)  
            fac[i] = fac[i - 1] * i % p;  
      
        return (fac[(int)n] * modInverse(fac[r], p) % p *  
                              modInverse(fac[(int)n - r], p) % p) % p;  
    }  
      
    // Function to return the count of  
    // odd numbers from 1 to n  
    static long countOdd(long n)  
    {  
        long x = n / 2;  
        if (n % 2 == 1)  
            x++;  
        return x;  
    }  
      
    // Function to return the count of  
    // even numbers from 1 to n  
    static long counteEven(long n)  
    {  
        long x = n / 2;  
        return x;  
    }  
      
    // Function to return the count  
    // of the required sequences  
    static long CountEvenSumSequences(long n)  
    {  
        long count = 0;  
      
        for (int i = 0; i <= n; i++) 
        {  
      
            // Take i even and n - i odd numbers  
            int even = i, odd = (int)n - i;  
      
            // Number of odd numbers must be even  
            if (odd % 2 == 1)  
                continue;  
      
            // Total ways of placing n - i odd  
            // numbers in the sequence of n numbers  
            long tot = (power(countOdd(n), odd, M) *  
                          nCrModPFermat(n, odd, M)) % M;  
            tot = (tot * power(counteEven(n), i, M)) % M;  
      
            // Add this number to the final answer  
            count += tot;  
            count %= M;  
        }  
        return count;  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    {  
      
        long n = 5;  
      
        System.out.println(CountEvenSumSequences(n));  
    }  
} 
  
// This code is contributed by AnkitRai01 

