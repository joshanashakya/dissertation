

# Python 3 implementation of  
# above approach 
  
# Function to find minimum operations 
# required to make array beautiful 
def minOperations(A, n) : 
  
    if n & 1 : 
        return -1
  
    zeros, consZeros, ones = 0, 0, 0
  
    for i in range(n) : 
  
        if A[i] : 
            zeros += 1
        else : 
            ones += 1
  
        # counting consecutive zeros. 
        if( i + 1 < n) : 
  
            if A[i] == 0 and A[i + 1] == 0 : 
                consZeros += 1
  
    # check that start and end are same 
    if A[0] == A[n - 1] and A[0] == 0 : 
        consZeros += 1
  
    # check is zero and one are equal 
    if zeros == ones : 
        return consZeros 
    else : 
        return -1
  
# Driver code 
if __name__ == "__main__" : 
  
    A = [1, 1, 0, 0] 
    n = len(A) 
  
    print(minOperations(A, n)) 
      
# This code is contributed by ANKITRAI1 

