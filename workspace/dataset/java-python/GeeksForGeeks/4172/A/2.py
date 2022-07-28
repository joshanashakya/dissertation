

# Python3 implementation of the above approach 
from collections import deque 
  
# Function to return the reversed queue 
def reverse(q): 
      
    # Size of ueue 
    s = len(q) 
  
    # Second queue 
    ans = deque() 
  
    for i in range(s): 
  
        # Get the last element to the 
        # front of queue 
        for j in range(s - 1): 
            x = q.popleft() 
            q.appendleft(x) 
  
        # Get the last element and 
        # add it to the new queue 
        ans.appendleft(q.popleft()) 
    return ans 
  
# Driver Code 
q = deque() 
  
# Insert elements 
q.append(1) 
q.append(2) 
q.append(3) 
q.append(4) 
q.append(5) 
  
q = reverse(q) 
  
# Print the queue 
while (len(q) > 0): 
    print(q.popleft(), end = " ") 
  
# This code is contributed by Mohit Kumar 

