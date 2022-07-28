

# Python 3 program to count number  
# less than N which are product of 
# any two perfect squares 
import math 
  
# Function to count number less 
# than N which are product of 
# any two perfect squares 
def countNumbers(N): 
    return int(math.sqrt(N)) - 1
  
# Driver Code 
if __name__ == "__main__": 
    N = 36
  
    print(countNumbers(N)) 
  
# This code is contributed 
# by ChitraNayal 

