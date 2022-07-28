

// Java Program to find number of parallelogram when  
// n horizontal parallel lines intersect m vertical  
// parallel lines. 
class GFG 
{ 
    static final int MAX = 10; 
      
    // Find value of Binomial Coefficient 
    static void binomialCoeff(int C[][], int n, int k) 
    {  
        // Calculate value of Binomial Coefficient 
        // in bottom up manner 
        for (int i = 0; i <= n; i++) 
        { 
            for (int j = 0; j <= Math.min(i, k); j++) 
            { 
                // Base Cases 
                if (j == 0 || j == i) 
                    C[i][j] = 1; 
      
                // Calculate value using previously 
                // stored values 
                else
                    C[i][j] = C[i - 1][j - 1] + C[i - 1][j]; 
            } 
        } 
    } 
      
    // Return number of parallelogram when n horizontal 
    // parallel lines intersect m vertical parallel lines. 
    static int countParallelogram(int n, int m) 
    { 
        int C[][]=new int[MAX][MAX];  
          
        binomialCoeff(C, Math.max(n, m), 2);  
          
        return C[n][2] * C[m][2]; 
    } 
      
    // Driver code 
    public static void main(String arg[])  
    { 
        int n = 5, m = 5;  
        System.out.println(countParallelogram(n, m)); 
    } 
} 
  
// This code is contributed By Anant Agarwal. 

