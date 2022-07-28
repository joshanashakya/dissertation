

# Python3 implementation of above approach 
  
# Function that finds the Nth 
# element of K-Fibonacci series 
def solve(N, K) : 
    Array = [0] * (N + 1) 
      
    # If N is less than K 
    # then the element is '1' 
    if (N <= K) : 
        print("1") 
        return
      
    i = 0
    sm = K 
      
    # first k elements are 1 
    for i in range(1, K + 1) : 
        Array[i] = 1
          
    # (K+1)th element is K 
    Array[i + 1] = sm 
      
    # find the elements of the 
    # K-Fibonacci series 
    for i in range(K + 2, N + 1) : 
          
        # subtract the element at index i-k-1 
        # and add the element at index i-i 
        # from the sum (sum contains the sum 
        # of previous 'K' elements ) 
        Array[i] = sm - Array[i - K - 1] + Array[i - 1] 
  
        # set the new sum 
        sm = Array[i] 
  
    print(Array[N]) 
      
      
# Driver code 
N = 4
K = 2
  
# get the Nth value 
# of K-Fibonacci series 
solve(N, K) 
  
# This code is contributed by Nikita Tiwari. 

