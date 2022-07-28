

// Java implementation of the above approach. 
class GFG  
{ 
  
// Function to return a^n 
static long power(long a, long n) 
{ 
    if (n == 0) 
        return 1; 
  
    long p = power(a, n / 2); 
    p = p * p; 
  
    if (n%2== 1) 
        p = p * a; 
  
    return p; 
} 
  
// Function to return count of integers 
// that satisfy n % phi(n) = 0 
static int countIntegers(long l, long r) 
{ 
  
    long ans = 0, i = 1; 
    long v = power(2, i); 
  
    while (v <= r)  
    { 
        while (v <= r)  
        { 
  
            if (v >= l) 
                ans++; 
            v = v * 3; 
        } 
  
        i++; 
        v = power(2, i); 
    } 
  
    if (l == 1) 
        ans++; 
  
    return (int) ans; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    long l = 12, r = 21; 
    System.out.println(countIntegers(l, r)); 
} 
} 
  
// This code contributed by Rajput-Ji 

