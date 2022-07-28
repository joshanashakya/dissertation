

# Python 3 program to compute sum of 
# all element after doing Xor with  
# itself ( element_time) 
  
# function return sum of all XOR  
# element of array 
def XorSum(arr, n) : 
      
    # store result 
    result = 0
  
    # Traverse array element and  
    # apply XOR operation on it 
    for i in range(0, n) : 
          
        # XOR of current element  
        # with itself according to  
        # value. 
        k = 0
        for j in range(1, arr[i]+1) : 
            k = k ^ arr[i] 
  
        result = result + k 
      
    return result 
  
  
# Driver program 
  
arr = [ 1, 2, 6, 3, 4, 5 ] 
n = len(arr) 
print(XorSum(arr, n)) 
  
  
# This code is contributed by Nikita Tiwari. 

