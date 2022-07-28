

// Java implementation of the approach 
  
class GFG 
{ 
    // Function for the binomial coefficient 
    static int binomialCoeff(int n, int k) 
    { 
        int [][] C = new int[n + 1][k + 1]; 
        int i, j; 
      
        // Calculate value of Binomial Coefficient 
        // in bottom up manner 
        for (i = 0; i <= n; i++) { 
            for (j = 0; j <= Math.min(i, k); j++) { 
      
                // Base Cases 
                if (j == 0 || j == i) 
                    C[i][j] = 1; 
      
                // Calculate value using previously 
                // stored values 
                else
                    C[i][j] = C[i - 1][j - 1] + C[i - 1][j]; 
            } 
        } 
      
        return C[n][k]; 
    } 
      
    // Function to return the maximum 
    // value in the nth level 
    // of the Pascal's triangle 
    static int findMax(int n) 
    { 
        return binomialCoeff(n, n / 2); 
    } 
      
    // Driver code 
    public static void main (String[] args) { 
          
        int n = 5; 
      
        System.out.println(findMax(n)); 
      
    } 
  
} 
  
  
// This code is contributed by ihritik 

