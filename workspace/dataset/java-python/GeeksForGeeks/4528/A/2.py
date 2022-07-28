

# Python3 program to calculate 
# sum of series of power of 2 
  
# function to calculate sum of series 
def calculateSum(n): 
     sum = 0
  
     # loop to calculate sum of series 
     for i in range (0, n): 
  
         # calculate 2 ^ i 
         sum = sum+ (1 << i) 
     
     return sum
  
# Driver code 
n = 10
print("Sum of series ", calculateSum(n)) 

