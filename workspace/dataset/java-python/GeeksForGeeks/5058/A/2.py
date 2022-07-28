

# Python3 program to count of index pairs  
# with equal elements in an array. 
import math as mt 
  
# Return the number of pairs with  
# equal values. 
def countPairs(arr, n): 
  
    mp = dict() 
  
    # Finding frequency of each number. 
    for i in range(n): 
        if arr[i] in mp.keys(): 
            mp[arr[i]] += 1
        else: 
            mp[arr[i]] = 1
              
    # Calculating pairs of each value. 
    ans = 0
    for it in mp: 
        count = mp[it] 
        ans += (count * (count - 1)) // 2
    return ans 
  
# Driver Code 
arr = [1, 1, 2] 
n = len(arr) 
print(countPairs(arr, n)) 
  
# This code is contributed by mohit kumar 29 

