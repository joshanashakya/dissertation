

# Python3 implementation of the approach 
  
# Function to return the Nth number of 
# the modified Fibonacci series where 
# A and B are the first two terms 
def findNthNumber(A, B, N): 
  
    # To store the current element which 
    # is the sum of previous two 
    # elements of the series 
    sum = 0
  
    # This loop will terminate when 
    # the Nth element is found 
    for i in range(2, N): 
        sum = A + B 
  
        A = B 
  
        B = sum
      
    # Return the Nth element 
    return sum
  
# Driver code 
if __name__ == '__main__': 
    A = 5
    B = 7
    N = 10
  
    print(findNthNumber(A, B, N)) 
  
# This code is contributed by Ashutosh450 

