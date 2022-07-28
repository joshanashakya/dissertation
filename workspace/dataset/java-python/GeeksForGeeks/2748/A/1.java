

// Java implementation of the approach  
class GFG 
{ 
      
    final static int row = 2, col = 2;  
      
    // Function to return the Frobenius  
    // Norm of the given matrix  
    static float frobeniusNorm(int mat[][])  
    {  
      
        // To store the sum of squares of the  
        // elements of the given matrix  
        int sumSq = 0;  
        for (int i = 0; i < row; i++)  
        {  
            for (int j = 0; j < col; j++)  
            {  
                sumSq += (int)Math.pow(mat[i][j], 2);  
            }  
        }  
      
        // Return the square root of  
        // the sum of squares  
        float res = (float)Math.sqrt(sumSq);  
        return res;  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int mat[][] = { { 1, 2 }, { 3, 4 } };  
      
        System.out.println(frobeniusNorm(mat));  
      
    }  
} 
  
// This code is contributed by AnkitRai01 

