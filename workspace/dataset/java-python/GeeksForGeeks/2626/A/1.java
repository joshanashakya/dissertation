

// JAVA code to find sum of series 
  
class GFG { 
  
    // Function to calculate sum of series 
    static long calculateSum(int n, int k) 
    { 
  
        // initialize res and MOD 
        int res = 1; 
        int MOD = 1000000007; 
  
        // loop to calculate n^k % MOD 
        // using modular Arithmetic 
        while (k > 0) { 
            // if k is odd 
            // multiply n with res 
            if ((k & 1) == 1) 
                res = (res * n) % MOD; 
  
            // k must be even now 
            // change k to k / 2 
            k = k / 2; 
  
            // change n to n^2 
            n = (n * n) % MOD; 
        } 
        return res; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 4, k = 3; 
        System.out.print(calculateSum(n, k)); 
    } 
}; 

