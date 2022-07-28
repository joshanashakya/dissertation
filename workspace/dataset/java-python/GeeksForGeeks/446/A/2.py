

# Python program to find 
# the frequency of k  
# in matrix where 
# m(i, j)=i+j 
  
import math 
  
def find( n,  k): 
  
    if (n + 1 >= k): 
        return (k - 1) 
    else: 
        return (2 * n + 1 - k) 
  
   
# Driver Code 
n = 4
k = 7
  
freq = find(n, k) 
  
if (freq < 0): 
    print ( " element not exist") 
else: 
    print(" Frequency of " , k ," is " , freq ) 
  
# This code is contributed 
# by Gitanjali. 

