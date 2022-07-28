

// Java program to print the  
// Kth prime greater than N 
import java.util.*; 
  
class GFG  
{ 
  
// set the MAX_SIZE of the array to 10^6 
static int MAX_SIZE = (int) 1e6; 
  
// initialize the prime array 
static boolean []prime = new boolean[MAX_SIZE + 1]; 
  
static void sieve() 
{ 
  
    // set all numbers as prime for time being 
    Arrays.fill(prime, true); 
  
    for (int p = 2; p * p <= MAX_SIZE; p++)  
    { 
  
        // if prime[p] is not changed,  
        // then it is a prime 
        if (prime[p] == true) 
        { 
  
            // update all multiples of p 
            for (int i = p * p;  
                     i <= MAX_SIZE; i += p) 
                prime[i] = false; 
        } 
    } 
} 
  
// Function to find the kth prime greater than n 
static int kthPrimeGreaterThanN(int n, int k) 
{ 
  
    int res = -1; 
      
    // looping through the numbers greater than n 
    for (int i = n + 1; i < MAX_SIZE; i++) 
    { 
  
        // decrement k if i is prime 
        if (prime[i] == true) 
            k--; 
  
        // store the kth prime greater than n 
        if (k == 0)  
        { 
            res = i; 
            break; 
        } 
    } 
    return res; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    sieve(); 
    int n = 2, k = 15; 
  
    // Print the kth prime number greater than n 
    System.out.println(kthPrimeGreaterThanN(n, k)); 
} 
}  
  
// This code is contributed by 29AjayKumar 

