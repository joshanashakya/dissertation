

# Python3 implementation of the approach  
import sys 
  
def minCostJumpsDP(A, k):  
      
    # for calculating the number of elements  
    size = len(A) 
  
    # Allocating Memo table and  
    # initializing with INT_MAX  
    x = [sys.maxsize] * (size)  
  
    # Base case  
    x[0] = 0
  
    # For every element relax every reachable  
    # element ie relax next k elements  
    for i in range(size):  
          
        # reaching next k element 
        j = i+1
        while j < i + k + 1 and j < size:  
              
            # Relaxing the element  
            x[j] = min(x[j], x[i] + abs(A[i] - A[j])) 
            j += 1
          
    # return the last element in the array  
    return x[size - 1]  
  
# Driver Code  
if __name__ == "__main__": 
  
    input_ = [83, 26, 37, 35, 33, 35, 56]  
    print(minCostJumpsDP(input_, 3)) 
      
# This code is contributed by Rituraj Jain 

