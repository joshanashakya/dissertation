

# Python Program to find deltaX 
# !/usr/bin/python 
# coding=utf-8 
  
# function to find delta X 
def findDelta(a, b, c, d) : 
  
    return int((b * c -
                a * d) / 
               (d - c)); 
  
# Driver Code 
a = 3; b = 9;  
c = 3; d = 5; 
  
# u0394X is code 
# for delta sign 
print ("X = {}" .  
        format(findDelta(a, b,  
                         c, d))); 
  
# This code is contributed by  
# Manish Shaw(manishshaw1) 

