

# Python implementation of the approach 
  
from collections import deque 
  
  
def maxXOR(arr): 
    # Declaring stack 
    stack = deque() 
      
    # Initializing the length of stack 
    l = 0
      
    # Initializing res1 for array 
    # traversal of left to right 
    res1 = 0
      
    # Traversing the array 
    for i in arr: 
          
        # If there are elements in stack  
        # And top of stack is less than  
        # current element then pop the stack 
        while stack and stack[-1]<i: 
            stack.pop() 
            # Simultaneously decrease the 
            # length of stack 
            l-= 1
      
        # Append the current element 
        stack.append(i) 
        # Increase the length of stack 
        l+= 1
          
        # If there are atleast two elements 
        # in stack If xor of top two elements 
        # is maximum, we will update the res1 
        if l>1: 
            res1 = max(res1, stack[-1]^stack[-2]) 
      
      
    # Similar to the above method,  
    # we calculate the xor for reversed array 
    res2 = 0
      
    # Clear the whole stack 
    stack.clear() 
    l = 0
      
    # Reversing the array 
    arr.reverse() 
    for i in arr: 
        while stack and stack[-1]<i: 
            stack.pop() 
            l-= 1
      
        stack.append(i) 
        l+= 1
        if l>1: 
            res2 = max(res2, stack[-1]^stack[-2]) 
              
    # Printing the maximum of res1, res2 
    return max(res1, res2) 
  
# Driver Code 
if __name__ == "__main__": 
    # Initializing the array 
    arr = [9, 8, 3, 5, 7] 
    print(maxXOR(arr)) 

