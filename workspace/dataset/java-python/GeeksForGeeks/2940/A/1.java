

// Java Program to find the sum  
// of Binomial Coefficient. 
  
class GFG { 
      
    // Returns value of Binomial  
    // Coefficient Sum 
    static int binomialCoeffSum(int n) 
    { 
        int C[][] = new int[n + 1][n + 1]; 
      
        // Calculate value of Binomial  
        // Coefficient in bottom up manner 
        for (int i = 0; i <= n; i++) 
        { 
            for (int j = 0; j <= Math.min(i, n); j++) 
            { 
                // Base Cases 
                if (j == 0 || j == i) 
                    C[i][j] = 1; 
      
                // Calculate value using previously 
                // stored values 
                else
                    C[i][j] = C[i - 1][j - 1] + 
                              C[i - 1][j]; 
              
                  
            } 
        } 
      
        // Calculating the sum. 
        int sum = 0; 
        for (int i = 0; i <= n; i++) 
            sum += C[n][i]; 
      
        return sum; 
    } 
      
    /* Driver program to test above function*/
    public static void main(String[] args) 
    { 
        int n = 4; 
        System.out.println(binomialCoeffSum(n)); 
    } 
} 
  
// This code is contributed by prerna saini. 

