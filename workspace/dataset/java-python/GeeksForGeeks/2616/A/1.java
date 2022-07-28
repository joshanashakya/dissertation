

// Java program to find maximum 
// number moves possible 
import java.io.*; 
  
class GFG  
{ 
      
static int N= 1000005; 
  
// To store number of prime 
// factors of each number 
static int primeFactors[] = new int[N]; 
  
// Function to find number of prime 
// factors of each number 
static void findPrimeFactors() 
{ 
    for (int i = 2; i < N; i++) 
      
        // if i is a prime number 
        if (primeFactors[i] == 0) 
            for (int j = i; j < N; j += i) 
              
                // increase value by one from 
                // it's preveious multiple 
                primeFactors[j] = primeFactors[j / i] + 1; 
  
    // make prefix sum 
    // this will be helpful for 
    // multiple test cases 
    for (int i = 1; i < N; i++) 
        primeFactors[i] += primeFactors[i - 1]; 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
  
    // Generate primeFactors array 
    findPrimeFactors(); 
    int a = 6, b = 3; 
      
    // required answer 
    System.out.println (primeFactors[a] -  
                        primeFactors[b]); 
} 
} 
  
// This code is contributed by jit_t. 

