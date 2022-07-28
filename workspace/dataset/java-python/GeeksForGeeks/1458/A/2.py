

# Python3 implementation of the above approach.  
  
# Function to count the number of maximal contiguous 
# increasing and decreasing subsequences 
def numOfSubseq(arr, n): 
    i, inc_count, dec_count = 0, 0, 0; 
    max = [0]*n; 
    min = [0]*n; 
  
    # k2, k1 are used to store the 
    # count of max and min array 
    k1 = 0; 
    k2 = 0; 
  
    # Comparison to store the index of 
    # first element of array 
    if (arr[0] < arr[1]): 
        min[k1] = 0; 
        k1 += 1; 
    else: 
        max[k2] = 0; 
        k2 += 1; 
      
    # Comparison to store the index 
    # from second to second last 
    # index of array 
    for i in range(1, n-1): 
        if (arr[i] < arr[i - 1] and arr[i] < arr[i + 1]): 
            min[k1] = i; 
            k1 += 1; 
          
        if (arr[i] > arr[i - 1] and arr[i] > arr[i + 1]): 
            max[k2] = i; 
            k2 += 1; 
  
    # Comparison to store the index 
    # of last element of array 
    if (arr[n - 1] < arr[n - 2]): 
        min[k1] = n - 1; 
        k1 += 1; 
    else: 
        max[k2] = n - 1; 
        k2 += 1; 
      
    # Count of number of maximal contiguous 
    # increasing and decreasing subsequences 
    if (min[0] == 0): 
        inc_count = k2; 
        dec_count = k1 - 1; 
    else: 
        inc_count = k2 - 1; 
        dec_count = k1; 
      
    print("Increasing Subsequence Count: " , inc_count); 
    print("Decreasing Subsequence Count: " , dec_count); 
  
# Driver code 
if __name__ == '__main__': 
    arr = [ 12, 8, 11, 13, 10, 15, 14, 16, 20 ]; 
    n = len(arr); 
    numOfSubseq(arr, n); 
  
# This code is contributed by 29AjayKumar 

