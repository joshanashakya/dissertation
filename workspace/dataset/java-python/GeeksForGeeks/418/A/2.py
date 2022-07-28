

# Python3 implementation of the approach  
  
# Function to return the maximum sum  
# in a subarray of size k  
def maxSum(arr, n, k) : 
  
    # k must be greater  
    if (n < k) : 
        return -1;  
  
    # Compute sum of first window of size k  
    res = 0;  
      
    for i in range(k) : 
        res += arr[i];  
  
    # Compute sums of remaining windows by  
    # removing first element of previous  
    # window and adding last element of  
    # current window.  
    curr_sum = res;  
      
    for i in range(k, n) : 
        curr_sum += arr[i] - arr[i - k];  
        res = max(res, curr_sum);  
  
    return res;  
  
# Function to return the length of subarray  
# Sum of all the subarray of this  
# length is less than or equal to K  
def solve(arr, n, k) : 
  
    max_len = 0; l = 0; r = n; 
  
    # Binary search from l to r as all the  
    # array elements are positive so that  
    # the maximum subarray sum is monotonically  
    # increasing  
    while (l <= r) : 
        m = (l + r) // 2;  
  
        # Check if the subarray sum is  
        # greater than K or not  
        if (maxSum(arr, n, m) > k) : 
            r = m - 1;  
        else : 
            l = m + 1;  
  
            # Update the maximum length  
            max_len = m;  
              
    return max_len;  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 1, 2, 3, 4, 5 ];  
    n = len(arr);  
    k = 10;  
  
    print(solve(arr, n, k));  
  
# This code is contributed by AnkitRai01 

