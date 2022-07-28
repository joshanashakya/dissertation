

# Python3 program to check if  
# given number is sum of first n  
# natural numbers 
  
# Function to find no. of elements 
# to be added from 1 to get n 
def findS (s): 
    _sum = 0
    n = 1
      
    # Start adding numbers from 1 
    while(_sum < s): 
        _sum += n 
        n+=1
    n-=1
      
    # If sum becomes equal to s 
    # return n 
    if _sum == s: 
        return n 
    return -1
  
# Driver code 
s = 15
n = findS (s) 
if n == -1: 
    print("-1") 
else: 
    print(n) 
  
# This code is contributed by "Abhishek Sharma 44". 

