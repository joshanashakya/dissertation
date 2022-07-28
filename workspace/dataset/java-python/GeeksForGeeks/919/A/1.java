

// Java program of the above approach  
import java.util.*; 
class Solution{ 
    
    
/* Calculates modular exponentiation, i.e.,  
   (x^y)%p in O(log y) */
static long power(long x, long y, long p)  
{  
    long res = 1; // Initialize result  
    
    x = x % p; // Update x if it is more than or  
    // equal to p  
    
    while (y > 0) {  
    
        // If y is odd, multiply x with result  
        if ((y & 1)!=0)  
            res = (res * x) % p;  
    
        // y must be even now  
        y = y >> 1; // y = y/2  
        x = (x * x) % p;  
    }  
    return res;  
}  
    
    
static long gcd(long a, long b)  
{  
    if (a == 0)  
        return b;  
    return gcd(b % a, a);  
}  
    
// Returns GCD of a^n and b  
static long powerGCD(long a, long b, long n)  
{  
    long e = power(a, n, b);  
    return gcd(e, b);  
}  
    
// Driver code  
public static void main(String args[]) 
{  
    long a = 5, b = 4, n = 2;  
    System.out.print( powerGCD(a, b, n));  
  
}  
} 
//contributed by Arnab Kundu 

