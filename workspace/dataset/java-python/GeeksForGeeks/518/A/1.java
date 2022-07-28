

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
static int sz = 100000; 
static boolean isPrime[] = new boolean[sz + 1]; 
  
// Function for Sieve of Eratosthenes 
static void sieve() 
{ 
    for(int i = 0; i <= sz; i++) 
    isPrime[i] = true; 
      
    isPrime[0] = isPrime[1] = false; 
  
    for (int i = 2; i * i <= sz; i++)  
    { 
        if (isPrime[i])  
        { 
            for (int j = i * i; j < sz; j += i)  
            { 
                isPrime[j] = false; 
            } 
        } 
    } 
} 
  
// Function to print all the prime 
// numbers with d digits 
static void findPrimesD(int d) 
{ 
  
    // Range to check integers 
    int left = (int)Math.pow(10, d - 1); 
    int right = (int)Math.pow(10, d) - 1; 
  
    // For every integer in the range 
    for (int i = left; i <= right; i++) 
    { 
  
        // If the current integer is prime 
        if (isPrime[i])  
        { 
            System.out.print(i + " "); 
        } 
    } 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
  
    // Generate primes 
    sieve(); 
    int d = 1; 
    findPrimesD(d); 
} 
} 
  
// This code is contributed by Arnab Kundu 

