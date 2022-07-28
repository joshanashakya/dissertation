

# Python3 implementation of the approach 
from math import gcd as __gcd 
from collections import deque as queue 
  
# Function to perform BFS traversal to 
# find minimum number of step needed 
# to reach x from K 
def minStepsNeeded(k, d1, d2, x): 
      
    # Calculate GCD of d1 and d2 
    gcd = __gcd(d1, d2) 
  
    # If position is not reachable 
    # return -1 
    if ((k - x) % gcd != 0): 
        return -1
  
    # Queue for BFS 
    q = queue() 
  
    # Hash Table for marking 
    # visited positions 
    visited = dict() 
  
    # we need 0 steps to reach K 
    q.appendleft([k, 0]) 
  
    # Mark starting position 
    # as visited 
    visited[k] = 1
  
    while (len(q) > 0): 
  
        sr = q.pop() 
        s, stp = sr[0], sr[1] 
  
        # stp is the number of steps 
        # to reach position s 
        if (s == x): 
            return stp 
  
        if (s + d1 not in visited): 
  
            # if position not visited 
            # add to queue and mark visited 
            q.appendleft([(s + d1), stp + 1]) 
  
            visited[(s + d1)] = 1
  
        if (s + d2 not in visited): 
            q.appendleft([(s + d2), stp + 1]) 
            visited[(s + d2)] = 1
  
        if (s - d1 not in visited): 
            q.appendleft([(s - d1), stp + 1]) 
            visited[(s - d1)] = 1
  
        if (s - d2 not in visited): 
            q.appendleft([(s - d2), stp + 1]) 
            visited[(s - d2)] = 1
  
# Driver Code 
k = 10
d1 = 4
d2 = 6
x = 8
  
print(minStepsNeeded(k, d1, d2, x)) 
  
# This code is contributed by Mohit Kumar 

