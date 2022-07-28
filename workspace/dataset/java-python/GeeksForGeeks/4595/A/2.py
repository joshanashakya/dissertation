

# Python3 program to find Length of  
# longest Fibonacci-like subarray 
  
# Function to find the Length of the  
# longest Fibonacci-like subarray 
def longestFibonacciSubarray(n, a): 
  
    # Any 2 terms are Fibonacci-like 
    if (n <= 2): 
        return n 
      
    Len = 2
      
    mx = -10**9
      
    for i in range(2, n): 
          
        # If previous subarray can be extended 
        if (a[i] == a[i - 1] + a[i - 2]): 
            Len += 1
              
        # Any 2 terms are Fibonacci-like 
        else: 
            Len = 2
              
        # Find the maximum Length 
        mx = max(mx, Len) 
      
    return mx 
  
# Driver Code 
n = 5
a = [2, 4, 6, 10, 2] 
  
print(longestFibonacciSubarray(n, a)) 
  
# This code is contributed by Mohit Kumar 

