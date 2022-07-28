

# Simple Python 3 program to count n digit  
# divisible numbers 
  
import math 
  
# Returns count of n digit  
# numbers divisible by number 
def numberofterm(n, number): 
  
    # compute the first and last term 
    firstnum = math.pow(10, n - 1) 
    lastnum = math.pow(10, n) 
  
    # count total number of which having 
    # n digit and divisible by number 
    count = 0
    for i in range(int(firstnum), int(lastnum)):  
        if (i % number == 0): 
            count += 1
    return count 
  
  
# Driver code 
n = 3 
num = 7
print(numberofterm(n, num)) 
  
# This article is contributed 
# by Smitha Dinesh Semwal 

