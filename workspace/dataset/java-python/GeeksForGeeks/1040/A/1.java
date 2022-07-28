

// Java  program to count common prime factors 
 // of a and b. 
  
import java.io.*; 
  
class GFG { 
    // Recursive function to return gcd of a and b  
    static int __gcd(int a, int b)  
    {  
        // Everything divides 0   
        if (a == 0)  
          return b;  
        if (b == 0)  
          return a;  
         
        // base case  
        if (a == b)  
            return a;  
         
        // a is greater  
        if (a > b)  
            return __gcd(a-b, b);  
        return __gcd(a, b-a);  
    }  
// A function to count all prime factors of 
// a given number x 
 static int countPrimeFactors(int x) 
{ 
    int res = 0; 
    if (x % 2 == 0) { 
        res++; 
  
        // Print the number of 2s that divide x 
        while (x % 2 == 0) 
            x = x / 2; 
    } 
  
    // x must be odd at this point. So we  
    // can skip one element (Note i = i +2) 
    for (int i = 3; i <= Math.sqrt(x); i = i + 2) { 
        if (x % i == 0) { 
  
            // While i divides x, print i and  
            // divide x 
            res++; 
            while (x % i == 0) 
                x = x / i; 
        } 
    } 
  
    // This condition is to handle the case  
    // when x is a prime number greater than 2 
    if (x > 2) 
        res++; 
    return res; 
} 
  
// Count of common prime factors 
static int countCommonPrimeFactors(int a, int b) 
{ 
    // Get the GCD of the given numbers 
    int gcd = __gcd(a, b); 
  
    // Count prime factors in GCD 
    return countPrimeFactors(gcd); 
} 
  
// Driver code 
  
  
    public static void main (String[] args) { 
    int a = 6, b = 12; 
    System.out.println(countCommonPrimeFactors(a, b)); 
    } 
} 
// This code is contributed by inder_verma.. 

