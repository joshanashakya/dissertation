

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
static int MAX = 100000; 
  
static boolean []prime = new boolean[MAX + 1]; 
  
static void SieveOfEratosthenes() 
{ 
  
    // Create a boolean array "prime[0..n]" and  
    // initialize all entries it as true.  
    // A value in prime[i] will finally be false 
    // if i is Not a prime, else true. 
    for (int i = 0; i < MAX + 1; i++) 
    { 
        prime[i] = true; 
    } 
    for (int p = 2; p * p <= MAX; p++)  
    { 
  
        // If prime[p] is not changed, 
        // then it is a prime 
        if (prime[p] == true)  
        { 
  
            // Update all multiples of p greater than or 
            // equal to the square of it 
            // numbers which are multiple of p and are 
            // less than p^2 are already been marked. 
            for (int i = p * p; i <= MAX; i += p) 
                prime[i] = false; 
        } 
    } 
} 
  
// Function to return the smallest prime 
// number with d digits 
static int smallestPrime(int d) 
{ 
    int l = (int) Math.pow(10, d - 1); 
    int r = (int) Math.pow(10, d) - 1; 
    for (int i = l; i <= r; i++) 
    { 
  
        // check if prime 
        if (prime[i]) 
        { 
            return i; 
        } 
    } 
    return -1; 
} 
  
// Function to return the largest prime 
// number with d digits 
static int largestPrime(int d) 
{ 
    int l = (int) Math.pow(10, d - 1); 
    int r = (int) Math.pow(10, d) - 1; 
    for (int i = r; i >= l; i--)  
    { 
  
        // check if prime 
        if (prime[i]) 
        { 
            return i; 
        } 
    } 
    return -1; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    SieveOfEratosthenes(); 
  
    int queries[] = { 2, 5 }; 
    int q = queries.length; 
  
    // Perform queries 
    for (int i = 0; i < q; i++) 
    { 
        System.out.println(smallestPrime(queries[i]) + " " +  
                           largestPrime(queries[i])); 
    } 
} 
}  
  
// This code is contributed by Rajput-Ji 

