

# Python3 program to Count all pair with  
# given XOR value x 
  
# Returns count of pairs in arr[0..n-1]  
# with XOR value equals to x. 
def xorPairCount(arr, n, x): 
  
    result = 0 # Initialize result 
  
    # create empty map that stores counts  
    # of individual elements of array. 
    m = dict() 
  
    for i in range(n): 
      
        curr_xor = x ^ arr[i] 
  
        # If there exist an element in map m 
        # with XOR equals to x^arr[i], that 
        # means there exist an element such that  
        # the XOR of element with arr[i] is equal  
        # to x, then increment count. 
        if (curr_xor in m.keys()): 
            result += m[curr_xor] 
  
        # Increment count of current element 
        if arr[i] in m.keys(): 
            m[arr[i]] += 1
        else: 
            m[arr[i]] = 1
      
    # return total count of pairs 
    # with XOR equal to x 
    return result 
  
# Driver Code 
arr = [2, 5, 2] 
n = len(arr) 
x = 0
print("Count of pairs with given XOR = ", 
                 xorPairCount(arr, n, x)) 
  
# This code is contributed by Mohit Kumar 

