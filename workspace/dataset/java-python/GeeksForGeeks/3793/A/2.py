

# Python3 program to find the minimum steps  
# to reach end from start by performing  
# multiplications and mod operations with  
# array elements  
from collections import deque 
  
# Function that returns the minimum operations 
def minimumMulitplications(start, end, a, n): 
      
    # array which stores the minimum  
    # steps to reach i from start 
    ans = [-1 for i in range(100001)] 
  
    # -1 indicated the state has  
    # not been visited 
    mod = 100000
  
    q = deque() 
      
    # queue to store all possible states 
    # initially push the start 
    q.append(start % mod) 
  
    # to reach start we require 0 steps 
    ans[start] = 0
  
    # till all states are visited 
    while (len(q) > 0): 
  
        # get the topmost element in the  
        # queue, pop the topmost element 
        top = q.popleft() 
  
        # if the topmost element is end 
        if (top == end): 
            return ans[end] 
  
        # perform multiplication with  
        # all array elements 
        for i in range(n): 
            pushed = top * a[i] 
            pushed = pushed % mod 
  
            # if not visited, then push it to queue 
            if (ans[pushed] == -1): 
                ans[pushed] = ans[top] + 1
                q.append(pushed) 
              
    return -1
  
# Driver Code 
start = 7
end = 66175
a = [3, 4, 65] 
n = len(a) 
  
# Calling function 
print(minimumMulitplications(start, end, a, n)) 
  
# This code is contributed by mohit kumar 

