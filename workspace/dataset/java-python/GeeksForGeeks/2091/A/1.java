

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
static int MAX = 1000000; 
  
// To store whether a number is prime or not 
static boolean []prime = new boolean[MAX]; 
  
// Function for Sieve of Eratosthenes 
static void SieveOfEratosthenes() 
{ 
    // Create a boolean array "prime[0..n]" and  
    // initialize all entries it as true.  
    // A value in prime[i] will finally be false 
    // if i is Not a prime, else true. 
    for (int i = 0; i < MAX; i++) 
        prime[i] = true; 
  
    for (int p = 2; p * p < MAX; p++)  
    { 
  
        // If prime[p] is not changed 
        // then it is a prime 
        if (prime[p])  
        { 
  
            // Update all multiples of p greater than or 
            // equal to the square of it 
            // numbers which are multiple of p and are 
            // less than p^2 are already been marked. 
            for (int i = p * p; i < MAX; i += p) 
                prime[i] = false; 
        } 
    } 
} 
  
// Function to return the sum of 
// primes in the Kth array 
static int sumPrime(int k) 
{ 
  
    // Update vector v to store all the 
    // prime numbers upto MAX 
    SieveOfEratosthenes(); 
    Vector<Integer> v = new Vector<>(); 
    for (int i = 2; i < MAX; i++)  
    { 
        if (prime[i]) 
            v.add(i); 
    } 
  
    // To store the sum of primes 
    // in the kth array 
    int sum = 0; 
  
    // Count of primes which are in 
    // the arrays from 1 to k - 1 
    int skip = (k * (k - 1)) / 2; 
  
    // k is the number of primes 
    // in the kth array 
    while (k > 0) 
    { 
        sum += v.get(skip); 
        skip++; 
  
        // A prime has been 
        // added to the sum 
        k--; 
    } 
  
    return sum; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int k = 3; 
  
    System.out.println(sumPrime(k)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

