

# Python 3 code for 
# Münchhausen Number 
import math 
  
# pwr[i] is going to  
# store i raised to 
# power i. 
pwr = [0] * 10
  
# Function to check out 
# whether the number is 
# Münchhausen Number or 
# not  
def isMunchhausen(n) : 
  
    sm = 0
    temp = n 
  
    while (temp) : 
        sm= sm + pwr[(temp % 10)] 
        temp = temp // 10
      
    return (sm == n) 
  
def printMunchhausenNumbers(n) : 
  
    # Precompute i raised to 
    # power i for every i 
    for i in range(0, 10) : 
        pwr[i] = math.pow((float)(i), (float)(i)) 
      
    # The input here is fixed  
    # i.e. it will check up to n 
    for i in range(1,n+1) : 
          
        # check the integer for 
        # Münchhausen Number, if 
        # yes then print out the  
        # number 
        if (isMunchhausen(i)) : 
            print( i ) 
  
  
# Driver Code 
n = 10000
printMunchhausenNumbers(n) 
  
# This code is contributed by Nikita Tiwari. 

