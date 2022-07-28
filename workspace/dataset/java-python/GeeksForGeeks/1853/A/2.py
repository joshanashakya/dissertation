

# Python 3 implementation of the 
# above appoach 
N = 3
M = 3
  
# Boolean function that returns 
# true or false 
def check(a, b): 
      
    # Traverse for all elements 
    for i in range(1, N, 1): 
        for j in range(1, M, 1): 
              
            # If both are not equal 
            if (a[i][j] != b[i][j]): 
                  
                # Change the parity of 
                # all corner elements 
                a[i][j] ^= 1
                a[0][0] ^= 1
                a[0][j] ^= 1
                a[i][0] ^= 1
  
    # Check if A is equal to B 
    for i in range(N): 
        for j in range(M): 
              
            # Not equal 
            if (a[i][j] != b[i][j]): 
                return False
      
    return True
  
# Driver Code 
if __name__ == '__main__': 
      
    # First binary matrix 
    a = [[0, 1, 0], 
         [0, 1, 0], 
         [1, 0, 0]] 
  
    # Second binary matrix 
    b = [[1, 0, 0], 
         [1, 0, 0], 
         [1, 0, 0]] 
  
    if (check(a, b)): 
        print("Yes") 
    else: 
        print("No") 
  
# This code is contributed by 
# Surendra_Gangwar 

