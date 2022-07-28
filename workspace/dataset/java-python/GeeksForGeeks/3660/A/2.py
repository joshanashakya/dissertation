

# Python3 implementation of the approach 
  
# Function that returns true if the 
# required subarray exists 
# in the given array 
def subArray(arr, n, m): 
    i = 0
  
    # Map to store the positions of 
    # each integer in the original 
    # permutation 
    mp = dict() 
    for i in range(n): 
          
        # To store the address of each 
        # entry in arr[n] but with 
        # 1-based indexing 
        mp[arr[i]] = i + 1
  
    sumcur = 0
  
    # To track minimum position sumcur 
    # for sum of a positions 
    # ti this position 
    p = 10**9
    ans = [] 
    for i in range(1, m + 1): 
  
        # Summing up addresses 
        sumcur += mp[i] 
  
        # Tracking minimum address 
        # encountered ti now 
        p = min(p, mp[i]) 
  
        # The sum of the addresses if 
        # it forms the required subarray 
        val = p * i - i + (i * (i + 1)) / 2
        if (i == m): 
  
            # If current sum of address 
            # is equal to val 
            if (val == sumcur): 
                return True
            else: 
                return False
  
# Driver code 
  
arr = [4, 5, 1, 3, 2, 6] 
n = len(arr) 
m = 3
  
if (subArray(arr, n, m)): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed by mohit kumar 29 

