

// JAVA code to find 
// Sum of series 
  
class GFG { 
  
    // function to calculate sum of series 
    static long calculateSum(int n, int k) 
    { 
  
        // Initialize res and MOD 
  
        long res = 1; 
        long MOD = 1000000007; 
  
        // loop to calculate n^k % MOD 
        for (int i = 0; i < k; i++) { 
  
            res = (res * n) % MOD; 
        } 
  
        return res; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
  
        int n = 4; 
        int k = 3; 
        System.out.print(calculateSum(n, k)); 
    } 
}; 

