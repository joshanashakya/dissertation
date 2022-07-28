

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
// check if a number is prime or not 
static boolean isPrime(int x) 
{ 
    // run a loop upto square root of x 
    for (int i = 2; i * i <= x; i++)  
    { 
        if (x % i == 0) 
            return false; 
    } 
    return true; 
} 
  
// Function to return the minimized cost 
static int minimumCost(int n) 
{ 
    // If n is prime 
    if (isPrime(n)) 
        return 1; 
  
    // If n is odd and can be 
    // split into (prime + 2) 
    // then cost will be 1 + 1 = 2 
    if (n % 2 == 1 && isPrime(n - 2)) 
        return 2; 
  
    // Every non-prime even number 
    // can be expressed as the 
    // sum of two primes 
    if (n % 2 == 0) 
        return 2; 
  
    // n is odd so n can be split into (3 + even) 
    // further even part can be 
    // split into (prime + prime) 
    // (3 + prime + prime) will cost 3 
    return 3; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int n = 6; 
    System.out.println(minimumCost(n)); 
} 
} 
  
// This code is contributed by 
// Surendra_Gangwar 

