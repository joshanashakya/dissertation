

// Java implementation of the above approach  
class GFG 
{ 
  
static final int mod = 1000000007;  
  
// Function to compute a^n % mod  
static long power(long a, long n)  
{  
  
    if (n == 0)  
        return 1;  
  
    long p = power(a, n / 2) % mod;  
    p = (p * p) % mod;  
    if ((n & 1) == 1)  
        p = (p * a) % mod;  
  
    return p;  
}  
  
// Function to count permutations that are  
// first decreasing and then increasing  
static int countPermutations(int n)  
{  
  
    // For n = 1 return 0  
    if (n == 1)  
    {  
        return 0;  
    }  
  
    // Calculate and return result  
    return ((int)power(2, n - 1) - 2) % mod;  
}  
  
// Driver code  
public static void main(String args[]) 
{  
    int n = 5;  
    System.out.println(countPermutations(n));  
}  
} 
  
// This code is contributed by Arnab Kundu 

