

// Java program to print the  
// nearest prime number by 
// sequentially adding the 
// prime numbers  
import java.util.*; 
  
class GFG  
{ 
  
// Function to store prime 
// numbers using prime seive 
static void prime_seive(int MAX, int []isprime, 
                        Vector<Integer> prime) 
{ 
      
    // iterate for all 
    // the numbers  
    int i = 2; 
    while (i * i <= MAX) 
    { 
          
        // If prime[p] is not changed,  
        // then it is a prime 
        if (isprime[i] == 1) 
        { 
              
            // append the prime 
            // to the list  
            prime.add(i); 
              
            // Update all multiples of p 
            for (int j = i * 2; 
                     j < MAX; j += i) 
            { 
                isprime[j] = 0; 
            } 
        } 
                  
        i += 1; 
    } 
} 
          
// Function to print  
// the nearest prime  
static int printNearest(int N) 
{ 
    int MAX = (int) 1e6; 
      
    // store all the  
    // index with 1 except 0,1 index  
    int [] isprime = new int[MAX]; 
    for(int i = 2; i < MAX; i++) 
        isprime[i] = 1; 
      
    // list to store  
    // prime numbers 
    Vector<Integer> prime = new Vector<Integer>(); 
      
    // variable to add primes  
    int i = 0; 
      
    // call the seive function  
    prime_seive(MAX, isprime, prime); 
      
    // Keep on adding prime  
    // numbers till the nearest  
    // prime number is achieved  
    while (isprime[N] == 0) 
    { 
        N += prime.get(i); 
        i += 1; 
    } 
      
    // return the  
    // nearest prime  
    return N ; 
} 
  
// Driver Code  
public static void main(String[] args) 
{ 
    int N = 8; 
    System.out.printf("%d", printNearest(N)); 
} 
}  
  
// This code is contributed by Rajput-Ji 

