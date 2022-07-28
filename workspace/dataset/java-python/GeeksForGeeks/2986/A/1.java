

// Java Program to find the sum of  
// square of binomial coefficient. 
import static java.lang.Math.*; 
  
class GFG{ 
          
    // Return the sum of square of  
    // binomial coefficient 
    static int sumofsquare(int n) 
    { 
        int[][] C = new int [n+1][n+1] ; 
        int i, j; 
      
        // Calculate value of Binomial  
        // Coefficient in bottom up manner 
        for (i = 0; i <= n; i++) 
        { 
            for (j = 0; j <= min(i, n); j++) 
            { 
                // Base Cases 
                if (j == 0 || j == i) 
                    C[i][j] = 1; 
      
                // Calculate value using  
                //previously stored values 
                else
                    C[i][j] = C[i-1][j-1]  
                             + C[i-1][j]; 
            } 
        }  
          
        // Finding the sum of square of  
        // binomial coefficient. 
        int sum = 0; 
        for (i = 0; i <= n; i++)  
            sum += (C[n][i] * C[n][i]);  
          
        return sum; 
    } 
      
    // Driver function 
    public static void main(String[] args) 
    { 
        int n = 4;  
          
        System.out.println(sumofsquare(n)); 
    }  
} 
  
// This code is contributed by  
// Smitha Dinesh Semwal 

