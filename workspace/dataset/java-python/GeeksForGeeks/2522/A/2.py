

# Python3 program to maximize profit 
  
# Function that maximizes the Sum 
def maximize(A1, A2, n, x, y): 
  
    # Array to store the loss 
    c = [0 for i in range(n)] 
  
    # Initial Sum 
    Sum = 0
  
    # Generate the array C 
    for i in range(n): 
        c[i] = A2[i] - A1[i] 
        Sum += A1[i] 
      
    # Sort the array elements 
    # in descending order 
    c.sort() 
    c = c[::-1] 
  
    # Variable to store the answer 
    maxi = -1
  
    # Iterate in the array, C 
    for i in range(n): 
  
        # Subtract the loss 
        Sum += c[i] 
  
        # Check if X orders are going 
        # to be used 
        if (i + 1 >= (n - x)): 
            maxi = max(Sum, maxi) 
  
    return maxi 
      
# Driver Code 
A1 = [ 1, 2, 3, 4, 5 ] 
A2 = [ 5, 4, 3, 2, 1 ] 
  
n = 5
x, y = 3, 3
  
print(maximize(A1, A2, n, x, y)) 
  
# This code is contributed 
# by Mohit Kumar 

