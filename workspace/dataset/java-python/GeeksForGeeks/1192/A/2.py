

# Python3 implementation of the above approach 
  
# Function to count the number of ways to divide 
# C into two parts and add to A and B such 
# that A is strictly greater than B 
def countWays(A, B, C): 
      
    # Minimum value added to A to satisfy 
    # the given relation 
    minAddA = max(0, (C + B - A + 2) // 2) 
      
    # Number of different values of A, i.e., 
    # number of ways to divide C 
    count_ways = max(C - minAddA + 1, 0) 
      
    return count_ways 
  
# Driver code 
A = 3
B = 5
C = 5
print(countWays(A, B, C)) 
  
# This code is contributed by shivanisingh 

