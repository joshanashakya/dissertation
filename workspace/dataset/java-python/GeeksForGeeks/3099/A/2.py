

# Python3 program to count number of strings of 
# size m such that no substring is palindrome 
  
# Return the count of strings with 
# no palindromic substring. 
def numofstring(n, m): 
    if n == 1: 
        return m 
  
    if n == 2: 
        return m * (m - 1) 
  
    return m * (m - 1) * pow(m - 2, n - 2) 
  
# Driven Program 
n = 2
m = 3
print (numofstring(n, m)) 
  
# This code is contributed 
# by Shreyanshi Arun. 

