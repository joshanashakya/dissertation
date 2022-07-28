

# Python 3 implementation of the approach 
import sys 
  
R = 5
C = 5
  
# Function to return the maximum sum 
# of a cocktail glass 
def findMaxCock(ar): 
      
    # If no cocktail glass is possible 
    if (R < 3 or C < 3): 
        return -1
  
    # Initialize max_sum with the mini 
    max_sum = -sys.maxsize - 1
  
    # Here loop runs (R-2)*(C-2) times considering 
    # different top left cells of cocktail glasses 
    for i in range(R - 2): 
        for j in range(C - 2): 
              
            # Considering mat[i][j] as the top left 
            # cell of the cocktail glass 
            sum = ((ar[i][j] + ar[i][j + 2]) + 
                   (ar[i + 1][j + 1]) + 
                   (ar[i + 2][j] + ar[i + 2][j + 1] + 
                    ar[i + 2][j + 2])) 
  
            # Update the max_sum 
            max_sum = max(max_sum, sum) 
  
    return max_sum; 
  
# Driver code 
if __name__ == '__main__': 
    ar = [[0, 3, 0, 6, 0],  
          [0, 1, 1, 0, 0], 
          [1, 1, 1, 0, 0], 
          [0, 0, 2, 0, 1], 
          [0, 2, 0, 1, 3]] 
  
    print(findMaxCock(ar)) 
  
# This code is contributed by 
# Surendra_Gangwar 

