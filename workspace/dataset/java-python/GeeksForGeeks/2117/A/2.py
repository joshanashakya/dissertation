

# Python 3 implementation of above approach 
  
# function to find longest sub-array 
# whose elements gives same remainder 
# when divided with K 
def LongestSubarray(arr, n, k): 
  
    # second array contains modulo 
    # results of each element with K 
    arr2 = [0] * n 
    for i in range( n): 
        arr2[i] = arr[i] % k 
          
    max_length = 0
  
    # loop for finding longest sub-array 
    # with equal elements 
    i = 0
    while i < n : 
        current_length = 1
        for j in range(i + 1, n): 
            if (arr2[j] == arr2[i]): 
                current_length += 1
            else: 
                break
          
        max_length = max(max_length,  
                         current_length) 
        i = j 
        i += 1
  
    return max_length 
  
# Driver code 
if __name__ == "__main__": 
    arr = [ 4, 9, 7, 18, 29, 11 ] 
    n = len(arr) 
    k = 11
    print(LongestSubarray(arr, n, k)) 
  
# This code is contributed  
# by ChitraNayal 

