

// Java implemenation to find sum of all 
// proper divisor of number up to N 
class GFG { 
      
    // Utility function to find sum of 
    // all proper divisor of number up to N 
    static int properDivisorSum(int n) 
    { 
        int sum = 0; 
      
        // Loop to iterate over all the 
        // numbers from 1 to N 
        for (int i = 1; i <= n; ++i) { 
      
            // Find all divisors of 
            // i and add them 
            for (int j = 1; j * j <= i; ++j) { 
                if (i % j == 0) { 
                    if (i / j == j) 
                        sum += j; 
                    else
                        sum += j + i / j; 
                } 
            } 
      
            // Subtracting 'i' so that the 
            // number itself is not included 
            sum = sum - i; 
        } 
        return sum; 
    } 
      
    // Driver Code 
    public static void main (String[] args) 
    { 
        int n = 4; 
        System.out.println(properDivisorSum(n)); 
      
        n = 5; 
        System.out.println(properDivisorSum(n)) ; 
      
    } 
} 
  
// This code is contributed by Yash_R 

