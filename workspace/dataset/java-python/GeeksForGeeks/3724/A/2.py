

# Python3 implementation of the approach 
  
# Function to return the count of 
# all distinct valid elements 
def countOccurrence(n, arr, k): 
  
    cnt, ans = 0, 0
  
    # To avoid duplicates 
    Hash = dict() 
  
    # Traverse the complete array 
    for i in range(n): 
        cnt = 0
  
        # If current element is previously  
        # checked don't check it again 
        if (arr[i] in Hash.keys()): 
            continue
  
        # To avoid duplicates 
        Hash[arr[i]] = 1
  
        # Count occurrence of arr[i] in  
        # range [i + 1, n - 1] 
        for j in range(i + 1, n): 
            if (arr[j] == arr[i]): 
                cnt += 1
  
            # If count becomes equal to K 
            # break the loop 
            if (cnt >= k): 
                break
  
        # If cnt >= K 
        # increment ans by 1 
        if (cnt >= k): 
            ans += 1
  
    return ans 
  
# Driver code 
arr = [1, 2, 1, 3] 
n = len(arr) 
k = 1
print(countOccurrence(n, arr, k)) 
  
# This code is contributed  
# by mohit kumar 

