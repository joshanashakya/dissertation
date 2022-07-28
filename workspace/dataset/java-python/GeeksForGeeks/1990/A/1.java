

// Java program to implement above approach 
  
class GFG 
{ 
  
static int __gcd(int a,int b) 
{ 
    if(b == 0) 
    return a; 
    return __gcd(b, a % b); 
} 
  
// Recursive function to count 
// the number of unset bits 
static int countBits(int n) 
{ 
    // Base case 
    if (n == 0) 
        return 0; 
  
    // unset bit count 
    else
        return ((n & 1) == 0 ? 1 : 0) + countBits(n >> 1); 
} 
  
// Function to return the max gcd 
static int maxGcd(int n) 
{ 
  
    // If no unset bits 
    if (countBits(n) == 0) 
    { 
        // Find the maximum factor 
        for (int i = 2; i * i <= n; i++)  
        { 
            // Highest factor 
            if (n % i == 0) 
            { 
                return n / i; 
            } 
        } 
    } 
    else
    { 
  
        int val = 0; 
        int power = 1; 
        int dupn = n; 
  
        // Find the flipped bit number 
        while (n > 0)  
        { 
            // If bit is not set 
            if ((n & 1) == 0)  
            { 
                val += power; 
            } 
  
            // Next power of 2 
            power = power * 2; 
  
            // Right shift the number 
            n = n >> 1; 
        } 
  
        // Return the answer 
        return __gcd(val ^ dupn, val & dupn); 
    } 
  
    // If a prime number 
    return 1; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    // First example 
    int n = 5; 
    System.out.println(maxGcd(n)); 
  
    // Second example 
    n = 15; 
    System.out.println(maxGcd(n)); 
} 
} 
  
// This code contributed by Rajput-Ji 

