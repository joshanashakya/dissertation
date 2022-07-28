

# Python3 implementation of the approach 
from collections import deque 
  
# To store the indices of 0s and 1s 
zero = deque() 
one = deque() 
  
# Function to return the leftmost 0 
def getLeftMostZero(): 
  
    # If there are no 0s 
    if not len(zero): 
        return -1
  
    # pop the head of the queue 
    zero.popleft() 
    return 0
  
# Function to return the leftmost 1 
def getLeftMostOne(): 
  
    # If there are no 1s 
    if not len(one): 
        return -1
  
    # pop the head of the queue 
    one.popleft() 
    return 1
  
# Function to return the pre-calculate array 
# such that arr[i] stores the count of 
# valid numbers in the range [0, i] 
def getLeftMostElement(): 
  
    # If there are no elements left 
    if not len(zero) and not len(one): 
        return -1
  
    # If only 1s are there 
    elif not len(zero): 
        one.popleft() 
        return 1
  
    # If only 0s are there 
    elif not len(one): 
        zero.popleft() 
        return 0
  
    # Get the element which is at 
    # the left-most position 
    res = 0 if zero[0] < one[0] else 1
  
    if res == 0: 
        zero.popleft() 
    else: 
        one.popleft() 
  
    return res 
  
# Function to perform the queries 
def performQueries(arr: list, n: int, queries: list, q: int): 
    for i in range(n): 
        if arr[i] == 0: 
            zero.append(i) 
        else: 
            one.append(i) 
  
    # For every query 
    for i in range(q): 
  
        # Get its type 
        type = queries[i] 
  
        # Perform type 1 query 
        if type == 1: 
            print(getLeftMostZero()) 
  
        # Perform type 2 query 
        elif type == 2: 
            print(getLeftMostOne()) 
  
        # Perform type 3 query 
        elif type == 3: 
            print(getLeftMostElement()) 
  
# Driver Code 
if __name__ == "__main__": 
  
    arr = [1, 0, 1, 1, 1] 
    n = len(arr) 
    queries = [1, 3, 1] 
    q = len(queries) 
  
    performQueries(arr, n, queries, q) 
  
# This code is contributed by 
# sanjeev2552 

