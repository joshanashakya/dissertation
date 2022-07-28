

# Python 3 program to find sum of  
# matrix element where each element  
# is integer division of row and column.  
  
# Return sum of matrix element  
# where each element is division  
# of its corresponding row and column.  
def findSum(N): 
    ans = 0
    for i in range(1, N + 1): 
        for j in range(1, N + 1): 
            ans += i // j 
    return ans 
  
# Driver code 
N = 2
print(findSum(N)) 
  
# This code is contributed  
# by Shrikant13 

