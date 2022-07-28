

// Java implementation of the approach 
import java.io.*; 
  
class GFG  
{ 
      
static int MAX = 100001; 
static int prefix[] = new int[MAX]; 
  
// Function to calculate the prefix sum 
// of all the odd factors 
static void sieve_modified() 
{ 
    for (int i = 1; i < MAX; i += 2)  
    { 
  
        // Add i to all the multiples of i 
        for (int j = i; j < MAX; j += i) 
            prefix[j] += i; 
    } 
  
    // Update the prefix sum 
    for (int i = 1; i < MAX; i++) 
        prefix[i] += prefix[i - 1]; 
} 
  
// Function to return the sum of 
// all the odd factors of the 
// numbers in the given range 
static int sumOddFactors(int L, int R) 
{ 
    return (prefix[R] - prefix[L - 1]); 
} 
  
    // Driver code 
    public static void main (String[] args) 
    { 
        sieve_modified(); 
        int l = 6, r = 10; 
        System.out.println (sumOddFactors(l, r)); 
    } 
} 
  
// This code is contributed by jit_t 

