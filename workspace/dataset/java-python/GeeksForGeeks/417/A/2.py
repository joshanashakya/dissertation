

# Python3 program Count total number of  
# sub-arrays having total distinct elements  
# same as that original array. 
  
# Function to calculate distinct sub-array 
def countDistictSubarray(arr, n): 
  
    # Count distinct elements in whole array 
    vis = dict() 
    for i in range(n): 
        vis[arr[i]] = 1
    k = len(vis) 
  
    # Reset the container by removing 
    # all elements 
    vid = dict() 
  
    # Use sliding window concept to find 
    # count of subarrays having k distinct 
    # elements. 
    ans = 0
    right = 0
    window = 0
    for left in range(n): 
      
        while (right < n and window < k): 
  
            if arr[right] in vid.keys(): 
                vid[ arr[right] ] += 1
            else: 
                vid[ arr[right] ] = 1
  
            if (vid[ arr[right] ] == 1): 
                window += 1
  
            right += 1
          
        # If window size equals to array distinct  
        # element size, then update answer 
        if (window == k): 
            ans += (n - right + 1) 
  
        # Decrease the frequency of previous  
        # element for next sliding window 
        vid[ arr[left] ] -= 1
  
        # If frequency is zero then decrease  
        # the window size 
        if (vid[ arr[left] ] == 0): 
            window -= 1
      
    return ans 
  
# Driver code 
arr = [2, 1, 3, 2, 3] 
n = len(arr) 
  
print(countDistictSubarray(arr, n)) 
  
# This code is contributed by 
# mohit kumar 29 

