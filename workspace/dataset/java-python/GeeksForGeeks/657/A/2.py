

# Python3 program to find the minimum value 
# of maximum absolute difference of 
# all adjacent pairs in an Array 
  
# Function to find the minimum possible 
# value of the maximum absolute difference. 
def maximumAbsolute(arr, n): 
  
    # To store minimum and maximum elements 
    mn = 10**9
    mx = -10**9
  
    for i in range(n): 
      
        # If right side element is equals -1 
        # and left side is not equals -1 
        if (i > 0
            and arr[i] == -1
            and arr[i - 1] != -1): 
            mn = min(mn, arr[i - 1]) 
            mx = max(mx, arr[i - 1]) 
  
        # If left side element is equals -1 
        # and right side is not equals -1 
        if (i < n - 1
            and arr[i] == -1
            and arr[i + 1] != -1): 
            mn = min(mn, arr[i + 1]) 
            mx = max(mx, arr[i + 1]) 
  
    # Calculating the common integer 
    # which needs to be replaced with 
    common_integer = (mn + mx) // 2
  
    # Replace all -1 elements 
    # with the common integer 
    for i in range(n): 
        if (arr[i] == -1): 
            arr[i] = common_integer 
  
    max_diff = 0
  
    # Calculating the maximum 
    # absolute difference 
    for i in range(n-1): 
        diff = abs(arr[i] - arr[i + 1]) 
  
        if (diff > max_diff): 
            max_diff = diff 
  
    # Return the maximum absolute difference 
    return max_diff 
  
# Driver Code 
if __name__ == '__main__': 
    arr=[-1, -1, 11, -1, 3, -1] 
    n = len(arr) 
  
    # Function call 
    print(maximumAbsolute(arr, n)) 
  
# This code is contributed by mohit kumar 29 

