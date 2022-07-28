

# Python3 implementation of the  
# above approach 
  
# Function to return required count 
def SquareCube( N): 
  
    cnt, i = 0, 1
  
    while (i ** 6 <= N): 
        cnt += 1
        i += 1
  
    return cnt 
  
# Driver code 
N = 100000
  
# function call to print required  
# answer  
print(SquareCube(N)) 
  
# This code is contributed  
# by saurabh_shukla 

