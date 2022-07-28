

# Python program implementation of 
# Max sum problem in a triangle 
  
N = 3
  
# Function for finding maximum sum 
def maxPathSum( tri ): 
  
    ans = 0; 
  
    # Loop for bottom-up calculation 
    for i in range(N - 2, -1, -1): 
        for j in range(0 , N - i): 
  
            # For each element, check both 
            # elements just below the number 
            # and below left to the number 
            # add the maximum of them to it 
            if (j - 1 >= 0): 
                tri[i][j] += max(tri[i + 1][j], 
                                tri[i + 1][j - 1]); 
            else: 
                tri[i][j] += tri[i + 1][j]; 
  
            ans = max(ans, tri[i][j]); 
      
    # Return the maximum sum 
    return ans 
      
# Driver Code 
      
tri = [ [ 1, 5, 3 ], 
        [ 4, 8, 0 ], 
        [ 1, 0, 0 ] ] 
  
print(maxPathSum(tri)) 
  
# This code is contributed by ihritik 

