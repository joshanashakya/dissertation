

# Python 3 Program to find the value 
# 1^K + 2^K + 3^K + .. + N^K 
from math import pow
  
# Function to find value of 
# 1^K + 2^K + 3^K + .. + N^K 
def findSum(N, k): 
      
    # Initialise sum to 0 
    sum = 0
    for i in range(1, N + 1, 1): 
          
        # Find the value of 
        # pow(i, 4) and then 
        # add it to the sum 
        sum += pow(i, k) 
  
    # Return the sum 
    return sum
  
# Drives Code 
if __name__ == '__main__': 
    N = 8
    k = 4
  
    # Function call to 
    # find the sum 
    print(int(findSum(N, k))) 
  
# This code is contributed by Surendra_Gangwar 

