

// Java program for above implementation 
import java.io.*; 
  
class GFG  
{ 
static int nCr(int n, int r) 
{ 
    int fac[] = new int[100] ; 
    for(int i = 0; i < n; i++) 
    fac[i] = 1; 
      
    for (int i = 1 ; i < n + 1 ; i++) 
    { 
        fac[i] = fac[i - 1] * i ; 
    } 
      
    int ans = fac[n] / (fac[n - r] *  
                        fac[r]); 
    return ans ; 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int n = 3 ; 
    int k = 3 ; 
      
    int ans = nCr(n + k - 1 , k) +  
              nCr(k - 1, n - 1); 
      
    System.out.println(ans) ; 
} 
} 
  
// This code is contributed 
// by anuj_67 

