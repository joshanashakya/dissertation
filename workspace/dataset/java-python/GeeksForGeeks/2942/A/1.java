

// java Program to print  
// symmetric pascal matrix. 
import java.io.*; 
  
class GFG  
{ 
    // Print Pascal Matrix 
    static void printpascalmatrix(int n) 
    { 
        int C[][] = new int[2 * n + 1][2 * n + 1]; 
      
        // Calculate value of Binomial Coefficient in 
        // bottom up manner 
        for (int i = 0; i <= 2 * n; i++)  
        { 
            for (int j = 0; j <= Math.min(i, 2 * n); j++)  
            { 
                // Base Cases 
                if (j == 0 || j == i) 
                    C[i][j] = 1; 
      
                // Calculate value using previously 
                // stored values 
                else
                    C[i][j] = C[i - 1][j - 1]  
                              + C[i - 1][j]; 
            } 
        } 
      
        // Printing the pascal matrix 
        for (int i = 0; i < n; i++) 
        { 
            for (int j = 0; j < n; j++) 
                System.out.print ( C[i + j][i] +" "); 
                System.out.println(); 
          
        } 
    } 
      
    // Driven Program 
    public static void main (String[] args)  
    { 
        int n = 5; 
        printpascalmatrix(n); 
      
    } 
} 
  
// This code is contributed by vt_m. 

