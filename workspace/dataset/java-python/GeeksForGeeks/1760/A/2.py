

# Python3 program to count all binary digit 
# numbers smaller than N 
from collections import deque 
  
# method returns count of binary digit 
# numbers smaller than N 
def countOfBinaryNumberLessThanN(N): 
    # queue to store all intermediate binary 
    # digit numbers 
    q = deque() 
  
    # binary digits start with 1 
    q.append(1) 
    cnt = 0
  
    # loop untill we have element in queue 
    while (q): 
        t = q.popleft() 
          
        # push next binary digit numbers only if 
        # current popped element is N 
        if (t <= N): 
            cnt = cnt + 1
            # uncomment below line to print actual 
            # number in sorted order 
            q.append(t * 10) 
            q.append(t * 10 + 1) 
  
    return cnt 
  
# Driver code to test above methods 
if __name__=='__main__': 
    N = 200
    print(countOfBinaryNumberLessThanN(N)) 
  
# This code is contributed by 
# Sanjit_Prasad 

