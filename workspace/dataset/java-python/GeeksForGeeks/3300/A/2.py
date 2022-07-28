

# Python3 implementation of the approach  
import sys 
  
# Function to return the maximum subarray sum  
def maxSubArraySum(a, size) : 
  
    max_so_far = -(sys.maxsize - 1);  
    max_ending_here = 0;  
  
    for i in range(size) : 
          
        max_ending_here = max_ending_here + a[i];  
        if (max_so_far < max_ending_here) : 
            max_so_far = max_ending_here;  
  
        if (max_ending_here < 0) : 
            max_ending_here = 0;  
  
    return max_so_far;  
  
# Function to return the minimized sum  
# of the array elements after performing  
# the given operation  
def minimizedSum(a, n, K) : 
  
    # Find maximum subarray sum  
    sum = maxSubArraySum(a, n);  
    totalSum = 0;  
  
    # Find total sum of the array  
    for i in range(n) : 
        totalSum += a[i];  
  
    # Maximum subarray sum is already negative  
    if (sum < 0) : 
        return totalSum;  
  
    # Choose the subarray whose sum is  
    # maximum and divide all elements by K  
    totalSum = totalSum - sum + sum / K;  
      
    return totalSum;  
  
# Driver code  
if __name__ == "__main__" :  
  
    a = [ 1, -2, 3 ];  
    n = len(a);  
    K = 2;  
  
    print(minimizedSum(a, n, K));  
  
# This code is contributed by AnkitRai01 

