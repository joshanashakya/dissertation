

# Python3 Program to computer sum of prime number  
# in a given range  
import math # for sqrt and ceil function 
  
# Suppose the constraint is N<=1000  
N = 1000
  
# Declare an array for dynamic approach  
dp = [0] * (N + 1) 
  
# Method to compute the array  
def seive(): 
  
    # Declare an extra array as array  
    array = [0] * (N + 1) 
      
    array[0] = 1
    array[1] = 1
  
    # Iterate the loop till sqrt(N)  
    # Time Complexity is O(log(n) X sqrt(N)) 
    for i in range(2, math.ceil(math.sqrt(N) + 1)): 
  
        # if ith element of arr is 0 
        # i.e. marked as prime  
        if array[i] == 0: 
              
            # mark all of it's multiples till N as  
            # non-prime by setting the locations to 1  
            for j in range(i * i, N + 1, i): 
                array[j] = 1
      
    runningPrimeSum = 0
  
    # Update the array 'dp' with the running sum  
    # of prime numbers within the range [1, N]  
    # Time Complexity is O(n) 
    for i in range(1, N + 1): 
        if array[i] == 0: 
            runningPrimeSum += i 
      
        # Here, dp[i] is the sum of all the prime numbers  
        # within the range [1, i]  
        dp[i] = runningPrimeSum 
  
# Driver Code 
l = 4
r = 13
seive() 
print(dp[r] - dp[l - 1]) 
  
# This code is contributed by Vivek Kumar Singh 

