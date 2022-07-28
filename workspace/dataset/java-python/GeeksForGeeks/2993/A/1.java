

// Java Program to find  
// maximum binomial  
// coefficient term 
import java.io.*; 
  
class GFG  
{ 
              
    // Returns value of  
    // Binomial Coefficient 
    // C(n, k) 
    static int binomialCoeff(int n,  
                             int k) 
    { 
        int [][]C = new int[n + 1][k + 1]; 
      
        // Calculate value of  
        // Binomial Coefficient  
        // in bottom up manner 
        for (int i = 0; i <= n; i++) 
        { 
            for (int j = 0;  
                j <= Math.min(i, k); j++) 
            { 
                  
                // Base Cases 
                if (j == 0 || j == i) 
                    C[i][j] = 1; 
      
                // Calculate value using  
                // previously stored values 
                else
                    C[i][j] = C[i - 1][j - 1] +  
                              C[i - 1][j]; 
            } 
        } 
        return C[n][k]; 
    } 
      
    // Return maximum  
    // binomial coefficient 
    // term value. 
    static int maxcoefficientvalue(int n) 
    { 
          
        // if n is even 
        if (n % 2 == 0) 
            return binomialCoeff(n, n / 2); 
              
        // if n is odd 
        else
            return binomialCoeff(n, (n + 1) / 2); 
    } 
      
    // Driver Code 
    public static void main(String[] args)  
    { 
        int n = 4; 
      
        System.out.println(maxcoefficientvalue(n)); 
    } 
} 
  
// This code is contributed 
// by akt_mit 

