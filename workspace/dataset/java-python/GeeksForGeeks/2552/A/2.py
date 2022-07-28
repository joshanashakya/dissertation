

# Python3 implementation of the approach 
  
# Initialize the matrix with 0 
l = [[0 for i in range(1001)] for j in range(1001)] 
  
def initialize(): 
      
    # 0C0 = 1 
    l[0][0] = 1
    for i in range(1, 1001): 
          
        # Set every nCr = 1 where r = 0 
        l[i][0] = 1
        for j in range(1, i + 1): 
              
            # Value for the current cell of Pascal's triangle 
            l[i][j] = (l[i - 1][j - 1] + l[i - 1][j]) 
  
# Function to return the value of nCr 
def nCr(n, r):  
    # Return nCr 
    return l[n][r] 
  
# Driver code 
# Build the Pascal's triangle 
initialize() 
n = 8
r = 3
print(nCr(n, r)) 

