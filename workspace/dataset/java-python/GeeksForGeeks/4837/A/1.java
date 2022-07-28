

// Java program to check whether number has 
// exactly four distinct factors or not 
import java.util.*; 
class GFG{ 
// Initialize global variable according 
// to given condition so that it can be 
// accessible to all function 
static int N = (int)1E6; 
static boolean[] fourDiv=new boolean[N + 1]; 
  
// Function to calculate all number having 
// four distinct distinct factors 
static void fourDistinctFactors() 
{ 
    // Create a boolean array "prime[0..n]" and  
    // initialize all entries it as true. A value  
    // in prime[i] will finally be false if i is  
    // not a prime, else true. 
    boolean[] primeAll=new boolean[N + 1]; 
  
    for (int p = 2; p * p <= N; p++) { 
  
        // If prime[p] is not changed, then it 
        // is a prime 
        if (primeAll[p] == false) { 
  
            // Update all multiples of p 
            for (int i = p * 2; i <= N; i += p) 
                primeAll[i] = true; 
        } 
    } 
  
    // Initialize prime[] array which will 
    // contains all the primes from 1-N 
    ArrayList<Integer> prime=new ArrayList<Integer>(); 
  
    for (int p = 2; p <= N; p++) 
        if (!primeAll[p]) 
            prime.add(p); 
  
  
    // Iterate over all the prime numbers 
    for (int i = 0; i < prime.size(); ++i) { 
        int p = prime.get(i); 
  
        // Mark cube root of prime numbers 
        if (1L * p * p * p <= N) 
            fourDiv[p * p * p] = true; 
  
        for (int j = i + 1; j < prime.size(); ++j) { 
            int q = prime.get(j); 
  
            if (1L * p * q > N) 
                break; 
  
            // Mark product of prime numbers 
            fourDiv[p * q] = true; 
        } 
    } 
} 
  
// Driver program 
public static void main(String[] args) 
{ 
    fourDistinctFactors(); 
  
    int num = 10; 
    if (fourDiv[num]) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
  
    num = 12; 
    if (fourDiv[num]) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
  
} 
} 
// This code is contributed by mits 

