

# Python 3 program to find index of given Fibonacci 
# nunber 
  
import math 
def findIndex(n) : 
    fibo = 2.078087 * math.log(n) + 1.672276
   
    # returning rounded off value of index 
    return round(fibo) 
  
  
# Driver program to test above function 
n = 21
print(findIndex(n)) 
  
  
# This code is contributed by Nikita Tiwari. 

