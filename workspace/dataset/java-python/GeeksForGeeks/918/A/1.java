

// Java program to find GCD of a^n and b. 
  
import java.io.*; 
  
class GFG { 
  
  
static long gcd(long a, long b) 
{ 
    if (a == 0) 
        return b; 
    return gcd(b % a, a); 
} 
  
// Returns GCD of a^n and b. 
static long powGCD(long a, long n, long b) 
{ 
    for (int i = 0; i < n; i++) 
        a = a * a; 
  
    return gcd(a, b); 
} 
  
// Driver code 
    public static void main (String[] args) { 
    long a = 10, b = 5, n = 2; 
    System.out.println(powGCD(a, n, b)); 
    } 
} 
// This code is contributed by anuj_67.. 

