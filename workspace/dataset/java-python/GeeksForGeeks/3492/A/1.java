

// Java implementation of the above approach  
  
class GFG 
{ 
    final static int n = 4 ;  
    final static int m = 4 ; 
  
    // Function to calculate probability  
    static float calcProbability(int M[][], int k)  
    {  
        // declare dp[][] and sum[]  
        float dp[][] = new float[m][n] ; 
        float sum[] = new float[n];  
      
        // precalculate the first row  
        for (int j = 0; j < n; j++)  
        {  
            dp[0][j] = M[0][j];  
            sum[0] = sum[0] + dp[0][j];  
        }  
      
        // calculate the probability for  
        // each element and update dp table  
        for (int i = 1; i < m; i++)  
        {  
            for (int j = 0; j < n; j++) 
            {  
                dp[i][j] += dp[i - 1][j] / sum[i - 1] + 
                            M[i][j];  
                sum[i] += dp[i][j];  
            }  
        }  
      
        // return result  
        return dp[n - 1][k - 1] / sum[n - 1];  
    }  
      
    // Driver code  
    public static void main(String []args) 
    {  
        int M[][] = { { 1, 1, 0, 3 },  
                      { 2, 3, 2, 3 },  
                      { 9, 3, 0, 2 },  
                      { 2, 3, 2, 2 } };  
        int k = 3;  
        System.out.println(calcProbability(M, k)); 
          
    }  
} 
  
// This code is contributed by Ryuga 

