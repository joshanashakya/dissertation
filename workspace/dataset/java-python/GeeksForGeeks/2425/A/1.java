

// Java program to check whether there 
// exist at least k or not in range [2..n] 
import java.util.*;  
class GFG{ 
static ArrayList<Integer> primes = new ArrayList<Integer>(); 
// Generating all the prime numbers 
// from 2 to n. 
static void SieveofEratosthenes(int n) 
{ 
    boolean[] visited=new boolean[n*n+2]; 
    for (int i = 2; i <= n + 1; i++) 
        if (!visited[i]) { 
            for (int j = i * i; j <= n + 1; j += i) 
                visited[j] = true; 
            primes.add(i); 
        } 
} 
  
static boolean specialPrimeNumbers(int n, int k) 
{ 
    SieveofEratosthenes(n); 
    int count = 0; 
    for (int i = 0; i < primes.size(); i++) { 
        for (int j = 0; j < i - 1; j++) { 
  
            // If a prime number is Special prime 
            // number, then we increments the 
            // value of k. 
            if (primes.get(j) + primes.get(j + 1) + 1
                == primes.get(i)) { 
                count++; 
                break; 
            } 
        } 
  
        // If at least k Special prime numbers 
        // are present, then we return 1. 
        // else we return 0 from outside of 
        // the outer loop. 
        if (count == k) 
            return true; 
    } 
    return false; 
} 
  
// Driver function 
public static void main(String[] args) 
{ 
    int n = 27, k = 2; 
    if (specialPrimeNumbers(n, k)) 
        System.out.println("YES"); 
    else
        System.out.println("NO"); 
} 
} 
// This code is contributed by mits 

