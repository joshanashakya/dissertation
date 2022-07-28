

// Java implementation of  
// the above approach 
import java.util.*; 
  
class GFG 
{ 
    // Function to return maximum  
    // length of square submatrix 
    // having sum of elements at-most K 
    public static int maxLengthSquare(int row,int column, 
                                        int[][] arr, int k) 
    { 
        // Matrix to store prefix sum 
        int sum[][] = new int[row + 1][column + 1]; 
      
        // Current maximum length 
        int cur_max = 1; 
      
        // Variable for storing  
        // maximum length of square 
        int max = 0; 
              
        for (int i = 1; i <= row; i++)  
        { 
            for (int j = 1; j <= column; j++)  
            { 
                // Calculating prefix sum 
                sum[i][j] = sum[i - 1][j] + sum[i][j - 1] +  
                            arr[i - 1][j - 1] - sum[i - 1][j - 1]; 
          
                // Checking whether there  
                // exits square with length  
                // cur_max+1 or not 
                if(i >=cur_max&&j>=cur_max&&sum[i][j]-sum[i - cur_max][j] 
                            - sum[i][j - cur_max]  
                            + sum[i - cur_max][j - cur_max] <= k){ 
                    max = cur_max++; 
                } 
            } 
        } 
      
        // Returning the  
        // maximum length 
        return max; 
    } 
  
    // Driver code 
    public static void main(String args[])  
    { 
          
        int row = 4 , column = 4; 
        int matrix[][] = { {1, 1, 1, 1}, 
                        {1, 0, 0, 0}, 
                        {1, 0, 0, 0}, 
                        {1, 0, 0, 0} 
                        }; 
      
        int k = 6;  
        int ans = maxLengthSquare(row,column,matrix, k); 
        System.out.println(ans); 
    } 
} 

