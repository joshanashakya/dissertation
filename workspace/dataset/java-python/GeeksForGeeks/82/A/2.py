

# Python3 implementation of the above approach 
  
# Function to return the count of subarrays  
# with at most K distinct elements using  
# the sliding window technique 
def atMostK(arr, n, k) : 
      
    # To store the result 
    count = 0
      
    # Left boundary of window 
    left = 0
      
    # Right boundary of window  
    right = 0
      
    # Map to keep track of number of distinct  
    # elements in the current window  
    map = {} 
  
    # Loop to calculate the count  
    while(right < n) : 
          
        if arr[right] not in map : 
            map[arr[right]] = 0
          
        # Calculating the frequency of each  
        # element in the current window      
        map[arr[right]] += 1
          
        # Shrinking the window from left if the  
        # count of distinct elements exceeds K  
        while(len(map) > k) : 
              
            if arr[left] not in map : 
                map[arr[left]] = 0
                  
            map[arr[left]] -= 1
              
            if map[arr[left]] == 0 : 
                del map[arr[left]] 
              
            left += 1
          
        # Adding the count of subarrays with at most  
        # K distinct elements in the current window  
        count += right - left + 1
        right += 1
      
    return count 
      
# Function to return the count of subarrays  
# with exactly K distinct elements  
def exactlyK(arr, n, k) : 
      
    # Count of subarrays with exactly k distinct  
    # elements is equal to the difference of the  
    # count of subarrays with at most K distinct  
    # elements and the count of subararys with  
    # at most (K - 1) distinct elements  
    return (atMostK(arr, n, k) -
            atMostK(arr, n, k - 1)) 
  
# Driver code 
if __name__ == "__main__" : 
    arr = [2, 1, 2, 1, 6] 
    n = len(arr) 
    k = 2
      
    print(exactlyK(arr, n, k)) 
      
# This code is contributed by AnkitRai01 

