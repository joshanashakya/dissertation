

# Python3 program find Sum of elements 
# that appear k times.  
import math as mt 
  
# Returns Sum of k appearing elements. 
def sumKRepeating(arr, n, k): 
    Sum = 0
  
# Count frequencies of all items 
    mp = dict()  
    for i in range(n): 
        if arr[i] in mp.keys(): 
            mp[arr[i]] += 1
        else: 
            mp[arr[i]] = 1
                  
# Sum items with frequencies equal to k. 
    for x in mp: 
        if (mp[x] == k): 
            Sum += x 
    return Sum
  
# Driver code 
arr = [ 9, 9, 10, 11, 8, 8, 9, 8 ] 
n = len(arr) 
k = 3
print(sumKRepeating(arr, n, k)) 
  
# This code is contributed  
# by Mohit kumar 29 

