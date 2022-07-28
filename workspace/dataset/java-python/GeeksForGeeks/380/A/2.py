

# Python3 program to find the minimum possible sum 
# of the array elements after performing 
# the given operation 
  
# Function to find the maximum sum 
# of the sub array 
def maxSubArraySum(a, size): 
  
    # max_so_far represents the maximum sum 
    # found till now and max_ending_here 
    # represents the maximum sum ending at 
    # a specific index 
    max_so_far = -10**9
    max_ending_here = 0
  
    # Iterating through the array to find 
    # the maximum sum of the subarray 
    for i in range(size): 
        max_ending_here = max_ending_here + a[i] 
        if (max_so_far < max_ending_here): 
            max_so_far = max_ending_here 
  
        # If the maximum sum ending at a 
        # specific index becomes less than 0, 
        # then making it equal to 0. 
        if (max_ending_here < 0): 
            max_ending_here = 0
    return max_so_far 
  
# Function to find the minimum possible sum 
# of the array elements after performing 
# the given operation 
def minPossibleSum(a,n, x): 
    mxSum = maxSubArraySum(a, n) 
    sum = 0
  
    # Finding the sum of the array 
    for i in range(n): 
        sum += a[i] 
  
    # Computing the minimum sum of the array 
    sum = sum - mxSum + mxSum / x 
    print(round(sum,2)) 
  
# Driver code 
if __name__ == '__main__': 
    N = 3
    X = 2
    A=[1, -2, 3] 
    minPossibleSum(A, N, X) 
  
# This code is contributed by mohit kumar 29 

