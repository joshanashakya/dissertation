

# Python3 implementation to find the 
# Array from the XOR array 
# of the adjacent elements of array 
  
# XOR of all elements from 1 to N 
def xor_all_elements(n): 
  
    if n & 3 == 0: 
        return n 
    elif n & 3 == 1: 
        return 1
    elif n & 3 == 2: 
        return n + 1
    else: 
        return 0
  
# Function to find the Array 
# from the XOR Array 
def findArray(xorr, n): 
      
    # Take a vector to store 
    # the permuatation 
    arr = [] 
  
    # XOR of N natural numbers 
    xor_all = xor_all_elements(n) 
    xor_adjacent = 0
  
    # Loop to find the XOR of 
    # adjacent elements of the XOR Array 
    for i in range(0, n - 1, 2): 
        xor_adjacent = xor_adjacent ^ xorr[i] 
  
    last_element = xor_all ^ xor_adjacent 
    arr.append(last_element) 
  
    # Loop to find the other 
    # elements of the permuatation 
    for i in range(n - 2, -1, -1): 
          
        # Finding the next and next elements 
        last_element = xorr[i] ^ last_element 
        arr.append(last_element) 
  
    return arr 
  
# Driver Code 
xorr = [7, 5, 3, 7] 
n = 5
  
arr = findArray(xorr, n) 
  
# Required Permutation 
for i in range(n - 1, -1, -1): 
    print(arr[i], end=" ") 
      
# This code is contributed by mohit kumar 29     

