

# Python3 program to calculate the LCM of N!  
# and its neighbor (N-1)! and (N+1)! 
  
# Function to calculate the factorial 
def factorial(n): 
    if (n == 0): 
        return 1
    return n * factorial(n - 1) 
  
def LCMOfNeighbourFact(n): 
  
    # returning the factorial of the  
    # largest number in the given three  
    # consecutive numbers 
    return factorial(n + 1) 
  
# Driver code 
N = 5
print(LCMOfNeighbourFact(N)) 
  
# This code is contributed by Anant Agarwal. 

