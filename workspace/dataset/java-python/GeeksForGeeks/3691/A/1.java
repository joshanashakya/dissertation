

// Java implementation of the approach 
class GFG { 
  
    // Function to find the product of all elements 
    // in all subsets in natural numbers from 1 to N 
    static int product(int N) 
    { 
        int ans = 1; 
        int val = (int)Math.pow(2, N - 1); 
      
        for (int i = 1; i <= N; i++) { 
            ans *= (int)Math.pow(i, val); 
        } 
      
        return ans; 
    } 
      
    // Driver Code 
    public static void main (String[] args) 
    { 
        int N = 2; 
      
        System.out.println(product(N)); 
    } 
} 
  
// This code is contributed by AnkitRai01 

