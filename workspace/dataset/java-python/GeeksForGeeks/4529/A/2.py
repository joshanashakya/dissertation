

# Python3 program to calculate 
# sum of series of 2's power 
  
# function to calculate sum of series 
def calculateSum(n): 
  
      # calculate 2^(n + 1) 
      sum = (1 << (n + 1)) 
      return sum-1
  
# Driver code 
n = 10
print("Sum of series ", calculateSum(n)) 

