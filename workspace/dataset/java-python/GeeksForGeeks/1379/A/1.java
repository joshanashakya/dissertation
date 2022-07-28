

// Java approach of finding  
// sum of GCD of all pairs. 
import java.lang.*; 
  
class GFG { 
      
static final int MAX = 100001; 
  
// phi[i] stores euler totient function for i 
// result[j] stores result for value j 
static long phi[] = new long[MAX]; 
static long result[] = new long[MAX]; 
  
// Precomputation of phi[] numbers. 
// Refer below link for details : 
// https://goo.gl/LUqdtY 
static void computeTotient() { 
      
    // Refer https://goo.gl/LUqdtY 
    phi[1] = 1; 
    for (int i = 2; i < MAX; i++) { 
    if (phi[i] == 0) { 
        phi[i] = i - 1; 
        for (int j = (i << 1); j < MAX; j += i) { 
        if (phi[j] == 0) 
            phi[j] = j; 
  
        phi[j] = (phi[j] / i) * (i - 1); 
        } 
    } 
    } 
} 
  
// Precomputes result for all 
// numbers till MAX 
static void sumOfGcdPairs() { 
      
    // Precompute all phi value 
    computeTotient(); 
  
    for (int i = 1; i < MAX; ++i) { 
          
    // Iterate throght all the  
    // divisors of i. 
    for (int j = 2; i * j < MAX; ++j) 
        result[i * j] += i * phi[j]; 
    } 
  
    // Add summation of previous calculated sum 
    for (int i = 2; i < MAX; i++) 
    result[i] += result[i - 1]; 
} 
  
// Driver code 
public static void main(String[] args) { 
      
    // Function to calculate sum of  
    // all the GCD pairs 
    sumOfGcdPairs(); 
  
    int N = 4; 
    System.out.println("Summation of " + N + 
                         " = " + result[N]); 
    N = 12; 
    System.out.println("Summation of " + N +  
                         " = " + result[N]); 
    N = 5000; 
    System.out.print("Summation of " + N +  
                      " = " + +result[N]); 
} 
} 
  
// This code is contributed by Anant Agarwal. 

