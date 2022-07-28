

# Python 3 program to count subarrays  
# having sum less than k. 
  
# Function to find number of subarrays  
# having sum less than k. 
def countSubarrays(arr, n, k): 
  
    start = 0
    end = 0
    count = 0
    sum = arr[0] 
  
    while (start < n and end < n) : 
  
        # If sum is less than k, move end  
        # by one position. Update count and  
        # sum accordingly. 
        if (sum < k) : 
            end += 1
  
            if (end >= start): 
                count += end - start 
  
            # For last element, end may become n 
            if (end < n): 
                sum += arr[end] 
  
        # If sum is greater than or equal to k,  
        # subtract arr[start] from sum and 
        # decrease sliding window by moving  
        # start by one position 
        else : 
            sum -= arr[start] 
            start += 1
  
    return count 
  
# Driver Code 
if __name__ == "__main__": 
      
    array = [ 1, 11, 2, 3, 15 ] 
    k = 10
    size = len(array) 
    print(countSubarrays(array, size, k)) 
  
# This code is contributed by ita_c 

