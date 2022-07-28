

# Python 3 program to find sum of matrix  
# in which each element is absolute  
# difference of its corresponding row  
# and column number row.  
  
# Return the sum of matrix in which  
# each element is absolute difference  
# of its corresponding row and column  
# number row  
def findSum(n): 
    n -= 1
    sum = 0
    sum += (n * (n + 1)) / 2
    sum += (n * (n + 1) * (2 * n + 1)) / 6
    return int(sum)  
  
# Driver Code 
n = 3
print(findSum(n))  
  
# This code contributed by Rajput-Ji 

