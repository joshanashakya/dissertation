

# Python3 program to find Sum of  
# numbers from 1 to N which are  
# in Lucas Sequence 
  
# Function to return the 
# required Sum 
def LucasSum(N): 
      
    # Generate lucas number and  
    # keep on adding them 
    Sum = 0
    a = 2
    b = 1
    c = 0
  
    Sum += a 
  
    while (b <= N): 
  
        Sum += b 
        c = a + b 
        a = b 
        b = c 
  
    return Sum
  
# Driver code 
N = 20
print(LucasSum(N)) 
  
# This code is contributed  
# by mohit kumar 

