

// Java implementation of the approach 
  
class GFG { 
  
// Function to return the count 
// of required numbers 
    static int countNumbers(int L, int R, int K) { 
        if (K == 9) { 
            K = 0; 
        } 
  
        // Count of numbers present 
        // in given range 
        int totalnumbers = R - L + 1; 
  
        // Number of groups of 9 elements 
        // starting from L 
        int factor9 = totalnumbers / 9; 
  
        // Left over elements not covered 
        // in factor 9 
        int rem = totalnumbers % 9; 
  
        // One Number in each group of 9 
        int ans = factor9; 
  
        // To check if any number in rem 
        // satisfy the property 
        for (int i = R; i > R - rem; i--) { 
            int rem1 = i % 9; 
            if (rem1 == K) { 
                ans++; 
            } 
        } 
  
        return ans; 
    } 
  
// Driver code 
    public static void main(String[] args) { 
        int L = 10; 
        int R = 22; 
        int K = 3; 
        System.out.println(countNumbers(L, R, K)); 
    } 
} 
/* This code contributed by PrinciRaj1992 */

