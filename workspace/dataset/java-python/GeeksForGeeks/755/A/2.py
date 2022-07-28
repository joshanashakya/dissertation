

# Python3 implementation of the approach 
  
def maxCount(A, N, K): 
  
    maximum = 0
    start = 0
    end = 0
    j = 0
      
    # Sort the Array 
    A.sort() 
      
    # Find max elements 
    for i in range(0, N): 
        while(j < N and A[j] <= A[i] + K): 
            j += 1
        if maximum < (j - i ): 
            maximum = (j - i) 
            start = i; 
            end = j;  
  
    # Return the maximum 
    return maximum 
  
# Driver code 
A = [1, 26, 17, 12, 15, 2]  
N = len(A) 
K = 5
  
print(maxCount(A, N, K)) 

