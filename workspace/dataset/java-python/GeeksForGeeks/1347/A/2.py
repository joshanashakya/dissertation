

# Python3 Program to find number 
# of Divisors which on integer 
# division produce quotient  
# having less set bit than divisor 
import math 
# Return the count of set bit. 
def bit(x) : 
    ans = 0
    while (x) : 
        x /= 2
        ans = ans + 1
  
    return ans 
  
# check if q and d have 
# same number of set bit. 
def check(d, x) : 
    if (bit(x /d) <= bit(d)) : 
        return True
  
    return False; 
      
# Binary Search to find 
# the point at which 
# number of set in q is  
# less than or equal to d. 
def bs(n) : 
    l = 1
    r = int(math.sqrt(n)) 
  
    # while left index is less  
    # than right index 
    while (l < r) :          
        # finding the middle. 
        m = int((l + r) / 2) 
  
        # check if q and d have  
        # same number of 
        # set it or not. 
        if (check(m, n)) : 
            r = m 
        else : 
            l = m + 1
  
    if (check(l, n) == False) : 
        return math.floor(l + 1) 
    else : 
        return math.floor(l) 
  
def countDivisor(n) : 
    return n - bs(n) + 1
  
# Driver Code 
n = 5
print (countDivisor(n)) 
  
# This code is contributed by  
# Manish Shaw (manishshaw1) 

