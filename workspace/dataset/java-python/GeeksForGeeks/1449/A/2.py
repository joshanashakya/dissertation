

# Python3 implementation to find the  
# first negative integer in every window  
# of size k import deque() from collections  
from collections import deque 
  
# function to find the first negative  
# integer in every window of size k 
def printFirstNegativeInteger(arr, n, k): 
      
    # A Double Ended Queue, Di that will store 
    # indexes of useful array elements for the  
    # current window of size k. The useful  
    # elements are all negative integers. 
    Di = deque() 
  
    # Process first k (or first window) 
    # elements of array  
    for i in range(k): 
          
        # Add current element at the rear of Di 
        # if it is a negative integer 
        if (arr[i] < 0): 
            Di.append(i); 
      
    # Process rest of the elements, i.e.,  
    # from arr[k] to arr[n-1] 
    for i in range(k, n): 
          
        # if the window does not have 
        # a negative integer 
        if (not Di): 
            print(0, end = ' ') 
          
        # if Di is not empty then the element  
        # at the front of the queue is the first  
        # negative integer of the previous window 
        else: 
            print(arr[Di[0]], end = ' '); 
  
        # Remove the elements which are 
        # out of this window 
        while Di and Di[0] <= (i - k): 
            Di.popleft() # Remove from front of queue 
  
        # Add current element at the rear of Di 
        # if it is a negative integer 
        if (arr[i] < 0): 
            Di.append(i); 
  
    # Print the first negative  
    # integer of last window 
    if not Di: 
        print(0) 
    else: 
        print(arr[Di[0]], end = " ")  
      
# Driver Code 
if __name__ =="__main__": 
    arr = [12, -1, -7, 8, -15, 30, 16, 28] 
    n = len(arr) 
    k = 3
    printFirstNegativeInteger(arr, n, k); 
  
# This code is contributed by 
# chaudhary_19 (Mayank Chaudhary) 

