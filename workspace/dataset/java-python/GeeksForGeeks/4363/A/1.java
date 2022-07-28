

// Java code for above program to find product 
// under modulo. 
class GFG { 
      
    static final int MOD = 1000000007; 
  
    static int product(int ar[], int n) 
    { 
        int result = 1; 
        for (int i = 0; i < n; i++) 
            result = (result * ar[i]) % MOD; 
              
        return result; 
    } 
  
    // driver code for the above program 
    public static void main(String[] args) 
    { 
        int ar[] = { 1, 2, 3, 4, 5 }; 
        int n = ar.length; 
          
        System.out.printf("%d", product(ar, n)); 
    } 
} 
  
// This code is contributed by  Smitha Dinesh Semwal. 

