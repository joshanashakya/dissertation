

# Python3 implementation of the above approach 
  
# Function that count the Length 
# of longest subarray with product 
# greater than or equals to zero 
def maxLength(arr, N): 
    product = 1
    Len = 0
  
    for i in arr: 
        product *= i 
  
    # If product is greater than 
    # zero, return array size 
    if (product >= 0): 
        return N 
  
    # Traverse the array and if 
    # any negative element found 
    # then update the Length of 
    # longest subarray with the 
    # Length of left and right subarray 
    for i in range(N): 
        if (arr[i] < 0): 
            Len = max(Len,max(N - i - 1, i)) 
  
    return Len
  
# Driver Code 
if __name__ == '__main__': 
    arr = [-1, 1, 1, -2, 3, 2, -1] 
    N = len(arr) 
  
    print(maxLength(arr, N)) 
  
# This code is contributed by mohit kumar 29 

