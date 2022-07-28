

// Java program to find maximum  
// number of prime factors in  
// first N natural numbers 
  
class GFG 
{ 
// Return maximum number  
// of prime factors for 
// any number in [1, N] 
static int maxPrimefactorNum(int N) 
{ 
    if (N < 2) 
        return 0; 
  
    // Based on Sieve of Eratosthenes 
    // https://www.geeksforgeeks.org/sieve-of-eratosthenes/ 
    boolean[] arr = new boolean[N + 1]; 
    int prod = 1, res = 0; 
    for (int p = 2; p * p <= N; p++) 
    { 
        // If p is prime 
        if (arr[p] == false) 
        { 
            for (int i = p * 2;  
                     i <= N; i += p) 
                arr[i] = true; 
  
            // We simply multiply first set 
            // of prime numbers while the 
            // product is smaller than N. 
            prod *= p; 
            if (prod > N) 
                return res; 
            res++; 
        } 
    } 
  
    return res; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int N = 500; 
    System.out.println(maxPrimefactorNum(N)); 
} 
} 
  
// This code is contributed by mits 

