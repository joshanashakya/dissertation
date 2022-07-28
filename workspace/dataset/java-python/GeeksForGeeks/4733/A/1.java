

// Java implementation of the approach 
class GFG { 
  
    // Function to return the minimum 
    // number of cubes whose sum is k 
    static int MinOfCubedDP(int k) 
    { 
        int[] DP = new int[k + 1]; 
        int j = 1, t = 1; 
        DP[0] = 0; 
        for (int i = 1; i <= k; i++) { 
            DP[i] = Integer.MAX_VALUE; 
  
            // While current perfect cube 
            // is less than current element 
            while (j <= i) { 
  
                // If i is a perfect cube 
                if (j == i) 
                    DP[i] = 1; 
  
                // i = (i - 1) + 1^3 
                else if (DP[i] > DP[i - j]) 
                    DP[i] = DP[i - j] + 1; 
  
                // Next perfect cube 
                t++; 
                j = t * t * t; 
            } 
  
            // Re-initialization for next element 
            t = j = 1; 
        } 
        return DP[k]; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int num = 15; 
        System.out.println(MinOfCubedDP(num)); 
    } 
} 
  
/* This code contributed by PrinciRaj1992 */

