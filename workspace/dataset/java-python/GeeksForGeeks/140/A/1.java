

// Java implementation of the approach 
class GFG  
{ 
static int N = 10000; 
static int MOD = 1000000007; 
  
static int []F = new int[N]; 
  
// Function to pre-compute the sequence 
static void precompute() 
{ 
  
    // For N = 1 the answer will be 2 
    F[1] = 2; 
  
    // Starting two terms of the sequence 
    F[2] = 3; 
    F[3] = 4; 
  
    // Comute the rest of the sequence 
    // with the relation 
    // F[i] = F[i - 1] + F[i - 2] 
    for (int i = 4; i < N; i++) 
        F[i] = (F[i - 1] + F[i - 2]) % MOD; 
} 
  
// Driver code 
public static void main(String []args) 
{ 
    int n = 8; 
  
    // Pre-compute the sequence 
    precompute(); 
  
    System.out.println(F[n]); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

