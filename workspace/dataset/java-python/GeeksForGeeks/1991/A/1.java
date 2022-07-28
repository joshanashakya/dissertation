

// Java implementation of the above approacdh 
import java.util.*; 
  
class GFG 
{ 
  
// Function to calculate gcd of two number 
static int gcd(int a, int b) 
{ 
    if (b == 0) 
        return a; 
    else
        return gcd(b, a % b); 
} 
  
// Function to check if two  
// numbers are coprime or not 
static boolean coPrime(int n1, int n2) 
{ 
    // two numbers are coprime 
    // if their gcd is 1 
    if (gcd(n1, n2) == 1) 
        return true; 
    else
        return false; 
} 
  
// Function to find largest integer less 
// than or equal to N/2 and coprime with N 
static int largestCoprime(int N) 
{ 
    int half = (int)(N / 2); 
  
    // Check one by one all numbers 
    // less than or equal to N/2 
    while (coPrime(N, half) == false) 
        half--; 
  
    return half; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int n = 50; 
    System.out.println(largestCoprime(n)); 
} 
} 
  
// This code is contributed by 
// Surendra_Gangwar 

