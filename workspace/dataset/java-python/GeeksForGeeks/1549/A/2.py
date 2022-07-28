

# Python Program to find maximum 
# product path from (0, 0) to 
# (N-1, M-1) 
import sys 
N = 3; 
M = 3; 
  
# Function to find maximum product 
def maxProductPath(arr): 
  
    # It will store the maximum 
    # product till a given cell. 
    maxPath = [[0 for i in range(M)] for j in range(N)]; 
  
    # It will store the minimum 
    # product till a given cell 
    # (for -ve elements) 
    minPath = [[0 for i in range(M)] for j in range(N)]; 
  
    for i in range(N): 
        for j in range(M): 
  
            minVal = sys.maxsize; 
            maxVal = -sys.maxsize; 
  
            # If we are at topmost 
            # or leftmost, just 
            # copy the elements. 
            if (i == 0 and j == 0): 
                maxVal = arr[i][j]; 
                minVal = arr[i][j]; 
              
            # If we're not at the 
            # above, we can consider 
            # the above value. 
            if (i > 0): 
                tempMax = max(maxPath[i - 1][j] * arr[i][j],\ 
                            minPath[i - 1][j] * arr[i][j]); 
                maxVal = max(maxVal, tempMax); 
  
                tempMin = min(maxPath[i - 1][j] * arr[i][j],\ 
                    minPath[i - 1][j] * arr[i][j]); 
                minVal = min(minVal, tempMin); 
              
            # If we're not on the 
            # leftmost, we can consider 
            # the left value. 
            if (j > 0): 
                tempMax = max(maxPath[i][j - 1] * arr[i][j],\ 
                    minPath[i][j - 1] * arr[i][j]); 
                maxVal = max(maxVal, tempMax); 
  
                tempMin = min(maxPath[i][j - 1] * arr[i][j],\ 
                    minPath[i][j - 1] * arr[i][j]); 
                minVal = min(minVal, tempMin); 
              
            # Store max & min product 
            # till i, j. 
            maxPath[i][j] = maxVal; 
            minPath[i][j] = minVal; 
          
    # Return the max product path 
    # from 0, 0.N-1, M-1. 
    return maxPath[N - 1][M - 1]; 
  
# Driver Code 
if __name__ == '__main__': 
    arr = [[ 1, -2, 3 ],[ 4, -5, 6 ],[ -7, -8, 9]]; 
  
    # Prmaximum product from 
    # (0, 0) to (N-1, M-1) 
    print(maxProductPath(arr)); 
  
# This code is contributed by 29AjayKumar 

