

# Python3 implementation of above approach 
import math as ma 
  
# Function to find total number of subsets  
# in which product of the elements is even 
def find(a): 
    count_odd = 0
    for i in a: 
  
        # counting number of odds elements 
        if(i % 2 != 0): 
            count_odd+= 1
  
    result = pow(2, len(a)) - 1
    result = result - (pow(2, count_odd) - 1) 
    print(result) 
  
# Driver code 
a =[2, 2, 3] 
find(a) 

