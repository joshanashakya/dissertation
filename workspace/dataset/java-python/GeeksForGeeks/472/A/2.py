

# Python3 implementation of the approach 
from math import gcd as __gcd 
  
# Function to return the minimum cost required 
def getMinCost(arr, n, cost): 
  
    # Map to store <gcd, cost> pair where 
    # cost is the cost to get the current gcd 
    mp = dict() 
    mp[0] = 0
  
    for i in range(n): 
        for it in list(mp): 
            gcd = __gcd(arr[i], it) 
  
            # If current gcd value  
            # already exists in map 
            if (gcd in mp): 
  
                # Update the minimum cost 
                # to get the current gcd 
                mp[gcd] = min(mp[gcd],  
                              mp[it] + cost[i]) 
  
            else: 
                mp[gcd] = mp[it] + cost[i] 
  
    # If there can be no sub-set such that 
    # the gcd of all the elements is 1 
    if (mp[1] == 0): 
        return -1
    else: 
        return mp[1] 
  
# Driver code 
arr = [ 5, 10, 12, 1] 
cost = [ 2, 1, 2, 6] 
n = len(arr) 
  
print(getMinCost(arr, n, cost)) 
  
# This code is contributed by Mohit Kumar 

