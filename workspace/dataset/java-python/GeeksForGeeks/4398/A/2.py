

# Python3 program to generate  
# tetrahedral number series 
  
# function to generate nth  
# triangular number 
def findTriangularNumber(n): 
    return (n * (n + 1)) / 2
  
# function to print tetrahedral  
# number series up to n 
def printSeries(n): 
  
    # Initialize prev as 0.  
    # It stores the sum of all  
    # previously generated  
    # triangular number 
    prev = 0
  
    # Loop to print series 
    for i in range(1, n+1):  
      
        # Find ith triangular number 
        curr = findTriangularNumber(i) 
  
        # Add ith triangular number  
        # to sum of all previously  
        # generated triangular number  
        # to get ith tetrahedral number 
        curr = int(curr + prev) 
        print(curr, end = ' ') 
  
        # Update sum of all previously  
        # generated triangular number 
        prev = curr 
  
# Driver code 
n = 10
      
# function call to 
# print series 
printSeries(n) 
  
# This code is contributed by Mahadev. 

