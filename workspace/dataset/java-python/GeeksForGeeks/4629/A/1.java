

// Java program to find the product of 
// the multiplication of 
// prime numbers in all possible subsets. 
import java.util.*; 
  
class GFG  
{ 
  
// Sieve method to check prime or not 
static void sieve(int n, boolean []prime) 
{ 
    // Initially mark all primes 
    for (int i = 2; i <= n; i++) 
        prime[i] = true; 
    prime[0] = prime[1] = false; 
  
    // Iterate and mark all the 
    // non primes as false 
    for (int i = 2; i <= n; i++) 
    { 
        if (prime[i])  
        { 
            // Multiples of prime marked as false 
            for (int j = i * i; j <= n; j += i)  
            { 
                prime[j] = false; 
            } 
        } 
    } 
} 
  
// Function to find the sum 
// of sum of all the subset 
static int sumOfSubset(int a[], int n) 
{ 
  
    // Get the maximum element 
    int maxi = Arrays.stream(a).max().getAsInt(); 
  
    // Declare a sieve array 
    boolean []prime = new boolean[maxi + 1]; 
  
    // Sieve function called 
    sieve(maxi, prime); 
  
    // Number of times an element 
    // contributes to the answer 
    int times = (int) Math.pow(2, n - 1); 
  
    int sum = 1; 
  
    // Iterate and check 
    for (int i = 0; i < n; i++)  
    { 
        // If prime 
        if (prime[a[i]]) 
        sum = (int) (sum * (Math.pow(a[i], times))); 
    } 
  
    return sum; 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
    int a[] = { 3, 7 }; 
    int n = a.length; 
    System.out.println(sumOfSubset(a, n)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

