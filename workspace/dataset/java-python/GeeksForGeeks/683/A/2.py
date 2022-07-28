

# Python3 implementation of the above approach 
from collections import deque; 
  
def remainingDigit(S, N): 
      
    # Converting string to array 
    c = [i for i in S] 
  
    # Delete counters for each to 
    # count the deletes 
    de = [0, 0] 
  
    # Counters to keep track 
    # of characters left from each type 
    count = [0, 0] 
  
    # Queue to simulate the process 
    q = deque() 
  
    # Initializing the queue 
    for i in c: 
        x = 0
        if i == '1': 
            x = 1
        count[x] += 1
        q.append(x) 
  
    # Looping till at least 1 digit is 
    # left from both the type 
    while (count[0] > 0 and count[1] > 0): 
        t = q.popleft() 
  
        # If there is a floating delete for 
        # current character we will 
        # delete it and move forward otherwise 
        # we will increase delete counter for 
        # opposite digit 
        if (de[t] > 0): 
            de[t] -= 1
            count[t] -= 1
        else: 
            de[t ^ 1] += 1
            q.append(t) 
  
    # If 0 are left 
    # then answer is 0 else 
    # answer is 1 
    if (count[0] > 0): 
        return "0"
    return "1"
  
# Driver Code 
if __name__ == '__main__': 
  
    # Input String 
    S = "1010100100000"
  
    # Length of String 
    N = len(S) 
  
    # Printing answer 
    print(remainingDigit(S, N)) 
  
# This code is contributed by mohit kumar 29 

