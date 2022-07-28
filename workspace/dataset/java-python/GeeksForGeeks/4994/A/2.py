

# Python program to Collect maximum point  
# in array with k moves. 
  
# function return maximum point  
# that we can collect with K moves 
def maximumPoints(arr, n, k, i): 
      
    # Compute sum of first window of size k in which 
    # we consider subArray from index ( 'i-k' to 'i' ) 
    # store starting index of sub_array 
    start = 0
    if (k > i): 
  
        # sub_array from ( 0 to I+(K-I)) 
        start = 0
    else: 
  
        # sub_array from ( i-i, to i ) 
        start = i - k 
  
    res = 0
    j = start 
    while(j <= start + k and j < n): 
        res += arr[j] 
        j += 1
  
    # Compute sums of remaining windows by 
    # removing first element of previous 
    # window and adding last element of 
    # current window. 
    curr_sum = res 
    j = start + k + 1
    while(j < n and j <= i + k): 
        curr_sum += arr[j] - arr[j - k - 1] 
        res = max(res, curr_sum) 
        j += 1
    return res 
  
# Driver code 
arr = [ 5, 6, 4, 2, 8, 3, 1 ] 
k, i = 3, 3
n = len(arr) 
print ("Maximum points :", maximumPoints(arr, n, k - 1, i)) 
  
# This code is contributed by Sachin Bisht 

