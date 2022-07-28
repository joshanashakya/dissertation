

// Java implementation of counting pairs 
// such that gcd (a, b) = b 
class GFG { 
      
    // returns number of valid pairs 
    static int CountPairs(int n) { 
          
        // initialize k 
        int k = n; 
      
        // loop till imin <= n 
        int imin = 1; 
      
        // Initialize result 
        int ans = 0; 
      
        while (imin <= n) { 
      
            // max i with given k floor(n/k) 
            int imax = n / k; 
          
            // adding k*(number of i with 
            // floor(n/i) = k to ans 
            ans += k * (imax - imin + 1); 
          
            // set imin = imax + 1  
            // and k = n/imin 
            imin = imax + 1; 
            k = n / imin; 
        } 
      
        return ans; 
    } 
      
    // Driver code 
    public static void main(String[] args) { 
        System.out.println(CountPairs(1)); 
        System.out.println(CountPairs(2)); 
        System.out.println(CountPairs(3)); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

