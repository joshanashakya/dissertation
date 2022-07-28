

# Python 3 implementation of above approach 
  
# Function to check is there exists a 
# subarray whose sum is a multiple of N 
def CheckSubarray(arr, N): 
    # Prefix sum array to store cumulative sum 
    presum = [0 for i in range(N+1)] 
  
    # Single state dynamic programming 
    # relation for prefix sum array 
    for i in range(1,N+1): 
        presum[i] = presum[i - 1] + arr[i - 1] 
  
    # Modulo class vector 
    moduloclass = [[]]*N 
  
    # Storing the index value in the modulo class vector 
    for i in range(1,N+1,1): 
        moduloclass[presum[i] % N].append(i - 1) 
  
    # If there exists a sub-array with 
    # startig index equal to zero 
    if (len(moduloclass[0]) > 0): 
        print(0+1,moduloclass[0][0]+2) 
        return
  
    for i in range(1,N): 
        # In this class, there are more than two presums%N 
        # Hence difference of any two subarrays would be a 
        # multiple of N 
        if (len(moduloclass[i]) >= 2): 
            # 0 based indexing 
            print(moduloclass[i][0] + 1,moduloclass[i][1]) 
            return
# Driver code 
if __name__ == '__main__': 
    arr = [7, 3, 5, 2] 
  
    N = len(arr) 
  
    CheckSubarray(arr, N) 
  
# This code is contributed by 
# Surendra_Gangwar 

