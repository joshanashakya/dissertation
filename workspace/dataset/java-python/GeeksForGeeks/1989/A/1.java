

// Java implementation of the approach 
class GFG { 
  
    // Function to return the smallest number 
    // which on dividing with any element from 
    // the range [2, N] leaves a remainder of 1 
    static long getMinNum(int N) 
    { 
        // Find the LCM of the elements 
        // from the range [2, N] 
        int lcm = 1; 
        for (int i = 2; i <= N; i++) 
            lcm = ((i * lcm) / (__gcd(i, lcm))); 
  
        // Return the required number 
        return (lcm + 1); 
    } 
  
    static int __gcd(int a, int b) 
    { 
        if (b == 0) 
            return a; 
        return __gcd(b, a % b); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int N = 5; 
        System.out.println(getMinNum(N)); 
    } 
} 
  
// This code has been contributed by 29AjayKumar 

