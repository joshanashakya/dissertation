

# Python3 implementation of the above approach  
import numpy as np 
  
# Function to return maximum  
# length of square submatrix  
# having sum of elements at-most K  
def maxLengthSquare(row, column, arr, k) : 
      
    # Matrix to store prefix sum  
    sum = np.zeros((row + 1, column + 1));  
      
    # Current maximum length  
    cur_max = 1;  
      
    # Variable for storing  
    # maximum length of square  
    max = 0;  
              
    for i in range(1, row + 1) : 
        for j in range(1, column + 1) : 
              
            # Calculating prefix sum 
            sum[i][j] = sum[i - 1][j] + sum[i][j - 1] + \ 
                        arr[i - 1][j - 1] - \ 
                        sum[i - 1][j - 1]; 
              
            # Checking whether there 
            # exits square with length 
            # cur_max+1 or not 
            if(i >= cur_max and j >= cur_max and 
                 sum[i][j] - sum[i - cur_max][j] - sum[i][j - 
                                     cur_max] + sum[i - 
                                     cur_max][j - cur_max] <= k) : 
                max = cur_max;  
                cur_max += 1; 
      
    # Returning the maximum length  
    return max;  
      
# Driver code  
if __name__ == "__main__" : 
      
    row = 4 ; 
    column = 4; 
    matrix = [[1, 1, 1, 1], 
              [1, 0, 0, 0], 
              [1, 0, 0, 0], 
              [1, 0, 0, 0]]; 
    k = 6; 
    ans = maxLengthSquare(row, column, matrix, k); 
    print(ans);  
      
# This code is contributed by AnkitRai01 

