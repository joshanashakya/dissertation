

# Python3 Program to count number of subarrays 
# with Bitwise-XOR as power of 2 
MAX = 10
  
# Function to find number of subarrays 
def findSubarray(array, n): 
      
    # Hash Map to store prefix XOR values 
    mp = dict() 
  
    # When no element is selected 
    mp[0] = 1
  
    answer = 0
    preXor = 0
    for i in range(n): 
        value = 1
        preXor ^= array[i] 
  
        # Check for all the powers of 2, 
        # till a MAX value 
        for j in range(1, MAX + 1): 
            Y = value ^ preXor 
            if ( Y in mp.keys()): 
                answer += mp[Y] 
  
            value *= 2
  
        # Insert Current prefixxor in Hash Map 
        if (preXor in mp.keys()): 
            mp[preXor] += 1
  
        else: 
            mp[preXor] = 1
  
    return answer 
  
# Driver Code 
array = [2, 6, 7, 5, 8] 
  
n = len(array) 
  
print(findSubarray(array, n)) 
  
# This code is contributed by Mohit Kumar 

