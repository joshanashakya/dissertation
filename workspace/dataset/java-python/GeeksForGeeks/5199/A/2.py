

# Python program to compute 
# sum of all element after 
# doing XOR with itself 
# ( element_time) 
  
# function return sum of 
# all XOR element of array 
def XorSum(arr,n): 
  
    result = 0
    for i in range(n): 
   
        # if number is odd then add it to the  
        # result else not 
        if (arr[i] % 2 != 0): 
            result += arr[i] 
      
   
    return result 
  
# Driver program 
arr = [ 1, 2, 6, 3, 4, 5 ] 
n = len(arr) 
  
print(XorSum(arr, n)) 
  
# This code is contributed 
# by Anant Agarwal. 

