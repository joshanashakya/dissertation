

// Java implementation of above approach 
import java .io.*; 
  
class GFG 
{ 
      
// Function to return the count of 
// prime factors of a number 
static int countFactors(int n) 
{ 
    int factors = 0; 
  
    for (int i = 2; i * i <= n; i++)  
    { 
        while (n % i == 0)  
        { 
            n /= i; 
            factors += 1; 
        } 
    } 
  
    if (n != 1) 
        factors++; 
  
        return factors; 
} 
  
static int __gcd(int a, int b) 
{ 
    if (b == 0) 
    return a; 
    return __gcd(b, a % b); 
} 
  
// Function to return the minimum  
// number of given operations 
// required to convert A to B 
static int minOperations(int A, int B) 
{ 
    int g = __gcd(A, B); // gcd(A, B); 
  
    // Eliminate the common 
    // factors of A and B 
    A /= g; 
    B /= g; 
  
    // Sum of prime factors 
    return countFactors(A) + countFactors(B); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int A = 10, B = 15; 
  
    System.out.println(minOperations(A, B)); 
} 
} 
  
// This code is contributed 
// by Code_Mech 

