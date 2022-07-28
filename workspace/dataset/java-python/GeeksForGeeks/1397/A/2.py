

# Python3 program to implement  
# above approach 
  
# from math import pow method 
from math import pow
  
# count number of set bits 
def __builtin_popcount(n) : 
  
    # count variable 
    count = 0
  
    while n > 0 : 
  
        # if the bit is 1 
        if n % 2 == 1 : 
            count += 1
  
        n = n//2
          
    return count 
  
  
# function to Count all values of x  
def count_values(n) : 
  
    set_bits = __builtin_popcount(n) 
  
    # count all subset of set bits  
    print(int(pow(2, set_bits))) 
  
  
# Driver code 
if __name__ == "__main__" : 
  
    n = 27
    count_values(n) 
  
# This code is contributed by  
# ANKITRAI1 

