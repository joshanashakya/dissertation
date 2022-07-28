

# Python3 implementation of the  
# above approach  
  
# Function to return the max Length  
# of Fibonacci subsequence  
def LongestFibSubseq(A, n):  
  
    # Store all array elements in  
    # a hash table  
    S = set(A)  
    maxLen = 0
  
    for i in range(0, n):  
        for j in range(i + 1, n):  
  
            x = A[j]  
            y = A[i] + A[j]  
            length = 2
  
            # check until next fib  
            # element is found  
            while y in S:  
  
                # next element of fib subseq  
                z = x + y  
                x = y  
                y = z 
                length += 1
                maxLen = max(maxLen, length)  
              
    return maxLen if maxLen >= 3 else 0
  
# Driver Code 
if __name__ == "__main__": 
  
    A = [1, 2, 3, 4, 5, 6, 7, 8]  
    n = len(A)  
    print(LongestFibSubseq(A, n))  
      
# This code is contributed  
# by Rituraj Jain 

