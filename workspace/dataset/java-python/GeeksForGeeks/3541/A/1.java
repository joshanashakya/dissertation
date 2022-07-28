

// Java program for above approach 
class GFG 
{ 
  
// Function to find max count of primes 
static int maxPrimes(int n) 
{ 
    // if n is even n/2 is required answer 
    // if n is odd floor(n/2) = (int)(n/2) 
    // is required answer 
    return n / 2; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int n = 17; 
  
    System.out.println(maxPrimes(n)); 
} 
} 
  
// This code is contributed 
// by Code_Mech 

