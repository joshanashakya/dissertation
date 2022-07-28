

# Python3 program to find the maximum  
# sum after given operations  
import sys 
  
# Function to calculate Maximum 
# Subarray Sum or Kadane's Algorithm  
def maxSubArraySum(a, size) : 
          
    max_so_far = -(sys.maxsize - 1) 
    max_ending_here = 0
  
    for i in range(size) : 
          
        max_ending_here = max_ending_here + a[i] 
          
        if (max_so_far < max_ending_here) : 
                max_so_far = max_ending_here 
  
        if (max_ending_here < 0) : 
                max_ending_here = 0
      
    return max_so_far  
  
# Function to find the maximum  
# sum after given operations  
def maxSum(a, n) : 
      
    # To store sum of all elements  
    S = 0;  
  
    # Maximum sum of a subarray  
    S1 = maxSubArraySum(a, n) 
  
    # Calculate the sum of all elements  
    for i in range(n) : 
        S += a[i] 
  
    return (2 * S1 - S)  
  
# Driver Code 
if __name__ == "__main__" : 
  
    a = [ -35, 32, -24, 0,  
           27, -10, 0, -19 ] 
  
    # size of an array  
    n = len(a)  
  
    print(maxSum(a, n)) 
  
# This code is contributed by Ryuga 

