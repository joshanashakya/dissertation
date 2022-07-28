

# Python3 implementation of the approach 
  
# Function to find the required values 
def solve(A, B): 
    p = B / 2
    M = int(4 * p) 
    N = 1
    O = - 2 * A 
    Q = int(A * A + 4 * p*p) 
    return [M, N, O, Q] 
  
# Driver code 
a = 1
b = 1
print(*solve(a, b)) 

