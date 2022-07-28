

//Java implementation of above approach 
import java.util.*; 
class GFG 
{ 
      
static int N = 100000; 
  
// prime[i] stores 1 if i is prime 
static int prime[] = new int[N]; 
  
// divi[i] stores the count of 
// divisors of i 
static int divi[] = new int[N]; 
  
// sum[i] will store the sum of all 
// the integers from 0 to i whose 
// count of divisors is prime 
static int sum[] = new int[N]; 
  
// Function for Sieve of Eratosthenes 
static void SieveOfEratosthenes() 
{ 
    // Create a boolean array "prime[0..n]" and  
    // initialize all entries it as true.  
    // A value in prime[i] will finally be 0  
    // if i is Not a prime, else true. 
    for (int i = 0; i < N; i++) 
        prime[i] = 1; 
  
    // 0 and 1 is not prime 
    prime[0] = prime[1] = 0; 
  
    for (int p = 2; p * p < N; p++)  
    { 
  
        // If prime[p] is not changed,  
        // then it is a prime 
        if (prime[p] == 1)  
        { 
  
            // Update all multiples of p greater than or 
            // equal to the square of it 
            // numbers which are multiple of p and are 
            // less than p^2 are already been marked. 
            for (int i = p * p; i < N; i += p) 
                prime[i] = 0; 
        } 
    } 
} 
  
// Function to count the divisors 
static void DivisorCount() 
{ 
  
    // For each number i we will go to each of 
    // the multiple of i and update the count 
    // of divisor of its multiple j as i is one 
    // of the factor of j 
    for (int i = 1; i < N; i++)  
    { 
        for (int j = i; j < N; j += i)  
        { 
            divi[j]++; 
        } 
    } 
} 
  
// Function for pre-computation 
static void pre() 
{ 
    for (int i = 1; i < N; i++)  
    { 
  
        // If count of divisors of i is prime 
        if (prime[divi[i]] == 1)  
        { 
            sum[i] = i; 
        } 
    } 
  
    // taking prefix sum 
    for (int i = 1; i < N; i++) 
        sum[i] += sum[i - 1]; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int l = 5, r = 8; 
  
    // Find all the prime numbers till N 
    SieveOfEratosthenes(); 
  
    // Update the count of divisors 
    // of all the numbers till N 
    DivisorCount(); 
  
    // Precomputation for the prefix sum array 
    pre(); 
  
    // Perform query 
    System.out.println( sum[r] - sum[l - 1]); 
} 
} 
  
// This code is contributed by Arnab Kundu 

