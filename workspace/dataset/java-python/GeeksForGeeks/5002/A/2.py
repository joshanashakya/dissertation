

# Python3 implementation of the approach 
import math as mt 
  
# Function to return the count of 
# valid values of x 
def countX(n): 
    count = 0
  
    for i in range(n + 1): 
  
        if n - i == (n ^ i): 
            count += 1
  
    return count 
  
# Driver Code 
if __name__ == '__main__': 
    n = 5
    answer = countX(n) 
    print(answer) 
  
# This code is contributed by  
# Mohit kumar 29 

