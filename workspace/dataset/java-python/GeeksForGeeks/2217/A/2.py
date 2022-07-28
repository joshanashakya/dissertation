

# Python3 program to find the maximum  
# number of numbers divisible by 3 in  
# a large number 
import math as mt  
  
# Function to find the maximum number  
# of numbers divisible by 3 in a  
# large number 
def MaximumNumbers(string): 
  
    # store size of the string 
    n = len(string) 
  
    # Stores last index of a remainder 
    remIndex = [-1 for i in range(3)] 
  
    # last visited place of remainder 
    # zero is at 0. 
    remIndex[0] = 0
  
    # To store result from 0 to i 
    res = [-1 for i in range(n + 1)] 
  
    r = 0
    for i in range(n + 1): 
          
        # get the remainder 
        r = (r + ord(string[i - 1]) - 
                 ord('0')) % 3
  
        # Get maximum res[i] value 
        res[i] = res[i - 1] 
        if (remIndex[r] != -1): 
            res[i] = max(res[i], res[remIndex[r]] + 1) 
  
        remIndex[r] = i + 1
      
    return res[n] 
  
# Driver Code 
s= "12345"
print(MaximumNumbers(s)) 
  
# This code is contributed 
# by Mohit kumar 29 

