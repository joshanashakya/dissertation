

# Python3 program to find minimum element 
# whose n-th power is greater than product 
# of an array of size n 
import math as m 
  
# function to find the minimum element 
def findMin( a, n): 
      
    # loop to traverse and store the 
    # sum of log 
    _sum = 0
    for i in range(n): 
        _sum += m.log(a[i]) # computes sum 
      
    # calculates the elements  
    # according to formula. 
    x = m.exp(_sum / n) 
      
    # returns the minimal element 
    return int(x + 1) 
      
# Driver program to test above function 
  
# initialised array 
a = [ 3, 2, 1, 4 ] 
  
# computes the size of array 
n = len(a) 
  
# prints out the minimal element 
print(findMin(a, n)) 
  
# This code is contributed by "Abhishek Sharma 44" 

