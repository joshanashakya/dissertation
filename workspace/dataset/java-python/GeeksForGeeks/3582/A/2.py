

# Python 3 implementation to find the length of 
# longest subarray having count of 1's one 
# more than count of 0's 
  
# function to find the length of longest 
# subarray having count of 1's one more 
# than count of 0's 
def lenOfLongSubarr(arr, n): 
      
    # unordered_map 'um' implemented as 
    # hash table 
    um = {i:0 for i in range(10)} 
    sum = 0
    maxLen = 0
  
    # traverse the given array 
    for i in range(n): 
          
        # consider '0' as '-1' 
        if arr[i] == 0: 
            sum += -1
        else: 
            sum += 1
  
        # when subarray starts form index '0' 
        if (sum == 1): 
            maxLen = i + 1
  
        # make an entry for 'sum' if it is 
        # not present in 'um' 
        elif (sum not in um): 
            um[sum] = i 
  
        # check if 'sum-1' is present in 'um' 
        # or not 
        if ((sum - 1) in um): 
            # update maxLength 
            if (maxLen < (i - um[sum - 1])): 
                maxLen = i - um[sum - 1] 
  
    # required maximum length 
    return maxLen 
  
# Driver code 
if __name__ == '__main__': 
    arr = [0, 1, 1, 0, 0, 1] 
    n = len(arr) 
    print("Length =",lenOfLongSubarr(arr, n)) 
      
# This code is contributed by 
# Surendra_Gangwar 

