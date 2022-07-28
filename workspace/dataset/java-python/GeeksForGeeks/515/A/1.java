

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
// Function for Sieve of Eratosthenes 
static void sieve(boolean prime[], int n) 
{ 
    prime[0] = false; 
    prime[1] = false; 
    for (int p = 2; p * p <= n; p++) 
    { 
        if (prime[p] == true) 
        { 
            for (int i = p * p; 
                     i <= n; i += p) 
                prime[i] = false; 
        } 
    } 
} 
  
// Function to return the sum of 
// the required prime numbers 
static int sumPrime(int d) 
{ 
  
    // Maximum number of the required range 
    int maxVal = (int) (Math.pow(2, d) - 1); 
  
    // Sieve of Eratosthenes 
    boolean []prime = new boolean[maxVal + 1]; 
    Arrays.fill(prime, true); 
    sieve(prime, maxVal); 
  
    // To store the required sum 
    int sum = 0; 
  
    for (int i = 2; i <= maxVal; i++) 
    { 
  
        // If current element is prime 
        if (prime[i])  
        { 
            sum += i; 
        } 
    } 
    return sum; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int d = 8; 
  
    System.out.println(sumPrime(d)); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

