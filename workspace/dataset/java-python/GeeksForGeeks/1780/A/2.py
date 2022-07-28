

# Python program to print 
# the sum of series. 
# function to calculate 
# sum of given series. 
  
from __future__ import division 
  
def sumOfSeries(a,num): 
    res = 0
    prev=1
    for i in range(1, n+1): 
  
        # multiply (a/i) to 
        # previous term 
        prev *= (a/i) 
  
        # store result in res 
        res = res + prev 
    return res 
  
# Driver code 
n = 5
a = 2
print(round(sumOfSeries(a,n),4)) 
  
# This Code is Contributed 
# by Azkia Anam. 

