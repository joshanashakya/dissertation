

// Java program To calculate  
// The Value Of nCr 
class GFG { 
  
static int nCr(int n, int r) 
{ 
    return fact(n) / (fact(r) * 
                  fact(n - r)); 
} 
  
// Returns factorial of n 
static int fact(int n) 
{ 
    int res = 1; 
    for (int i = 2; i <= n; i++) 
        res = res * i; 
    return res; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 5, r = 3; 
    System.out.println(nCr(n, r)); 
} 
} 
  
// This code is Contributed by 
// Smitha Dinesh Semwal. 

