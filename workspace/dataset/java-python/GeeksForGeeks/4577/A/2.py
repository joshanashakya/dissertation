

# Python 3 program to count number of 
# subarrays with XOR less than k 
  
# function to count number of 
# subarrays with XOR less than k 
def xorLessK(arr, n, k): 
    count = 0
  
    # check all subarrays 
    for i in range(n): 
        tempXor = 0
        for j in range(i, n): 
            tempXor ^= arr[j] 
            if (tempXor < k): 
                count += 1
      
    return count 
  
# Driver Code 
if __name__ == '__main__': 
    k = 3
    arr = [8, 9, 10, 11, 12] 
  
    n = len(arr) 
  
    print(xorLessK(arr, n, k)) 
  
# This code is contributed by 
# Sahil_shelangia 

