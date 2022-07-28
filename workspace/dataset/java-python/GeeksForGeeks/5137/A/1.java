

// Java Program to print  
// Leibniz Harmonic Triangle 
import java.io.*; 
import java.math.*; 
  
class GFG { 
      
    // Print Leibniz Harmonic Triangle 
    static void LeibnizHarmonicTriangle(int n) 
    { 
        int C[][] = new int[n + 1][n + 1]; 
      
        // Calculate value of Binomial  
        // Coefficient in bottom up manner 
        for (int i = 0; i <= n; i++) { 
            for (int j = 0; j <= Math.min(i, n);  
                                          j++) { 
      
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
      
        // printing Leibniz Harmonic Triangle 
        for (int i = 1; i <= n; i++) { 
            for (int j = 1; j <= i; j++) 
                System.out.print("1/" + i * C[i - 1][j - 1]  
                                          + " "); 
      
            System.out.println(); 
        } 
    } 
      
    // Driven Program 
    public static void main(String args[]) 
    { 
        int n = 4; 
        LeibnizHarmonicTriangle(n); 
    } 
} 
  
// This code is contributed by Nikita Tiwari 

