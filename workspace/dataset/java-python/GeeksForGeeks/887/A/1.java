

// Java program to find number of unordered 
// coprime pairs of integers from 1 to N 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class GFG 
{ 
static final int N = 100005; 
  
// to store euler's 
// totient function 
static int[] phi; 
  
// to store required answer 
static int[] S ; 
  
// Computes and prints totient  
// of all numbers smaller than 
// or equal to N. 
static void computeTotient() 
{ 
    // Initialise the phi[] with 1 
    for (int i = 1; i < N; i++) 
        phi[i] = i; 
  
    // Compute other Phi values 
    for (int p = 2; p < N; p++)  
    { 
  
        // If phi[p] is not computed  
        // already, then number p is prime 
        if (phi[p] == p)  
        { 
  
            // Phi of a prime number p  
            // is always equal to p-1. 
            phi[p] = p - 1; 
  
            // Update phi values of  
            // all multiples of p 
            for (int i = 2 * p; i < N; i += p)  
            { 
  
                // Add contribution of p to  
                // its multiple i by multiplying  
                // with (1 - 1/p) 
                phi[i] = (phi[i] / p) * (p - 1); 
            } 
        } 
    } 
} 
  
// function to compute 
// number coprime pairs 
static void CoPrimes() 
{ 
    // function call to compute 
    // euler totient function 
    computeTotient(); 
  
    // prefix sum of all euler  
    // totient function values 
    for (int i = 1; i < N; i++) 
        S[i] = S[i - 1] + phi[i]; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    phi = new int[N];  
    S = new int[N]; 
      
    // function call 
    CoPrimes(); 
  
    int q[] = { 3, 4 }; 
    int n = q.length; 
      
    for (int i = 0; i < n; i++) 
        System.out.println("Number of unordered coprime\n" +  
                           "pairs of integers from 1 to " +  
                                q[i] + " are " + S[q[i]] ); 
} 
} 
  
// This code is contributed  
// by Subhadeep 

